<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="head.jsp" %>
<title>Sign Up</title>
</head>
  <div id="content">
      <div class="header">
        <div class="header-inner">
          <!--navbar-branding/logo - hidden image tag & site name so things like Facebook to pick up, actual logo set via CSS for flexibility -->
          <a class="navbar-brand center-block" href="Index.jsp" title="Home">
            <h1 class="hidden">
                <img src="img/logo.png" alt=" Logo">
                TVES
              </h1>
          </a>
        </div>
      </div>
      <div class="row">
        <div class="col-sm-6 col-sm-offset-3">
          <div class="panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">
                  Sign Up
                </h3>
            </div>
            <div class="panel-body">
              <form accept-charset="UTF-8" role="form">
                <fieldset>
                  <div class="form-group">
                    <div class="input-group input-group-lg">
                      <span class="input-group-addon"><i class="fa fa-fw fa-user"></i></span>
                      <input type="text" class="form-control" placeholder="Username">
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="input-group input-group-lg">
                      <span class="input-group-addon"><i class="fa fa-fw fa-envelope"></i></span>
                      <input type="text" class="form-control" placeholder="Email">
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="input-group input-group-lg">
                      <span class="input-group-addon"><i class="fa fa-fw fa-lock"></i></span>
                      <input type="password" class="form-control" placeholder="Password">
                    </div>
                  </div>
                  
                 
                  <input class="btn btn-lg btn-primary btn-block" type="submit" value="Sign Me Up">
                </fieldset>
              </form>
              <p class="m-b-0 m-t">Already signed up? <a href="login.html">Login here</a>.</p>
              
            </div>
          </div>
        </div>
      </div>
      <!-- /row -->
    </div>
  
  <!-- Required JavaScript Libraries -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="lib/stellar/stellar.min.js"></script>
  <script src="lib/waypoints/waypoints.min.js"></script>
  <script src="lib/counterup/counterup.min.js"></script>
  <script src="contactform/contactform.js"></script>

  <!-- Template Specisifc Custom Javascript File -->
  <script src="js/custom.js"></script>

  <!--Custom scripts demo background & colour switcher - OPTIONAL -->
  <script src="js/color-switcher.js"></script>

  <!--Contactform script -->
  <script src="contactform/contactform.js"></script>

</body>
</html>