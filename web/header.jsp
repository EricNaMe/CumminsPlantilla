<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Insert title here</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	
  	<meta charset="utf-8"> 
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="cummins_styles/bootstrap.min.css">
    <script src="scripts/jquery.min.js"></script>
    <script src="scripts/bootstrap.min.js"></script>

    <script src="scripts/jquery.dataTables.min.js"></script>
    <script src="scripts/dataTables.bootstrap.min.js"></script>
    <script src="scripts/dataTables.buttons.min.js"></script>
    <script src="scripts/buttons.bootstrap.min.js"></script>
    <script src="scripts/dataTables.select.min.js"></script>
    <script src="scripts/bootstrap-table.js"></script>
    <script src="scripts/mindmup-editabletable.js"></script>
    <script src="scripts/bootstrap-editable.js"></script>
    <script src="scripts/bootstrap-table-editable.js"></script>
 
   

    <link rel="stylesheet" href="cummins_styles/bootstrap-table.min.css">
    <link rel="stylesheet" href="cummins_styles/bootstrap-table.css">
    <link rel="stylesheet" href="cummins_styles/buttons.bootstrap.min.css">
    <link rel="stylesheet" href="cummins_styles/select.bootstrap.min.css">
    <link rel="stylesheet" href="cummins_styles/bootstrap-editable.css">
    
       <script src="scripts/jquery-ui.js"></script>
       <script src="scripts/datepicker.js"></script>
       <link rel="stylesheet" href="css/datepicker.css">
       
    <link rel="stylesheet" href="css/jquery-ui.min.css">
    <link rel="stylesheet" href="css/jquery-ui.css">
    <link rel="stylesheet" href="css/jquery-ui.structure.css">
    <link rel="stylesheet" href="css/jquery-ui.theme.css">
    <link rel="stylesheet" href="css/jquery-ui.theme.min.css">
     <script type="text/javascript" src="scripts/jquery.js"></script>

    
     
     
    <link rel="stylesheet" href="css/infantCare.css">
    <!-- progress bar -->
    <link rel="stylesheet" href="cummins_styles/jquery-ui.css">

    <script src="scripts/jquery-ui.js"></script>

    <!-- json serialize -->
    <script src="scripts/jquery.serialize-object.min.js"></script>

    <!-- excel export --> 
    <script type="text/javascript" src="scripts/bootstrap-table-export.js"></script>
    <script type="text/javascript" src="scripts/FileSaver.min.js"></script>
    <script type="text/javascript" src="scripts/jspdf.min.js"></script>
    <script type="text/javascript" src="scripts/jspdf.plugin.autotable.js"></script>
    <script type="text/javascript" src="scripts/tableExport.js"></script>

	<!-- DatePicker -->
	
	
	<link rel="stylesheet" href="styles/bootstrapmodificado.min.css">

<style type="text/css">

body {   
    background-image: url('img/bg01.bmp');
	margin:0px;
}

.encabezado {
	background-color:#FF0000;
	margin-left:10px;
	margin-right:10px;
	margin-top:10px;
	margin-bottom:10px;
	border:black 8px solid;
	border-spacing: 8px;
}

.contenido {
	border-radius: 5px;
	margin-top:0px;
	background-image:url('img/bg01.bmp');
	height:520px;
	margin-left:10px;
	margin-right:10px;
	margin-bottom:10px;
	}

.TextFormat {
	color:#000000;
	background-color: #ffffff;
}
.TextFormat a {
	color:#000000;
	background-color: #ffffff;
}


</style>

</head>

<body>

<div class="container">

  <div class="encabezado">
      <img src="img/cummins.gif"  height="70px" alt="ABO IT" />     
      <img src="img/global.bmp"  height="70px" alt="Global" align="right" />
  </div>

<br>
<div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="headerModal">Enviando informacion</h4>
            </div>
            <div class="modal-body">
                <div class="progress">
                    <div class="progress-bar progress-bar-striped active" role="progressbar"
                         aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width:100%">
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal" id="closeModal" style="display: none">Close</button>
                <button type="button" class="btn btn-default" data-dismiss="modal" id="closeModalEliminar" style="display: none">Close</button>
            </div>
        </div>
    </div>
</div>
<ul class="cummins_navi cummins_navi-tabs active" id="TABS">
    <!-- <li  class="active " ><a data-toggle="tab" href="TEMPPerfilDealer.jsp">Perfil</a></li>-->
    <li><a href="TEMPPerfilDealer.jsp">Perfil</a></li>
    <li><a href="TEMPpartes.jsp">Partes</a></li>
    <li><a href="TEMPcapacitacion.jsp">Capacitación</a></li>
    
    <li><a href="TEMPHerramientasmain.jsp">Herramientas & Software</a></li>
    <li><a href="TEMPeficiencia.jsp">Eficiencia</a></li>
    <li><a data-toggle="tab" href="#menu6">Branding</a></li>
    
    <li><a href="TEMPquejas.jsp">Quejas</a></li>
    <li><a  data-toggle="tab" href="#menu8">Desarrollo Dealer</a></li>
    <li><a  href="TEMPcatalogos.jsp">Catálogos</a></li>
  </ul>

			<div class="tab-content" style ="background-color: #FFFFFF; ">
  		
