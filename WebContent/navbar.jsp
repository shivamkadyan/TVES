<!-- ======== @Region: #navigation ======== -->
    <div id="navigation" class="wrapper">
      <!--Hidden Header Region-->
      <div class="header-hidden collapse">
        <div class="header-hidden-inner container">
          <div class="row">
            <div class="col-md-3">
              <h3>
                  About Us
                </h3>
              <p></p>
              <a href="about.html" class="btn btn-more"><i class="fa fa-plus"></i> Learn more</a>
            </div>
            <div class="col-md-3">
              <!--@todo: replace with company contact details-->
              <h3>
                  Contact Us
                </h3>
              <address>
                  <strong>theme</strong>
                  <abbr title="Address"><i class="fa fa-pushpin"></i></abbr>
                  
                  <br>
                  <abbr title="Phone"><i class="fa fa-phone"></i></abbr>
                 
                  <br>
                  <abbr title="Email"><i class="fa fa-envelope-alt"></i></abbr>
                  
                </address>
            </div>
            <div class="col-md-6">
              <!--Colour & Background Switch for demo - @todo: remove in production-->
              <h3>
                  Theme Variations
                </h3>
              <div class="switcher">
                <div class="cols">
                  Backgrounds:
                  <br>
                  <a href="#benches" class="background benches active" title="Benches">Benches</a> <a href="#boots" class="background boots " title="Boots">Boots</a> <a href="#buildings" class="background buildings " title="Buildings">Buildings</a>
                  <a
                    href="#city" class="background city " title="City">City</a> <a href="#metro" class="background metro " title="Metro">Metro</a>
                </div>
                <div class="cols">
                  Colours:
                  <br>
                  <a href="#orange" class="colour orange active" title="Orange">Orange</a> <a href="#green" class="colour green " title="Green">Green</a> <a href="#blue" class="colour blue " title="Blue">Blue</a> <a href="#lavender" class="colour lavender "
                    title="Lavender">Lavender</a>
                </div>
              </div>
              <p>
                <small></small>
              </p>
            </div>
          </div>
        </div>
      </div>
      <!--Header & navbar-branding region-->
      <div class="header">
        <div class="header-inner container">
          <div class="row">
            <div class="col-md-8">
              <!--navbar-branding/logo - hidden image tag & site name so things like Facebook to pick up, actual logo set via CSS for flexibility -->
              <a style="height:33px" class="navbar-brand" href="Index.jsp" title="Home">
                <h1 class="hidden">
                    <img src="img/logo.png" alt="TVES Logo">
                    TVES
                  </h1>
              </a>
              <div class="navbar-slogan">
                TV Event Schedule
                 
              </div>
            </div>
            <!--header rightside-->
            <div class="col-md-4">
              <!--user menu-->
              <ul class="list-inline user-menu pull-right">
                <li class="user-button"><a class="btn btn-primary btn-hh-trigger" role="button" data-toggle="collapse" data-target=".header-hidden">Open</a></li>
              </ul>
              <ul class="list-inline user-menu pull-right">
                <li class="user-register"><i class="fa fa-edit text-primary "></i> <a href="register.jsp" class="text-uppercase">Register</a></li>
                <li class="user-login"><i class="fa fa-sign-in text-primary"></i> <a href="login.jsp" class="text-uppercase">Login</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <div class="container">
        <div class="navbar navbar-default">
          <!--mobile collapse menu button-->
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse" aria-expanded="false"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
          <!--social media icons-->
          <div class="navbar-text social-media social-media-inline pull-right">
            <!--@todo: replace with company social media details-->
            <a href="#"><i class="fa fa-twitter"></i></a>
            <a href="#"><i class="fa fa-facebook"></i></a>
            <a href="#"><i class="fa fa-linkedin"></i></a>
            <a href="#"><i class="fa fa-google-plus"></i></a>
          </div>
          <!--everything within this div is collapsed on mobile-->
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav" id="main-menu">
              <li class="icon-link">
                <a href="Index.jsp"><i class="fa fa-home"></i></a>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Menu<b class="caret"></b></a>
                <!-- Dropdown Menu -->
                <ul class="dropdown-menu">
                  <li class="dropdown-header"></li>
                  <li><a href="ChannelController?action=getChannel" tabindex="-1" class="menu-item">Listings</a></li>
                  <li><a href="Login?action=admin" tabindex="-1" class="menu-item">Admin</a></li>
                  <li><a href="" tabindex="-1" class="menu-item">About</a></li>
                  <li><a href="login.jsp" tabindex="-1" class="menu-item">Login</a></li>
                  <li><a href="register.jsp" tabindex="-1" class="menu-item">Sign-Up</a></li>
                  <li class="dropdown-footer"></li>
                </ul>
              </li>
             <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Categories<b class="caret"></b></a>
                <!-- Dropdown Menu -->
                <ul class="dropdown-menu">
                  <li class="dropdown-header">Genre</li>
                  <li><a href="ChannelController?action=ctgry&category=Entertainment" tabindex="-1" class="menu-item">Entertainment</a></li>
                  <li><a href="ChannelController?action=ctgry&category=Music" class="menu-item">Music</a></li>
                  <li><a href="" tabindex="-1" class="menu-item">News</a></li>
                  <li><a href="" tabindex="-1" class="menu-item">Kids</a></li>
                  <li><a href="" tabindex="-1" class="menu-item">Movies</a></li>
                  <li class="dropdown-footer"></li>
                </ul>
              </li>
                  
                </ul>
              
          </div>
          <!--/.navbar-collapse -->
        </div>
      </div>
    </div>