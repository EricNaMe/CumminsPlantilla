/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonMotoresCapacitaMec.Data;
import com.cummins.jacksonMotoresCapacitaMec.JsonMotoresCapacitaMec;
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
public class ObtenerMotoresCapacitaMec extends HttpServlet {

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
        JsonMotoresCapacitaMec jsonMotores = new JsonMotoresCapacitaMec();
        PrintWriter out = response.getWriter();
        try {
            System.out.println("Consiguiendo Lista Motores Cantidad de Motores");
            session = request.getSession();
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            jsonMotores.setData(obtenerMotoresCapacitaMec());
            mapper = new ObjectMapper();
            conn.commit();
        } catch (SQLException sqlEx) {
            System.out.println("ObtenerMotoresCapacitaMec::processRequest SQLException: " + sqlEx);
        } catch (NumberFormatException numEx) {
            System.out.println("ObtenerMotoresCapacitaMec::processRequest NumberFormatException: " + numEx);
        } catch (Exception e) {
            System.out.println("ObtenerMotoresCapacitaMec::processRequest Exception: " + e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.print(e);
                }
            }
        }
        out.println(mapper.writeValueAsString(jsonMotores));
    }

    public ArrayList<Data> obtenerMotoresCapacitaMec() throws Exception {
        ArrayList<Data> alListaMotor = new ArrayList<Data>();
        CallableStatement csObtenerMotores = null;
        ResultSet rsListaMotores = null;
        Data data;
        System.out.println("Ejecutando Procedimiento Obtener Motores Cantidad de Motores");
        csObtenerMotores = conn.prepareCall("{ call ZMKT.ZMKT7352_SELUES_PKG.obtener_mecanicos_certificados(?,?)}");
        csObtenerMotores.registerOutParameter("p_resultado", OracleTypes.CURSOR);
        csObtenerMotores.setString("P_SP_CODE", "P_SP_CODE");
        csObtenerMotores.execute();
        rsListaMotores = (ResultSet) csObtenerMotores.getObject("p_resultado");
        while (rsListaMotores.next()) {
            data = new Data();
            data.setID_PARTICIPACION_MOTOR(rsListaMotores.getString("ID_PARTICIPACION_MOTOR"));
            data.setMec_cert(rsListaMotores.getString("mec_cert"));
            data.setMEC_REQ(rsListaMotores.getString("MEC_REQ"));
            data.setMotor(rsListaMotores.getString("motor"));
            data.setPorcent_motor(rsListaMotores.getString("porcent_motor"));
            data.setPorcent_obtenido(rsListaMotores.getString("porcent_obtenido"));
            alListaMotor.add(data);
        }
        csObtenerMotores.close();
        return alListaMotor;
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
