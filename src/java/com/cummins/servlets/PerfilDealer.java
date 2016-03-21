/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonPerfil.Data;
import com.cummins.jacksonPerfil.JsonPerfil;
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
public class PerfilDealer extends HttpServlet {

    private Connection conn;
    private boolean rollback = false;

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        JsonPerfil jsonPerfil = new JsonPerfil();
        String id_dealer = "";
        try {
            System.out.println("Consiguiendo Perfil Dealear");
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            id_dealer = request.getParameter("id_deal");
            jsonPerfil.setData(obtenerPerfil(id_dealer));
            conn.commit();
        } catch (SQLException ex) {
            rollback = true;
            out.print("error");
            System.out.println(ex);
        } catch (Exception ex) {
            rollback = true;
            out.print("error");
            System.out.println(ex);
        } finally {
            if (rollback) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    out.print("error");
                    System.out.println(ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        out.println(mapper.writeValueAsString(jsonPerfil));
    }

    private ArrayList<Data> obtenerPerfil(String id_dealer) throws SQLException {
        // TODO Auto-generated method stub
        System.out.println("Ejecutando Procedimiento Perfil Dealear");
        Data data;
        ArrayList<Data> arrayPerfil = new ArrayList<Data>();
        CallableStatement cs = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_MECANICOS(?,?)}");
        cs.registerOutParameter("p_resultado", OracleTypes.CURSOR);
        cs.setString("p_id_dealer", id_dealer);
        cs.execute();
        ResultSet resultado = (ResultSet) cs.getObject("p_resultado");
        while (resultado.next()) {
            data = new Data();
            data.setNo(resultado.getString("PROMOTION_ID"));
            data.setNombre(resultado.getString("FIRST_NAME").trim() + ", " + resultado.getString("LAST_NAME").trim());
            data.setStatus(resultado.getString("PUESTO"));
            arrayPerfil.add(data);
        }
        cs.close();
        return arrayPerfil;
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
