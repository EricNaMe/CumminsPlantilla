/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonObtenerGarantias.Data;
import com.cummins.jacksonObtenerGarantias.JsonObtenerGarantias;
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
public class ObtenerGarantias extends HttpServlet {

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
        JsonObtenerGarantias jsonGarantias = new JsonObtenerGarantias();
        PrintWriter out = response.getWriter();
        try {
            System.out.println("Consiguiendo Lista Garantias");
            session = request.getSession();
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            jsonGarantias.setData(obtenerGarantias());
            mapper = new ObjectMapper();
            conn.commit();
        } catch (SQLException sqlEx) {
            System.out.println("ObtenerGarantias::processRequest SQLException: " + sqlEx);
        } catch (NumberFormatException numEx) {
            System.out.println("ObtenerGarantias::processRequest NumberFormatException: " + numEx);
        } catch (Exception e) {
            System.out.println("ObtenerGarantias::processRequest Exception: " + e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.print(e);
                }
            }
        }
        out.println(mapper.writeValueAsString(jsonGarantias));
    }

    public ArrayList<Data> obtenerGarantias() throws Exception {
        ArrayList<Data> alListaGarantias = new ArrayList<Data>();
        CallableStatement csObtenerGarantias = null;
        ResultSet rsListaGarantias = null;
        Data data;
        System.out.println("Ejecutando Procedimiento Obtener Lista de Garantias");
        csObtenerGarantias = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_LISTA_GARANTIAS(?)}");
        csObtenerGarantias.registerOutParameter(1, OracleTypes.CURSOR);
        csObtenerGarantias.execute();
        rsListaGarantias = (ResultSet) csObtenerGarantias.getObject(1);
        while (rsListaGarantias.next()) {
            data = new Data();
            data.setId(rsListaGarantias.getString("ID_MATRIZ"));
            data.setFechaCaptura(rsListaGarantias.getString("MATRIZ_NAME"));
            data.setFolio(rsListaGarantias.getString("MATRIZ_NAME"));
            data.setTecCalificados(rsListaGarantias.getString("MATRIZ_NAME"));
            data.setTipoReclamo(rsListaGarantias.getString("MATRIZ_NAME"));
            data.setTipoRechazo(rsListaGarantias.getString("MATRIZ_NAME"));
            alListaGarantias.add(data);
        }
        csObtenerGarantias.close();
         conn.close();
        return alListaGarantias;
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
