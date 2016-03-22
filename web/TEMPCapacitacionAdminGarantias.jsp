<%@include file="TEMPcapacitacion.jsp"%>

<script src="js/capacitacionAdminGarantias.js"></script>


<h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Evaluación administrador garantías</h1>
<br>


<%@include file="CTRL_FeDrDealer.jsp"%>





<br><br> <br><br>



<div class="row"> 
    <h1 style='font-size: 18px;' class="text-left col-md-4"><b>¿Es correcta la información?</b></h1>        

    <div style='margin-top:20px;' class="col-md-1">
        <label ><input type="radio" name="correctInf">Sí</label>
    </div>
    <div style='margin-top:20px;' class="col-md-1">
        <label ><input type="radio" name="correctInf">No</label>
    </div>
</div>


<br><br></br>


<!-- Bloque tabla  -->

<div class='row'>

<div class="col-sm-6">

    <div class="table-responsive" style='  height: 190px;' >

        <table data-toggle="table" id="tableBody" class="table table-striped" >
           
        </table>
    </div>
</div>



  
    <div class="col-sm-6">
        <div class="col-xs-5">
            <label class="" for="usr">Nombre de administrador:</label>
        </div>
        <div class="col-xs-6">
            <input type="text" class="col-md-5 form-control" id="usr">
        </div>
    </div>
    <br></br> <br>

    <div class="col-sm-6">
        <div class="col-xs-5">
            <label class="" for="usr">Promotion ID:</label>
        </div>
        <div class="col-xs-6">
            <input type="text" class="col-md-5 form-control" id="usr">
        </div>
    </div>

    <div style='margin-top:20px; ' class="col-md-2 col-md-offset-3">
        <button type="button" class="btn-default"  id="enviar">Buscar</button>
    </div>

</div>



<!-- bloque para evaluar -->

<div style='margin-top:10px;' class="col-md-2">
    <button type="button" class="btn-default"  id="evaluar">Evaluar</button>
</div>



<div class="col-md-4" style="">
    <div class="table-responsive" style='max-height: 90px;' >

        <table data-toggle="table" id="tableBody2" class="table table-striped" >
         
          

        </table>
    </div>

</div>


</div>


<%@include file="footer.jsp"%>