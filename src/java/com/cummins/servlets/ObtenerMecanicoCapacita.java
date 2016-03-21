/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonMotoresCapacitaMec.CapMecanicoCurso;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.jdbc.OracleTypes;
import servlets.SaveCsv;

/**
 *
 * @author nc784
 */
public class ObtenerMecanicoCapacita extends HttpServlet {

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





    private boolean rollback=false;
    private ArrayList<CapMecanicoCurso> arrayTeenCare;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        try {
            
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);

            obtenerCursosMecanicos();

            conn.commit();
            out.println(mapper.writeValueAsString(arrayTeenCare));
        }  catch (SQLException ex) {
            rollback=true;
            out.print("Ocurrio un error al guardar la informacion");
            System.out.println(ex);
        } catch (Exception ex) {
            rollback=true;
            out.print("Ocurrio un error al guardar la informacion");
            System.out.println(ex);
        } finally {
            if(rollback){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    out.print("Ocurrio un error al guardar la informacion");
                    System.out.println(ex);
                }
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(SaveCsv.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
            out.close();
        }
    }


    private void obtenerCursosMecanicos() throws SQLException {
        arrayTeenCare = new ArrayList<CapMecanicoCurso>();
        CallableStatement csObtenerMotores = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_MECANICOS_CAPACITA(?)}");
        csObtenerMotores.registerOutParameter("p_resultado", OracleTypes.CURSOR);

        csObtenerMotores.execute();
        ResultSet resultado = (ResultSet) csObtenerMotores.getObject("p_resultado");
        CapMecanicoCurso tc;
        while (resultado.next()) {
            tc= new CapMecanicoCurso();
            tc.setPromotion_id(resultado.getString("promotion_id"));
            tc.setNombre_Mecanico(resultado.getString("Nombre_Mecanico"));
            tc.setSp_code(resultado.getString("SP_CODE"));
            tc.setCursos(resultado.getString("Cursos"));
            arrayTeenCare.add(tc);
        }
  
        csObtenerMotores.close();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
