<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

.container{

}
.center {


  margin-top: 20px;
  background-color: whitesmoke;
  max-width: 100%;
  border-style: solid;
border-width: 1px;
 border-color: red;
 
 
 
  margin: 0;
  position: absolute;
  top: 30%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
p{
font-size: 20px}


.center{
  text-align:center;
 }


</style>
</head>
<body>


<div class="container">
  <div class="center">


    <p style="color: red"> &nbsp; &nbsp;<b>${msg} </b>&nbsp; &nbsp;</p>
 
    <p><b>Ticket No :</b> <b style="color:blue">${ticNo}</b> </p>




</div>
</div>



</body>
</html>