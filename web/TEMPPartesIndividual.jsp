<%@include file="TEMPpartes.jsp"%>




<br></br><br>

  <script>
  $(function() {
    $( "#datepicker" ).datepicker();
  });
  
   $(function() {
    $( "#datepicker2" ).datepicker();
  });
  
   $(function() {
    $( "#datepicker3" ).datepicker();
  });
  </script>


<div class="table-responsive">
    <form role="form" id="formPartes"> 
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
                    <select class="form-control" id="anio">
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


        <br>

        <div class="col-sm-5 col-sm-offset-1">
            <div  class="col-xs-3">
                <label class="" for="usr">Matriz:</label>
            </div>
            <div class="col-xs-6">
                <select class="form-control" id="sel1">
                    <option>2015</option>
                    <option>2014</option>

                </select>
            </div>
        </div>


        <div class="col-sm-5">
            <div class="col-xs-6">
                <label class="" for="usr">Tipo de producto:</label>
            </div>
            <div class="col-xs-6">
                <select class="form-control" id="sel1">
                    <option>2015</option>
                    <option>2014</option>

                </select>
            </div>
        </div>

        <br>  <br><br>

        <div class="col-sm-3">
            <div class="col-xs-4">
                <label class="" for="usr">Dealer:</label>
            </div>
            <div class="col-xs-8">
                <select  class="col-md-5 form-control" id="dealer"></select>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="col-xs-7">
                <label class="" for="usr">Código dealer:</label>
            </div>
            <div class="col-xs-5">
                <select  class="col-md-5 form-control" id="codigooDeal"></select>
            </div>
        </div>

        <div class="col-sm-5"> 
            <div class="col-xs-6">
                <label for="Modl">Fecha evaluación:</label>
            </div>
            <div class="col-xs-6">
                <input id="datepicker" class="form-control" type="text" value=""/>
            </div>
        </div>



        <br> <br>   <br>   


        <div class="col-sm-3">
            <div class="col-xs-4">
                <label class="" for="usr">DR:</label>
            </div>
            <div class="col-xs-8">
                <select  class="col-md-5 form-control" id="dr"></select>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="col-xs-7">
                <label class="" for="usr">Código DR:</label>
            </div>
            <div class="col-xs-5">
                <select  class="col-md-5 form-control" id="codigoDR"></select>
            </div>
        </div>

        <div class="col-sm-5">
            <div class="col-xs-6">
                <label for="Modl">Fecha inicio evaluación:</label>
            </div>
            <div class="col-xs-6">
                <input id="datepicker2" class="form-control" type="text" value=""/>
            </div>
        </div>    



        <br>   <br>   <br>   




        <div class="col-sm-3">
            <div class="col-xs-4">
                <label class="" for="usr">OEM:</label>
            </div>
            <div class="col-xs-8">
                <select class="form-control" id="oem">
                    <option>DINA</option>
                    <option>2014</option>

                </select>
            </div>
        </div>

        <div style=""  class="col-sm-5 col-sm-offset-4">
            <div class="col-xs-6">
                <label for="Modl">Fecha fin evaluación:</label>
            </div>
            <div class="col-xs-6">
                <input id="datepicker3" class="form-control" type="text" value=""/>
            </div>
        </div> 


        <br>   <br>   <br>

        <div class="col-sm-3">
            <div class="col-xs-4">
                <label class="" for="usr">Para:</label>
            </div>
            <div class="col-xs-8">
                <select class="form-control" id="para">
                    <option>DINA</option>
                    <option>2014</option>

                </select>
            </div>
        </div>



        <br>   <br>   <br>   <br>   <br> 

        <button type="button" id="savePartes" class="btn btn-default">Guardar</button>
    </form>
</div>

<table id="tableBody" data-toolbar="#toolbar" data-toggle="table"></table>

<%@include file="footer.jsp"%>
