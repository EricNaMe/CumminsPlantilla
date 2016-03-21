/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.CallableStatement;

import javax.servlet.http.HttpSession;

/**
 *
 * @author nc784
 */
public class GuardarMotores extends HttpServlet {

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
     private HttpSession session;
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String strMotor = "";
        String strRango = "";
        String strName = "";
        String strValue = "";
        String strPK = "";
        try {
            System.out.println("Guardando Motores");
            session = request.getSession();
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            strMotor = request.getParameter("motor");
            //URLDecoder.decode(request.getParameter("motor"),"");
            strRango = request.getParameter("rango");
            
            strName = request.getParameter("name");
            strValue = request.getParameter("value");
            strPK = request.getParameter("pk");
            if((!"".equals(strName) && strName != null) ||
                    (!"".equals(strValue) && strValue != null) ||
                    (!"".equals(strPK) && strPK != null)){
                if("Motor".equals(strName)){
                    guardarMotores(strPK, strValue);
                }else if("Rango".equals(strName)){
                    guardarRangos(strPK, strValue);
                }
            }else{
                System.out.println("ESTE ES EL ELSE");
                
            	guardarMotoresNuevo(strMotor, strRango);
            }
            conn.commit();
            out.print("La informacion fue guardada exitosamente");
        }catch (SQLException ex) {
            out.print("Ocurrio un error al guardar la informacion");
            System.out.println(ex);
        } catch (Exception ex) {
            out.print("Ocurrio un error al guardar la informacion");
            System.out.println(ex);
        } finally {
            if(conn != null){
                try{
                    conn.close();
                }catch(SQLException e){
                    System.out.println(e);
                }
            }
            out.close();
        }
    }

    public void guardarMotores(String strPK, String strValue) throws Exception{
        System.out.println("Ejecutando Procedimiento Guardar Motores");
        CallableStatement csGuardarMotores = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.GUARDAR_MOTORES(?,?,?)}");
        csGuardarMotores.setString("p_id_motor", strPK);
        csGuardarMotores.setString("p_motor", strValue);
        //csGuardarMotores.setString("p_usuario", session.getId());
        csGuardarMotores.setString("p_usuario", "NC874");
        csGuardarMotores.execute();
    }
    
    public void guardarRangos(String strPK, String strValue) throws Exception{
        System.out.println("Ejecutando Procedimiento Guardar Rango");
        CallableStatement csGuardarMotores = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.GUARDAR_RANGOS(?,?,?)}");
        csGuardarMotores.setString("p_id_motor", strPK);
        csGuardarMotores.setString("p_rango", strValue);
        //csGuardarMotores.setString("p_usuario", session.getId());
        csGuardarMotores.setString("p_usuario", "NC874");
        csGuardarMotores.execute();
    }
    
    public void guardarMotoresNuevo(String strMotor, String strRango) throws Exception{
        System.out.println("Ejecutando Procedimiento Guardar Motor Nuevo");
        CallableStatement csGuardarMotores = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.GUARDAR_MOTORES_NUEVO(?,?,?)}");
        //csGuardarMotores.setString(1, session.getId());
       System.out.println("MOTOR:" + strMotor + "  RANGO:" + strRango);
        csGuardarMotores.setString("p_usuario", "NC784");
        csGuardarMotores.setString("p_motor", strMotor);
        csGuardarMotores.setString("p_rango", strRango);
        csGuardarMotores.execute();
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
