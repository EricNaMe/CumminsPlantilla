<%@include file="TEMPcatalogos.jsp"%>

<script src="js/motores.js"></script>
<script src="js/validaciones.js"></script>


 <br> </br> 
  <br> </br> 

<form  id="formPorcenMotorDR">

    <div class="row" style="width:100%; padding:0px;">

        <div class="col-sm-5 ">
            <div  class="col-xs-2">
                <label class="" for="usr">DR:</label>
            </div>
            <div class="col-xs-6">
                <select class="form-control" id="sel1">

                </select>
            </div>
        </div>

        <div class="col-sm-5 ">
            <div  class="col-xs-3">
                <label class="" for="usr">Motor:</label>
            </div>
            <div class="col-xs-6">
                <select class="form-control" id="sel1">

                </select>
            </div>
        </div>


    </div>

    <br> </br> 
    
    <div class="row">


        <div class="col-sm-3 ">
            <div  class="col-xs-4">
                <label class="" for="usr">Rango:</label>
            </div>
            <div class="col-xs-8">
                <select class="form-control" id="sel1">

                </select>
            </div>
        </div>


        <div class="col-sm-2">
            <div class="col-xs-4">
                <label class="" for="usr">Min:</label>
            </div>
            <div class="col-xs-8">
                <input type="text" class="col-md-3 form-control" id="usr">
            </div>
        </div>

        <div class="col-sm-2">
            <div class="col-xs-4">
                <label class="" for="usr">Max:</label>
            </div>
            <div class="col-xs-8">
                <input type="text" class="col-md-3 form-control" id="usr">
            </div>
        </div>

        <div class="col-sm-4">
            <div class="col-xs-8">
                <label class="" for="usr">Min Mecanicos Req:</label>
            </div>
            <div class="col-xs-4">
                <input type="text" class="col-md-3 form-control" id="usr">
            </div>
        </div>




    </div>   

    
    <br> </br> 

    <div class="row" style="width:100%; padding:0px;">


        <div class="col-sm-2 col-md-offset-5">

            <button type="button" id ="aceptar" class="btn btn-default" >Guardar</button>
        </div>

    </div>
    
    <br></br>
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