<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Empresas Cadastradas</title>
</head>
<body>
<h1>Lista de empresas cadastradas:</h1>
<p>
    <ul>
        <c:forEach items="${listaEmpresas}" var="empresa">
            <li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> </li>
        </c:forEach>
    </ul>
</p>
<a href="/gerenciador">Voltar para o Menu inicial</a>
</body>
</html>
