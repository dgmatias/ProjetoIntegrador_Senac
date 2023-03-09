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

.header-container {
    background-color: #003b95;
    display: flex;
    justify-content: space-around;
    align-items: center;
    height: 13vh;
}

.logo-header {
    color: white;
    font-size: 32px;
    /* font-family: 'Nixie One', cursive; */
    font-family: 'Marcellus SC', serif;
    text-decoration: none;
    font-weight: bold;
}

.header-item-container {
    /* background-color: aqua; */
    display: inline-flex;
}

.item-header {
    color: white;
    font-size: 20px;
    font-family: 'Open Sans', sans-serif;
    padding: 2rem;
    text-decoration: none;
}

.item-header:hover {
    font-weight: bold;
}

/* Menu mobile */



.container-menu-mobile {
    display: none;
    background-color: #003b95;
    text-align: center;
    height: 10vh;
}

.item-mobile {
    color: white;
    font-size: 10 px;
    font-family: 'Open Sans', sans-serif;
    text-decoration: none;
}

.menu-icon {
    
    display: none;
}

@media (max-width: 900px) {

    .logo-header {
        font-size: 25px;
    }

    .item-header {
        font-size: 18px;
        padding: .5rem;
    }

}

@media (max-width: 750px) {

    .logo-header {
        font-size: 22px;
    }

    .item-header {
        font-size: 13px;
        padding: .5rem;
    }

}

@media (max-width: 500px) {

    /* .header-container {
        background-color: greenyellow;
    } */

    .logo-header {

        font-size: 15px;
        
    }

    .item-header {
        display: none;
    }

    .menu-icon {
        display: block;
    }

    .menu-icon button {
        border: none;
        background-color: transparent;
    }

    .open {
        display: block;
    }

}

    </style>

    <script>
        function showMenu() {
    // console.log("funcionando");
    let menuContainer = document.querySelector('.container-menu-mobile');
    // console.log(menuContainer);
    if(menuContainer.classList.contains('open')) {
        menuContainer.classList.remove('open');
        // document.querySelector('menu-icon').src = "assets/static/img/close_white_36dp.svg"; 
    } else {
        menuContainer.classList.add('open');
        // document.querySelector('menu-icon').src = "assets//static/img/menu_while_36dp.svg"; 
    }
}


    </script>

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
                <h1>Excluir</h1>
                
                <form method="post" action="excluirAction.jsp">
                    
                    
                    
                    <input class="input-form" type="hidden" name="id" value="<%=request.getParameter("id")%>" /> <br>
                    
                    <label> Nome </label> <br>
                    
                    <input class="input-form" type="text" name="nome" value="<%=request.getParameter("nome")%>" /> <br>
        
                    <label> Cnpj </label> <br>
                    
                    <input class="input-form" type="text" name="cnpj" value="<%=request.getParameter("cnpj")%>" /> <br>
        
                    <label for=""> Local </label> <br>
        
                    <input class="input-form" type="text" name="local" value="<%=request.getParameter("local")%>" /> <br>
        
                    <input class="input-submit" type="submit" value="Excluir">
        
                </form>
                
            </div>

        </div>
        
        
        
    </body>
</html>
