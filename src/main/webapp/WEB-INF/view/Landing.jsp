<%@include file="Header.jsp" %>

<!-- carousel coding-->

<div class="bs-example">
    <div id="myCarousel" class="carousel slide" data-ride="carousel" >
        <!-- Carousel indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>   
        <!-- Wrapper for carousel items -->
        <div class="carousel-inner">
            <div class="item active">
                <img src="resources/images/bnr-1.jpg" alt="First Slide">
            </div>
            <div class="item">
                <img src="resources/images/bnr-2.jpg" alt="Second Slide">
            </div>
            <div class="item">
                <img src="resources/images/bnr-3.jpg" alt="Third Slide">
            </div>
        </div>
        <!-- Carousel controls -->
        <a class="carousel-control left" href="#myCarousel" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <a class="carousel-control right" href="#myCarousel" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
        </a>
    </div>
</div>
<!-- add images -->
<div class="row">
 <div class="col-md-2">
 <a href="Details/AEQ"><img class="img-responsive" src="resources/images/w1.jpg"  alt="Cinque Terre" width="304" height="236" /></a>
 </div>
   <div class="col-md-2">
  <a href="Details/Th1791118j"> <img class="img-responsive" src="resources/images/w2.jpg" /></a>
 </div>

 <div class="col-md-2">
<a href="Details/YCS"> <img class="img-responsive" src="resources/images/w3.jpg" /></a>
 </div>
   <div class="col-md-2">
<a href="Details/FS4552">  <img class="img-responsive" src="resources/images/w4.jpg" /></a>
 </div>
  <div class="col-md-2">
  <a href="Details/ND5024DL04"> <img class="img-responsive" src="resources/images/w5.jpg" /></a>
 </div>
</div>













<!-- <script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>

    Include all compiled plugins (below), or include individual files as needed
    <script src="resources/bootstrap/js/bootstrap.min.js"></script>
 -->