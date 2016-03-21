
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>

        <meta charset="utf-8"> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

        <script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.10/js/dataTables.bootstrap.min.js"></script>
        <script src="https://cdn.datatables.net/buttons/1.1.0/js/dataTables.buttons.min.js"></script>
        <script src="https://cdn.datatables.net/buttons/1.1.0/js/buttons.bootstrap.min.js"></script>
        <script src="https://cdn.datatables.net/select/1.1.0/js/dataTables.select.min.js"></script>
        <script src="https://rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.js"></script>
        <script src="https://rawgit.com/mindmup/editable-table/master/mindmup-editabletable.js"></script>
        <script src="https://rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/js/bootstrap-editable.js"></script>
        <script src="https://rawgit.com/wenzhixin/bootstrap-table/master/src/extensions/editable/bootstrap-table-editable.js"></script>


        <link rel="stylesheet" href="https://rawgit.com/wenzhixin/bootstrap-table/master/dist/bootstrap-table.min.css">
        <link rel="stylesheet" href="https://rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.1.0/css/buttons.bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/select/1.1.0/css/select.bootstrap.min.css">
        <link rel="stylesheet" href="https://rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/css/bootstrap-editable.css">
        <!-- progress bar -->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

        <!-- json serialize -->
        <script src="http://cdn.rawgit.com/macek/jquery-serialize-object/master/dist/jquery.serialize-object.min.js"></script>


        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        
        <script>
            $(document).ready(function() {
                
            });
        </script>
    </head>
    <body>

      
	<script src="js/capacitacionAdminGarantias.js"></script>
            <h2 >Evaluación administrador garantías</h2>

			<div class="row">
				<div class="col-md-2">
					<div class="row">
						<label >Tipo de evaluación:</label>
					</div>
					<div class="row">
						<label><input type="radio" name="TipoEva">Evaluación</label>
					</div>
					<div class="row">
						<label ><input type="radio" name="TipoEva">Pre Evaluación</label>
					</div>
				</div>
				
				<div class="col-md-1">
					<div class="row">
						<label class="col-lg-6" >Revisión:</label>
					</div>
					<div class="row">
						<label><input type="radio" name="No_Eva1">1a</label>
					</div>
					<div class="row">
						<label><input type="radio" name="No_Eva1">2a</label>
					</div>
				</div>
				
				<div class="col-md-2">
					<label for="sel1">Año:</label>
					<select class="form-control" id="sel1">
                        <option>2016</option>
                        <option>2015</option>
                        <option>2014</option>
                        <option>2013</option>
                   	</select>
				</div>
				
				<div class="col-md-4">
					<div class="row">
						<label  for="Modl">Fecha evaluación:</label>
						<input  id="meeting" type="date" value=""/>
                    	<img   src="calendar5.png" alt="Calendar" width="20" height="20">
					</div>
					<div class="row">
						<label  for="Modl">Fecha inicio evaluación:</label>
                    	<input id="meeting" type="date" value=""/>
                    	<img src="calendar5.png" alt="Calendar" width="20" height="20"> 
					</div>
					<div class="row">
						<label for="Modl">Fecha fin evaluación:</label>
                    	<input  id="meeting" type="date" value=""/>
                    	<img  src="calendar5.png" alt="Calendar" width="20" height="20"> 
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-3">
					<label  for="dr">DR:</label>
                	<select  id="dr" name="dr" class="form-control" ></select>
				</div>
				<div class="col-md-2">
					<label  for="codigoDR">Código DR:</label>
                    <input   type="text"  class="form-control" id="codigoDR">
				</div>
			</div>
			<div class="row">
				<div class="col-md-3">
					 <label  for="dealer">Dealer:</label>
                     <select id ="dealer"  name="dealer" class="form-control" ></select>
				</div>
				<div class="col-md-2">
					<label   for="codigoDeal">Código Dealer:</label>
                    <input  type="text"  class="form-control" id="codigoDeal">
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-md-3">
					<label for="usr">Administrador encontrado:</label>
                    <input  type="text"  class="form-control" id="usr">
				</div>
				<div class="col-md-3">
					<label  for="usr">Promotion ID:</label>
                    <input  type="text"  class="form-control" id="usr">
				</div>
			</div>

			<div class="row">
				<div class="col-md-3">
					<label for="usr">Fecha de certificación:</label>
                    <input type="text"  class="form-control" id="usr">
				
				</div>
			</div>

            <br><br>
            
            <div class="row">
				<div class="col-md-3">
					<label for="usr">¿Es correcta la información?</label>
				</div>
				<div class="col-md-1">
					<label ><input type="radio" name="correctInf">Si</label>
				</div>
				<div class="col-md-1">
					<label ><input type="radio" name="correctInf">No</label>
				</div>
			</div>

            <div class="table-responsive" style='position:relative;  height: 190px; top:30px; width:500px;' class="container" >
                <table class="table table-striped" id="tableBody">
                </table>
            </div>

			<div class="row">
				<div class="col-md-1">
					<button  type="button" class="btn btn-default"  id="evaluar" >Evaluar</button>
				</div>
				<div class="col-md-5">
				
					<div class="table-responsive" style='position:relative;  height: 90px; top:0px; width:250px;' >
                        <table class="table table-striped" id="tableBody2">
                        </table>
                     </div>
				</div>
			</div>

    </body>
</html>
