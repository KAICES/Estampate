<%-- 
    Document   : index
    Created on : 22/03/2018, 11:26:43 PM
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
        <form action='UsuarioServlet'method='post'>
            <input type='submit' value='Usuarios'/>
        </form>
        
        <form action='EstampaServlet'method='post'>
            <input type='submit' value='Estampas'/>
        </form>
        
        <form action='Front-EndArtistas.jsp'method='post'>
            <input type='submit' value='Ingreso para Artistas'/>
        </form>
        
        
        
    </body>
</html>
