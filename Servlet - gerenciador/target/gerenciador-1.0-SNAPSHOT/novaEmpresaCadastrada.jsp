<%--
  Created by IntelliJ IDEA.
  User: MULTIMIDIA
  Date: 25/05/2023
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
    String nomeEmpresa = (String) request.getAttribute("empresa");
    System.out.println(nomeEmpresa);
%>
<html>
<head>
    <title>Nova Empresa Cadastrada</title>
</head>
<body>
<h1>Empresa <%= nomeEmpresa %> cadastrada com sucesso!</h1>
<p><strong>O que deseja fazer?</strong></p>
<p><a href=/gerenciador/formNovaEmpresa.html>Cadastrar outra empresa</a> <a href=/gerenciador/listaEmpresas>Ver a lista de empresas cadastradas</a></p>
</body>
</html>
