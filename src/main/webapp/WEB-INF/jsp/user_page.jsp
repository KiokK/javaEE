<%@ page import="com.kihtenko.javaee.entity.User" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>User page</title>
   <style type="text/css">
      body {
         background: rgb(99, 39, 120)
      }

      .form-control:focus {
         box-shadow: none;
         border-color: #BA68C8
      }

      .profile-button {
         background: rgb(99, 39, 120);
         box-shadow: none;
         border: none
      }

      .profile-button:hover {
         background: #682773
      }

      .profile-button:focus {
         background: #682773;
         box-shadow: none
      }

      .profile-button:active {
         background: #682773;
         box-shadow: none
      }

      .back:hover {
         color: #682773;
         cursor: pointer
      }

      .labels {
         font-size: 11px
      }

      .add-experience:hover {
         background: #BA68C8;
         color: #fff;
         cursor: pointer;
         border: solid 1px #BA68C8
      }
   </style>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>

<% User user = (User)request.getSession(true).getAttribute("UserData"); %>
<br />
   <div class="container rounded bg-white mt-5 mb-5">
      <div class="row">
         <div class="col-md-3 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5">
                <img class="rounded-circle mt-5" width="150px" src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg">
                <span class="font-weight-bold"><%= user.getLogin() %></span>
<%--                <span class="text-black-50">edogaru@mail.com.my</span>--%>
                <span> </span>
            </div>
         </div>
         <div class="col-md-5 border-right">
            <div class="p-3 py-5">
               <div class="d-flex justify-content-between align-items-center mb-3">
                  <h4 class="text-right">Profile Settings</h4>
               </div>
               <div class="row mt-2">
                  <div class="col-md-6"><label class="labels">Name</label><input type="text" class="form-control" placeholder="first name" value="<%= user.getName() %>"></div>
                  <div class="col-md-6"><label class="labels">Surname</label><input type="text" class="form-control" value="<%= user.getSurname() %>" placeholder="surname"></div>
                  <div class="col-md-12"><label class="labels">Patronymic</label><input type="text" class="form-control" placeholder="enter phone number" value="<%= user.getPatronymic() %>"></div>
               </div>
               <div class="row mt-3">
                  <div class="col-md-12"><label class="labels">Login</label><input type="text" class="form-control" placeholder="login" value="<%= user.getLogin() %>"></div>
                  <div class="col-md-12"><label class="labels">Password</label><input type="text" class="form-control" placeholder="password" value="<%= user.getPassword() %>"></div>
                  <div class="col-md-12"><label class="labels">Mobile Number</label><input type="text" class="form-control" placeholder="enter phone number" value="<%= user.getPhone() %>"></div>
<%--                  <div class="col-md-12"><label class="labels">Address Line 1</label><input type="text" class="form-control" placeholder="enter address line 1" value=""></div>--%>
<%--                  <div class="col-md-12"><label class="labels">Address Line 2</label><input type="text" class="form-control" placeholder="enter address line 2" value=""></div>--%>
<%--                  <div class="col-md-12"><label class="labels">Postcode</label><input type="text" class="form-control" placeholder="enter address line 2" value=""></div>--%>
<%--                  <div class="col-md-12"><label class="labels">State</label><input type="text" class="form-control" placeholder="enter address line 2" value=""></div>--%>
<%--                  <div class="col-md-12"><label class="labels">Area</label><input type="text" class="form-control" placeholder="enter address line 2" value=""></div>--%>
<%--                  <div class="col-md-12"><label class="labels">Email ID</label><input type="text" class="form-control" placeholder="enter email id" value=""></div>--%>
                  <div class="col-md-12"><label class="labels">DateOfBarth</label><input type="text" class="form-control" placeholder="DateOfBarth" value="<%= user.getDateOfBarth() %>"></div>
                  <div class="col-md-12"><label class="labels">DateOfIncoming</label><input type="text" class="form-control" placeholder="DateOfIncoming" value="<%= user.getDateOfIncoming() %>"></div>
               </div>
<%--               <div class="row mt-3">--%>
<%--                  <div class="col-md-6"><label class="labels">Country</label><input type="text" class="form-control" placeholder="country" value=""></div>--%>
<%--                  <div class="col-md-6"><label class="labels">State/Region</label><input type="text" class="form-control" value="" placeholder="state"></div>--%>
<%--               </div>--%>
               <div class="mt-5 text-center"><button class="btn btn-primary profile-button" type="button">Save Profile</button></div>
            </div>
         </div>
         <div class="col-md-4">
            <div class="p-3 py-5">
               <div class="d-flex justify-content-between align-items-center experience"><span>Edit Experience</span><span class="border px-3 p-1 add-experience"><i class="fa fa-plus"></i>&nbsp;Experience</span></div><br>
               <div class="col-md-12"><label class="labels">Experience in Designing</label><input type="text" class="form-control" placeholder="experience" value=""></div> <br>
               <div class="col-md-12"><label class="labels">Additional Details</label><input type="text" class="form-control" placeholder="additional details" value=""></div>
            </div>
         </div>
      </div>
   </div>
</body>
</html>