/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonMotoresOEM.Data;
import com.cummins.jacksonMotoresOEM.JsonMotoresOEM;
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
public class ObtenerNivelServicio extends HttpServlet {

	private static final long serialVersionUID = 1L;
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
        JsonMotoresOEM jsonMotores = new JsonMotoresOEM();
        PrintWriter out = response.getWriter();
        String strIdDealer = "";
        try {
            System.out.println("Consiguiendo Lista Motores Obligatorios Opcionales");
            session = request.getSession();
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            strIdDealer = request.getParameter("id_deal");
            jsonMotores.setData(obtenerMotoresOblPerfil(strIdDealer));
            jsonMotores.setMessage("OK");
            mapper = new ObjectMapper();
            conn.commit();
        } catch (SQLException sqlEx) {
            jsonMotores.setMessage("No se pudo extraer la lista de los programas");
            System.out.println("ObtenerNivelServicio::processRequest SQLException: " + sqlEx);
        } catch (NumberFormatException numEx) {
            jsonMotores.setMessage("No se pudo extraer la lista de los programas");
            System.out.println("ObtenerNivelServicio::processRequest NumberFormatException: " + numEx);
        } catch (Exception e) {
            jsonMotores.setMessage("No se pudo extraer la lista de los programas");
            System.out.println("ObtenerNivelServicio::processRequest Exception: " + e);
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

    public ArrayList<Data> obtenerMotoresOblPerfil(String strIdDealer) throws Exception {
        ArrayList<Data> alListaMotor = new ArrayList<Data>();
        CallableStatement csObtenerMotores = null;
        ResultSet rsListaMotores = null;
        Data data;
        System.out.println("Ejecutando Procedimiento Obtener Motores Obligatorios Opcionales Perfil");
        csObtenerMotores = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_MOTORES_PERFIL(?,?,?)}");
        csObtenerMotores.registerOutParameter(1, OracleTypes.CURSOR);
        csObtenerMotores.setString(2, strIdDealer);
        csObtenerMotores.setString(3, "");
        csObtenerMotores.execute();
        rsListaMotores = (ResultSet) csObtenerMotores.getObject(1);
        while (rsListaMotores.next()) {
            data = new Data();
            data.setIDMOTORESOEM(rsListaMotores.getInt("id_motores_oem"));
            data.setMotor(rsListaMotores.getString("motor"));
            data.setAutorizado("Autorizado");
            data.setNoAutorizado("No Autorizado");
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
