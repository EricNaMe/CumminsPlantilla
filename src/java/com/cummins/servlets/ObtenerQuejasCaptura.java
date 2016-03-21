/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonObtenerQuejasCaptura.Data;
import com.cummins.jacksonObtenerQuejasCaptura.JsonObtenerQuejasCaptura;
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
public class ObtenerQuejasCaptura extends HttpServlet {

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
        JsonObtenerQuejasCaptura jsonQuejasCaptura = new JsonObtenerQuejasCaptura();
        PrintWriter out = response.getWriter();
        try {
            System.out.println("Consiguiendo Lista QuejasCaptura");
            session = request.getSession();
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            jsonQuejasCaptura.setData(obtenerQuejasCaptura());
            mapper = new ObjectMapper();
            conn.commit();
        } catch (SQLException sqlEx) {
            System.out.println("ObtenerQuejasCaptura::processRequest SQLException: " + sqlEx);
        } catch (NumberFormatException numEx) {
            System.out.println("ObtenerQuejasCaptura::processRequest NumberFormatException: " + numEx);
        } catch (Exception e) {
            System.out.println("ObtenerQuejasCaptura::processRequest Exception: " + e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.print(e);
                }
            }
        }
        out.println(mapper.writeValueAsString(jsonQuejasCaptura));
    }

    public ArrayList<Data> obtenerQuejasCaptura() throws Exception {
        ArrayList<Data> alListaQuejasCaptura = new ArrayList<Data>();
        CallableStatement csObtenerQuejasCaptura = null;
        ResultSet rsListaQuejasCaptura = null;
        Data data;
        System.out.println("Ejecutando Procedimiento Obtener Lista de QuejasCaptura");
        csObtenerQuejasCaptura = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_QUEJAS_CAPTURA(?)}");
        csObtenerQuejasCaptura.registerOutParameter(1, OracleTypes.CURSOR);
        csObtenerQuejasCaptura.execute();
        rsListaQuejasCaptura = (ResultSet) csObtenerQuejasCaptura.getObject(1);
        while (rsListaQuejasCaptura.next()) {
            data = new Data();
            data.setFolio(rsListaQuejasCaptura.getString("ID_MATRIZ"));
            data.setFCreacion(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
            data.setFQueja(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
			data.setCliente(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
			data.setCCliente(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
			data.setIDQueja(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
			data.setDQueja(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
			data.setSQueja(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
			data.setReporta(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
			data.setSoporte(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
			data.setRSeguimiento(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
			data.setEstatus(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
			data.setFCierre(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
			data.setCompromiso(rsListaQuejasCaptura.getString("MATRIZ_NAME"));
            alListaQuejasCaptura.add(data);
        }
        csObtenerQuejasCaptura.close();
        return alListaQuejasCaptura;
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
