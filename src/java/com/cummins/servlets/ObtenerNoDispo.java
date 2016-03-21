/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonObtenerNoDispo.Data;
import com.cummins.jacksonObtenerNoDispo.JsonObtenerNoDispo;
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
public class ObtenerNoDispo extends HttpServlet {

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
        JsonObtenerNoDispo jsonNoDispo = new JsonObtenerNoDispo();
        PrintWriter out = response.getWriter();
        try {
            System.out.println("Consiguiendo Lista NoDispo");
            session = request.getSession();
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            jsonNoDispo.setData(obtenerNoDispo());
            mapper = new ObjectMapper();
            conn.commit();
        } catch (SQLException sqlEx) {
            System.out.println("ObtenerNoDispo::processRequest SQLException: " + sqlEx);
        } catch (NumberFormatException numEx) {
            System.out.println("ObtenerNoDispo::processRequest NumberFormatException: " + numEx);
        } catch (Exception e) {
            System.out.println("ObtenerNoDispo::processRequest Exception: " + e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.print(e);
                }
            }
        }
        out.println(mapper.writeValueAsString(jsonNoDispo));
    }

    public ArrayList<Data> obtenerNoDispo() throws Exception {
        ArrayList<Data> alListaNoDispo = new ArrayList<Data>();
        CallableStatement csObtenerNoDispo = null;
        ResultSet rsListaNoDispo = null;
        Data data;
        System.out.println("Ejecutando Procedimiento Obtener Lista NoDispo");
        csObtenerNoDispo = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_NODISPO(?)}");
        csObtenerNoDispo.registerOutParameter(1, OracleTypes.CURSOR);
        csObtenerNoDispo.execute();
        rsListaNoDispo = (ResultSet) csObtenerNoDispo.getObject(1);
        while (rsListaNoDispo.next()) {
            data = new Data();
            data.setId(rsListaNoDispo.getString("ID_MATRIZ"));
            data.setNDREFechaLlamada(rsListaNoDispo.getString("MATRIZ_NAME"));
            data.setNDREAtendido(rsListaNoDispo.getString("MATRIZ_NAME"));
            data.setNDRECliente(rsListaNoDispo.getString("MATRIZ_NAME"));
            data.setNDRERazon(rsListaNoDispo.getString("MATRIZ_NAME"));
            alListaNoDispo.add(data);
        }
        csObtenerNoDispo.close();
        return alListaNoDispo;
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
