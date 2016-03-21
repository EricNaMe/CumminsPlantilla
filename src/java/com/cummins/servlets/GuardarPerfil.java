/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonPerfil.Data;
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
import org.hsqldb.util.SqltoolRB;

/**
 *
 * @author nc784
 */
public class GuardarPerfil extends HttpServlet {

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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println("Guardando Perfil");
            session = request.getSession();
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            data = mapper.readValue(request.getParameter("data"), Data[].class);
            guardarPerfil();
            conn.commit();
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

    public void guardarPerfil() throws Exception {
        System.out.println("Ejecutando Procedimiento Guardar Perfil");
        String strQry1 = "(ID_PERFIL_DEALER";
        String strQry2 = "(1";
        for (Data d : data) {
            if ("optradio".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",TIPO_EVAL,PRE_EVA_TIPO";
                    strQry2 += ",'" + d.getValue() + "','" + d.getValue() + "'";
                } else {
                    strQry1 += ",TIPO_EVAL,PRE_EVA_TIPO";
                    strQry2 += ",'-','-'";
                }
            } else if ("dr".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",DR";
                    strQry2 += ",'" + d.getValue() + "'";
                } else {
                    strQry1 += ",DR";
                    strQry2 += ",'-'";
                }
            } else if ("codigoDR".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",DR_CODE";
                    strQry2 += "," + d.getValue();
                } else {
                    strQry1 += ",DR_CODE";
                    strQry2 += ",'-'";
                }
            } else if ("dealer".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",DEALER";
                    strQry2 += ",'" + d.getValue() + "'";
                } else {
                    strQry1 += ",DEALER";
                    strQry2 += ",'-'";
                }
            } else if ("codigoDeal".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",DEALER_CODE";
                    strQry2 += "," + d.getValue();
                } else {
                    strQry1 += ",DEALER_CODE";
                    strQry2 += ",'-'";
                }
            } else if ("oem".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",OEM";
                    strQry2 += ",'" + d.getValue() + "'";
                } else {
                    strQry1 += ",OEM";
                    strQry2 += ",'-'";
                }
            } else if ("fronterizo".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",FRONTERIZO";
                    strQry2 += ",'" + d.getValue() + "'";
                } else {
                    strQry1 += ",FRONTERIZO";
                    strQry2 += ",'-'";
                }
            } else if ("noBahia".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",NIVEL_SERVICIO";
                    strQry2 += ",'" + d.getValue() + "'";
                } else {
                    strQry1 += ",NIVEL_SERVICIO";
                    strQry2 += ",'-'";
                }
            } else if ("fechaEval".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",FECHA_EVALUACION";
                    strQry2 += ",TO_DATE('" + d.getValue() + "','yyyy/mm/dd')";
                } else {
                    strQry1 += ",FECHA_EVALUACION";
                    strQry2 += ",SYSDATE";
                }
            } else if ("fechaIniEval".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",F_INICIO_EVAL";
                    strQry2 += ",TO_DATE('" + d.getValue() + "','yyyy/mm/dd')";
                } else {
                    strQry1 += ",F_INICIO_EVAL";
                    strQry2 += ",SYSDATE";
                }
            } else if ("fechaFinEval".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",F_FIN_EVAL";
                    strQry2 += ",TO_DATE('" + d.getValue() + "','yyyy/mm/dd')";
                } else {
                    strQry1 += ",F_FIN_EVAL";
                    strQry2 += ",SYSDATE";
                }
            } else if ("noMecProm".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",NO_MEC_PROM";
                    strQry2 += "," + d.getValue();
                } else {
                    strQry1 += ",NO_MEC_PROM";
                    strQry2 += ",0";
                }
            } else if ("noMeca".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",NO_MEC";
                    strQry2 += "," + d.getValue();
                } else {
                    strQry1 += ",NO_MEC";
                    strQry2 += ",0";
                }
            } else if ("noAyudantes".equals(d.getName())) {
                if (!"".equals(d.getValue()) && d.getValue() != null) {
                    strQry1 += ",NO_AYUDANTES";
                    strQry2 += "," + d.getValue();
                } else {
                    strQry1 += ",NO_AYUDANTES";
                    strQry2 += ",0";
                }
            }

        }
        strQry1 += ",NO_EVA,ANIO_EVAL,PRE_EVA_ANIO,MOT_OBLIGATORIOS,MOT_OP,NP_JEFE,NP_JEFE_NAME,NP_GTE,NP_GTE_NAME,LISTA_PRO,LISTA_PRO_NAME,LISTA_PRO_STATUS,L_EVA,L_SERV,"
                + "CREATION_DATE,CREATED_BY,LAST_UPDATE_DATE,LAST_UPDATE_BY,DELETE_IND)";
        strQry2 += ",1,'2016','2016','O','ND','RENDON','MAURICIO','RAMIREZ','EDGAR','LISTA','LISTA','LISTA','EVA','SERV',SYSDATE,'NC784',SYSDATE,'NC784','N')";
        strQry1 += " VALUES " + strQry2;
        CallableStatement csGuardarMotores = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.GUARDAR_PERFIL(?)}");
        csGuardarMotores.setString("p_qry", strQry1);
        csGuardarMotores.execute();
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
