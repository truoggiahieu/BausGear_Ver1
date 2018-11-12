<%-- 
    Document   : index
    Created on : Nov 2, 2018, 9:45:32 AM
    Author     : ThanhLich
--%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>BausGear &mdash; Best Gear</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Mukta:300,400,700"> 
        <link rel="stylesheet" href="../fonts/icomoon/style.css">

        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <link rel="stylesheet" href="../css/magnific-popup.css">
        <link rel="stylesheet" href="../css/jquery-ui.css">
        <link rel="stylesheet" href="../css/owl.carousel.min.css">
        <link rel="stylesheet" href="../css/owl.theme.default.min.css">
        <link rel="stylesheet" href="../css/aos.css">
        <link rel="stylesheet" href="../css/style.css">

    </head>
    <body>

        <div class="site-wrap">
            <jsp:include page="header.jsp"/>

            <div class="site-blocks-cover" style="background-image: url(../images/hero-1.jpg);" data-aos="fade">
                <div class="container">
                    <div class="row align-items-start align-items-md-center justify-content-end">
                        <div class="col-md-5 text-center text-md-left pt-5 pt-md-0">
                            <h1 class="mb-2">Bâu's Gear - Best PC Gear</h1>
                            <p>The best place you can find the perfect PC gears for your need from all the best Brands.</p>
                            <div class="intro-text text-center text-md-left">
                                <p class="mb-4"> </p>
                                <p>
                                    <a href="../product/shop.htm" class="btn btn-sm btn-primary">Shop Now</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="site-section site-section-sm site-blocks-1">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 col-lg-4 d-lg-flex mb-4 mb-lg-0 pl-4" data-aos="fade-up" data-aos-delay="">
                            <div class="icon mr-4 align-self-start">
                                <span class="icon-truck"></span>
                            </div>
                            <div class="text">
                                <h2 class="text-uppercase">Free Shipping</h2>
                                <p>If you don’t get free shipping at checkout, visit our “Rebates” tab to save up to $10 per charge.</p>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-4 d-lg-flex mb-4 mb-lg-0 pl-4" data-aos="fade-up" data-aos-delay="100">
                            <div class="icon mr-4 align-self-start">
                                <span class="icon-refresh2"></span>
                            </div>
                            <div class="text">
                                <h2 class="text-uppercase">Free Returns</h2>
                                <p>Free product return and full refund offer for customer.</p>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-4 d-lg-flex mb-4 mb-lg-0 pl-4" data-aos="fade-up" data-aos-delay="200">
                            <div class="icon mr-4 align-self-start">
                                <span class="icon-help"></span>
                            </div>
                            <div class="text">
                                <h2 class="text-uppercase">Customer Support</h2>
                                <p>We offer the best customer support and product support.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="site-section block-3 site-blocks-2 bg-light">
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-md-7 site-section-heading text-center pt-4">
                            <h2>Featured Products</h2>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">

                            <div class="nonloop-block-3 owl-carousel">
                                <c:forEach var="items" items="${sessionScope.listProducts}">
                                    <div class="item">
                                        <div class="block-4 text-center">
                                            <figure class="block-4-image">
                                                <a href="<s:url value="../product_detail/${items.id}.htm"/>"><img src="../images/${items.image}" alt="Image placeholder" class="img-fluid"></a>
                                            </figure>
                                            <div class="block-4-text p-4">
                                                <h3><a href="#">${items.name}</a></h3>
                                                <p class="mb-0">${items.tag}</p>
                                                <p class="text-primary font-weight-bold">${items.price}&#8363</p>
                                                <a class="addbtn" href="<s:url value="/cartbean/${items.id}.htm"/>">ADD TO CART</a>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="site-section block-8">
                <div class="container">
                    <div class="row justify-content-center  mb-5">
                        <div class="col-md-7 site-section-heading text-center pt-4">
                            <h2>Big Sale!</h2>
                        </div>
                    </div>
                    <div class="row align-items-center">
                        <div class="col-md-12 col-lg-7 mb-5">
                            <a href="#"><img src="../images/D4-8X4-3200.jpg" alt="Image placeholder" class="img-fluid rounded"></a>
                        </div>
                        <div class="col-md-12 col-lg-5 text-center pl-md-5">
                            <h2><a href="#">50% less in all items</a></h2>
                            <p class="post-meta mb-4">By <a href="#">Truong Gia Hieu</a> <span class="block-8-sep">&bullet;</span> December 10, 2018</p>
                            <p>With the release of the the brand new product, we put a sale on every item , up to 50% , what are you waiting for and start buying.</p>
                            <p><a href="#" class="btn btn-primary btn-sm">Shop Now</a></p>
                        </div>
                    </div>
                </div>
            </div>


            <jsp:include page="footer.jsp"/>
        </div>

        <script src="../js/jquery-3.3.1.min.js"></script>
        <script src="../js/jquery-ui.js"></script>
        <script src="../js/popper.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/owl.carousel.min.js"></script>
        <script src="../js/jquery.magnific-popup.min.js"></script>
        <script src="../js/aos.js"></script>

        <script src="../js/main.js"></script>

    </body>
</html>
