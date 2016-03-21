    <%@include file="TEMPcatalogos.jsp"%>
    
        <script src="js/configMotor.js"></script>
        
        <div class="row">
            <div class="col-sm-4 form-inline" >
                <label for="motor">Motor</label>
                <select id ="motor" name ="motor" class="form-control" style="width:200px;"></select>
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

        <div class="row">
            <div class="col-sm-5 form-inline" >
                <table id="tableGerenteServicios"  data-height="200"></table>
            </div>
            <div class="col-sm-5 form-inline" >
                <table id="tableMecanicos"  data-height="200"></table>
            </div>
        </div>


		<button id="guardar" class="btn btn-default">Guardar</button> 
        <div class="table-responsive" >

            <table class="table table-striped" id = "tableConfigMotores" data-height="450">
            </table>
        </div>


    <%@include file="footer.jsp"%>