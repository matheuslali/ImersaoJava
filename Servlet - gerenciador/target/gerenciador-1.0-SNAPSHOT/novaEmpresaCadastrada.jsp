<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/formNovaEmpresa.jsp" var="linkFormNovaEmpresa"/>
<c:url value="/listaEmpresas" var="linkListaEmpresas"/>

<html>
<head>
    <title>Nova Empresa Cadastrada</title>
</head>
<body>
    <c:if test="${not empty empresa}">
        <h1>Empresa ${empresa} cadastrada com sucesso!</h1>
    </c:if>
    <p><strong>O que deseja fazer?</strong></p>
<p><a href=${linkFormNovaEmpresa}>Cadastrar outra empresa</a> <a href=${linkListaEmpresas}>Ver a lista de empresas cadastradas</a></p>
</body>
</html>
