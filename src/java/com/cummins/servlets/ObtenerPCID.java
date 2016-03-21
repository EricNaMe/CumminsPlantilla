/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonObtenerPCID.Data;
import com.cummins.jacksonObtenerPCID.JsonObtenerPCID;
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
public class ObtenerPCID extends HttpServlet {

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
        JsonObtenerPCID jsonPCID = new JsonObtenerPCID();
        PrintWriter out = response.getWriter();
        try {
            System.out.println("Consiguiendo Lista PCID");
            session = request.getSession();
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            jsonPCID.setData(obtenerPCID());
            mapper = new ObjectMapper();
            conn.commit();
        } catch (SQLException sqlEx) {
            System.out.println("ObtenerPCID::processRequest SQLException: " + sqlEx);
        } catch (NumberFormatException numEx) {
            System.out.println("ObtenerPCID::processRequest NumberFormatException: " + numEx);
        } catch (Exception e) {
            System.out.println("ObtenerPCID::processRequest Exception: " + e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.print(e);
                }
            }
        }
        out.println(mapper.writeValueAsString(jsonPCID));
    }

    public ArrayList<Data> obtenerPCID() throws Exception {
        ArrayList<Data> alListaPCID = new ArrayList<Data>();
        CallableStatement csObtenerPCID = null;
        ResultSet rsListaPCID = null;
        Data data;
        System.out.println("Ejecutando Procedimiento Obtener Lista PCID");
        csObtenerPCID = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_PCID(?)}");
        csObtenerPCID.registerOutParameter(1, OracleTypes.CURSOR);
        csObtenerPCID.execute();
        rsListaPCID = (ResultSet) csObtenerPCID.getObject(1);
        while (rsListaPCID.next()) {
            data = new Data();
            data.setId(rsListaPCID.getString("ID_MATRIZ"));
            data.setPCID(rsListaPCID.getString("MATRIZ_NAME"));
            data.setFechaExpiracion(rsListaPCID.getString("MATRIZ_NAME"));
            data.setCliente(rsListaPCID.getString("MATRIZ_NAME"));
            data.setEnBDHetas(rsListaPCID.getString("MATRIZ_NAME"));
            data.setValidoAuditorias(rsListaPCID.getString("MATRIZ_NAME"));
            data.setComentarios(rsListaPCID.getString("MATRIZ_NAME"));
            alListaPCID.add(data);
        }
        csObtenerPCID.close();
        return alListaPCID;
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
