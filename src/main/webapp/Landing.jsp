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
















<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>

    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="resources/bootstrap/js/bootstrap.min.js"></script>
