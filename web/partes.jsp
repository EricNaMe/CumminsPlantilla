<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="styles/bootstrap.vertical-tabs.css">


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> 
  <script>
  $(document).ready(function() {

	 var wh = $( window ).height(); 
	  $('#myframe2').height(wh-90);
	  $('#divTab').height(wh-90);
	  $('#perfil').height(wh-90);
	  
	});
  </script>

<link rel="stylesheet" href="balconjaimeJJtab7.css" type="text/css" />

</head>
<body>





<div class="col-xs-3" id="tabs"> <!-- required for floating -->
    <!-- Nav tabs -->
    <ul class="nav nav-tabs tabs-left">
	  	<li class="active"><a data-toggle="tab" href="#ParEval">Evaluación de Partes</a></li>
		<li><a data-toggle="tab" href="#EvalParts">Partes Individual</a></li>
		<li><a data-toggle="tab" href="#ConsultPart">Partes Agrupadas</a></li>
	</ul>
</div>

<div class="col-xs-9" >
    <!-- Tab panes -->
    <div class="tab-content">
     	<div id="ParEval" class="tab-pane fade in active">
			<iframe  style="height:600px;" name="myframe2" src="PartesEvaluadas.jsp"  scrolling="yes" width="100%" marginheight="0" marginwidth="0" frameborder="0"></iframe>
		</div>
		<div id="EvalParts" class="tab-pane fade"> 
			<iframe  style="height:600px;" name="myframe2" src="PartesIndividual.jsp"  scrolling="yes" width="100%" marginheight="0" marginwidth="0" frameborder="0"></iframe>
		</div>
		<div id="ConsultPart" class="tab-pane fade">
			<iframe  style="height:600px;" name="myframe2" src="Matriz.jsp"  scrolling="yes" width="100%" marginheight="0" marginwidth="0" frameborder="0"></iframe>
		
		</div>
    </div>
</div>  




</body>
</html>