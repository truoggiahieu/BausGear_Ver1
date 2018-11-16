<%-- 
    Document   : header
    Created on : Nov 3, 2018, 6:40:46 PM
    Author     : ThanhLich
--%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <header class="site-navbar" role="banner">
            <div class="site-navbar-top">
                <div class="container">
                    <div class="row align-items-center">

                        <div class="col-6 col-md-4 order-2 order-md-1 site-search-icon text-left">
                            <form action="../product/SearchProduct.htm" class="site-block-top-search">
                                <span class="icon icon-search2"></span>
                                <input type="text" class="form-control border-0" placeholder="Search" name="txtSearch">
                            </form>
                        </div>

                        <div class="col-12 mb-3 mb-md-0 col-md-4 order-1 order-md-2 text-center">
                            <div class="site-logo">
                                <a href="../product/index.htm" class="js-logo-clone">Bausgear</a>
                            </div>
                        </div>

                        <div class="col-6 col-md-4 order-3 order-md-3 text-right">
                            <div class="site-top-icons">
                                <ul>
                                    <c:if test="${sessionScope.USER == null}">
                                        <li>
                                            <a href="../product/loginCustomer.htm" data-toggle="modal" data-target="#login-user"><span class="icon icon-person">${sessionScope.USER}</span></a></li>
                                        <!-- Modal -->
                                        <div class="modal fade" id="login-user" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                                            <div class="modal-dialog modal-dialog-centered" role="document">
                                                <div class="modal-content">
                                                    <form action="btnLoginCustomer.htm" method="POST">
                                                        <div class="modal-header text-center">
                                                            <h5 class="modal-title w-100 font-weight-bold" id="exampleModalLongTitle">Login Customer</h5>
                                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                <span aria-hidden="true">&times;</span>
                                                            </button>
                                                        </div>

                                                        <div class="modal-body mx-3">
                                                            <div class="md-form mb-5">
                                                                <label for="recipient-name" class="col-form-label" style="float: left">Username</label>
                                                                <input type="text" class="form-control" id="recipient-name" name="txtUsername">
                                                            </div>
                                                            <div class="md-form mb-4">
                                                                <label for="recipient-name" class="col-form-label" style="float: left">Password</label>
                                                                <input type="password" class="form-control" id="recipient-name" name="txtPassword">
                                                            </div>
                                                            <div class="form-group">
                                                                <p color="red" style="float: left">${message}</p>
                                                            </div>
                                                        </div>

                                                        <div class="modal-footer">
                                                            <a href="registerCus.htm" class="btn btn-secondary">Register</a>
                                                            <button type="submit" class="btn btn-primary" name="btnLoginCustomer">Login</button>
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>   
                                    </c:if>
                                    <c:if test="${sessionScope.USER != null}">
                                        <li>          
                                            Hello, ${sessionScope.USER}  <a href="#" data-toggle="modal" data-target="#user-info">
                                                <span class="icon icon-person">${sessionScope.IMGUSER}</span></a></li>
                                        <!-- Modal -->
                                        <div class="modal fade" id="user-info" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                                            <div class="modal-dialog modal-dialog-centered" role="document">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <h5 class="modal-title" id="exampleModalLongTitle">User Profile</h5>
                                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                            <span aria-hidden="true">&times;</span>
                                                        </button>
                                                    </div>
                                                    <div class="modal-body">
                                                        <c:forEach var="items" items="${sessionScope.listCustomer}">
                                                            <div class="form-group">
                                                                <label for="recipient-name" class="col-form-label" style="float: left">Name:  ${items.nameCustomer}</label>
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="recipient-name" class="col-form-label" style="float: left; clear: both">Email:  ${items.emailCustomer}</label>
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="recipient-name" class="col-form-label" style="float: left; clear: both">Phone:  ${items.phoneCustomer}</label>
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="recipient-name" class="col-form-label" style="float: left; clear: both">Address:  ${items.addressCustomer}</label>
                                                            </div>
                                                            <div class="form-group">
                                                                <img src="../images/${items.imageCustomer}" width="45%"/>
                                                            </div>
                                                        </c:forEach>
                                                    </div>
                                                    <form action="btnLogoutCustomer.htm" method="POST">
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                            <button type="submit" class="btn btn-primary" name="btnLogoutCustomer">LogOut</button>
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>                  
                                    </c:if>  
                                    <li><a href="../product/order.htm"><span class="icon icon-book"></span></a></li>
                                    <li>
                                        <a href="../product/cart.htm" class="site-cart">
                                            <span class="icon icon-shopping_cart"></span>
                                            <span class="count">${sessionScope.CARTSIZE}</span>
                                        </a>
                                    </li>
                                    <li class="d-inline-block d-md-none ml-md-0"><a href="#" class="site-menu-toggle js-menu-toggle"><span class="icon-menu"></span></a></li>
                                </ul>
                            </div> 
                        </div>

                    </div>
                </div>
            </div> 
            <nav class="site-navigation text-right text-md-center" role="navigation">
                <div class="container">
                    <ul class="site-menu js-clone-nav d-none d-md-block">
                        <li class="has-children">
                            <a href="../product/index.htm">Home</a>
                            <ul class="dropdown">
                                <li><a href="#">PC Accessories</a></li>
                                <li><a href="#">Monitor</a></li>
                                <li><a href="#">Keyboard</a></li>
                                <li class="has-children">
                                    <a href="#">PC & LapTop</a>
                                    <ul class="dropdown">
                                        <li><a href="#">Less than 10 mil</a></li>
                                        <li><a href="#">From 10 to 20 mil</a></li>
                                        <li><a href="#">More than 20 mil</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li class="has-children">
                            <a href="#">Accessories</a>
                            <ul class="dropdown">
                                <li><a href="#">Keyboard</a></li>
                                <li><a href="#">Mouse</a></li>
                                <li><a href="#">Monitor</a></li>
                            </ul>
                        </li>
                        <li><a href="../product/shop.htm">Shop</a></li>
                        <li><a href="#">Catagories</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="../product/contact.htm">Contact</a></li>
                    </ul>
                </div>
            </nav>
        </header>
    </body>
</html>
