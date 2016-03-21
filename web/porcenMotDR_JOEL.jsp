<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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


        <link rel="stylesheet" href="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/dist/bootstrap-table.min.css">
        <link rel="stylesheet" href="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.1.0/css/buttons.bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/select/1.1.0/css/select.bootstrap.min.css">
        <link rel="stylesheet" href="http://cdn.rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/css/bootstrap-editable.css">

        <link rel="stylesheet" href="css/infantCare.css">
        <!-- progress bar -->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

        <!-- json serialize -->
        <script src="http://cdn.rawgit.com/macek/jquery-serialize-object/master/dist/jquery.serialize-object.min.js"></script>

        <script src="js/motores.js"></script>
        <script src="js/validaciones.js"></script>
		
		<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.9.1/extensions/export/bootstrap-table-export.js"></script>
      <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/FileSaver.js/2014-11-29/FileSaver.min.js"></script>
      <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.1.135/jspdf.min.js"></script>
      <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf-autotable/2.0.17/jspdf.plugin.autotable.js"></script>
      <script type="text/javascript" src="https://rawgit.com/hhurz/tableExport.jquery.plugin/master/tableExport.js"></script>
    

<script>


</script>

</head>
<body>
    <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
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
	
	
	<form  id="formPorcenMotorDR">
	
	<div class="row" style="width:100%; padding:0px;">
		<div class="col-sm-3">
	
	<label for="dr">DR</label>
	<select id ="dr" name="dr" class="form-control" style="width:200px;">
  		

	</select>
	
		</div>
		<div class="col-sm-3">

	<label for="matriz">Motor</label>
	<select id ="matriz" name="matriz" class="form-control" style="width:200px;">
  		

	</select>
	
	</div>
		<div class="col-sm-2">
	
	
	<label for="rango">Rango</label>

	<select id ="rango" name="rango" class="form-control" style="width:80px;">
  		
	</select>
	
	</div>
		<div class="col-sm-1 form-inline">


	
	<label for="parMotorMin">Min</label>
	<input type="text" name="parMotorMin" id="parMotorMin" value="1" style="width: 50px;" class="form-control">
	
	</div>
	<div class="col-sm-1 form-inline">
	<label for="parMotorMax">Max</label>
	<input type="text" id="parMotorMax" name="parMotorMax" value="1" style="width: 50px;" class="form-control">
	
	</div>
		<div class="col-sm-2">

	<label for="mecReq">Min Mecanicos Rec.</label>
	<input type="text" id="mecReq" name ="mecReq" value="1" style="width: 50px;" class="form-control">
	
	</div>


</div>
<div class="row" style="width:100%; padding:0px;">
    

		<div class="col-sm-2 .col-md-offset-2">
  		
  		<button type="button" id ="aceptar" class="btn btn-default" >Guardar</button>
  		</div>

</div>
<input type="hidden" name="DeleteID" id="DeleteID" value="">
	 </form>

	<div class="table-responsive">
		<table class="table table-striped"  id= "TableParticipMotores">
			    <thead>
			  		<tr style="background-color:#BFBFBF;">
			  		<th style="width:150px;">DR</th>
			    	<th style="width:150px;">Motor</th>
			    	<th style="width:150px;">Rango</th>
			    	<th style="width:150px;">Min Part</th>
			    	<th style="width:150px;">Max Part</th>
			    	<th style="width:150px;">Mec. Rec.</th>
			   		<!-- <th style="width:150px;">Editar</th> -->
			   		<th style="width:150px;">Eliminar</th>
			  	</tr>
			  	</thead>
			  	

				</table>
	</div>

	
</body>
</html>