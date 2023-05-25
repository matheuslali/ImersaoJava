package com.example.gerenciador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String nomeEmpresa = req.getParameter("nome");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>Empresa "+nomeEmpresa+" cadastrada com sucesso!</body></html>");
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);
        Banco banco = new Banco();
        banco.adciona(empresa);

        RequestDispatcher rd = req.getRequestDispatcher("/novaEmpresaCadastrada.jsp");
        req.setAttribute("empresa", empresa.getNome());
        rd.forward(req, resp);


    }
}
