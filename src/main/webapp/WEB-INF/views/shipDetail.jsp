<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="java.util.List, com.home.knightingal.bean.ShipDetail, com.home.knightingal.bean.Ship"
%>
<html>
<head>
</head>
<body>

    <table border="1">
        <%
            List<ShipDetail> shipDetailList = ((List<ShipDetail>)request.getAttribute("shipDetailList"));
            Ship ship = (Ship)request.getAttribute("ship");
            for (ShipDetail shipDetail : shipDetailList) {
                String imgSrc = shipDetail.getPicType().equals("pdf") ?
                    "/NavySourceStatic/BB/" + ship.getDirName() + "/converted/" + shipDetail.getPicName().replace("pdf", "png"):
                    "/NavySourceStatic/BB/" + ship.getDirName() + "/" + shipDetail.getPicName();
        %>
            <tr>
                <td>
                    <a href="<%=imgSrc %>">
                        <img
                            src="<%=imgSrc %>"
                            style="width:300px"/>
                    </a>
                </td>
                <td>
                    <%= shipDetail.getPicDescription() %>
                </td>
            </tr>
        <%
            }
        %>
    </table>
</body>
</html>
