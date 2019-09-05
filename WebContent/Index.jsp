<%@ page import="com.tves.models.Channel"%>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<%@include file="head.jsp" %>


<title>TVES</title>
</head>
<body class="page-index has-hero">
  <!--Change the background class to alter background image, options are: benches, boots, buildings, city, metro -->
  <div id="background-wrapper" class="buildings" data-stellar-background-ratio="0.1">

    <%@include file="navbar.jsp" %>
    <div class="hero" id="highlighted">
      <div class="inner">
        <!--Slideshow-->
        <div id="highlighted-slider" class="container">
          <div class="item-slider" data-toggle="owlcarousel" data-owlcarousel-settings='{"singleItem":true, "navigation":true, "transitionStyle":"fadeUp"}'>
            <!--Slideshow content-->
            <!--Slide 1-->
            <div class="item">
              <div class="row">
                <div class="col-md-6 col-md-push-6 item-caption">
                  <h2 class="h1 text-weight-light">
                      Welcome to <span class="text-primary">TVES</span>
                    </h2>
                  <h4>
                      A perfect TV Guide for Viewers to see the schedule of programs of their favourite channel or any channel .
                    </h4>
                  <p>See TV listings, schedule of programs anytime on TVES</p>
                  
                  <a href="" class="btn btn-more btn-lg i-right">See Now <i class="fa fa-plus"></i></a>
                </div>
                <div class="col-md-6 col-md-pull-6 hidden-xs">
                  <img src="img/slides/slide1.png" alt="Slide 1" class="center-block img-responsive">
                </div>
              </div>
            </div>
            <!--Slide 2-->
            <div class="item">
              <div class="row">
                <div class="col-md-6 text-right-md item-caption">
                  <h2 class="h1 text-weight-light">
                      <span class="text-primary">TVES</span> TV Guide
                    </h2>
                  <h4>
                      Find Any Channel
                    </h4>
                  <p>Search Channel of your choice and see schedule of programs.</p>
                  <form action="ChannelController" method="get">
                  <input type="hidden" name="action" value="find">
                  <input type="text" name="chnlname" placeholder="Search">
                  <input type="submit" value="submit">
                  </form></div>
                <div class="col-md-6 hidden-xs">
                  <img src="slide2.jpg" alt="Slide 2" class="center-block img-responsive">
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  
  
  <%@include file="content.jsp" %>
   <%@include file="footer.jsp" %>
</body>
</html>