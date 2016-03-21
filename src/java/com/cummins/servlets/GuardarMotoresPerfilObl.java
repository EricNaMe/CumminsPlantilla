/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonMotoresOEM.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nc784
 */
public class GuardarMotoresPerfilObl extends HttpServlet {

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
    Data[] data;
    String strIdDealer = "";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            System.out.println("Guardando Motores Perfil Oblogatorios");
            session = request.getSession();
            data = mapper.readValue(request.getParameter("data"), Data[].class);
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            strIdDealer = request.getParameter("id_deal");
            guardarMotoresPerfil(strIdDealer);
            
            System.out.println("#0001 EXITO AL GUARDAR");
            conn.commit();
            
            System.out.println("#0002 EXITO AL GUARDAR");
            out.print("La informacion fue guardada exitosamente");
        } catch (SQLException ex) {
            out.print("Ocurrio un error al guardar la informacion");
            System.out.println(ex);
        } catch (Exception ex) {
            out.print("Ocurrio un error al guardar la informacion");
            System.out.println(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            out.close();
        }
    }

    public void guardarMotoresPerfil(String strIdDealer) throws Exception {
        String strMotores = "";
        int i = 0;
        System.out.println("Ejecutando Procedimiento Guardar Motores Perfil Obligatorios");
        CallableStatement csGuardarMotores = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.GUARDAR_MOTORES_PERFIL(?,?,?)}");
        for (Data d : data) {
           /* if (i == 0) {
                strMotores = d.getMotor();
            } else {
                strMotores += "," + d.getMotor();
            }*/
        	
        	System.out.println("p_motor:" + d.getIDMOTORESOEM() );
        	System.out.println("p_id_dealer:"+ strIdDealer);
        	//System.out.println();
        	csGuardarMotores.setLong("p_motor", d.getIDMOTORESOEM());
            csGuardarMotores.setString("p_tipo_motor", "O");
            csGuardarMotores.setString("p_id_dealer", strIdDealer);
            csGuardarMotores.execute();
        	
        }
       /*
        if (!"".equals(strMotores) && strMotores != null) {
            
        	csGuardarMotores.setString("p_motor", strMotores);
            csGuardarMotores.setString("p_tipo_motor", "O");
            csGuardarMotores.setString("p_id_dealer", strIdDealer);
            csGuardarMotores.execute();
        }*/
        
        csGuardarMotores.close();
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
