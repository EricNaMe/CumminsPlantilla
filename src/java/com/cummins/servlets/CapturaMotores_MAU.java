/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonMotores.Data;
import com.cummins.jacksonMotores.JsonMotores;
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
public class CapturaMotores_MAU extends HttpServlet {
    private Connection conn;
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
        JsonMotores jsonMotores = new JsonMotores();
        String strMotor = "";
        PrintWriter out = response.getWriter();
        try{
            System.out.println("Consiguiendo Lista Motores");
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            strMotor = (String)request.getParameter("motor");
            jsonMotores.setData(obtenerMotores(strMotor));
            jsonMotores.setMessage("OK");
            //mapper = new ObjectMapper();
            conn.commit();
        }catch(SQLException sqlEx){
            jsonMotores.setMessage("No se pudo extraer la lista de los programas");
            System.out.println("CapturaMotores::processRequest SQLException: " + sqlEx);
        }catch (NumberFormatException numEx) {
            jsonMotores.setMessage("No se pudo extraer la lista de los programas");
            System.out.println("CapturaMotores::processRequest NumberFormatException: " + numEx);
        } catch (Exception e) {
            jsonMotores.setMessage("No se pudo extraer la lista de los programas");
            System.out.println("CapturaMotores::processRequest Exception: " + e);
        }finally{
            if(conn != null){
                try{
                    conn.close();
                }catch(SQLException e){
                    System.out.println(e);
                }
            }
        }
        out.println(mapper.writeValueAsString(jsonMotores));
    }

    public ArrayList<Data> obtenerMotores(String strMotor) throws Exception{
        ArrayList<Data> alListaMotor = new ArrayList<Data>();
        CallableStatement csObtenerMotores = null;
        ResultSet rsListaMotores = null;
        Data data;
        System.out.println("Ejecutando Procedimiento Obtener Motores");
        csObtenerMotores = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_MOTORES(?,?)}");
        csObtenerMotores.setString(1, strMotor);
        csObtenerMotores.registerOutParameter(2, OracleTypes.CURSOR);
        csObtenerMotores.execute();
        rsListaMotores = (ResultSet)csObtenerMotores.getObject(2);
        while(rsListaMotores.next()){
            data = new Data();
            data.setIDMOTORES(rsListaMotores.getInt("id_motores"));
            data.setMotor(rsListaMotores.getString("motor"));
            data.setRango(rsListaMotores.getString("rango"));
            alListaMotor.add(data);
        }
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
