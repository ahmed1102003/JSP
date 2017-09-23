<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Food</title>

<%@ page import="java.util.*"%>
<%@ page import="Auth.*"%>

</head>

<body>

<h3> Food </h3>
</br>
<h3> Testing the send request from JSP to the Servelt </h3>


<form method= "post" action = "Auth" >

Enter Food type <input type= "text"  name="foodtype"  id = "foodtype">

</br>
</br>

Enter location <input type ="text" name ="location" id ="location">
</br>
</br>

<% if (request.getAttribute("Rest") != null) {
    ArrayList match = (ArrayList) request.getAttribute("Rest");
 
    for (int i=0; i < match.size(); i++) {
    
        out.println("<br/>");
        String um = (String)match.get(i);   
	out.println("this for the food " + um.charAt(i));
      /*   out.println("<span>"+um.foodtype+"</span>");
        out.println("<img src='"+um.images+"' style='width:25px;width:25px;'>");
        out.println("<span>"+um.location+"</span>"); */
        
        out.println("<br/>");
  
    }
}
else {
    out.println("no data in array");
}  
%>


<input type = "submit" value = "Search"  name ="Search"  id= "Search">

</br>
</form>

</br>

<img src="Arabicfood1.jpg" style="width:35px;width:40px;">



</body>
</html>