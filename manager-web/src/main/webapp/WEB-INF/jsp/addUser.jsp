<%--
  Created by IntelliJ IDEA.
  User: JerryLi
  Date: 2019/6/15
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add user</title>
</head>
<body>
<form action="/user/addUser" method="post">
    用户名：<input type="text" name="username"><br/>
    生日：<input type="text" name="age"><br/>
    性别： 男<input type="radio" name="sex" value="M">
           女<input type="radio" name="sex" value="F"><br/>
    地址：<input type="text" name="address"><br/>
    <input type="submit" value="OKOK">
</form>
</body>
</html>
