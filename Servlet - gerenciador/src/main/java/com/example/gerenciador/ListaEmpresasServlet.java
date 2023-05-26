package com.example.gerenciador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");
        req.setAttribute("listaEmpresas", lista);
        rd.forward(req, resp);


    }
}
