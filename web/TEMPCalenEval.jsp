    <%@include file="TEMPcatalogos.jsp"%>    
        
        <script src="js/calenEval.js"></script>
        <script src="js/validaciones.js"></script>
        
            <form id="formCalenEval" >

                <div class="row">

                    <div class="col-md-3  col-md-offset-2" >
                        Numero de Evaluación:
                        <input type="radio" name="numEval" value="1" id="numEval1">
                        <label for="numEval1">1</label>
                        <input type="radio" name="numEval" value="2" id="numEval2">
                        <label for="numEval2">2</label>
                    </div>

                    <div class="col-md-3 " >
                        Tipo:
                        <input type="radio" name="tipoEval" value="1" id="TipoEval1">
                        <label for="TipoEval1">Evalucación</label>
                        <input type="radio" name="tipoEval" value="2" id="TipoEval2">
                        <label for="TipoEval2">Pre evaluacion</label>
                    </div>

                </div>

                <div class="row">
                    <div class="col-md-3 col-md-offset-2" >
                        Año de Evaluación
                        <select class="form-control" id="anioEval" name="anioEval" >
                            <option></option>
                            <option value="2014">2014</option>
                            <option value="2015">2015</option>
                            <option value="2016">2016</option>
                            <option value="2017">2017</option>
                            <option value="2018">2018</option>
                        </select>
                        Fecha inicio de Evaluación

                        <input  type="text" placeholder="Fecha Inicio" name="fecIniEval" id="fecIniEval" class="form-control">

                        Fecha Fin de Evaluación

                        <input  type="text" placeholder="Fecha Inicio" name="fecFinEval" id="fecFinEval" class="form-control">

                        <div class="form-inline" >
                            Estatus:
                            <input type="radio" name="estatus" value="Y" id="estatus">
                            <label for="status">Activo</label>
                            <input type="radio" name="estatus" value="N" id="estatus2">
                            <label for="status2">Inactivo</label>
                        </div>
                        <input type="button" value="Guardar" id = "Guardar" class ="btn btn-default" >
                    </div>
                </div>

            </form>

			<div class="table-responsive" >
            	<table class="table table-striped" id="TableCalenEval" data-height="500"></table>
			</div>

    <%@include file="footer.jsp"%>