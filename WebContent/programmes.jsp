<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.tves.models.Programmes"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="head.jsp" %>
<title>Schedule</title>
</head>
<body class="page-index has-hero">
<div id="background-wrapper" class="buildings" data-stellar-background-ratio="0.1">

<% 
List<Programmes> list=(List<Programmes>)request.getAttribute("list");
%>
<%@include file="navbar.jsp" %>
<div class="hero" id="highlighted">
      <div class="inner">
<div class="container">
<div class="row">
<div class=col-md-12>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Programmes</th>
      <th scope="col">Starts At</th>
      <th scope="col">Ends At</th>
      <th scope="col">Description</th>
    </tr>
  </thead>
  <tbody>
  <%for(Programmes p:list){ %>
    <tr>
      <td><%=p.getPname() %></td>
      <td><%=p.getStart_at() %></td>
      <td><%=p.getEnd_at() %></td>
      <td><%=p.getDescription() %></td>
      <%} %>
    </tr>
  </tbody>
</table>
</div>
</div>
</div>
</div>
</div>
</div>
<%@include file="footer.jsp" %>

</body>
</html>