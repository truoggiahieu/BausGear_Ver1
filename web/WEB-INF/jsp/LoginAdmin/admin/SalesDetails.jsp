<!doctype html>
<html class="fixed">
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    <head>

        <!-- Basic -->
        <meta charset="UTF-8">

        <title>Order Details Page | Baus Gear Admin</title>
        <meta name="keywords" content="HTML5 Admin Template" />
        <meta name="description" content="Porto Admin - Responsive HTML5 Template">
        <meta name="author" content="okler.net">

        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

        <!-- Web Fonts  -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800|Shadows+Into+Light" rel="stylesheet" type="text/css">

        <!-- Vendor CSS -->
        <link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" href="assets/vendor/font-awesome/css/font-awesome.css" />
        <link rel="stylesheet" href="assets/vendor/magnific-popup/magnific-popup.css" />
        <link rel="stylesheet" href="assets/vendor/bootstrap-datepicker/css/datepicker3.css" />

        <!-- Theme CSS -->
        <link rel="stylesheet" href="assets/stylesheets/theme.css" />

        <!-- Skin CSS -->
        <link rel="stylesheet" href="assets/stylesheets/skins/default.css" />

        <!-- Theme Custom CSS -->
        <link rel="stylesheet" href="assets/stylesheets/theme-custom.css">

        <!-- Head Libs -->
        <script src="assets/vendor/modernizr/modernizr.js"></script>

    </head>
    <body>
        <section class="body">

            <!-- start: header -->
            <header class="header">
                <div class="logo-container">
                    <a href="btnDashboard.htm" class="logo">
                        <img src="assets/images/logo.png" height="35" alt="JSOFT Admin" />
                    </a>
                    <div class="visible-xs toggle-sidebar-left" data-toggle-class="sidebar-left-opened" data-target="html" data-fire-event="sidebar-left-opened">
                        <i class="fa fa-bars" aria-label="Toggle sidebar"></i>
                    </div>
                </div>

                <!-- start: search & user box -->
                <div class="header-right">

                    <form action="Ahhihihi.htm" class="search nav-form">
                        <div class="input-group input-search">
                            <input type="text" class="form-control" name="q" id="q" placeholder="Search...">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button>
                            </span>
                        </div>
                    </form>
                    <span class="separator"></span>
                    <ul class="notifications">
                        <li>
                            <a href="btnOrder.htm" class="dropdown-toggle notification-icon" data-toggle="dropdown">
                                <i class="fa fa-tasks"></i>
                                <span class="badge"></span>
                            </a>

                        </li>
                        <li>
                            <a href="#" class="dropdown-toggle notification-icon" data-toggle="dropdown">
                                <i class="fa fa-envelope"></i>
                                <span class="badge"></span>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="dropdown-toggle notification-icon" data-toggle="dropdown">
                                <i class="fa fa-bell"></i>
                                <span class="badge"></span>
                            </a>
                        </li>
                    </ul>

                    <span class="separator"></span>

                    <div id="userbox" class="userbox">
                        <a href="#" data-toggle="dropdown">
                            <figure class="profile-picture">
                                <img src="Hinh/${image}" alt="${username}" class="img-rounded" data-lock-picture="Hinh/${image}" />
                            </figure>
                            <div class="profile-info" data-lock-name="${username}" data-lock-email="${email}">
                                <span class="name">${username}</span>
                                <span class="role">${role}</span>
                            </div>
                            <i class="fa custom-caret"></i>
                        </a>


                        <div class="dropdown-menu">
                            <ul class="list-unstyled">
                                <li class="divider"></li>
                                <li>
                                    <a role="menuitem" tabindex="-1" href="btnAdminProfile.htm"><i class="fa fa-user"></i> My Profile</a>
                                </li>
                                <li>
                                    <a role="menuitem" tabindex="-1" href="#" data-lock-screen="true"><i class="fa fa-lock"></i> Lock Screen</a>
                                </li>
                                <li>
                                    <a role="menuitem" tabindex="-1" href="btnLogout.htm    "><i class="fa fa-power-off"></i> Logout</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- end: search & user box -->
            </header>
            <!-- end: header -->

            <div class="inner-wrapper">
                <!-- start: sidebar -->
                <aside id="sidebar-left" class="sidebar-left">

                    <div class="sidebar-header">
                        <div class="sidebar-title">
                            Navigation
                        </div>
                        <div class="sidebar-toggle hidden-xs" data-toggle-class="sidebar-left-collapsed" data-target="html" data-fire-event="sidebar-left-toggle">
                            <i class="fa fa-bars" aria-label="Toggle sidebar"></i>
                        </div>
                    </div>
                    <div class="nano">
                        <div class="nano-content">
                            <nav id="menu" class="nav-main" role="navigation">
                                <ul class="nav nav-main">
                                    <li >
                                        <a href="btnDashboard.htm">
                                            <i class="fa fa-home" aria-hidden="true"></i>
                                            <span>Dashboard</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="btnSendMail.htm">
                                            <span class="pull-right label label-primary">+999</span>
                                            <i class="fa fa-envelope" aria-hidden="true"></i>
                                            <span>Mailbox</span>
                                        </a>
                                    </li>
                                    <li class="nav-parent">
                                        <a>
                                            <i class="fa fa-copy" aria-hidden="true"></i>
                                            <span>Catalog</span>
                                        </a>
                                        <ul class="nav nav-children">
                                            <li>
                                                <a href="btnCatagories.htm">
                                                    Catagories
                                                </a>
                                            </li>
                                            <li>
                                                <a href="btnProducts.htm">
                                                    Product
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="nav-expanded nav-active">
                                        <a href="btnSales.htm">
                                            <i class="fa fa-tasks" aria-hidden="true"></i>
                                            <span>Order</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="btnStaff.htm">
                                            <i class="fa fa-list-alt" aria-hidden="true"></i>
                                            <span>Staff</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="btnCustomers.htm">
                                            <i class="fa fa-table" aria-hidden="true"></i>
                                            <span>Customer</span>
                                        </a>
                                    </li>
                                </ul>
                            </nav>
                            <hr class="separator" />

                            <div class="sidebar-widget widget-stats">
                                <div class="widget-header">
                                    <h6>Company Stats</h6>
                                    <div class="widget-toggle">+</div>
                                </div>
                                <div class="widget-content">
                                    <ul>
                                        <li>
                                            <span class="stats-title">Stat 1</span>
                                            <span class="stats-complete">85%</span>
                                            <div class="progress">
                                                <div class="progress-bar progress-bar-primary progress-without-number" role="progressbar" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100" style="width: 85%;">
                                                    <span class="sr-only">85% Complete</span>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <span class="stats-title">Stat 2</span>
                                            <span class="stats-complete">70%</span>
                                            <div class="progress">
                                                <div class="progress-bar progress-bar-primary progress-without-number" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%;">
                                                    <span class="sr-only">70% Complete</span>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <span class="stats-title">Stat 3</span>
                                            <span class="stats-complete">2%</span>
                                            <div class="progress">
                                                <div class="progress-bar progress-bar-primary progress-without-number" role="progressbar" aria-valuenow="2" aria-valuemin="0" aria-valuemax="100" style="width: 2%;">
                                                    <span class="sr-only">2% Complete</span>
                                                </div>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>

                    </div>
                </aside>
                <!-- end: sidebar -->

                <section role="main" class="content-body">
                    <header class="page-header">
                        <h2>Order Details</h2>

                        <div class="right-wrapper pull-right">
                            <ol class="breadcrumbs">
                                <li>
                                    <a href="btnDashBoard.htm">
                                        <i class="fa fa-home"></i>
                                    </a>
                                </li>
                                <li><span>Orders</span></li>
                                <li><span>Order Details</span></li>
                            </ol>

                            <a class="sidebar-right-toggle" data-open="sidebar-right"><i class="fa fa-chevron-left"></i></a>
                        </div>
                    </header>

                    <!-- start: page -->
                    <c:forEach var="rows" items="${listOrder}">
                        <div class="row">
                            <div class="col-lg-12">
                                <form id="form1" action="Ahihihihi.htm" method="POST" class="form-horizontal">
                                    <section class="panel">
                                        <header class="panel-heading">
                                            <div class="panel-actions">
                                                <a href="#" class="fa fa-caret-down"></a>
                                                <a href="#" class="fa fa-times"></a>
                                            </div>

                                            <h2 class="panel-title">Order Details (#${rows.idOrder})</h2>
                                            <input type="hidden" name="txtIdOrder" value="${rows.idOrder}"/> 
                                            <p class="panel-subtitle">
                                                Dashboard > <a href="btnSales.htm"> Order </a>
                                            </p>

                                        </header>
                                        <div class="panel-body">
                                            <div class="form-group">
                                                <label class="col-sm-4 control-label">Curator : </label>
                                                <div class="col-sm-5">
                                                    <input type="text" name="name" value=" ${rows.nameAdmin}" class="form-control" disabled="true">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-4 control-label">Payment Order </label>
                                                <div class="col-sm-5">
                                                    <input type="text" name="name" value="${rows.paymentOrder}" class="form-control" disabled="true">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-4 control-label" for="inputSuccess">Status</label>
                                                <div class="col-sm-5">
                                                    <select class="form-control mb-md" name="txtStatusOrder">
                                                        <option value="1"> Processing </option>
                                                        <option value="2"> Delivering </option>
                                                        <option value="3"> Delivered </option>
                                                        <option value="4"> Canceled </option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-4 control-label">Day Added</label>
                                                <div class="col-sm-5">
                                                    <input type="text" name="name" value="${rows.dateStartOrder}" class="form-control" disabled="true">
                                                </div>
                                            </div>
                                        </div>
                                        <footer class="panel-footer">
                                            <input type="submit" class="btn btn-primary" name="btnUpdateOrder" value="Update"/>
                                        </footer>
                                    </section>
                                </form>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <form id="form1" class="form-horizontal">
                                    <section class="panel">
                                        <header class="panel-heading">
                                            <div class="panel-actions">
                                                <a href="#" class="fa fa-caret-down"></a>
                                                <a href="#" class="fa fa-times"></a>
                                            </div>

                                            <h2 class="panel-title">Payment Address</h2>
                                        </header>
                                        <div class="panel-body">
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Name: </label>
                                                <div class="col-sm-8">
                                                    <input type="text" name="name" value="${rows.nameCustomer}" class="form-control" disabled="true">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Email: </label>
                                                <div class="col-sm-8">
                                                    <input type="text" name="email" value="${rows.emailCustomer}" class="form-control" disabled="true">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Address: </label>
                                                <div class="col-sm-8">
                                                    <input type="text" name="email" value="${rows.addressCustomer}" class="form-control" disabled="true">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Phone:  </label>
                                                <div class="col-sm-8">
                                                    <input type="text" name="email" value=" ${rows.phoneCustomer}" class="form-control" disabled="true">
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                </form>
                            </div>
                            <div class="col-md-6">
                                <form id="form1" class="form-horizontal">
                                    <section class="panel">
                                        <header class="panel-heading">
                                            <div class="panel-actions">
                                                <a href="#" class="fa fa-caret-down"></a>
                                                <a href="#" class="fa fa-times"></a>
                                            </div>
                                            <h2 class="panel-title">Shipping Address</h2>
                                        </header>
                                        <div class="panel-body">
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Name:  </label>
                                                <div class="col-sm-8">
                                                    <input type="text" name="name" value="${rows.nameOrder}" class="form-control" disabled="true">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Email: </label>
                                                <div class="col-sm-8">
                                                    <input type="text" name="email" value="${rows.emailOrder}" class="form-control" disabled="true">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Address: </label>
                                                <div class="col-sm-8">
                                                    <input type="text" name="email" value="${rows.addressOrder}" class="form-control" disabled="true">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-3 control-label">Phone: </label>
                                                <div class="col-sm-8">
                                                    <input type="text" name="email" value="${rows.phoneOrder}" class="form-control" disabled="true">
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                </form>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-12">
                                <form id="form1" class="form-horizontal">
                                    <section class="panel">
                                        <header class="panel-heading">
                                            <div class="panel-actions">
                                                <a href="#" class="fa fa-caret-down"></a>
                                                <a href="#" class="fa fa-times"></a>
                                            </div>

                                            <h2 class="panel-title">Order Details </h2>

                                        </header>
                                        <div class="panel-body">
                                            <table class="table table-bordered table-striped mb-none" id="datatable-editable">
                                                <thead>
                                                    <tr>
                                                        <th>Product</th>
                                                        <th>Quantity</th>
                                                        <th>Price</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach var="row" items="${listOrderDetails}">
                                                        <tr class="gradeX">
                                                            <td>${row.nameProduct}</td>
                                                            <td>${row.quantityOrder}</td>
                                                            <td><fmt:formatNumber type="number" value="${row.priceProduct}"/> đ</td>
                                                        </tr>
                                                    </c:forEach>
                                                    <tr>
                                                        <td colspan="2"><b>Total</b></td>
                                                        <td> <b> <fmt:formatNumber type="number" value="${rows.totalOrder}"/> đ</b></td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </section>
                                </form>
                            </div>
                        </div>
                    </c:forEach>
                    <!-- end: page -->
                </section>
            </div>

            <aside id="sidebar-right" class="sidebar-right">
                <div class="nano">
                    <div class="nano-content">
                        <a href="#" class="mobile-close visible-xs">
                            Collapse <i class="fa fa-chevron-right"></i>
                        </a>

                        <div class="sidebar-right-wrapper">

                            <div class="sidebar-widget widget-calendar">
                                <h6>Upcoming Tasks</h6>
                                <div data-plugin-datepicker data-plugin-skin="dark" ></div>

                                <ul>
                                    <li>
                                        <time datetime="2014-04-19T00:00+00:00">04/19/2014</time>
                                        <span>Company Meeting</span>
                                    </li>
                                </ul>
                            </div>

                            <div class="sidebar-widget widget-friends">
                                <h6>Friends</h6>
                                <ul>
                                    <li class="status-online">
                                        <figure class="profile-picture">
                                            <img src="assets/images/!sample-user.jpg" alt="Joseph Doe" class="img-circle">
                                        </figure>
                                        <div class="profile-info">
                                            <span class="name">Joseph Doe Junior</span>
                                            <span class="title">Hey, how are you?</span>
                                        </div>
                                    </li>
                                    <li class="status-online">
                                        <figure class="profile-picture">
                                            <img src="assets/images/!sample-user.jpg" alt="Joseph Doe" class="img-circle">
                                        </figure>
                                        <div class="profile-info">
                                            <span class="name">Joseph Doe Junior</span>
                                            <span class="title">Hey, how are you?</span>
                                        </div>
                                    </li>
                                    <li class="status-offline">
                                        <figure class="profile-picture">
                                            <img src="assets/images/!sample-user.jpg" alt="Joseph Doe" class="img-circle">
                                        </figure>
                                        <div class="profile-info">
                                            <span class="name">Joseph Doe Junior</span>
                                            <span class="title">Hey, how are you?</span>
                                        </div>
                                    </li>
                                    <li class="status-offline">
                                        <figure class="profile-picture">
                                            <img src="assets/images/!sample-user.jpg" alt="Joseph Doe" class="img-circle">
                                        </figure>
                                        <div class="profile-info">
                                            <span class="name">Joseph Doe Junior</span>
                                            <span class="title">Hey, how are you?</span>
                                        </div>
                                    </li>
                                </ul>
                            </div>

                        </div>
                    </div>
                </div>
            </aside>
        </section>

        <!-- Vendor -->
        <script src="assets/vendor/jquery/jquery.js"></script>
        <script src="assets/vendor/jquery-browser-mobile/jquery.browser.mobile.js"></script>
        <script src="assets/vendor/bootstrap/js/bootstrap.js"></script>
        <script src="assets/vendor/nanoscroller/nanoscroller.js"></script>
        <script src="assets/vendor/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
        <script src="assets/vendor/magnific-popup/magnific-popup.js"></script>
        <script src="assets/vendor/jquery-placeholder/jquery.placeholder.js"></script>

        <!-- Theme Base, Components and Settings -->
        <script src="assets/javascripts/theme.js"></script>

        <!-- Theme Custom -->
        <script src="assets/javascripts/theme.custom.js"></script>

        <!-- Theme Initialization Files -->
        <script src="assets/javascripts/theme.init.js"></script>

    </body>
</html>