<%@ page import="com.tves.models.Channel"%>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<head>
<%@include file="head.jsp" %>
<title>Listings</title>
</head>
<body class="class="page-index has-hero"">
  <!--Change the background class to alter background image, options are: benches, boots, buildings, city, metro -->
  <div id="background-wrapper" class="benches" data-stellar-background-ratio="0.8">

<%@include file="navbar.jsp"%>
<%
List<Channel> list =(List<Channel>)request.getAttribute("list");
%>
<div class="showcase block block-border-bottom-grey">
      <div class="container">
<h2 style="color:white" class="block-title">
            Channels
          </h2>

<div id="cardsection" class="section section-elements">
<div class="container">
<div class="row">

<%
for(Channel c:list){
	if(c==null){
%>
<p style="color:white"> No Channel Found!</p>
<%
	}
	else{
%>
<div id="card" class="col-lg-3 col-sm-6">
 <div class="card" style="width: 14rem;">
   
   <div class="card-body">
   <img class="card-img" src="<%=c.getName()%>.png" alt="Card image cap">
    <a class="text-center" href="ProgrammesController?action=getProgrammes&channelname=<%= c.getName() %>"><%= c.getName() %></a>
  </div>
</div>
</div>
<%
}
} 
%>
</div>
</div>
</div>
</div>
</div>
</div>
<%@include file="footer.jsp" %>


</body>
</html>