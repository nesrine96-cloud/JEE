<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>All Produit</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body>

<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>
        <th>N° Commande</th>
        <th>Date Commande</th>
        <th>Status Commande</th>
        <th>Client</th>
        <th>produit List</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${Produit}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.NCom}</td>
            <td>${c.dateCom}</td>
            <td>${c.StatCom}</td>
            <td>${c.client}</td>
            <td>${c.produitList}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>