<%-- 
    Document   : cadastrarAction
    Created on : 3 de mar. de 2023, 08:20:08
    Author     : Diego
--%>
<%@page import="br.com.hotel.DTO.ClienteDTO"%>
<%@page import="br.com.hotel.DAO.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Action</title>
    </head>
    <body
        
        <%
            try {
                ClienteDTO clienteDTO = new ClienteDTO();
                
                clienteDTO.setCliente_nome(request.getParameter("nome"));          
                clienteDTO.setCliente_email(request.getParameter("email"));
                clienteDTO.setCliente_senha(request.getParameter("senha"));
                clienteDTO.setCliente_cpf(request.getParameter("cpf") );
            
                ClienteDAO clienteDAO = new ClienteDAO();
                
                clienteDAO.CadastrarCliente(clienteDTO);
            
                response.sendRedirect("login.jsp");
            
            } catch(Exception e) {
                System.out.println("Erro " + e);
            }
            
            
        
        
        %>
    </body>
</html>
