<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-25
  Time: 오후 6:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<form action="/save1" method="post">
   아이디: <input type="text" name="memberId" placeholder="아이디"><br>
   비밀번호:<input type="text" name="memberPassword" placeholder="비밀번호"><br>
   이름: <input type="text" name="memberName" placeholder="이름"><br>
   나이:<input type="text" name="memberAge" placeholder="나이"><br>
   전화번호: <input type="text" name="memberPhone" placeholder="전화번호"><br>
    <input type="submit" value="확인">
</form>


</body>
</html>
