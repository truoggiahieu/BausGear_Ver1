<%-- 
    Document   : ForgotPassword_Page3
    Created on : Nov 25, 2018, 2:04:52 PM
    Author     : Gia Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
        <style type="text/css">
            body{
                color: #fff;
                background: #63738a;
                font-family: 'Roboto', sans-serif;
            }
            .form-control{
                height: 40px;
                box-shadow: none;
                color: #969fa4;
            }
            .form-control:focus{
                border-color: #5cb85c;
            }
            .form-control, .btn{        
                border-radius: 3px;
            }
            .signup-form{
                width: 400px;
                margin: 0 auto;
                padding: 30px 0;
            }
            .signup-form h2{
                color: #636363;
                margin: 0 0 15px;
                position: relative;
                text-align: center;
            }
            .signup-form h2:before, .signup-form h2:after{
                content: "";
                height: 2px;
                width: 30%;
                background: #d4d4d4;
                position: absolute;
                top: 50%;
                z-index: 2;
            }	
            .signup-form h2:before{
                left: 0;
            }
            .signup-form h2:after{
                right: 0;
            }
            .signup-form .hint-text{
                color: #999;
                margin-bottom: 30px;
                text-align: center;
            }
            .signup-form form{
                color: #999;
                border-radius: 3px;
                margin-bottom: 15px;
                background: #f2f3f7;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                padding: 30px;
            }
            .signup-form .form-group{
                margin-bottom: 20px;
            }
            .signup-form input[type="checkbox"]{
                margin-top: 3px;
            }
            .signup-form .btn{        
                font-size: 16px;
                font-weight: bold;		
                min-width: 140px;
                outline: none !important;
            }
            .signup-form .row div:first-child{
                padding-right: 10px;
            }
            .signup-form .row div:last-child{
                padding-left: 10px;
            }    	
            .signup-form a{
                color: #fff;
                text-decoration: underline;
            }
            .signup-form a:hover{
                text-decoration: none;
            }
            .signup-form form a{
                color: #5cb85c;
                text-decoration: none;
            }	
            .signup-form form a:hover{
                text-decoration: underline;
            }  
        </style>
    </head>
    <body>
        <div class="signup-form text-center">
            <h2>Forgot Password</h2>
            <p class="hint-text text-center ">It's free and only takes a minute.</p>
            <form action="btnChangePassword.htm" method="post">
                <a style="color: red">${message}</a>
                <div class="form-group">
                    <label>New Password</label>
                    <div class="input-group input-group-icon">
                        <input name="txtPassword" type="password" class="form-control input-lg" required="required"/>
                        <span class="input-group-addon">
                        </span>
                    </div>
                </div>
                <div class="form-group">
                    <div class="clearfix">
                        <label class="form-group">Confirm New Password</label>
                    </div>
                    <div class="input-group input-group-icon">
                        <input name="txtConfirmPassword" type="password" class="form-control input-lg" required="required"/>
                        <span class="input-group-addon">
                        </span>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group">

                    </div>
                    <div class="form-group">
                        <button type="submit" name="btnChangePassword" id="sent" class="btn btn-success btn-lg">Update</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
