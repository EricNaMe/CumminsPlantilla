
 <%@include file="header.jsp"%>
  	
<link rel="stylesheet" href="styles/bootstrap.vertical-tabs.css">
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
	background-color:#FFFFFF;
	
}
.cumminsTabs a{
	color:#000000;
	background-color:#FFFFFF;
}
</style>

<div class="col-xs-3 tabs-left"> <!-- required for floating -->
    <!-- Nav tabs -->
    <ul class="nav nav-tabs tabs-left cumminsTabs" >
	  	<!-- <li class="active tabs-left" ><a data-toggle="tab" href="TEMPMotores.jsp">Motores</a></li> -->
	  	<li><a  href="TEMPMotores.jsp">Motóres</a></li>
		<li><a  href="TEMPMotoresOEM.jsp">Motores por OEM</a></li>
		<li><a  href="TEMPporcenMotDR.jsp">% Participación Motores en DR</a></li>
		<li><a  href="TEMPConfigMotor.jsp">Configuración de Motores</a></li>
		<li><a  href="TEMPCalenEval.jsp">Calendario de Evaluaciones</a></li>
		<li><a  href="TEMPInfantCare.jsp">Generación de Infant Care</a></li>
		<li><a  href="TEMPTeenCare.jsp">Generación de Teen Care</a></li>
		<li><a  href="TEMPHerramientas.jsp">Generación de Herramientas</a></li>
		<li><a  href="TEMPPonderaciones.jsp">Ponderaciones</a></li>
		
	</ul>
</div>

<div class="col-xs-9" >
    <div class="tab-content" style="background-color: #ffffff;">
    
   		
