<%@page import="br.com.hotel.DTO.HotelDTO"%>
<%@page import="br.com.hotel.DAO.HotelDAO"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/static/css/reset.css">
    <link rel="stylesheet" href="assets/static/css/index.css">
    <link rel="stylesheet" href="assets/static/css/header.css">
    <script src="assets/js/header.js"> </script>
    <title> Busca Hoteis - Index </title>
</head>

<style> 
    
   table, tr, td, th{
		border:#000 solid 1px;
		width:450px;
		padding:0px;
		font-size:15px;
	}
	td{
		width:100px;
		height:20px;
        
                /* background-color: #003b95; */
	}
	th{
		background-color:#003b95; 
		color:#FFF;
	}

</style>

<body>
    
     <header>

        <nav>

            <div class="header-container">            
    
                <div class="header-logo-container"> 
                    
                    <div>  <a href="index.jsp" class="logo-header"> Busca Hoteis </a> </div>

                </div>
                
                <div class="header-item-container">

                    <div> <a href="hotel/anunciar.html" class="item-header"> Anuncie a sua propriedade </a> </div>
        
                    <div> <a href="cliente/login.jsp" class="item-header"> Login </a> </div>
        
                    <div> <a href="" class="item-header"> Favoritos </a> </div>

                    <div class="menu-icon"> <button onclick="showMenu()"> <img class="icon" src="assets/static/img/menu_white_36dp.svg" alt=""> </button> </div>

                </div>
    
            </div>

            <div class="container-menu-mobile">
                
                <div> <a href="cliente/login.jsp" class="item-mobile"> Login </a> </div>
                
                <div> <a href="hotel/anunciar.html" class="item-mobile"> Anuncie a sua propriedade </a> </div>
                                  
               <div> <a href="" class="item-mobile"> Favoritos </a> </div>

            </div>
            
        </nav>

    </header>
    
    
    
    <main>
        
        <div class="container">
            
            <div class="content">

                <div> <h1 class="hi-content"> Relatório </h1> </div> <br> <br>
                
                 <table class="table">
                <thead>
                  <tr>    
                    <th>id</th>
                    <th>nome</th>                    
                    <th>cnpj</th>                                             
                    <th>local</th>
    
                    
                  </tr>
                </thead>
                <tbody>                    
                        <%                                                    
                            try {
                                HotelDAO hotelDAO = new HotelDAO();
                                ArrayList<HotelDTO> lista = hotelDAO.PesquisarHotel();

                                
                                for(int i = 0; i < lista.size(); i++){
                                
                                %>
                                <tr>                                    
                                <%
                                    out.print("<td>"+ lista.get(i).getHotel_id()+"</td>");
                                    out.print("<td>"+ lista.get(i).getHotel_nome() +"</td>");
                                    out.print("<td>"+lista.get(i).getHotel_cnpj() +"</td>");
                                    out.print("<td>"+lista.get(i).getHotel_local() +"</td>");
                                    
                                    out.print("<td>" <a  type='button' href='hotel/excluir.jsp?id=" 
                                                + lista.get(i).getHotel_id() +
                                                "&nome="+ lista.get(i).getHotel_nome() + 
                                                "&cnpj="+ lista.get(i).getHotel_cnpj()+ "&local=" + lista.get(i).getHotel_local()+                                                
                                                "'>Excluir</a>);
                                    
                                    out.print("<td>" <a  type='button' href='hotel/editar.jsp?id=" 
                                                + lista.get(i).getHotel_id() +
                                                "&nome="+ lista.get(i).getHotel_nome() + 
                                                "&cnpj="+ lista.get(i).getHotel_cnpj()+ "&local=" + lista.get(i).getHotel_local()+                                                
                                                "'>Editar</a>");
                                    
                                     
                                %>    
                                </tr>
                                <%
                                }     
                            }catch(Exception e){
                            }
                       %>  
                             
                </tbody>
            </table>        

            </div>

        </div>

    </main>

</body>
</html>