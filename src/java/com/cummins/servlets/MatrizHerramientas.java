/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import com.cummins.jacksonMatrizHerramientas.Data;
import com.cummins.jacksonMatrizHerramientas.JsonMatrizHerramientas;
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
public class MatrizHerramientas extends HttpServlet {

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
    String strIdDealer;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        JsonMatrizHerramientas jsonMatriz = new JsonMatrizHerramientas();
        PrintWriter out = response.getWriter();
        String strMatrisId = "";
        try {
            System.out.println("Consiguiendo Lista Matriz");
            session = request.getSession();
            conn = Conexion.getDS().getConnection();
            conn.setAutoCommit(false);
            strMatrisId = request.getParameter("id_matriz");
            if (!"".equals(strMatrisId) && strMatrisId != null) {
                data = mapper.readValue(request.getParameter("data"), Data[].class);
                jsonMatriz.setData(obtenerMatrizAgrup());
            } else {
                strIdDealer = request.getParameter("id_deal");
                System.out.println(strIdDealer);
                jsonMatriz.setData(obtenerMatriz());
            }
            mapper = new ObjectMapper();
            conn.commit();
        } catch (SQLException sqlEx) {
            System.out.println("MotoresMatriz::processRequest SQLException: " + sqlEx);
        } catch (NumberFormatException numEx) {
            System.out.println("MotoresMatriz::processRequest NumberFormatException: " + numEx);
        } catch (Exception e) {
            System.out.println("MotoresMatriz::processRequest Exception: " + e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.print(e);
                }
            }
        }
        out.println(mapper.writeValueAsString(jsonMatriz));
    }

    public ArrayList<Data> obtenerMatriz() throws Exception {
        ArrayList<Data> alListaMatriz = new ArrayList<Data>();
        CallableStatement csObtenerMatriz = null;
        ResultSet rsListaMatriz = null;
        Data data;
        System.out.println("Ejecutando Procedimiento Obtener Matriz");
        csObtenerMatriz = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_MATRIZ(?,?)}");
        csObtenerMatriz.registerOutParameter(1, OracleTypes.CURSOR);
        csObtenerMatriz.setString(2, strIdDealer);
        csObtenerMatriz.execute();
        rsListaMatriz = (ResultSet) csObtenerMatriz.getObject(1);
        while (rsListaMatriz.next()) {
            data = new Data();
            data.setMotorId(rsListaMatriz.getString("ID_MATRIZ"));
            data.setMatriz(rsListaMatriz.getString("MATRIZ_NAME"));
            alListaMatriz.add(data);
        }
        csObtenerMatriz.close();
        return alListaMatriz;
    }

    public ArrayList<Data> obtenerMatrizAgrup() throws Exception {
        ArrayList<Data> alListaMatriz = new ArrayList<Data>();
        CallableStatement csObtenerMatriz = null;
        ResultSet rsListaMatriz = null;
        Data data;
        String strMatrisIds = " 1 = 1 ";
        int i = 0;
        System.out.println("Ejecutando Procedimiento Obtener Matriz Agrupada");
        for (Data d : this.data) {
            if (i == 0) {
                strMatrisIds = d.getMotorId();
            } else {
                strMatrisIds += "," + d.getMotorId();
            }
            i++;
        }
        System.out.println(strMatrisIds);
        csObtenerMatriz = conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.OBTENER_MATRIZ_AGR(?,?)}");
        csObtenerMatriz.registerOutParameter(1, OracleTypes.CURSOR);
        csObtenerMatriz.setString(2, strMatrisIds);
        csObtenerMatriz.execute();
        rsListaMatriz = (ResultSet) csObtenerMatriz.getObject(1);
        while (rsListaMatriz.next()) {
            data = new Data();
            data.setIdInfantBdy(rsListaMatriz.getString("ID_INFANT_BDY"));
            data.setProducto(rsListaMatriz.getString("PRODUCTO"));
            data.setNoParte(rsListaMatriz.getString("NO_PARTE"));
            data.setNoParteAnt(rsListaMatriz.getString("NO_PARTE_ANT"));
            data.setDescripcion(rsListaMatriz.getString("DESCRIPCION"));
            data.setComentariosNP(rsListaMatriz.getString("COMENTARIOS"));
            data.setCantidadMin(rsListaMatriz.getString("CM"));
            data.setExistencia(String.valueOf(rsListaMatriz.getInt("EXISTENCIA")));
            data.setPonderacion(rsListaMatriz.getString("PONDERACION"));
            data.setUbicacion(rsListaMatriz.getString("UBICACION"));
            data.setVolumenVentas(rsListaMatriz.getString("VOLUMEN_VTA_1"));
            data.setUrl(rsListaMatriz.getString("URL"));
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
