<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="java.util.List, com.home.knightingal.bean.Ship"
%>
<html>
<head>
</head>
<body>
    welcome to local navy source!
    <img src="/NavySourceStatic/BB/20160315232552BB-27_USS_MICHIGAN/0-012623.jpg" style="width:300px"/>
    <table border="1">
        <%
            List<Ship> ships = ((List<Ship>)request.getAttribute("ships"));
            for (int i = 0; i < ships.size(); i++) {
        %>
            <tr>
                <td>
                    <a href="/NavySourceStatic/BB/20160315232552BB-27_USS_MICHIGAN/0-012623.jpg">
                        <%= ships.get(i).getId() %>
                    </a>
                </td>
                <td>
                    <a href="/LocalNavySource/navy/queryShipDetail?shipId=<%= ships.get(i).getId() %>">
                        <%= ships.get(i).getShipName() %>
                    </a>
                </td>
                <td>
                    <%= ships.get(i).getDirName() %>
                </td>
            </tr>
        <%
            }
        %>
    </table>
</body>
</html>