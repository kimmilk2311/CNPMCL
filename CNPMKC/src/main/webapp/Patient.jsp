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
<body>
    <div class="container">
   <a href="index.jsp" class="btn btn-primary mt-3 mb-3 m1-auto">Back to Index</a>
   <table class="table table-striped mx-auto"> 
      <tr> 
          <th scope="col"><h3>IDPatient</h3></th>  
          <th scope="col"><h3>NamePatient</h3></th>
          <th scope="col"><h3>Condition</h3></th>
          <th scope="col"><h3>Phone</h3></th>
          <th scope="col"><h3>AddressPatient</h3></th>
      </tr>
          <%
					ArrayList<Model.Patient> list = (ArrayList<Model.Patient>) request.getAttribute("listPatient");
					System.out.println(list);
					    if (list != null) {
					        for (int i = 0; i < list.size(); i++) {
					            Model.Patient pt = list.get(i);
		  %>
	   
           <tr>
              <td scope="row"><%= pt.getIDpatient() %></td>
              <td scope="row"><%= pt.getNamepatient() %></td>
              <td scope="row"><%= pt.getConditon() %></td>
              <td scope="row"><%= pt.getPhone() %></td>
              <td scope="row"><%= pt.getAdrresspatient() %></td>
          </tr>
		  <%
			  }
			
			}
		  %>
               
   </table>
   </div>
</body>
</html>