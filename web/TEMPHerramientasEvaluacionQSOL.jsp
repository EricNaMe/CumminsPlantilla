<%@include file="TEMPHerramientasmain.jsp"%>   

<style>
    body{
        text-align: center;
    }
    .eficiencia-container{
        display: inline-block;
        width: 100%;
        max-width: 1100px;
        text-align: left;
    }
    .Evaluacion input{
        margin-left:-30px;
        padding:0px;
    }
    .revision {
        margin-left:0;
    }
</style>
<div class="eficiencia-container container-fluid">

    <h1 class="text-center" >Evaluación de licencia de QSOL</h1>
    <br>


    <%@include file="CTRL_FeDrDealer.jsp"%>


    <div class="row">
        <div  class="text-center col-md-12">
            <button type="button" class="btn-default"  id="enviar">Calcular</button>
        </div>
    </div>

    <br>
    <br>


    <div class="col-sm-12">
    <div class="table-responsive" style="height:80px;">
        <table class="table table-striped "  data-toggle="table">
            <thead>
                <tr >
                    <th >Licencia</th>       
                    <th >Fecha de Expiración</th>      
                    <th >% Posible</th>      
                    <th >% Obtenido</th>      


                </tr>
            </thead>
            <tr>
                <td>Activa</td>
                <td>27-marzo-16</td>
                <td>100</td>
                <td>100</td>




            </tr>
        </table>

    </div>
    </div>
