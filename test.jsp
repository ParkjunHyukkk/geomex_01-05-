<%@page import="com.sun.tools.javac.Main"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="exam.Arm"%>
<%@page import="exam.Body"%>
<%@page import="exam.Finger"%>
<%@page import="exam.Human"%>
<%@page import="exam.Leg"%>
<%@page import="exam.Tose"%>
<%@page import="exam.Head"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
Body body = new Body();
Arm arm = new Arm();
Finger finger = new Finger();
Head head = new Head();
Leg leg= new Leg();
Tose tose = new Tose();

out.println(body.getmove()+"<br>");
out.println(arm.getmove()+"<br>");
out.println(head.getmove()+"<br>");
out.println(leg.getmove()+"<br>");
out.println(tose.getmove()+"<br>");
%>
</body>
</html>
