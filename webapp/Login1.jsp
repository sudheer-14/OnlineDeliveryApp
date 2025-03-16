<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Shopping - Login</title>
    <link rel="stylesheet"  href="assets/css/login.css" type="text/css"/>
    
</head>
<body>
	<div class="header">Online Delivery Application</div>
    <div class="container">
        <div class="left-panel" >
            <h2>Online Shopping</h2>
            <p>Experience the best online shopping with us. Easy, fast, and secure.</p>
        </div>
        <div class="right-panel">
            <h2>User Login</h2>
            <form action="UserLoginServlet" method="post">
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" required>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" required>
                </div>
                <button type="submit" class="btn">Login</button>
            </form>
            <div class="register-link">
                <p>New user? <a href="register.jsp">Create Account</a></p>
            </div>
            <div class="admin-login">
                <p><a href="adminlogin.jsp">Admin Login</a></p>
            </div>
        </div>
    </div>
</body>
</html>
