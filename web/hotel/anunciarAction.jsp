<%-- 
    Document   : anunciarAction
    Created on : 6 de mar. de 2023, 15:05:50
    Author     : Diego
--%>
<%@page import="br.com.hotel.DTO.HotelDTO"%>
<%@page import="br.com.hotel.DAO.HotelDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Anunciar Action</title>
    </head>
    <body>
        
        <%
            try {
                HotelDTO hotelDTO = new HotelDTO();
                
                hotelDTO.setHotel_nome(request.getParameter("nome") );
                hotelDTO.setHotel_cnpj(request.getParameter("cnpj") );   
                hotelDTO.setHotel_local(request.getParameter("local") );
            
                HotelDAO hotelDAO = new HotelDAO();
                
                hotelDAO.CadastrarHotel(hotelDTO);
            
                response.sendRedirect("../index.jsp");
            
            } catch(Exception e) {
                System.out.println("Erro " + e);
            }
            
            
        
        
        %>
        
        
    </body>
</html>
