<%-- 
    Document   : order
    Created on : Nov 11, 2018, 12:42:33 PM
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

        <jsp:include page="header.jsp"/>

        <div class="bg-light py-3">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 mb-0"><a href="../product/index.htm">Home</a> <span class="mx-2 mb-0">/</span> <strong class="text-black">Order</strong></div>
                </div>
            </div>
        </div>  

        <div class="site-section">
            <div class="container">
                <div class="modal-content">
                    <!-- Modal Header -->
                    <div class="modal-header">
                        <h4 class="modal-title">Your History Ordered</h4>
                    </div>
                    <!-- Modal body -->
                    <div class="modal-body">
                        <form action="#" method="post">
                            <table class="table table-striped" id="myTable">
                                <thead>
                                    <tr>
                                        <th scope="col">Order ID</th> 
                                        <th scope="col">Total Price</th>
                                        <th scope="col">Date Modified</th>
                                        <th scope="col">Customer</th>
                                        <th scope="col">Status</th>
                                    </tr>
                                </thead>
                                <c:forEach var="rows" items="${sessionScope.ORDER_LIST}">
                                    <tbody>
                                        <tr>
                                            <th>#${rows.id}</th>
                                            <td><fmt:formatNumber type="number" value="${rows.total}"/>VND</td>
                                            <td>${rows.date}</td>
                                            <td>${rows.customersname}</td>
                                            <td>${rows.status}</td>
                                        </tr>
                                    </tbody>
                                </c:forEach>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
            <br>    
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