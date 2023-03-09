<%-- 
    Document   : editar
    Created on : 9 de mar. de 2023, 14:27:15
    Author     : Diego
--%>
<%@page import="br.com.hotel.DTO.HotelDTO"%>
<%@page import="br.com.hotel.DAO.HotelDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../assets/static/css/reset.css">
        <link rel="stylesheet" href="../assets/static/css/header.css">
        <link rel="stylesheet" href="../assets/js/header.js">

        <title>Editar</title>
    </head>

    <style>

        @import url('https://fonts.googleapis.com/css2?family=Open+Sans&display=swap');

        @import url('https://fonts.googleapis.com/css2?family=Marcellus+SC&display=swap');

        body {
            font-family: 'Open Sans', sans-serif;
        }

        h1 {
            font-size: 30px;
            margin-bottom: 2rem;
            
        }

        label {
            font-size: 120%;
        }
        
        .input-form {
            outline: none;
            width: 150px;
            margin-top: 7px;
            margin-bottom: 20px;
            border-top: none;
            border-left: none;
            border-right: none;
        }

        .input-submit {
            background-color: #003b95;
            border-color: white;
            border-radius: 100px;
            color: white;
            cursor: pointer;
            font-size: 100%;
            font-weight: bold;
            padding: .5rem;
            width: 150px;   
        }

        .flex-container {
            min-height: 80vh;
            display: flex;
            align-items: center; 
            justify-content: center;
            /* flex-direction: column; */
        }


    </style>

    

    <body>

        <header>

            <nav>
    
                <div class="header-container">            
        
                    <div class="header-logo-container"> 
                        
                        <div>  <a href="../index.jsp" class="logo-header"> Busca Hoteis </a> </div>
    
                    </div>
                    
                    <div class="header-item-container">
    
                        <div> <a href="../hotel/anunciar.html" class="item-header"> Anuncie a sua propriedade </a> </div>
            
                        <div> <a href="../cliente/login.jsp" class="item-header"> Login </a> </div>
            
                        <div> <a href="" class="item-header"> Favoritos </a> </div>
    
                        <div class="menu-icon"> <button onclick="showMenu()"> <img class="icon" src="../assets/static/img/menu_white_36dp.svg" alt=""> </button> </div>
    
                    </div>
        
                </div>
    
                <div class="container-menu-mobile">
                    
                    <div> <a href="cliente/login.jsp" class="item-mobile"> Login </a> </div>
                    
                    <div> <a href="hotel/anunciar.html" class="item-mobile"> Anuncie a sua propriedade </a> </div>
                                      
                   <div> <a href="" class="item-mobile"> Favoritos </a> </div>
    
                </div>
                
            </nav>
    
        </header>
    
        

        <div class="flex-container">

            <div class="flex-content">
                <h1>Editar</h1>
                
                <form method="post" action="editarAction.jsp">
                    
                    
                    
                    <input class="input-form" type="hidden" name="id" value="<%=request.getParameter("id")%>" /> <br>
                    
                    <label> Nome </label> <br>
                    
                    <input class="input-form" type="text" name="nome" value="<%=request.getParameter("nome")%>" /> <br>
        
                    <label> Cnpj </label> <br>
                    
                    <input class="input-form" type="text" name="cnpj" value="<%=request.getParameter("cnpj")%>" /> <br>
        
                    <label for=""> Local </label> <br>
        
                    <input class="input-form" type="text" name="local" value="<%=request.getParameter("local")%>" /> <br>
        
                    <input class="input-submit" type="submit">
        
                </form>
                
            </div>

        </div>
        
        
        
    </body>
</html>
