    <%@include file="TEMPpartes.jsp"%>
  
        <script src="js/PartesIndividual.js"></script>
        
		<div class="table-responsive">
	        <form role="form" id="formPartes"> 
	            <div class="container-body" style="margin: 20px">
	            
	            
	            <input type="hidden" name="id_parte">
	                <div class="row">
	                     
	                     
	                    <%@include file="CTRL_evalDatos.jsp"%>
	                    
	                    <div class="col-sm-3">
	                    	<label for="tipo_producto">Tipo de Producto</label>
							 <input class="form-control"  name="tipo_producto" id="tipo_producto"  type="text" style="background-color:#ffffff; color:#000000" disabled>
	                    </div>
	                </div>
	                
	                
	               <div class="row">
	                    
		                <div class="col-sm-4">
							<label for="dr">DR</label>
							<select id ="dr" name="dr" class="form-control" style="width:200px;"></select>
						</div>
						<div class="col-sm-2">
	                    	<label for="codigo_DR">Codigo DR</label>
							 <input class="form-control"  name="codigo_DR" id="codigo_DR"  type="text" style="background-color:#ffffff; color:#000000; width:80px;"  disabled >
	                    </div>
	            	</div>
	            	
	            	
	            	<div class="row">
	                    
	                    
		               <div class="col-sm-4">
		               		<label for="dealer">Dealer</label>
							<select id ="dealer" name="dealer" class="form-control" style="width:200px;"></select>	
		                </div>
						<div class="col-sm-2">
	                    	<label for="sp_code">Codigo Dealer</label>
							 <input class="form-control"  name="sp_code" id="sp_code"  type="text" style="background-color:#ffffff; color:#000000; width:80px;"  disabled >
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
	      
	        <button type="button" id="savePartes" class="btn btn-default">Guardar</button>
		</form>
  	</div>

			<table id="tableBody" data-toolbar="#toolbar" data-toggle="table"></table>

	   <%@include file="footer.jsp"%>
