 <%@include file="TEMPcapacitacion.jsp"%>   

<script src="js/herramientasEvaluar.js"></script>
        
        <div class="table-responsive" >

            <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Evaluación de herramienta evaluar</h1>

            
			<div class="row">
            	 <%@include file="CTRL_evalDatos.jsp"%>
            	 <div class="col-md-2">
            	 	<label for="usr">Matriz:</label>
                    <input type="text" class="form-control" id="usr">
            	 </div>
    		</div>   
			<br>
            <%@include file="CTRL_Fechas.jsp"%>

            <%@include file="CRTL_DrDealer.jsp"%>
			<br>

			<div class="row">
				<div class="col-md-2">
					<label for="oem">OEM:</label>
            		<input type="text" disabled style="background-color:#ffffff; width:100px;" class="form-control" name="oem" id="oem">
				</div>
				<div class="col-md-2">
					<label for="sel1">Para:</label>
                    <select  class="form-control" id="sel1">
                        <option>Dealer</option>
                    </select>
				</div>
			</div>     

			<label style="padding-left:500px; font-size: 18px; font-weight: bold; font-family: arial; color:black;">Porcentaje requerido:15%</label>

			<table class="table table-striped" id="tableBody" ></table>
           
            <div class="row">
            	<div class="col-md-5">
            		<div class="form-group" style="padding-top:30px;">
                    	<label for="comment">Comentario evaluación:</label>
                    	<textarea  class="form-control" rows="3" id="comment" style ="width:350px;"></textarea>
                	</div>
                	
            	</div>
            	<div class="col-md-3" style="padding-top:45px;">
            		<table class="table table-striped" id="tableBody2"></table>
            	</div>
            	<div class="col-md-3" style="padding-top:45px;">
            		<button type="button" class="btn btn-default"  id="enviar">Calcular</button>
            	</div>
            	
            </div>

        </div>

  <%@include file="footer.jsp"%>  
