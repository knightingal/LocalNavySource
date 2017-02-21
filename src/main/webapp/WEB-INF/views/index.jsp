<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="java.util.List, com.home.knightingal.bean.Ship"
%>
<html>
<head>
</head>
<body>
    welcome to local navy source!
    <!--
    <img src="/NavySourceStatic/BB/20160315232552BB-27_USS_MICHIGAN/0-012623.jpg"/>
    -->
    <table border="1">
        <%
            List<Ship> ships = ((List<Ship>)request.getAttribute("ships"));
            for (int i = 0; i < ships.size(); i++) {
        %>
            <tr>
                <td>
                    <%= ships.get(i).getId() %>
                </td>
                <td>
                    <%= ships.get(i).getShipName() %>
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