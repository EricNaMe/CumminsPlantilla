 <%@include file="TEMPcatalogos.jsp"%>

		<script src="js/EditConfigMotor.js"></script>

		<!--
        <div class="row">
            <div class="col-sm-4 form-inline" >
                <label for="motor">Motor</label>
                <!-- 
                <select id ="motor" name ="motor" class="form-control" style="width:200px;"></select>
                 --><!-- 
                 <input type="hidden" name="motor" value="English">
                <input class="form-control" id="motorName" type="text" placeholder="Disabled input here..." disabled value="MOTOR">
            </div>
        </div>
		-->
		
		 <div class="row" style="padding-top:25px;">
            <div class="col-sm-4 form-inline" >
                <label for="motor">Motor</label>
                <select id ="motor" name ="motor" class="form-control" disabled style="width:200px;"></select>
            </div>
        </div>
		
        <div class="row">
            <div class="col-sm-5 form-inline" >
                <table id="tableMatrizInfant"  data-height="200"></table>
            </div>
            <div class="col-sm-5 form-inline" >
                <table id="tableHerramientas"  data-height="200"></table>
            </div>
        </div>
        
        

        <div class="row">

            <div class="col-sm-5 form-inline" >
                <table id="tableAdminGarantias"  data-height="200"></table>
            </div>
            <div class="col-sm-5 form-inline" >
                <table id="tableJefeTaller"  data-height="200"></table>
            </div>
        </div>

        <div class="row" style ="padding-bottom:20px;">
            <div class="col-sm-5 form-inline" >
                <table id="tableGerenteServicios"  data-height="200"></table>
            </div>
            <div class="col-sm-5 form-inline" >
                <table id="tableMecanicos"  data-height="200"></table>
            </div>
        </div>

	<button id="guardar" class="btn btn-default"  >Guardar</button> 
        <div class="table-responsive" style="height:380px; padding-top:20px;">

             <table class="table table-striped" id = "tableConfigMotores">
                <thead>
                    <tr style="background-color:#BFBFBF;">
                        <th style="width:150px;">Motor</th>
                        <th style="width:150px;">Clave Cursos Mecanicos</th>
                        <th style="width:150px;">Clave Cursos Gte Serv.</th>
                        <th style="width:150px;">Clave Cursos Jefe Taller</th>
                        <th style="width:150px;">Clave Cursos Admin Garant.</th>
                        <th style="width:150px;">Clave Cursos Mecanicos</th>
                        <th style="width:150px;">Clave Cursos Mecanicos</th>
                    </tr>
                </thead>  
            </table>

        </div>


 <%@include file="footer.jsp"%>