<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<c:set var="contextPath" value="${pageContext.request.contextPath}" />--%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
<%--    <link href="${contextPath}/resource/bootstrap.min.css" rel="stylesheet">--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <br />
    <h1>Login:</h1>
    <div class="card">
        <div class="card-body">
            <form action="Controller" method="post">

                <input type="hidden" name="command" value="login" />

                <div class=" form-group row">
                    <label for="login" class="col-sm-2 col-form-label">Login</label>
                    <div class="col-sm-7">
                        <input type="text" class="form-control" name="login"
                               placeholder="Enter login">
                    </div>
                </div>

                <div class="form-group row">
                    <label for="lastName" class="col-sm-2 col-form-label">Password</label>
                    <div class="col-sm-7">
                        <input type="password" class="form-control" name="password"
                               placeholder="Enter Password">
                    </div>
                </div>

                <input type="submit" class="btn btn-primary" value="Login" />
            </form>
        </div>
    </div>

    <br /> <br />
    <h1>Registration:</h1>
    <div class="card">
        <div class="card-body">
            <form action="Controller" method="post">

                <input type="hidden" name="command" value="REGISTER_USER" />

                <div class=" form-group row">
                    <label for="login" class="col-sm-2 col-form-label">Login</label>
                    <div class="col-sm-7">
                        <input type="text" class="form-control" name="login"
                               placeholder="Enter login">
                    </div>
                </div>
                <%
                    String message = (String) request.getAttribute("register_message");
                    if( message != null )
                        response.getWriter().print(message);
                %>
                <div class="form-group row">
                    <label for="lastName" class="col-sm-2 col-form-label">Password</label>
                    <div class="col-sm-7">
                        <input type="password" class="form-control" name="password"
                               placeholder="Enter Password">
                    </div>
                </div>

                <input type="submit" class="btn btn-primary" value="Registration" />
            </form>
        </div>
    </div>

</div>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>