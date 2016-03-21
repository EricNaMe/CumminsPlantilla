/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonObtenerEficiencia.Data;
import com.cummins.jacksonObtenerEficiencia.JsonObtenerEficiencia;
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
import javax.servlet.http.HttpSession;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author nc784
 */
public class ObtenerEficiencia extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private Connection conn;
    HttpSession session;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        JsonObtenerEficiencia jsonEficiencia = new JsonObtenerEficiencia();
        PrintWriter out = response.getWriter();
        try {
            System.out.println("Consiguiendo Lista Eficiencia");
            session = request.getSession();
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            jsonEficiencia.setData(obtenerEficiencia());
            mapper = new ObjectMapper();
            conn.commit();
        } catch (SQLException sqlEx) {
            System.out.println("ObtenerEficiencia::processRequest SQLException: " + sqlEx);
        } catch (NumberFormatException numEx) {
            System.out.println("ObtenerEficiencia::processRequest NumberFormatException: " + numEx);
        } catch (Exception e) {
            System.out.println("ObtenerEficiencia::processRequest Exception: " + e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.print(e);
                }
            }
        }
        out.println(mapper.writeValueAsString(jsonEficiencia));
    }

    public ArrayList<Data> obtenerEficiencia() throws Exception {
        ArrayList<Data> alListaPosible = new ArrayList<Data>();
        CallableStatement csObtenerPosible = null;
        ResultSet rsListaPosible = null;
        Data data;
        System.out.println("Ejecutando Procedimiento Obtener Lista Eficienciaa");
        csObtenerPosible = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_EFICIENCIA(?)}");
        csObtenerPosible.registerOutParameter(1, OracleTypes.CURSOR);
        csObtenerPosible.execute();
        rsListaPosible = (ResultSet) csObtenerPosible.getObject(1);
        while (rsListaPosible.next()) {
            data = new Data();
            data.setId(rsListaPosible.getString("ID_MATRIZ"));
            data.setTiempoRepara(rsListaPosible.getString("MATRIZ_NAME"));
            data.setTiempoCaptura(rsListaPosible.getString("MATRIZ_NAME"));
            data.setEficReclamo(rsListaPosible.getString("MATRIZ_NAME"));
            data.setEficRepara(rsListaPosible.getString("MATRIZ_NAME"));
            alListaPosible.add(data);
        }
        csObtenerPosible.close();
         conn.close();
        return alListaPosible;
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
