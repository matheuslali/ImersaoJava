<%@ page import="java.util.List" %>
<%@ page import="com.example.gerenciador.Empresa" %><%--
  Created by IntelliJ IDEA.
  User: MULTIMIDIA
  Date: 25/05/2023
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Empresa> lista = (List<Empresa>) request.getAttribute("listaEmpresas");
%>
<html>
<head>
    <title>Empresas Cadastradas</title>
</head>
<body>
<h1>Lista de empresas cadastradas:</h1>
<p>
    <ul>
    <%
        for (Empresa empresa: lista){
        %>
        <li><%= empresa.getNome() %></li>
        <%
    }%>
    </ul>
</p>
<a href="/gerenciador">Voltar para o Menu inicial</a>
</body>
</html>
