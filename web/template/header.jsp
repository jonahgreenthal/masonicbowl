﻿<%@ page import="org.apache.commons.lang3.ObjectUtils" %>

<%
String TITLE_SEPARATOR = " | ";

String argTitle, argDescription;

String argTitleParameter = request.getParameter("pageTitle");

if (argTitleParameter == null) {
	argTitle = "Masonic";
} else {
	argTitle = "Masonic" + TITLE_SEPARATOR + argTitleParameter;
}

String argDescriptionParameter = request.getParameter("pageDescription");
if (argDescriptionParameter == null) {
	argDescription = argTitle;
} else {
	argDescription = "Masonic" + TITLE_SEPARATOR + argDescriptionParameter;
}
%>
<!doctype html>

<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0, target-densitydpi=device-dpi">
	
	<title><%= argTitle %></title>
	<meta name="author" content="Jonah Greenthal">
	<meta name="description" content="<%= argDescription %>">
	
	<!-- jQuery -->
	<script src="//code.jquery.com/jquery-2.1.4.min.js"></script>
	
	<!-- jQuery UI -->
	<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
	
	<!-- Font Awesome -->
	<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
	
	<!-- Tablesorter -->
	<script src="/template/tablesorter/jquery.tablesorter.min.js"></script>
	
	<!-- Foundation -->
	<link rel="stylesheet" href="/template/style.css">
	<script src="/template/foundation/js/foundation.min.js"></script>
	
	<!-- Foundation Datepicker -->
	<link rel="stylesheet" href="/template/foundation/datepicker/foundation-datepicker.css">
	<script src="/template/foundation/datepicker/foundation-datepicker.js"></script>
	
	<!-- Responsive Tables -->
	<link rel="stylesheet" href="/template/foundation/responsive-tables/responsive-tables.css">
	<script src="/template/foundation/responsive-tables/responsive-tables.js"></script>
</head>

<body>
<%= ObjectUtils.firstNonNull(request.getParameter("topMenu"), "") %>

<section role="main" class="scroll-container">
	<div class="row">
		<div class="small-12 columns">
			<h1 class="page-header" id="<%= ObjectUtils.firstNonNull(request.getParameter("h1Id"), "mainHeader") %>"><%= ObjectUtils.firstNonNull(request.getParameter("h1"), "") %></h1>
		</div>
	</div>
