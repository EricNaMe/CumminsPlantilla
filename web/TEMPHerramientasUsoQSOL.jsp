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

    <h1 class="text-center" >Evaluación uso de QSOL</h1>
    <br>


    <%@include file="CTRL_FeDrDealer.jsp"%>




    <br>
    <br>
    <br>

    <h4><b>Motores a evaluar</b></h4>


    <br> <br>

    <div class="row">
        <div class="col-lg-4" style="display:inline-block; height:130px;"  >

            <table class="table table-striped"  data-toggle="table">
                <thead>
                    <tr >
                        <th >Motores</th>       

                    </tr>
                </thead>
                <tr>
                    <td>ISL CM850</td>


                </tr>
                <tr>
                    <td>ISL CM850</td>


                </tr>


            </table>
        </div>


        <h4  class="col-lg-7">Se seleccionaron 2 técnicos certificados al azar (diferente plataforma)</h4>



    </div>

    </br> </br>

    <div class="row">

        <div style="display:inline-block;" class="col-md-8">
            <div class="table-responsive" style="max-height:500px;">
                <table class="table table-striped"  data-toggle="table">
                    <thead>
                        <tr >
                            <th >#</th>
                            <th >Preguntas</th>
                            <th class="text-center" >Respuesta correcta</th>
                            <th class="text-center">Respuesta incorrecta</th>
                        </tr>
                    </thead>
                    <tr>
                        <td>1</td>
                        <td>¿Qué es un TRP?</td>
                        <td ><input class="center-block col-lg-offset-4" type="checkbox"></td>
                        <td><input class="center-block col-lg-offset-4" type="checkbox"></td>
                    </tr>

                    <tr>
                        <td>1</td>
                        <td>¿Qué es una campaña?</td>
                        <td ><input class="center-block col-lg-offset-4" type="checkbox"></td>
                        <td><input class="center-block col-lg-offset-4" type="checkbox"></td>
                    </tr>

                    <tr>
                        <td>1</td>
                        <td>Favor de indicar el procedimiento de ¿Cómo verificaste había una campaña para esta ciudad?</td>
                        <td ><input class="center-block col-lg-offset-4" type="checkbox"></td>
                        <td><input class="center-block col-lg-offset-4" type="checkbox"></td>
                    </tr>

                    <tr>
                        <td>1</td>
                        <td>¿Qué es un TRP?</td>
                        <td ><input class="center-block col-lg-offset-4" type="checkbox"></td>
                        <td><input class="center-block col-lg-offset-4" type="checkbox"></td>
                    </tr>

                    <tr>
                        <td>1</td>
                        <td>¿Qué es un TRP?</td>
                        <td ><input class="center-block col-lg-offset-4" type="checkbox"></td>
                        <td><input class="center-block col-lg-offset-4" type="checkbox"></td>
                    </tr>

                    <tr>
                        <td>1</td>
                        <td>¿Qué es un TRP?</td>
                        <td ><input class="center-block col-lg-offset-4" type="checkbox"></td>
                        <td><input class="center-block col-lg-offset-4" type="checkbox"></td>
                    </tr>

                    <tr>
                        <td>1</td>
                        <td>¿Qué es un TRP?</td>
                        <td ><input class="center-block col-lg-offset-4" type="checkbox"></td>
                        <td><input class="center-block col-lg-offset-4" type="checkbox"></td>
                    </tr>

                    <tr>
                        <td>1</td>
                        <td>¿Qué es un TRP?</td>
                        <td ><input class="center-block col-lg-offset-4" type="checkbox"></td>
                        <td><input class="center-block col-lg-offset-4" type="checkbox"></td>
                    </tr>
                </table>
            </div>
        </div>



        <div class="col-md-4" style="display:inline-block">

            <button class="col-md-offset-4 btn-default" style="display:block;" type="button" class=""  id="enviar">Técnico 2</button>
            <br><br>
            <button class="col-md-offset-4 btn-default" type="button"   id="enviar">Calcular</button>

            <br><br>


            <div class="col-lg-12">
                <div class="table-responsive" style="max-height:90px;">
                    <table class="table table-striped "  data-toggle="table">
                        <thead>
                            <tr >

                                <th >% Posible</th>      
                                <th >% Logrado</th>      


                            </tr>
                        </thead>
                        <tr>

                            <td>100</td>
                            <td>100</td>




                        </tr>
                    </table>

                </div>
            </div>

        </div>


    </div>

</div>

</body>
</html>
