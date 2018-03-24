<%-- 
    Document   : Front-EndArtistas
    Created on : 23/03/2018, 01:43:24 AM
    Author     : TIC-SCI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action='EstampasPropioServlet'method='post'>
         <SELECT name="Artistas"  > 
            <OPTION >Seleccionar</OPTION>
            <OPTION value="Deming">Deming</OPTION>
            <OPTION value="Morgan">Morgan</OPTION>
            <OPTION value="Darwing">Darwing</OPTION> 
        </SELECT>  
            
         <input type='submit' value='Catalogo propio'/>

         </form>  
               <form action='EstampasRatingServlet'method='post'>
         <SELECT name="Artistas"  > 
            <OPTION >Seleccionar</OPTION>
            <OPTION value="Deming">Deming</OPTION>
            <OPTION value="Morgan">Morgan</OPTION>
            <OPTION value="Darwing">Darwing</OPTION> 
        </SELECT>  
            
        <input type='submit' value='Registro Rating'/>

         </form>      
        
                 </form>  
      <form action='VentasArtistaServlet'method='post'>
         <SELECT name="Artistas"  > 

            <OPTION >Seleccionar</OPTION>
            <OPTION value="Deming">Deming</OPTION>
            <OPTION value="Morgan">Morgan</OPTION>
            <OPTION value="Darwing">Darwing</OPTION> 
        </SELECT>  
            
        <input type='submit' value='Reporte de utilidades'/>
        
        
        <br><br>        
        
        
        
        
        <form action='index'method='post'>
            <input type='submit' value='volver'/>
        </form>        
    </body>
</html>
