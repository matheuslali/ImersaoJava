<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkNovaEmpresa"/>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Form Nova Empresa</title>
</head>
<body>
  <form action="${linkNovaEmpresa}" method="post">
      Nome: <input type="text" name="nome"/>
      Data Abertura: <input type="text" name="data"/>

      <input type="submit"/>

  </form>

</body>
</html>