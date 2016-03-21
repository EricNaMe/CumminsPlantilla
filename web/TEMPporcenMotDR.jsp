    <%@include file="TEMPcatalogos.jsp"%>
	
	<script src="js/motores.js"></script>
    <script src="js/validaciones.js"></script>
	
	<form  id="formPorcenMotorDR">
	
	<div class="row" style="width:100%; padding:0px;">
		<div class="col-sm-4">
	
	<label for="dr">DR</label>
	<select id ="dr" name="dr" class="form-control" style="width:200px;">
  		

	</select>
	
		</div>
	
	<div class="col-sm-2">
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

<%@include file="footer.jsp"%>