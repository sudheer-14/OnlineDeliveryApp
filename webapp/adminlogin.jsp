<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Admin Login - Online Shopping</title>
    <link rel="stylesheet" href="assets/css/admin.css">
    
</head>
<body>
    <div class="header">Online Delivery Application</div>
    <div class="container">
        <div class="left-panel">
        <img alt="" src="assets/img/admin.png">
            <h2>Admin Panel</h2>
            <p>Manage users, orders, and products efficiently.</p>
        </div>
        <div class="right-panel">
            <h2>Admin Login</h2>
            <form action="validate" method="post">
                <div class="form-group">
                    <label for="username">Admin Username:</label>
                    <input type="text" id="username" name="username" required>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" required>
                </div>
                <button type="submit" class="btn">Login</button>
            </form>
            <div class="back-link">
                <p><a href="Login.jsp">Back to User Login</a></p>
            </div>
        </div>
    </div>
    
</body>
</html>
