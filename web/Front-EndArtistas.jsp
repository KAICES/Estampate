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
        <form action='VentasServlet'method='post'>
            <input type='submit' value='Reporte Ventas'/>
        </form>
        <br><br> 
        <form action='EstampasPropioServlet'method='post'>
            <input type='submit' value='Catalogo propio'/>
         </form>   
        <br><br>       
        <form action='index'method='post'>
            <input type='submit' value='volver'/>
        </form>
    </body>
</html>
