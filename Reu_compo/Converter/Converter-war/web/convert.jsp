<%-- 
    Document   : convert
    Created on : 10 oct. 2018, 10:41:09
    Author     : trogliano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean class="converter.ConverterBean" id="beanConv"/>
        <%@page import="java.util.*" %>
        <%double amount = Double.parseDouble(request.getParameter("amount"));
        String currency = request.getParameter("currency");
        double res = beanConv.euroToOtherCurrency(amount, currency);
        out.println(amount+" € are "+res+" in "+currency);
        %>
    </body>
</html>
