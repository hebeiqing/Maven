<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>
<body>
<h2>Hello World!</h2>
<form  action="login" method="post">
  <%--  <c:if test="${not empty error}">
        <div class="alert alert-danger" role="alert">${error}</div>
    </c:if>
    <c:if test="${not empty success}">
        <div class="alert alert-danger" role="alert">${success}</div>
    </c:if>---%>
       <pre>
          账号<input type="text" name="name">
           密码<input type="password" name="password">
           <input type="submit" value="提交">
       </pre>
     


</form>
</body>
</html>

