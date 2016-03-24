<%@include file="TEMPcatalogos.jsp"%>    

<script src="js/calenEval.js"></script>
<script src="js/validaciones.js"></script>

<form id="formCalenEval" >

    <br></br><br>

    <div class="row">
        <div class="col-sm-4">
            <div class="col-sm-4">
                <label  for="tipo_eval">Tipo de Evaluación:</label>
            </div>
            <div class="col-sm-8" >
                <select class="form-control" id ="tipo_eval" name="tipo_eval" class="form-control" >
                    <option value = '1' >Evaluación</option>
                    <option value = '2' >Pre evaluación</option>
                </select>
            </div>
        </div>

        <div class="col-sm-4">
            <div class="col-sm-4">
                <label  for="revision">Revisión:</label>
            </div>
            <div class="col-sm-6">
                <select class="form-control" id ="revision" name="revision" class="form-control" >
                    <option value = '1' >1a</option>
                    <option value = '2' >2a</option>
                    <option value = '3' >3a</option>
                </select>
            </div>    
        </div>


        <div class="col-xs-3">
            <div class="col-sm-3 text-right">
                <label for="sel1">Año:</label>
            </div>
            <div class="col-sm-9">
                <select class="form-control" id="anioEval">
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
        </div>
    </div>

    <br></br>


    <div  class="col-sm-5 col-sm-offset-4">
        <label class="col-sm-3" >Estatus:</label>

        <div class="col-sm-8"> 

            <label class="radio-inline">
                <input type="radio" value="Y" name="estatus" id="estatus">Activo
            </label>

            <label class="radio-inline">
                <input type="radio" value="N" name="estatus" id="estatus2">Inactivo
            </label>
        </div> 

    </div> 



    <br></br>


    <div class="col-sm-3 col-sm-offset-5" >
        <input type="button" value="Guardar" id = "Guardar" class ="btn btn-default" >
    </div>


</form>

<div class="col-sm-12">
    <div class="table-responsive" >
        <table class="table table-striped" id="TableCalenEval" data-height="500"></table>
    </div>
</div>

<%@include file="footer.jsp"%>