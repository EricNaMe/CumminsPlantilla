<%@include file="TEMPHerramientasmain.jsp"%>    

<script src="js/herramientasElectronica.js"></script>

<h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Evaluación de herramienta electrónica</h1>


<%@include file="CTRL_FeDrDealer.jsp"%>

<br></br><br></br>
<div class="row">    
    <div class="col-sm-6">
        <div class="col-xs-7">
            <label class="" for="usr">Mecánicos registrados:</label>
        </div>
        <div class="col-xs-3">
            <input type="text" class="col-md-3 form-control" id="usr">
        </div>
    </div>

    <div class="col-sm-6">
        <div class="col-xs-9">
            <label class="" for="usr">Ayudantes de mecánicos registrados:</label>
        </div>
        <div class="col-xs-3">
            <input type="text" class="col-md-4 form-control" id="usr">
        </div>
    </div>

</div>     


<br></br>    <br></br>

<div  class="col-sm-12" style="">
    <label><a style="font-size: 18px; font-weight: bold; color:black; background-color: white; font-family: arial;">Criterios de evaluación:</a></label>
</div>
<!-- CUADRO DONDE SE INDICAN LOS PORCENTAJES-->
<div class="row">
    <div class="col-sm-4"  style="font-size: 20px; border-style:solid; background-color: whitesmoke;  height:70px; width:340px;">           

        <label style="padding-left: 5px;" for="SubPorc"><a style="color:black; background-color: whitesmoke;  font-size: 18px;  font-family: arial;">INSITE/INLINE por cada 3 Técnicos sin contar rescatistas</a> </label>

    </div>  

    <div style="" class="col-sm-6 ">
        <div class="col-xs-7">
            <label class="" for="usr">INSITE/INLINE requerido:</label>
        </div>
        <div class="col-xs-3">
            <input type="text" class="col-md-4 form-control" id="usr">
        </div>
    </div>

    <br></br> <br></br> 
    <div style="" class="col-sm-6" >
        <div class="col-xs-9">
            <label class="" for="usr">Conteos de calibración (mínimo 2):</label>
        </div>
        <div class="col-xs-3">
            <input type="text" class="col-md-4 form-control" id="usr">
        </div>
    </div>
</div>  
<br>
<div class="col-sm-6 col-sm-offset-5" style="margin-left: 39.66666667%;">
    <div class="col-xs-9" style="">
        <label class="" for="usr">Zap it (mínimo 1):</label>
    </div>
    <div class="col-xs-3" style=""> 
        <input type="text" class="col-md-4 form-control" id="usr">
    </div>
</div>
<br></br>
<div class="col-sm-12">
    <label><a style="font-size: 18px; font-weight: bold; font-family: arial; background-color: white; color:black;">Información de INLINE's:</a></label>
</div>

<div class="col-sm-7">
    <div class="col-xs-9">
        <label style='margin-left:-15px;' class="" for="usr">¿Cuántos INLINE's tienen para el taller?:</label>
    </div>
    <div style='margin-left:8px;' class="col-xs-2">
        <input type="text" class="col-md-4 form-control" id="usr">
    </div>
</div>

<br></br>

<div class='col-sm-12'>
    <div class="table-responsive" style="padding-top:20px;">
        <table class="table table-striped" id="tableBody">
        </table>
    </div>
</div>

<div class='col-sm-3'>
    <div style='display:inline-block; ' class="col-md-4">
        <button type="button" class="btn btn-default"  id="enviar">Evaluar</button>
    </div>
</div>    


<div class='col-sm-8'>
     <div class="table-responsive" style="padding-top:20px;" >
        <table class="table table-striped"  id="tableInsite">
        </table>
    </div>
</div>     

    <%@include file="footer.jsp"%> 
