    <%-- 
    Document   : contact
    Created on : Nov 2, 2018, 9:59:23 AM
    Author     : ThanhLich
--%>


<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shoppers &mdash; Colorlib e-Commerce Template</title>
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
        <style>

            .easyPaginateNav{
                width: 100% !important;
                text-align: center;
            }
            .easyPaginateNav a {
                padding: 2vh 3vh 2vh 3vh;
                color: #727a7a;
                border: 1px solid #e9e9e9;
            }
            .easyPaginateNav a.current {
                font-weight:bold;
                background-color: #e9ecef; ;
                color: #0315ff;
            }
            .col-md-2 column productbox {
                background-color:#ffffff;
                padding:10px;
                margin-bottom:10px;
                -webkit-box-shadow: 0 8px 6px -6px  #999;
                -moz-box-shadow: 0 8px 6px -6px  #999;
                box-shadow: 0 8px 6px -6px #999;

            }

            .producttitle {
                font-weight:bold;
                padding:5px 0 5px 0;
            }

            .productprice {
                border-top:1px solid #dadada;
                padding-top:5px;
            }

            .pricetext {
                font-weight:bold;
                font-size:1.4em;
            }

        </style>
    </head>
    <body>
        <header class="site-navbar" role="banner">
            <jsp:include page="header.jsp"/>
        </header>

        <div class="bg-light py-3">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 mb-0"><a href="../product/index.htm">Home</a> <span class="mx-2 mb-0">/</span> <strong class="text-black">Shop</strong></div>
                </div>
            </div>
        </div>
        <div class="site-section">
            <div class="container">

                <div class="row mb-5">
                    <div class="row">


                        <div class="row mb-5">

                            <div class="col-md-9 order-2">


                                <div id="easyPaginate" class="row">
                                    <div class="col-sm-6 col-lg-4 mb-4" data-aos="fade-up" >
                                        <div class="block-4 text-center border">
                                            <figure class="block-4-image">
                                                <a>
                                                    <img src="../images/avatar.jpg" alt="Image placeholder" class="img-fluid" width="900px" height="700px">
                                                </a>
                                            </figure>
                                            <div class="block-4-text p-4">
                                                <h3><a>Can't Find Out Product</a></h3>
                                                <a>Please try another keyword</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-md-3 order-1 mb-5 mb-md-0">
                                <div class="border p-4 rounded mb-4">
                                    <h3 class="mb-3 h6 text-uppercase text-black d-block">Categories</h3>
                                    <ul class="list-unstyled mb-0">
                                        <li class="mb-1"><a href="#" class="d-flex"><span>Name</span> <span class="text-black ml-auto">(22)</span></a></li>
                                        <li class="mb-1"><a href="#" class="d-flex"><span>Brand</span> <span class="text-black ml-auto">(25)</span></a></li>
                                        <li class="mb-1"><a href="#" class="d-flex"><span>Catagories</span> <span class="text-black ml-auto">(35)</span></a></li>
                                    </ul>
                                </div>

                                <div class="border p-4 rounded mb-4">

                                    <div class="mb-4">
                                        <h3 class="mb-3 h6 text-uppercase text-black d-block">Filter by Price</h3>
                                        <div id="slider-range" class="border-primary"></div>
                                        <input type="text" name="text" id="amount" class="form-control border-0 pl-0 bg-white" disabled="" />
                                    </div>

                                    <div class="mb-4">
                                        <h3 class="mb-3 h6 text-uppercase text-black d-block">Type</h3>
                                        <label for="s_sm" class="d-flex">
                                            <input type="checkbox" id="s_sm" class="mr-2 mt-1"> <span class="text-black">Accessories</span>
                                        </label>
                                        <label for="s_md" class="d-flex">
                                            <input type="checkbox" id="s_md" class="mr-2 mt-1"> <span class="text-black">PC Gear</span>
                                        </label>
                                        <label for="s_lg" class="d-flex">
                                            <input type="checkbox" id="s_lg" class="mr-2 mt-1"> <span class="text-black">Others</span>
                                        </label>
                                    </div>

                                    <div class="mb-4">
                                        <h3 class="mb-3 h6 text-uppercase text-black d-block">Color</h3>
                                        <a href="#" class="d-flex color-item align-items-center" >
                                            <span class="bg-danger color d-inline-block rounded-circle mr-2"></span> <span class="text-black">Red (2,429)</span>
                                        </a>
                                        <a href="#" class="d-flex color-item align-items-center" >
                                            <span class="bg-success color d-inline-block rounded-circle mr-2"></span> <span class="text-black">Green (2,298)</span>
                                        </a>
                                        <a href="#" class="d-flex color-item align-items-center" >
                                            <span class="bg-info color d-inline-block rounded-circle mr-2"></span> <span class="text-black">Blue (1,075)</span>
                                        </a>
                                        <a href="#" class="d-flex color-item align-items-center" >
                                            <span class="bg-primary color d-inline-block rounded-circle mr-2"></span> <span class="text-black">Purple (1,075)</span>
                                        </a>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
        <!--Pagination-->
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="../js/jquery.easyPaginate.js"></script>
        <script>
            $('#easyPaginate').easyPaginate({
                paginateElement: 'div.mb-4',
                elementsPerPage: 6,
                effect: 'default'
            });
        </script>
        <script src="../js/jquery-3.3.1.min.js"></script>
        <script src="../js/jquery-ui.js"></script>
        <script src="../js/popper.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/owl.carousel.min.js"></script>
        <script src="../js/jquery.magnific-popup.min.js"></script>
        <script src="../js/aos.js"></script>
        <script src="../js/main.js"></script>
</html>
