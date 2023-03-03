<%-- 
    Document   : cadastrar
    Created on : 3 de mar. de 2023, 09:40:54
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../assets//static/css/reset.css">
    <link rel="stylesheet" href="../assets/static/css/cadastrar-login.css">
    <title> Cadastro </title>
</head>
<body>
    
    <main> 

        <div class="grid-container">

            <div class="left-container">

                <div class="left-content">

                    <div> <h1> Busca Hotel </h1> </div>

                    <div> <h2>  Viage sem se preocupar. </h2> </div>                    

                    <div> <button> <a href="../index.html"> Voltar ao inicio </a> </button> </div>

                </div>

            </div>

            <div class="right-container">                                

                <div class="login-container">
                    
                    <div> <h2> Cadastrar </h2> </div>

                    <div class="form-container">
        
                        <form method="post" action="cadastrarAction.jsp">
        
                                <label for="">
                                    Nome: <br>
                                </label>
        
                                <input name="nome" class="input-form" type="text"> <br>                                        
        
                                <label for="">
                                    Email: <br>
                                </label>
        
                                <input name="email" class="input-form" type="email"> <br>
        
                                <label for="">
                                    Senha: <br>
                                </label>
        
                                <input name="senha" class="input-form" type="password"> <br>
                                
                                <label for="">
                                    Cpf: <br>
                                </label>
        
                                <input name="cpf" class="input-form" type="text"> <br>
        
                                <input class="input-submit" value="Cadastrar" type="submit">
        
                            </form>
        
                    </div>

                    <span> <a href="login.jsp"> Já tem uma conta ? </a> </span> 

                </div>

            </div>


        </div>

    </main>

</body>
</html>
