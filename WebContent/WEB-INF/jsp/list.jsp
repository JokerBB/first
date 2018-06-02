<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/book/list" method="post">
    <table>
        <tr>
            <th colspan="2">书本查询</th>
        </tr>
        <tr>
            <td>id</td>
            <td><input type="text" name="id" value="${book.id}"/></td>
        </tr>
          <tr>
            <td>书名</td>
            <td><input type="text" name="bookName" value="${book.bookName}"/></td>
        </tr>
          <tr>
            <td>作者</td>
            <td><input type="text" name="bookAuthor" value="${book.bookAuthor}"/></td>
        </tr>
         <tr>
            <td>出版社</td>
            <td><input type="text" name="publisher" value="${book.publisher}"/></td>
        </tr>
       
        <tr>
            <td colspan="2">
              
                <input type="submit" value="查询"/>
            </td>
        </tr>
    </table>
</form>



<table>
    <tr>
        <th>ID</th>
        <th>书名</th>
        <th>作者</th>
        <th>出版社</th>
    </tr>

    <c:forEach var="book" items="${bookList}">
        <tr>
            <td>${book.id}</td>
            <td>${book.bookName}</td>
            <td>${book.bookAuthor}</td>
            <td>${book.publisher}</td>
            <td>
                <a href="${pageContext.request.contextPath}/book/update.do?id=${book.id}">修改</a>
                &nbsp;&nbsp;
                <a href="${pageContext.request.contextPath}/book/delete.do?id=${book.id}">删除</a>

            </td>

        </tr>
    </c:forEach>

</table>




</body>
</html>