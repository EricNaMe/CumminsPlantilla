/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonHerramientas.Data;
import com.cummins.jacksonHerramientas.JsonHerramientas;
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
public class HerramientasEvaluar extends HttpServlet {

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
    Data[] data;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        JsonHerramientas jsonHerramientas = new JsonHerramientas();
        PrintWriter out = response.getWriter();
        try {
            System.out.println("Consiguiendo Lista Herramientas Evaluar");
            session = request.getSession();
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            jsonHerramientas.setData(obtenerMatriz());
            mapper = new ObjectMapper();
            conn.commit();
        } catch (SQLException sqlEx) {
            System.out.println("HerramientasEvaluar::processRequest SQLException: " + sqlEx);
        } catch (NumberFormatException numEx) {
            System.out.println("HerramientasEvaluar::processRequest NumberFormatException: " + numEx);
        } catch (Exception e) {
            System.out.println("HerramientasEvaluar::processRequest Exception: " + e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.print(e);
                }
            }
        }
        out.println(mapper.writeValueAsString(jsonHerramientas));
    }

    public ArrayList<Data> obtenerMatriz() throws Exception {
        ArrayList<Data> alListaMatriz = new ArrayList<Data>();
        CallableStatement csObtenerMatriz = null;
        ResultSet rsListaMatriz = null;
        Data data;
        System.out.println("Ejecutando Procedimiento Obtener Herramientas Evaluar");
        csObtenerMatriz = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_HERRAMIENTAS_EVAL(?)}");
        csObtenerMatriz.registerOutParameter(1, OracleTypes.CURSOR);
        csObtenerMatriz.execute();
        rsListaMatriz = (ResultSet) csObtenerMatriz.getObject(1);
        while (rsListaMatriz.next()) {
            data = new Data();
            data.setNoParte(rsListaMatriz.getString("ID_MATRIZ"));
            data.setNoParteAnt(rsListaMatriz.getString("MATRIZ_NAME"));
            data.setDescripcion(rsListaMatriz.getString("MATRIZ_NAME"));
            data.setUso(rsListaMatriz.getString("MATRIZ_NAME"));
            data.setCantMinima(rsListaMatriz.getString("MATRIZ_NAME"));
            data.setExistencia(rsListaMatriz.getString("MATRIZ_NAME"));
            data.setPonderacion(rsListaMatriz.getString("MATRIZ_NAME"));
            data.sethNueva(rsListaMatriz.getString("MATRIZ_NAME"));
            data.setUbicacion(rsListaMatriz.getString("MATRIZ_NAME"));
            data.setImagen(rsListaMatriz.getString("MATRIZ_NAME"));
            alListaMatriz.add(data);
        }
        csObtenerMatriz.close();
        return alListaMatriz;
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
