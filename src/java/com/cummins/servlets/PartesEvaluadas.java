/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonPartesEval.Data;
import com.cummins.jacksonPartesEval.JsonPartesEvaluadas;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author nc784
 */
public class PartesEvaluadas extends HttpServlet {

    private Connection conn;
    private String strDR = "";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        JsonPartesEvaluadas jsonPartesEval = new JsonPartesEvaluadas();
        PrintWriter out = response.getWriter();
        try {
            System.out.println("Consiguiendo Lista Partes");
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            strDR = (String) request.getParameter("dr");
            jsonPartesEval.setData(obtenerPartes());
            conn.commit();
        } catch (SQLException sqlEx) {
            System.out.println("PartesEvaluadas::processRequest SQLException: " + sqlEx);
        } catch (NumberFormatException numEx) {
            System.out.println("PartesEvaluadas::processRequest NumberFormatException: " + numEx);
        } catch (Exception e) {
            System.out.println("PartesEvaluadas::processRequest Exception: " + e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
        out.println(mapper.writeValueAsString(jsonPartesEval));
    }

    public ArrayList<Data> obtenerPartes() throws Exception {
        ArrayList<Data> alListaPartes = new ArrayList<Data>();
        CallableStatement csObtenerPartes = null;
        ResultSet rsListaPartes = null;
        Data data;
        System.out.println("Ejecutando Procedimiento Obtener Partes");
        csObtenerPartes = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_PARTES_EVAL(?,?)}");
        csObtenerPartes.setString(1, strDR);
        csObtenerPartes.registerOutParameter(2, OracleTypes.CURSOR);
        csObtenerPartes.execute();
        rsListaPartes = (ResultSet) csObtenerPartes.getObject(2);
        while (rsListaPartes.next()) {
            data = new Data();
            data.setId(rsListaPartes.getString("id"));
            data.setDealer(rsListaPartes.getString("dealer"));
            data.setMatrizProd(rsListaPartes.getString("matrizProd"));
            data.setFechaEval(rsListaPartes.getString("fechaEval"));
            data.setPorcObtenido(rsListaPartes.getString("porcObtenido"));
            alListaPartes.add(data);
        }
        return alListaPartes;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
