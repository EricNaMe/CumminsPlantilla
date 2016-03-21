 <%@include file="TEMPcapacitacion.jsp"%>
      
	<script src="js/capacitacionAdminGarantias.js"></script>
           

			<h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Evaluación administrador garantías</h1>
			<br>
				
			<div class="row">
            	 <%@include file="CTRL_evalDatos.jsp"%>
    		</div>   
			<br>
            <%@include file="CTRL_Fechas.jsp"%>

            <%@include file="CRTL_DrDealer.jsp"%>
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

 <%@include file="footer.jsp"%>