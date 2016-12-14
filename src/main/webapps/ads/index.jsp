<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
    <head>
        <%@ include file="../partials/head.jsp"%>
    </head>
    <body>
        <jsp:include page="/partials/navbar.jsp" />

        <div class="container">
            <h1>Viewing your Ads.</h1>
        </div>

        <table class="table table-striped table-hover ">
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Description</th>
                </tr>
            </thead>
            <body>
                <c:forEach var="ad" items="${ads}">
                    <tr>
                        <td>${ad.title}</td>
                        <td>${ad.description}</td>
                    </tr>
                </c:forEach>
            </body>
        </table>
    </body>
</html>