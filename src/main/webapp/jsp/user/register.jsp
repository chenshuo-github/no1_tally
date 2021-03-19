<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册用户</title>
</head>
<body background="/images/1616143576.jpg">
<div style="width: 100%;text-align:center">
    <form action="${pageContext.request.contextPath}/api/v1/user/save" method="post">
        用户名：<input type="text" name="userName"/> <br><br>
        年 龄：<input type="text" name="password"/> <br><br>
        <label>用户类别</label>
        <select name="permission">
            <option value="0">管理员</option>
            <option value="1">普通用户</option>
        </select>
        <input type="submit" value="注册"/>
    </form>
</div>
</body>
</html>