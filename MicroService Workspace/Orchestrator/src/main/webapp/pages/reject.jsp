<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Reject</title>
<style>


.container{

}
.center {


  margin-top: 40px;
  background-color: whitesmoke;
  max-width: 100%;
  border-style: solid;
border-width: 1px;
 border-color: red;
 
 
 
  margin: 0;
  position: absolute;
  top: 40%;
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

    
    <p style="color: red"><b> &nbsp;&nbsp;Please enter the reason:&nbsp;&nbsp;</b></p>

    <p><b>Ticket No :</b> <b style="color: blue">${ticNo}</b> </p>
    
    
    	
    
  <form action="reject" method="post">
  <input type="text" value="${ticNo}" hidden="true" name="ticNo">
   &nbsp;&nbsp;&nbsp;&nbsp;<textarea cols="50" rows="8" style="resize: none;" name ="reason" required="required"></textarea>&nbsp;&nbsp;&nbsp;&nbsp;
                <br><br>
       <button style="background: #f44336; border: 10px solid #f44336; font-family: tahoma; font-weight: 900; letter-spacing: 1px; font-size: 16px; mso-height-rule: exactly; line-height: 30px; text-align: center; text-decoration: none;  border-radius: 3px; font-weight: 900; text-transform: uppercase;">
                &nbsp;&nbsp;&nbsp;&nbsp;<span style="color:#ffffff">Reject</span>&nbsp;&nbsp;&nbsp;&nbsp; 
            </button>
            <br>  <br>  
            
            </form>
  </div>
</div>

</body>
</html>