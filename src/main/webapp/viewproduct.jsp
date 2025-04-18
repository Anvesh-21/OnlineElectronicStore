<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*, pack1.*" %>
<html>
<head><title>View Products</title></head>
<body>
<h2>Product List</h2>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Brand</th><th>Price</th><th>Description</th></tr>
<%
    List<Product> products = (List<Product>)request.getAttribute("products");
    for(Product p : products){
%>
<tr>
    <td><%= p.getId() %></td>
    <td><%= p.getName() %></td>
    <td><%= p.getBrand() %></td>
    <td><%= p.getPrice() %></td>
    <td><%= p.getDescription() %></td>
</tr>
<% } %>
</table>
</body>
</html>
