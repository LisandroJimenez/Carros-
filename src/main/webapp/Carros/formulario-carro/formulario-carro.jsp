<%-- 
    Document   : index
    Created on : 23 jul. 2024, 01:05:58
    Author     : Usuario
--%>

<%@page import="org.lisandroJimenez.webapp.model.Carro"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link href="styles.css" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark fixed-top position-relative">
            <div class="container-fluid">
                <a class="navbar-brand" href="./index.jsp">Carros</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
                    <div class="offcanvas-header">
                        <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Carros</h5>
                        <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div class="offcanvas-body">
                        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                            <li class="nav-item">
                                <a class="nav-link " aria-current="page" href="../../index.jsp">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" aria-current="page" href="../../carro-servlet">Lista</a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link active" href="./formulario-carro.jsp">Agregar otro carro</a>
                            </li> 
                        </ul>

                    </div>
                </div>
            </div>
        </nav>

        <div class="container w-100">
            <form class=" mt-3" action="/SGBDCarros/carro-servlet" method="post" enctype="multipart/form-data">
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="marcacarro" name="marcaCarro" placeholder="">
                    <label for="marcacarro">Marca Del Carro</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="modelocarro" name="modeloCarro" placeholder="">
                    <label for="modelocarro">Modelo Del Carro</label>
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text">Q.</span>
                    <input type="text" class="form-control" name ="precioCarro" aria-label="Amount (to the nearest dollar)">
                </div>
                <div>
                    <input type ="submit"class ="btn btn-outline-success" value ="agregar">
                </div>
            </form>

        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
