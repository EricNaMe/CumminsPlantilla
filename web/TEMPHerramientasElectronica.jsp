 <%@include file="TEMPHerramientasmain.jsp"%>    

        	<script src="js/herramientasElectronica.js"></script>

            <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Evaluaci�n de herramienta electr�nica</h1>
            
           	<div class="row">
            	 <%@include file="CTRL_evalDatos.jsp"%>
    		</div>   
			<br>
            <%@include file="CTRL_Fechas.jsp"%>

            <%@include file="CRTL_DrDealer.jsp"%>
			<br>
            
            <div class="row form-inline" style="padding-left:25px;">
            	<label for="sel1">Mec�nicos Registrados:</label>
				<input type="number"  class="form-control" id="usr" style="width:80px;">     
            </div>
            
            <div class="row form-inline" style="padding-left:25px; padding-top:10px;">
            	<label for="sel1">Ayudantes de mec�nicos registrados:</label>
                <input type="number"  class="form-control" id="usr" style="width:80px;">     
            </div>
            
            <div class="row" style ="padding-top:30px;">
            	<div class="col-md-5">
                	<label>Criterios de evaluaci�n:</label>
            		<div  style="font-size: 20px; border-style:solid;background-color: whitesmoke;  width:300px;">
                		<label  for="SubPorc" style="color:black; font-size: 18px;  font-family: arial;">INSITE/INLINE por cada 3 T�cnicos sin contar rescatistas </label>
            		</div> 
            		
            	</div>
            	<div class="col-md-5">
            		<div class="row form-inline">
	            		<label for="sel1">INSITE/INLINE requerido:</label>
	                    <input style="width:80px;" type="number"  class="form-control" id="usr">
                    </div>
                    <div  class="row form-inline" style="padding-top:15px;">
	                    <label  for="sel1">Conteos de calibraci�n(m�nimo 2):</label>
	                    <input style="width:80px;" type="number"  class="form-control" id="usr">
                  	</div>
                  	
                  	<div  class="row form-inline" style="padding-top:15px;">
	                	<label for="sel1">Zap it(m�nimo1):</label>
	                	<input style="width:80px;" type="number"  class="form-control" id="usr">
                  	</div>
            	</div>
            </div>
             
            <label style="font-size: 18px; font-weight: bold; font-family: arial; color:black;">Informaci�n de INLINE's:</label>
            
            <div class="row">
            	<div class="col-md-6 form-inline">
		            <label for="sel1">�Cu�ntos INLINE's tienen para el taller?:</label>
		            <input style="width:80px;" type="number"  class="form-control" id="usr">
             	</div>
            </div>

            <div class="table-responsive" style="padding-top:20px;">
                <table class="table table-striped" id="tableBody">
                </table>
            </div>
            
            <div style='position: relative; display:inline-block; top:50px; left:120px;' class="col-md-4">
                <button type="button" class="btn btn-default"  id="enviar">Evaluar</button>
            </div>
            
            <div class="table-responsive" style="padding-top:20px;" >
                <table class="table table-striped"  id="tableInsite">
                </table>
            </div>

 <%@include file="footer.jsp"%> 
