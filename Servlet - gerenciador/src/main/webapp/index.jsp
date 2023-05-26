<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/formNovaEmpresa.jsp" var="linkFormNovaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Gerenciador" %>
</h1>
<h2><%="Cadastre uma nova empresa: "%></h2>
<br/>
<a href="${linkFormNovaEmpresa}">Clique aqui para cadastrar</a>
</body>
</html>