/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniminuto.arqSw.proyectoEstampas.servlets;

import co.edu.uniminuto.arqSw.proyectoEstampas.DAO.CamisetasDAO;
import co.edu.uniminuto.arqSw.proyectoEstampas.DAO.EstampasDAO;
import co.edu.uniminuto.arqSw.proyectoEstampas.DAO.FacturaVentaDAO;
import co.edu.uniminuto.arqSw.proyectoEstampas.DAO.UsuarioDAO;
import co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate.Camisetas;
import co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate.Estampas;
import co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate.FacturaVenta;
import co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TIC-SCI
 */
public class VentasArtistaServlet extends HttpServlet {

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
        
//        UsuarioDAO miDAO= new UsuarioDAO();
//        CamisetasDAO miDAOC = new CamisetasDAO();
        FacturaVentaDAO miDAOF = new FacturaVentaDAO();
       EstampasDAO miDAOE = new EstampasDAO();
        
//        List<Usuario> misV = new ArrayList<Usuario>();
//        List<Camisetas> misC = new ArrayList<Camisetas>();
        List<FacturaVenta> misF = new ArrayList<FacturaVenta>();
       List<Estampas> misES = new ArrayList<Estampas>();
        
//        misV =miDAO.getUsuarios();
//        misC =miDAOC.getCamisetas();
        misF =miDAOF.getFacturaVenta();
       misES= miDAOE.getEstampas();
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>REPORTE VENTAS</title>");            
            out.println("</head>");
            out.println("<body>");
            int conteo = 0;
            out.println("<table class='egt' border ='1'>");
            out.println("<h1>REPORTE GENERAL DE VENTAS DE </h1><br><br>");             
            out.println("<tr><td>Usuario</td><td>Clasificacion camiseta</td><td>Valor Artista</td><td>Valor Total</td><td>Estampa</td></tr>");
             for(Estampas es:misES){
            for(FacturaVenta f:misF){            
                    
                

                                  
              out.println("<tr><td>"+f.getValorArtista()+"</td><td></td></tr>");     
             
                }
 
            }  
    
              
            
            out.println("<form action='index.jsp' method='post'>");            
            out.println(" <input type='submit' value='volver'/>");            
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
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
