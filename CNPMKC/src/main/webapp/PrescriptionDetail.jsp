<%@page import="Model.PrescriptionDetail"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
</head>
<body>
     <div class="container">
     <a href="index.jsp" class="btn btn-primary mt-3 mb-3 m1-auto">Back to Index</a>
     <a href="index.jsp" class="btn btn-primary mt-3 mb-3 m1-auto">Insert</a>
       <table> 
          <tr>
              <th scope="col">IDPrescriptionDetail</th>
              <th scope="col">Dose</th>
              <th scope="col">Frequency</th>
              <th scope="col">Quantity</th>
          </tr>
          <%
             ArrayList<PrescriptionDetail> list = (ArrayList<PrescriptionDetail>) request.getAttribute("listDetail");
             System.out.println(list);
		    if (list != null) {
		        for (int i = 0; i < list.size(); i++) {
		            PrescriptionDetail psd = list.get(i);
           %>
            <tr>
              <td  scope="row"><%= psd.getIDprescriptionDetail() %></td>
              <td  scope="row"><%= psd.getDose() %></td>
              <td  scope="row"><%= psd.getFrequency() %></td>
              <td  scope="row"><%= psd.getQuantity() %></td>
          </tr>
		  <%
			  }
			
			}
		  %>
       </table>
       </div>
       <input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
<script type="text/javascript">
		var status = document.getElementById("status").value;
		if(status == "Erorr1"){
			swal("Sorry", "Lieu Qua Phep", "error");
		}
		if(status == "Erorr2"){
			swal("Sorry", "Loi Gi Gi Vo", "error");
		}
		if(status == "Erorr3"){
			swal("Sorry", "So Ngay Khong Trong Gioi Han Cho Phep", "error");
		}
	</script>
</body>
</html>