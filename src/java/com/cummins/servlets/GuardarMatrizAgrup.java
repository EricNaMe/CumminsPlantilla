package com.cummins.servlets;

import com.cummins.DBConexion.Conexion;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

public class GuardarMatrizAgrup
  extends HttpServlet
{
  private Connection conn;
  private HttpSession session;
  
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    String strName = "";
    String strValue = "";
    String strPK = "";
    try
    {
      System.out.println("Guardando Existencia Matriz");
      this.session = request.getSession();
      this.conn = Conexion.getDS().getConnection();
      this.conn.setAutoCommit(false);
      strName = request.getParameter("name");
      strValue = request.getParameter("value");
      strPK = request.getParameter("pk");
      if (strName.equals("comentariosNP")) {
        strName = "COMENTARIOS";
      } else if (strName.equals("ubicacion")) {
        strName = "UBICACION";
      } else if (strName.equals("volumenVentas")) {
        strName = "VOLUMEN_VTA_1";
      }
      if (((!"".equals(strName)) && (strName != null)) || 
        ((!"".equals(strValue)) && (strValue != null)) || (
        (!"".equals(strPK)) && (strPK != null))) {
        guardarMatriz(strPK, strValue, strName);
      }
      this.conn.commit();
      out.print("La informacion fue guardada exitosamente");
    }
    catch (SQLException ex)
    {
      out.print("Ocurrio un error al guardar la informacion");
      System.out.println(ex);
    }
    catch (Exception ex)
    {
      out.print("Ocurrio un error al guardar la informacion");
      System.out.println(ex);
    }
    finally
    {
      if (this.conn != null) {
        try
        {
          this.conn.close();
        }
        catch (SQLException e)
        {
          System.out.println(e);
        }
      }
      out.close();
    }
  }
  
  public void guardarMatriz(String strPK, String strValue, String strName)
    throws Exception
  {
    System.out.println("Ejecutando Procedimiento Guardar Existencia Matriz");
    












    CallableStatement csGuardarMatriz = this.conn.prepareCall("{ call ZMKT.ZMKT7257_DES_TEST_PKG.GUARDAR_MATRIZ(?,?,?,?)}");
    csGuardarMatriz.setString(1, strPK);
    csGuardarMatriz.setString(2, strValue);
    
    csGuardarMatriz.setString(3, strName);
    csGuardarMatriz.setString(4, "NC784");
    csGuardarMatriz.execute();
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    processRequest(request, response);
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    processRequest(request, response);
  }
  
  public String getServletInfo()
  {
    return "Short description";
  }
}
