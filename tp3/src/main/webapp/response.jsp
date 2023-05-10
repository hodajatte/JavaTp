<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> R E P O N S E </title>
</head>
<body>
     <p> Nom : <%=req.getParameter("nom") %> </p>
     <p> Prénom: <%=req.getParameter("prenom")%> </p>
     <p>
     <% if(req.getParameterValues("radio1")[0].equals("mas")){ %>
     C'est un homme. Il
     <%} else{%>
     c'est une femme. Elle<%} %>
     a écrit :<%=req.getParameter("textarea")%>
     </p>
     </body>
     </html>