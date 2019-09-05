<div id="content">
    <!-- Mission Statement -->
    <div class="mission text-center block block-pd-sm block-bg-noise">
      <div class="container">
        <h2 class="text-shadow-white">
            We are providing Schedule of TV programs so that you can never miss any show. <a href="about.html" class="btn btn-more"><i class="fa fa-plus"></i>Read more</a>
          </h2>
      </div>
    </div>
    <!--Showcase-->
    <div class="showcase block block-border-bottom-grey">
      <div class="container">
        <h2 class="block-title">
            Favourite Channels
          </h2>
        <p>Select Your Favourite Channel</p>
        <div class="item-carousel" data-toggle="owlcarousel" data-owlcarousel-settings='{"items":4, "pagination":false, "navigation":true, "itemsScaleUp":true}'>
         <%for(int i=1;i<11;i++){ %> <div class="item">
            <a href="#" class="overlay-wrapper">
                <img src="img/<%=i%>.png" alt="channel image" class="img-responsive underlay">
                <span class="overlay">
                  <span class="overlay-content"> <span class="h4">Channel</span> </span>
                </span>
              </a>
            <div class="item-details bg-noise">
              <h4 class="item-title">
                  <a href="#"></a>
              </h4>
              <a href="#" class="btn btn-more"><i class="fa fa-plus"></i>Schedule</a>
            </div>
          </div>
        <%} %>
        </div>
      </div>
    </div>
  </div>