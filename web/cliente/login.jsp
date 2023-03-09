<%-- 
    Document   : login
    Created on : 3 de mar. de 2023, 09:42:44
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../assets/static/css/reset.css">
    <link rel="stylesheet" href="../assets/static/css/cadastrar-login.css">
    <title> Login </title>
</head>
<body>
    
    <main>

        <div class="grid-container">

            <div class="left-container">

                <div class="left-content">

                    <div> <h1> Busca Hotel </h1> </div>

                    <div> <h2>  Viage sem se preocupar. </h2> </div>

                    <div> <button> <a href="../index.jsp"> Voltar ao inicio </a> </button> </div>

                </div>

            </div>

            <div class="right-container">

                

                <div class="login-container">
    
                    <div> <h2> Login </h2> </div>
    
                    <div class="form-container">
    
                        <form method="post" action="loginAction.jsp">
    
                            <label for="">
                                Email: <br>
                            </label>
    
                            <input required name="email" class="input-form" type="email"> <br>
    
                            <label for="">
                                Senha: <br>
                            </label>
    
                            <input required name="senha" class="input-form" type="password"> <br>
    
                            <input class="input-submit" value="Logar" type="submit">
    
                        </form>
    
                    </div>
    
                    <span> <a href="cadastrar.jsp"> Ainda não tem uma conta ? </a> </span>
    
                </div>

            </div>


        </div>

    </main>

</body>
</html>