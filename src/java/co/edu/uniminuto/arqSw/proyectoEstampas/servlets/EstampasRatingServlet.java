/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniminuto.arqSw.proyectoEstampas.servlets;

import co.edu.uniminuto.arqSw.proyectoEstampas.DAO.EstampasDAO;
import co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate.Estampas;
import co.edu.uniminuto.arqSw.proyectoEstampas.vos.NombreArtistasVO;
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
public class EstampasRatingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private NombreArtistasVO miArtista;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        EstampasDAO miDAO= new EstampasDAO();

        List<Estampas> misE = new ArrayList<Estampas>();
        misE =miDAO.getEstampas();
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         try {
            String nomArt = miArtista.getNomArtista();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CATALOGO ESTAMPAS PROPIO DEL ARTISTA</title>");            
            out.println("</head>");
            out.println("<body>");
            int conteo = 0;
            out.println("<table class='egt' border ='1'>");
            out.println("<h1>REGISTRO DE RATING DE ESTAMPAS HECHOS POR "+nomArt+"</h1><br><br>");             
            out.println("<tr><td>Tema</td><td>Rating</td><td>precio</td></tr>");
            for(Estampas e:misE){
                 
                   if(e.getAutor().equals(nomArt))      
                    out.println("<tr><td>"+e.getNombreEstampa()+"</td><td>"+e.getRating()+" unds</td><td> $ "+e.getPrecio()+"</td></tr>");     
   
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
        
                
        String nomArtista  = request.getParameter("Artistas");
        
        miArtista =new NombreArtistasVO (nomArtista);
        
        
        processRequest(request, response);
        
        
        
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
