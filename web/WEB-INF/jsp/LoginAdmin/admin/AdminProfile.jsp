<!doctype html>
<html class="fixed">
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <head>

        <!-- Basic -->
        <meta charset="UTF-8">

        <title>User Profile | Okler Themes | Porto-Admin</title>
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

                    <form class="search nav-form">
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
                                            <li class="nav-active">
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
                                    <li >
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
                        <h2>Profile</h2>

                        <div class="right-wrapper pull-right">
                            <ol class="breadcrumbs">
                                <li>
                                    <a href="btnDashboard.htm">
                                        <i class="fa fa-home"></i>
                                    </a>
                                </li>
                                <li><span>Admin</span></li>
                                <li><span>Profile</span></li>

                            </ol>

                            <a class="sidebar-right-toggle" data-open="sidebar-right"><i class="fa fa-chevron-left"></i></a>
                        </div>
                    </header>

                    <!-- start: page -->
                    <div class="row">
                        <c:forEach var="rows" items="${listAdminProfile}" >
                            <div class="col-md-4 col-lg-3">

                                <section class="panel">
                                    <div class="panel-body">
                                        <div class="thumb-info mb-md">
                                            <img src="Hinh/${rows.imageAdmin}" class="rounded img-responsive" alt="${ursername}">
                                            <div class="thumb-info-title">
                                                <span class="thumb-info-inner">${username}</span>
                                                <span class="thumb-info-type">${role}</span>
                                            </div>
                                        </div>

                                        <div class="widget-toggle-expand mb-md">
                                            <div class="widget-header">
                                                <h6>Profile Completion</h6>
                                                <div class="widget-toggle">+</div>
                                            </div>
                                            <div class="widget-content-collapsed">
                                                <div class="progress progress-xs light">
                                                    <div class="progress-bar" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%;">
                                                        60%
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="widget-content-expanded">
                                                <ul class="simple-todo-list">
                                                    <li class="completed">Update Profile Picture</li>
                                                    <li class="completed">Change Personal Information</li>
                                                    <li>Linked Social Media</li>
                                                </ul>
                                            </div>
                                        </div>

                                        <hr class="dotted short">

                                        <h6 class="text-muted">About</h6>
                                        <p>Love Ping - Hate the lie</p>
                                        <div class="clearfix">
                                            <a class="text-uppercase text-muted pull-right" href="#">(View All)</a>
                                        </div>

                                        <hr class="dotted short">

                                        <div class="social-icons-list">
                                            <a rel="tooltip" data-placement="bottom" target="_blank" href="http://www.facebook.com" data-original-title="Facebook"><i class="fa fa-facebook"></i><span>Facebook</span></a>
                                            <a rel="tooltip" data-placement="bottom" href="http://www.twitter.com" data-original-title="Twitter"><i class="fa fa-twitter"></i><span>Twitter</span></a>
                                            <a rel="tooltip" data-placement="bottom" href="http://www.linkedin.com" data-original-title="Linkedin"><i class="fa fa-linkedin"></i><span>Linkedin</span></a>
                                        </div>

                                    </div>
                                </section>


                                <section class="panel">
                                    <header class="panel-heading">
                                        <div class="panel-actions">
                                            <a href="#" class="fa fa-caret-down"></a>
                                            <a href="#" class="fa fa-times"></a>
                                        </div>

                                        <h2 class="panel-title">
                                            <span class="label label-primary label-sm text-normal va-middle mr-sm">5</span>
                                            <span class="va-middle">Employees</span>
                                        </h2>
                                    </header>
                                    <div class="panel-body">
                                        <div class="content">
                                            <ul class="simple-user-list">
                                                <li>
                                                    <figure class="image rounded">
                                                        <img src="assets/images/!sample-user.jpg" alt="Joseph Doe Junior" class="img-circle">
                                                    </figure>
                                                    <span class="title">GiaHieu</span>
                                                    <span class="message truncate">Admin</span>
                                                </li>
                                                <li>
                                                    <figure class="image rounded">
                                                        <img src="assets/images/!sample-user.jpg" alt="Joseph Junior" class="img-circle">
                                                    </figure>
                                                    <span class="title">ViBinh</span>
                                                    <span class="message truncate">Staff</span>
                                                </li>
                                                <li>
                                                    <figure class="image rounded">
                                                        <img src="assets/images/!sample-user.jpg" alt="Joe Junior" class="img-circle">
                                                    </figure>
                                                    <span class="title">HoangQuan</span>
                                                    <span class="message truncate">Staff</span>
                                                </li>
                                                <li>
                                                    <figure class="image rounded">
                                                        <img src="assets/images/!sample-user.jpg" alt="Joseph Doe Junior" class="img-circle">
                                                    </figure>
                                                    <span class="title">GiaHuy</span>
                                                    <span class="message truncate">Staff.</span>
                                                </li>
                                            </ul>
                                            <hr class="dotted short">
                                            <div class="text-right">
                                                <a class="text-uppercase text-muted" href="#">(View All)</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel-footer">
                                        <div class="input-group input-search">
                                            <input type="text" class="form-control" name="q" id="q" placeholder="Search...">
                                            <span class="input-group-btn">
                                                <button class="btn btn-default" type="submit"><i class="fa fa-search"></i>
                                                </button>
                                            </span>
                                        </div>
                                    </div>
                                </section>

                                <section class="panel">


                                </section>

                            </div>
                            <div class="col-md-8 col-lg-6">

                                <div class="tabs">
                                    <ul class="nav nav-tabs tabs-primary">
                                        <li class="active">
                                            <a href="#overview" data-toggle="tab">Overview</a>
                                        </li>
                                        <li>
                                            <a href="#edit" data-toggle="tab">Edit</a>
                                        </li>
                                    </ul>
                                    <div class="tab-content">
                                        <div id="overview" class="tab-pane active">

                                            <h4 class="mb-xlg">Timeline</h4>

                                            <div class="timeline timeline-simple mt-xlg mb-md">
                                                <div class="tm-body">
                                                    <div class="tm-title">
                                                        <h3 class="h5 text-uppercase">November 2018</h3>
                                                    </div>
                                                    <ol class="tm-items">
                                                        <li>
                                                            <div class="tm-box">
                                                                <p class="text-muted mb-none">15 Days Later .</p>
                                                                <p>
                                                                    Success a website of company <span class="text-primary">#awesome</span>
                                                                </p>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="tm-box">
                                                                <p class="text-muted mb-none">2 months ago.</p>
                                                                <p>
                                                                    Open a company
                                                                </p>
                                                            </div>
                                                        </li>

                                                    </ol>
                                                </div>
                                            </div>
                                        </div>
                                        <div id="edit" class="tab-pane">

                                            <form  action="Ahihihihi.htm"  class="form-horizontal" method="get">
                                                <h4 class="mb-xlg">Personal Information</h4>
                                                <fieldset>
                                                    <div class="form-group">
                                                        <label class="col-md-3 control-label" for="profileFirstName">Username</label>
                                                        <div class="col-md-8">
                                                            <input type="text" name="txtUsernameAdmin" value="${rows.usernameAdmin}" class="form-control" id="profileFirstName" disabled="true" >
                                                            <input type="hidden" name="txtUsernameAdmin" value="${rows.usernameAdmin}" class="form-control" id="profileFirstName">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-3 control-label" for="profileLastName">Password</label>
                                                        <div class="col-md-8">
                                                            <input type="password" name="txtPasswordAdmin" value="${rows.passwordAdmin}" class="form-control" id="profileLastName">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-3 control-label" for="profileAddress">Fullname</label>
                                                        <div class="col-md-8">
                                                            <input type="text" name="txtNameAdmin" value="${rows.nameAdmin}" class="form-control" id="profileAddress">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-3 control-label" for="profileCompany">Email</label>
                                                        <div class="col-md-8">
                                                            <input  type="text" name="txtEmailAdmin" value="${rows.emailAdmin}" class="form-control" id="profileCompany">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-3 control-label" for="profileCompany">Address</label>
                                                        <div class="col-md-8">
                                                            <input type="text" name="txtAddressAdmin" value="${rows.addressAdmin}" class="form-control" id="profileCompany">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-3 control-label" for="profileCompany">Phone</label>
                                                        <div class="col-md-8">
                                                            <input type="text" name="txtPhoneAdmin" value="${rows.phoneAdmin}" class="form-control" id="profileCompany">
                                                        </div>
                                                    </div>
                                                </fieldset>

                                                <div class="panel-footer">
                                                    <div class="row">
                                                        <div class="col-md-9 col-md-offset-3">
                                                            <input type="submit" name="btnUpdateProfileAdmin"   class="btn btn-primary" value="Update"/>
                                                            <button type="reset" class="btn btn-default">Reset</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-12 col-lg-3">

                                <h4 class="mb-md">Sale Stats</h4>
                                <ul class="simple-card-list mb-xlg">
                                    <li class="primary">
                                        <h3>488</h3>
                                        <p>Nullam quris ris.</p>
                                    </li>
                                    <li class="primary">
                                        <h3>$ 189,000.00</h3>
                                        <p>Nullam quris ris.</p>
                                    </li>
                                    <li class="primary">
                                        <h3>16</h3>
                                        <p>Nullam quris ris.</p>
                                    </li>
                                </ul>
                            </div>
                        </c:forEach>
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
        <script src="assets/vendor/jquery-autosize/jquery.autosize.js"></script>

        <!-- Theme Base, Components and Settings -->
        <script src="assets/javascripts/theme.js"></script>

        <!-- Theme Custom -->
        <script src="assets/javascripts/theme.custom.js"></script>

        <!-- Theme Initialization Files -->
        <script src="assets/javascripts/theme.init.js"></script>

    </body>
</html>