<!doctype html>
<html class="fixed">
    <head>

        <!-- Basic -->
        <meta charset="UTF-8">

        <title>Dashboard Page | Baus Gear Admin</title>
        <meta name="keywords" content="HTML5 Admin Template" />
        <meta name="description" content="JSOFT Admin - Responsive HTML5 Template">
        <meta name="author" content="JSOFT.net">

        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

        <!-- Web Fonts  -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800|Shadows+Into+Light" rel="stylesheet" type="text/css">

        <!-- Vendor CSS -->
        <link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" href="assets/vendor/font-awesome/css/font-awesome.css" />
        <link rel="stylesheet" href="assets/vendor/magnific-popup/magnific-popup.css" />
        <link rel="stylesheet" href="assets/vendor/bootstrap-datepicker/css/datepicker3.css" />

        <!-- Specific Page Vendor CSS -->
        <link rel="stylesheet" href="assets/vendor/jquery-ui/css/ui-lightness/jquery-ui-1.10.4.custom.css" />
        <link rel="stylesheet" href="assets/vendor/bootstrap-multiselect/bootstrap-multiselect.css" />
        <link rel="stylesheet" href="assets/vendor/morris/morris.css" />

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
                                    <a role="menuitem" tabindex="-1" href="btnLogout.htm"><i class="fa fa-power-off"></i> Logout</a>
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
                                    <li class="nav-expanded nav-active">
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
                                    <li>
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
                        <h2>Dashboard</h2>

                        <div class="right-wrapper pull-right">
                            <ol class="breadcrumbs">
                                <li>
                                    <a href="index.html">
                                        <i class="fa fa-home"></i>
                                    </a>
                                </li>
                                <li><span>Dashboard</span></li>
                            </ol>

                            <a class="sidebar-right-toggle" data-open="sidebar-right"><i class="fa fa-chevron-left"></i></a>
                        </div>
                    </header>

                    <div class="row">
                        <div class="col-md-6 col-lg-12 col-xl-6">
                            <div class="row">
                                <div class="col-md-12 col-lg-6 col-xl-6">
                                    <section class="panel panel-featured-left panel-featured-primary">
                                        <div class="panel-body">
                                            <div class="widget-summary">
                                                <div class="widget-summary-col widget-summary-col-icon">
                                                    <div class="summary-icon bg-primary">
                                                        <i class="fa fa-life-ring"></i>
                                                    </div>
                                                </div>
                                                <div class="widget-summary-col">
                                                    <div class="summary">
                                                        <h4 class="title">Orders</h4>
                                                        <div class="info">
                                                            <strong class="amount">${countorder}</strong>
                                                        </div>
                                                    </div>
                                                    <div class="summary-footer">
                                                        <a class="text-muted text-uppercase">(view all)</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                </div>
                                <div class="col-md-12 col-lg-6 col-xl-6">
                                    <section class="panel panel-featured-left panel-featured-secondary">
                                        <div class="panel-body">
                                            <div class="widget-summary">
                                                <div class="widget-summary-col widget-summary-col-icon">
                                                    <div class="summary-icon bg-secondary">
                                                        <i class="fa fa-usd"></i>
                                                    </div>
                                                </div>
                                                <div class="widget-summary-col">
                                                    <div class="summary">
                                                        <h4 class="title">Total </h4>
                                                        <div class="info">
                                                            <strong class="amount">$ ${total} VND</strong>
                                                        </div>
                                                    </div>
                                                    <div class="summary-footer">
                                                        <a class="text-muted text-uppercase">(withdraw)</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                </div>
                                <div class="col-md-12 col-lg-6 col-xl-6">
                                    <section class="panel panel-featured-left panel-featured-tertiary">
                                        <div class="panel-body">
                                            <div class="widget-summary">
                                                <div class="widget-summary-col widget-summary-col-icon">
                                                    <div class="summary-icon bg-tertiary">
                                                        <i class="fa fa-shopping-cart"></i>
                                                    </div>
                                                </div>
                                                <div class="widget-summary-col">
                                                    <div class="summary">
                                                        <h4 class="title">Today's Orders</h4>
                                                        <div class="info">
                                                            <strong class="amount">${countorderonday}</strong>
                                                        </div>
                                                    </div>
                                                    <div class="summary-footer">
                                                        <a class="text-muted text-uppercase">(statement)</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                </div>
                                <div class="col-md-12 col-lg-6 col-xl-6">
                                    <section class="panel panel-featured-left panel-featured-quartenary">
                                        <div class="panel-body">
                                            <div class="widget-summary">
                                                <div class="widget-summary-col widget-summary-col-icon">
                                                    <div class="summary-icon bg-quartenary">
                                                        <i class="fa fa-user"></i>
                                                    </div>
                                                </div>
                                                <div class="widget-summary-col">
                                                    <div class="summary">
                                                        <h4 class="title">Customer</h4>
                                                        <div class="info">
                                                            <strong class="amount">${sumcus}</strong>
                                                        </div>
                                                    </div>
                                                    <div class="summary-footer">
                                                        <a class="text-muted text-uppercase">(report)</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <section class="panel">
                                <header class="panel-heading">
                                    <div class="panel-actions">
                                        <a href="#" class="fa fa-caret-down"></a>
                                        <a href="#" class="fa fa-times"></a>
                                    </div>

                                    <h2 class="panel-title">Catagories</h2>
                                </header>
                                <div class="panel-body">

                                    <!-- Flot: Basic -->
                                    <div class="chart chart-md" id="flotDashBasic"></div>
                                    <script>

                                        var flotDashBasicData = [{
                                                data: [
                                                    [0, 170],
                                                    [1, 169],
                                                    [2, 173],
                                                    [3, 188],
                                                    [4, 147],
                                                    [5, 113],
                                                    [6, 128],
                                                    [7, 169],
                                                    [8, 173],
                                                    [9, 128],
                                                    [10, 128]
                                                ],
                                                label: "MSI",
                                                color: "#0088cc"
                                            }, {
                                                data: [
                                                    [0, 115],
                                                    [1, 124],
                                                    [2, 114],
                                                    [3, 121],
                                                    [4, 115],
                                                    [5, 83],
                                                    [6, 102],
                                                    [7, 148],
                                                    [8, 147],
                                                    [9, 103],
                                                    [10, 113]
                                                ],
                                                label: "Razer",
                                                color: "#2baab1"
                                            }, {
                                                data: [
                                                    [0, 70],
                                                    [1, 69],
                                                    [2, 73],
                                                    [3, 88],
                                                    [4, 47],
                                                    [5, 13],
                                                    [6, 28],
                                                    [7, 69],
                                                    [8, 73],
                                                    [9, 28],
                                                    [10, 28]
                                                ],
                                                label: "Logitech",
                                                color: "#734ba9"
                                            }];

                                        // See: assets/javascripts/dashboard/examples.dashboard.js for more settings.

                                    </script>

                                </div>
                            </section>
                        </div>
                        <div class="col-md-6">
                            <section class="panel">
                                <header class="panel-heading">
                                    <div class="panel-actions">
                                        <a href="#" class="fa fa-caret-down"></a>
                                        <a href="#" class="fa fa-times"></a>
                                    </div>
                                    <h2 class="panel-title">Visitor's</h2>
                                </header>
                                <div class="panel-body">

                                    <!-- Flot: Curves -->
                                    <div class="chart chart-md" id="flotDashRealTime"></div>

                                </div>
                            </section>
                        </div>
                    </div>

                    <!-- start: page -->
                    <div class="row">
                        <div class="col-md-6 col-lg-12 col-xl-6">
                            <section class="panel">
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-lg-8">
                                            <div class="chart-data-selector" id="salesSelectorWrapper">
                                                <h2>
                                                    Sales:
                                                    <strong>
                                                        <select class="form-control" id="salesSelector">
                                                            <option value="JSOFT Admin" selected>Bau's Gear</option>
                                                        </select>
                                                    </strong>
                                                </h2>

                                                <div id="salesSelectorItems" class="chart-data-selector-items mt-sm">
                                                    <!-- Flot: Sales JSOFT Admin -->
                                                    <div class="chart chart-sm" data-sales-rel="JSOFT Admin" id="flotDashSales1" class="chart-active"></div>
                                                    <script>

                                                        var flotDashSales1Data = [{
                                                                data: [
                                                                    ["Jan", 140],
                                                                    ["Feb", 240],
                                                                    ["Mar", 190],
                                                                    ["Apr", 140],
                                                                    ["May", 180],
                                                                    ["Jun", 320],
                                                                    ["Jul", 270],
                                                                    ["Aug", 180]
                                                                ],
                                                                color: "#0088cc"
                                                            }];

                                                        // See: assets/javascripts/dashboard/examples.dashboard.js for more settings.

                                                    </script>

                                                    <!-- Flot: Sales JSOFT Drupal -->
                                                    <div class="chart chart-sm" data-sales-rel="JSOFT Drupal" id="flotDashSales2" class="chart-hidden"></div>
                                                    <script>

                                                        var flotDashSales2Data = [{
                                                                data: [
                                                                    ["Jan", 240],
                                                                    ["Feb", 240],
                                                                    ["Mar", 290],
                                                                    ["Apr", 540],
                                                                    ["May", 480],
                                                                    ["Jun", 220],
                                                                    ["Jul", 170],
                                                                    ["Aug", 190]
                                                                ],
                                                                color: "#2baab1"
                                                            }];

                                                        // See: assets/javascripts/dashboard/examples.dashboard.js for more settings.

                                                    </script>

                                                    <!-- Flot: Sales JSOFT Wordpress -->
                                                    <div class="chart chart-sm" data-sales-rel="JSOFT Wordpress" id="flotDashSales3" class="chart-hidden"></div>
                                                    <script>

                                                        var flotDashSales3Data = [{
                                                                data: [
                                                                    ["Jan", 840],
                                                                    ["Feb", 740],
                                                                    ["Mar", 690],
                                                                    ["Apr", 940],
                                                                    ["May", 1180],
                                                                    ["Jun", 820],
                                                                    ["Jul", 570],
                                                                    ["Aug", 780]
                                                                ],
                                                                color: "#734ba9"
                                                            }];

                                                        // See: assets/javascripts/dashboard/examples.dashboard.js for more settings.

                                                    </script>
                                                </div>

                                            </div>
                                        </div>
                                        <div class="col-lg-4 text-center">
                                            <h2 class="panel-title mt-md">Sales</h2>
                                            <div class="liquid-meter-wrapper liquid-meter-sm mt-lg">
                                                <div class="liquid-meter">
                                                    <meter min="0" max="100" value="85" id="meterSales"></meter>
                                                </div>
                                                <div class="liquid-meter-selector" id="meterSalesSel">
                                                    <a href="#" data-val="80" class="active">Monthly Goal</a>
                                                    <a href="#" data-val="70">Annual Goal</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </section>
                        </div>
                        <div class="col-md-6 col-lg-12 col-xl-6">
                            <div class="row">
                                <div class="col-md-12 col-lg-6 col-xl-6">
                                    <section class="panel panel-featured-left panel-featured-primary">
                                        <div class="panel-body">
                                            <div class="widget-summary">
                                                <div class="widget-summary-col widget-summary-col-icon">
                                                    <div class="summary-icon bg-primary">
                                                        <i class="fa fa-life-ring"></i>
                                                    </div>
                                                </div>
                                                <div class="widget-summary-col">
                                                    <div class="summary">
                                                        <h4 class="title">Orders Processing</h4>
                                                        <div class="info">
                                                            <strong class="amount">${processing}</strong>
                                                        </div>
                                                    </div>
                                                    <div class="summary-footer">
                                                        <a class="text-muted text-uppercase">(view all)</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                </div>
                                <div class="col-md-12 col-lg-6 col-xl-6">
                                    <section class="panel panel-featured-left panel-featured-secondary">
                                        <div class="panel-body">
                                            <div class="widget-summary">
                                                <div class="widget-summary-col widget-summary-col-icon">
                                                    <div class="summary-icon bg-secondary">
                                                        <i class="fa fa-usd"></i>
                                                    </div>
                                                </div>
                                                <div class="widget-summary-col">
                                                    <div class="summary">
                                                        <h4 class="title">Order Deliverd</h4>
                                                        <div class="info">
                                                            <strong class="amount">${delivered}</strong>
                                                        </div>
                                                    </div>
                                                    <div class="summary-footer">
                                                        <a class="text-muted text-uppercase">(withdraw)</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                </div>
                                <div class="col-md-12 col-lg-6 col-xl-6">
                                    <section class="panel panel-featured-left panel-featured-tertiary">
                                        <div class="panel-body">
                                            <div class="widget-summary">
                                                <div class="widget-summary-col widget-summary-col-icon">
                                                    <div class="summary-icon bg-tertiary">
                                                        <i class="fa fa-shopping-cart"></i>
                                                    </div>
                                                </div>
                                                <div class="widget-summary-col">
                                                    <div class="summary">
                                                        <h4 class="title">Orders Delivering</h4>
                                                        <div class="info">
                                                            <strong class="amount">${delivering}</strong>
                                                        </div>
                                                    </div>
                                                    <div class="summary-footer">
                                                        <a class="text-muted text-uppercase">(statement)</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                </div>
                                <div class="col-md-12 col-lg-6 col-xl-6">
                                    <section class="panel panel-featured-left panel-featured-tertiary">
                                        <div class="panel-body">
                                            <div class="widget-summary">
                                                <div class="widget-summary-col widget-summary-col-icon">
                                                    <div class="summary-icon bg-tertiary">
                                                        <i class="fa fa-shopping-cart"></i>
                                                    </div>
                                                </div>
                                                <div class="widget-summary-col">
                                                    <div class="summary">
                                                        <h4 class="title">Orders Canceled</h4>
                                                        <div class="info">
                                                            <strong class="amount">${canceled}</strong>
                                                        </div>
                                                    </div>
                                                    <div class="summary-footer">
                                                        <a class="text-muted text-uppercase">(statement)</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                </div>
                            </div>
                        </div>
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

        <!-- Specific Page Vendor -->
        <script src="assets/vendor/jquery-ui/js/jquery-ui-1.10.4.custom.js"></script>
        <script src="assets/vendor/jquery-ui-touch-punch/jquery.ui.touch-punch.js"></script>
        <script src="assets/vendor/jquery-appear/jquery.appear.js"></script>
        <script src="assets/vendor/bootstrap-multiselect/bootstrap-multiselect.js"></script>
        <script src="assets/vendor/jquery-easypiechart/jquery.easypiechart.js"></script>
        <script src="assets/vendor/flot/jquery.flot.js"></script>
        <script src="assets/vendor/flot-tooltip/jquery.flot.tooltip.js"></script>
        <script src="assets/vendor/flot/jquery.flot.pie.js"></script>
        <script src="assets/vendor/flot/jquery.flot.categories.js"></script>
        <script src="assets/vendor/flot/jquery.flot.resize.js"></script>
        <script src="assets/vendor/jquery-sparkline/jquery.sparkline.js"></script>
        <script src="assets/vendor/raphael/raphael.js"></script>
        <script src="assets/vendor/morris/morris.js"></script>
        <script src="assets/vendor/gauge/gauge.js"></script>
        <script src="assets/vendor/snap-svg/snap.svg.js"></script>
        <script src="assets/vendor/liquid-meter/liquid.meter.js"></script>
        <script src="assets/vendor/jqvmap/jquery.vmap.js"></script>
        <script src="assets/vendor/jqvmap/data/jquery.vmap.sampledata.js"></script>
        <script src="assets/vendor/jqvmap/maps/jquery.vmap.world.js"></script>
        <script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.africa.js"></script>
        <script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.asia.js"></script>
        <script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.australia.js"></script>
        <script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.europe.js"></script>
        <script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.north-america.js"></script>
        <script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.south-america.js"></script>

        <!-- Theme Base, Components and Settings -->
        <script src="assets/javascripts/theme.js"></script>

        <!-- Theme Custom -->
        <script src="assets/javascripts/theme.custom.js"></script>

        <!-- Theme Initialization Files -->
        <script src="assets/javascripts/theme.init.js"></script>


        <!-- Examples -->
        <script src="assets/javascripts/dashboard/examples.dashboard.js"></script>
    </body>
</html>