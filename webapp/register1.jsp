<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Shopping - Register</title>
    <link rel="stylesheet" type="text/css" href="assets/css/register.css">
    <script>
        // JavaScript function to show an alert popup if registration is successful
        function showSuccessPopup() {
            alert("Registration Successful! Click OK to login.");
            window.location.href = "Login.jsp";  // Redirect to login page after clicking OK
        }
    </script>
</head>
<body>

    <%-- Check if success message exists --%>
    <% 
        String successMessage = request.getParameter("success");
        if ("true".equals(successMessage)) { 
    %>
        <script>
            showSuccessPopup();
        </script>
    <% } %>

    <div class="container">
        <h2>ONLINE DELIVERY APPLICATION</h2>
        <h3>User Registration</h3>
        <p>Join us and start shopping with ease.</p>
        
        <form action="insert" method="post">
            <label>Full Name:</label>
            <input type="text" name="name" required>
            
            <label>Age:</label>
            <input type="number" name="age" required>
            
            <label>Email:</label>
            <input type="email" name="email" required>
            
            <label>Mobile Number:</label>
            <input type="text" name="mobile" pattern="[0-9]{10}" required>
            
            <label>Gender:</label>
            <select name="gender" required>
                <option value="">Select</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>
            
            <label>Address:</label>
            <textarea name="address" required></textarea>
            
            <label>Password:</label>
            <input type="password" name="pass" required>
            
            <label>Confirm Password:</label>
            <input type="password" name="confirm_password" required>
            
            <button type="submit">Register</button>
        </form>
        
        <p>Already have an account? <a href="Login.jsp">Login Here</a></p>
    </div>

</body>
</html>
