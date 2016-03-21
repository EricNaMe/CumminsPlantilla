<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

  	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  	<link rel="stylesheet" href="styles/bootstrap.vertical-tabs.css">
  	
	<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<style type="text/css">

.contentTab{
	margin:0px; 
	padding-right: 0px; 
	border-spacing: 0px;
	border:0px;
}

.cumminsTabs{
	color:#000000;
}
.cumminsTabs li{
	color:#000000;
}
.cumminsTabs a{
	color:#000000;
}


</style>


</head>
<body>



<div class="col-xs-3 tabs-left"> <!-- required for floating -->
    <!-- Nav tabs -->
    <ul class="nav nav-tabs tabs-left cumminsTabs" >
	  	<li class="active tabs-left" ><a data-toggle="tab" href="#motores">Motores</a></li>
		<li><a data-toggle="tab" href="#motoresOEM">Motores por OEM</a></li>
		<li><a data-toggle="tab" href="#motdist">% Participación Motores en DR</a></li>
		<li><a data-toggle="tab" href="#confmot">Configuración de Motores</a></li>
		<li><a data-toggle="tab" href="#caleva">Calendario de Evaluaciones</a></li>
		<li><a data-toggle="tab" href="#genIC">Generación de Infant Care</a></li>
		<li><a data-toggle="tab" href="#genTC">Generación de Teen Care</a></li>
		<li><a data-toggle="tab" href="#genHTAS">Generación de Herramientas</a></li>
		<li><a data-toggle="tab" href="#pondera">Ponderaciones</a></li>
		
	</ul>
</div>

<div class="col-xs-9" >
    <!-- Tab panes -->
    <div class="tab-content">
    
    
     	<div id="motores" class="tab-pane fade in active contentTab"  >
			<iframe  style="height:450px;" class="contentTab"  name="myframe2" src="Motores.jsp"   width="100%" ></iframe>
		</div>
		<div id="motoresOEM" class="tab-pane fade contentTab"  > 
			<iframe  style="height:400px;" class="contentTab"  name="myframe2" src="MotoresOEM.jsp"   width="100%" ></iframe>
		</div>
		
		<div id="motdist" class="tab-pane fade contentTab"  > 
			<iframe  style="height:400px;" class="contentTab"  name="myframe2" src="porcenMotDR.jsp"   width="100%" ></iframe>
		</div>
		<div id="confmot" class="tab-pane fade contentTab"  > 
			<iframe  style="height:400px;" class="contentTab"  name="myframe2" src="ConfigMotor.jsp"   width="100%" ></iframe>
		</div>
		<div id="caleva" class="tab-pane fade contentTab"  > 
			<iframe  style="height:400px;" class="contentTab"  name="myframe2" src="CalenEval.jsp"   width="100%" ></iframe>
		</div>
		
		
		<div id="genIC" class="tab-pane fade contentTab"  > 
			<iframe  style="height:400px;" class="contentTab"  name="myframe2" src="InfantCare.jsp"   width="100%" ></iframe>
		</div>
		
		
		<div id="genTC" class="tab-pane fade contentTab"  > 
			<iframe  style="height:400px;" class="contentTab"  name="myframe2" src="TeenCare.jsp"   width="100%" ></iframe>
		</div>
		
		<div id="genHTAS" class="tab-pane fade contentTab"  > 
			<iframe  style="height:400px;" class="contentTab"  name="myframe2" src="Herramientas.jsp"   width="100%" ></iframe>
		</div>
		<div id="pondera" class="tab-pane fade contentTab"  > 
			<iframe  style="height:400px;" class="contentTab"  name="myframe2" src="Ponderaciones.jsp"   width="100%" ></iframe>
		</div>
		
		
		
    </div>
</div>  




</body>
</html>