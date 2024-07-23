/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lisandroJimenez.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.lisandroJimenez.webapp.model.Carro;
import org.lisandroJimenez.webapp.service.CarroService;

@WebServlet("/carro-servlet")
@MultipartConfig
public class CarroServlet extends HttpServlet {

    private CarroService cs;

    @Override
    public void init() throws ServletException {
        super.init();
        this.cs = new CarroService();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Carro> carro = cs.listarCarro();
        req.setAttribute("carros", carro);
        req.getRequestDispatcher("./Carros/lista-carro/lista-carro.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();

        if (path == null || path.equals("/")) {
            agregarCarro(req, resp);
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);

        }
    }
    
    public void agregarCarro(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        String marca = req.getParameter("marcaCarro"), modelo = req.getParameter("modeloCarro");
        double precio = Double.parseDouble(req.getParameter("precioCarro"));
        
        cs.agregarCarro(new Carro(marca,modelo,precio));
        
        resp.sendRedirect(req.getContextPath() + "/");
    }

}
