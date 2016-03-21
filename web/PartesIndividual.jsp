<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
        <script src="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.js"></script>
        <script src="http://cdn.rawgit.com/mindmup/editable-table/master/mindmup-editabletable.js"></script>
        <script src="http://cdn.rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/js/bootstrap-editable.js"></script>
        <script src="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/src/extensions/editable/bootstrap-table-editable.js"></script>
		<script src="https://github.com/wenzhixin/bootstrap-table/blob/master/src/extensions/export/bootstrap-table-export.js"></script>

		<script src="https://github.com/hhurz/tableExport.jquery.plugin/blob/master/tableExport.min.js"></script>

        <link rel="stylesheet" href="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/dist/bootstrap-table.min.css">
        <link rel="stylesheet" href="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.1.0/css/buttons.bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/select/1.1.0/css/select.bootstrap.min.css">
        <link rel="stylesheet" href="http://cdn.rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/css/bootstrap-editable.css">

        <!-- progress bar -->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

        <!-- json serialize -->
        <script src="http://cdn.rawgit.com/macek/jquery-serialize-object/master/dist/jquery.serialize-object.min.js"></script>

        <script src="js/PartesIndividual.js"></script>
        
      <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.9.1/extensions/export/bootstrap-table-export.js"></script>
      <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/FileSaver.js/2014-11-29/FileSaver.min.js"></script>
      <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.1.135/jspdf.min.js"></script>
      <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf-autotable/2.0.17/jspdf.plugin.autotable.js"></script>
      <script type="text/javascript" src="https://rawgit.com/hhurz/tableExport.jquery.plugin/master/tableExport.js"></script>

        <title>Insert title here</title>
       
       <style type="text/css">
			.TextFormat {
				color:#000000;
			}
			.TextFormat a {
				color:#000000;
			}
		</style>
    </head>
    <body>
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">

                        <h4 class="modal-title" id="headerModal">Enviando informacio</h4>
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
		<form role="form" id="formPartes">    
	        <div class="table-responsive">
	            <div class="container-body" style="margin: 20px">
	                <div class="row">
	                     <input type="hidden" name="id_parte">
	                     
	                    <div class="col-sm-3">
	                    	<label for="tipo_eval">Tipo de Evaluación</label>
							<select id ="tipo_eval" name="tipo_eval" class="form-control" style="width:200px;">
								<option value = '1' >Evaluación</option>
								<option value = '2' >Pre evaluación</option>
							</select>
	                    </div>
	                   
	                	<div class="col-sm-2">
	                    	<label for="revision">Revisión</label>
							<select id ="revision" name="revision" class="form-control" style="width:100px;">
								<option value = '1' >1a</option>
								<option value = '2' >2a</option>
								<option value = '3' >3a</option>
							</select>
	                    </div>
						
						<div class="col-sm-2">
	                    	<label for="anio">Año</label>
							<select id ="anio" name="anio" class="form-control" style="width:100px;">
								<option>2005</option> <option>2006</option> <option>2007</option>
								<option>2008</option> <option>2009</option> <option>2010</option>
								<option>2011</option> <option>2012</option> <option>2013</option>
								<option>2014</option> <option>2015</option> <option>2016</option>
								<option>2017</option> <option>2018</option> <option>2019</option>
								<option>2020</option> <option>2021</option> <option>2022</option>
								<option>2023</option> <option>2024</option> <option>2025</option>
								<option>2026</option> <option>2027</option> <option>2028</option>
								<option>2029</option> <option>2030</option>
							</select>
	                    </div>
	                    
	                    
	                    <div class="col-sm-3">
	                    	<label for="tipo_producto">Tipo de Producto</label>
							 <input class="form-control"  name="tipo_producto" id="tipo_producto"  type="text" style="background-color:#ffffff; color:#000000" disabled>
	                    </div>
	                </div>
	                
	                
	               <div class="row">
	                    
		                <div class="col-sm-3">
							<label for="dr">DR</label>
							<select id ="dr" name="dr" class="form-control" style="width:200px;"></select>
						</div>
						<div class="col-sm-3">
	                    	<label for="codigo_DR">Codigo DR</label>
							 <input class="form-control"  name="codigo_DR" id="codigo_DR"  type="text" style="background-color:#ffffff; color:#000000"  disabled >
	                    </div>
	            	</div>
	            	
	            	
	            	<div class="row">
	                    
	                    
		               <div class="col-sm-3">
		               		<label for="dealer">Dealer</label>
							<select id ="dealer" name="dealer" class="form-control" style="width:200px;"></select>	
		                </div>
						<div class="col-sm-3">
	                    	<label for="sp_code">Codigo Dealer</label>
							 <input class="form-control"  name="sp_code" id="sp_code"  type="text" style="background-color:#ffffff; color:#000000"  disabled >
	                    </div>
	                    <div class="col-sm-3">
	                    	<label for="OEM">OEM</label>
							 <input class="form-control"  name="oem" id="oem"  type="text" style="background-color:#ffffff; color:#000000"  disabled >
	                    </div>
	            	</div>
	            	<div class="row">
	                    <div class="col-sm-3">
	                    	<label for="dealer_dr">Para</label>
							 <input class="form-control"  name="dealer_dr" id="dealer_dr"  type="text" style="background-color:#ffffff; color:#000000"  disabled >
	                    </div>
	                    
	                     <div class="col-sm-3">
	                    	<label for="dealer_dr">Matriz</label>
							<select id ="matriz" name="matriz" class="form-control" style="width:200px;"></select>	
	                    </div>
	                    
	                    
	            	</div>
		            
	        	</div>
	        </div>
	        <button type="button" id="savePartes" class="btn btn-default">Guardar</button>
		</form>

		<form>
			<table id="tableBody" data-toolbar="#toolbar" data-toggle="table"></table>
		</form>
	
    </body>
</html>