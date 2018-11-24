<%@page language="java" contentType="text/html" %>
<html>
<head>
    <title>HOME PAGE</title>
</head>
<body>
Nasz pierwszy jsp

<h1><% out.print("Hello world !");%></h1>


<% for (int i = 1; i <= 100; i++) {
    out.print(i + " ");
    if (i % 10 == 0) {%>
<br>
<%
        }
    }
%>

</body>
</html>