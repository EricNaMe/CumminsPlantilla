<%@include file="TEMPcapacitacion.jsp"%>

    <body>
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

            <h1 class="text-center" >Capacitación Preevaluación</h1>
            <br>
            <div class="row ">

                <div class="col-xs-6">
                    <div class="col-sm-3 text-right">
                        <label for="sel1">DR:</label>
                    </div>
                    <div class="col-sm-6">
                        <select class="form-control" id="sel1">
                            <option>Cummins Alesso</option>

                        </select>
                    </div>
                </div>

                <div class="col-xs-4">
                    <div class="col-sm-3 text-right">
                        <label for="sel1">Dealer:</label>
                    </div>
                    <div class="col-sm-9">
                        <select class="form-control" id="sel1">
                            <option>Cummins Alesso</option>

                        </select>
                    </div>
                </div>
            </div>

            <br>

            <h4><b>Tipo: Pre evaluación 2016</b></h4>


            <br> <br>

            <style>
                .tabla1 td{
                    border: solid; 
                }
                .tabla1 tr{
                    border:solid;
                }
            </style>
            <div class="row">
                <div class="col-lg-12" style="display:inline-block; height:300px;  "  >

                    <table class="table tabla1"  >

                        <tr >
                            <td rowspan="2" >Motores en los que debes estar certificado</td>    
                            <td colspan="2" >Técnicos requeridos por motor</td>  

                        </tr>

                        <tr>

                            <td>Motor</td>
                            <td>Cantidad de técnicas</td>


                        </tr>
                        <tr>
                            <td>ISL CM850</td>
                            <td>ISL CM850</td>
                            <td>ISL CM850</td>


                        </tr>
                        <tr>
                            <td>ISL CM850</td>
                            <td>ISL CM850</td>
                            <td>ISL CM850</td>


                        </tr>
                        <tr>
                            <td>ISL CM850</td>
                            <td>ISL CM850</td>
                            <td>ISL CM850</td>


                        </tr>


                    </table>
                </div>

            </div>

            </br> 
            <h2 class='text-center'>Favor de verificar los siguientes datos</h2>

            <div class="col-sm-8">
                <div class="col-xs-6">
                    <label class="" for="usr">¿Cuántos mecánicos tienen?</label>
                </div>
                <div class="col-xs-2">
                    <input type="text"  class="col-md-2 form-control" id="usr">
                </div>
            </div>
            <br></br>
            <div class="col-sm-8">
                <div class="col-xs-6">
                    <label class="" for="usr">¿Cuántos ayudantes mecánicos tienen?</label>
                </div>
                <div class="col-xs-2">
                    <input type="text"  class="col-md-2 form-control" id="usr">
                </div>
            </div>



            <br> </br>     <br> </br>     <br> </br>

            <div class="row">

                <div style="display:inline-block;" class="col-md-12">
                    <div class="table-responsive" style="height:300px;">
                        <table class="table table-striped"  data-toggle="table">
                            <thead>
                                <tr >
                                    <th >Motor</th>
                                    <th >Nombre técnico</th>
                                    <th >Promotion ID</th>
                                    <th >Seleccionar una opción</th>
                                </tr>
                            </thead>
                            <tr>
                                <td>ISX04</td>
                                <td>Pablo</td>
                                <td >2056</td>
                                <td>     <button class=" btn-default" type="button"   id="enviar">Verificado</button>      <button class="col-md-offset-4 btn-default" type="button"   id="enviar">Dar de baja</button></td>
                            </tr>

                            <tr>
                                <td>ISX04</td>
                                <td>Pablo</td>
                                <td >2056</td>
                                <td>     <button class=" btn-default" type="button"   id="enviar">Verificado</button>      <button class="col-md-offset-4 btn-default" type="button"   id="enviar">Dar de baja</button></td>
                            </tr>


                        </table>
                    </div>
                </div>

            </div>

            <br><br>

            <h4 class="text-center" >Administrador de garantías</h4>
            <br><br>
            <div style="display:inline-block;" class="col-xs-7">
                <div class="col-sm-5 ">
                    <label for="sel1">Administrador de garantías:</label>
                </div>
                <div class="col-sm-5">

                    <input  type="text" class="col-md-5 form-control" id="usr">
                </div>
            </div>

            <div class="col-sm4"><button class=" btn-default" type="button"   id="enviar">Verificado</button>      <button class=" btn-default" type="button"   id="enviar">Dar de baja</button></div>
            <br><br>

            <div style="display:inline-block;" class="col-xs-6">
                <div class="col-sm-4 ">
                    <label for="sel1">Promoción ID:</label>
                </div>
                <div class="col-sm-5">

                    <input  type="text" class="col-md-5 form-control" id="usr">
                </div>
            </div>

            <div class="col-xs-6">
                <div class="col-sm-5 ">
                    <label for="sel1">Fecha de certificación:</label>
                </div>
                <div class="col-sm-5">

                    <input  type="text" class="col-md-5 form-control" id="usr">
                </div>
            </div>


            <br><br>  <br>

            <div class="col-xs-6">
                <div class="col-sm-5 ">
                    <label for="sel1">Nombre de certificación:</label>
                </div>
                <div class="col-sm-5">

                    <input  type="text" class="col-md-5 form-control" id="usr">
                </div>
            </div>

            <br><br>  <br>

            <div class="col-xs-7">
                <div class="col-sm-3 ">
                    <label for="sel1">Dar de alta a:</label>
                </div>
                <div class="col-sm-5">

                    <input  type="text" class="col-md-6 form-control" id="usr">
                </div>
            </div>


            <div  class="col-xs-5">
                <div class="col-sm-4 ">
                    <label for="sel1">Promoción ID:</label>
                </div>
                <div class="col-sm-5">

                    <input  type="text" class="col-md-5 form-control" id="usr">
                </div>
            </div>

            <br><br>  <br>

            <h4><b>Nota:</b> La certificación tiene una vigencia de 2 años. Verificar al momento de la evaluación,
                que el administrador de garantías cuente con una certificación o recertificación con fecha menor
                o igual a 2 años de la fecha de evaluar del Dealer.</h4>

            <br><br>  <br>



            <div style="display:inline-block;" class="col-md-12">
                <div class="table-responsive" style="height:200px;">
                    <table class="table table-striped"  data-toggle="table">
                        <thead>
                            <tr >
                                <th >Jefe de taller</th>
                                <th >Gerente de servicio</th>

                            </tr>
                        </thead>
                        <tr>
                            <td>Jefe de taller:Juan Carlos </td>
                            <td>Gerente de servicio: Manuel Lopez</td>



                        </tr>

                        <tr>
                            <td>Certificación: ISX</td>


                            <td>Familiarización:ISX50</td>

                        </tr>
                        <tr>

                            <td>Promotion ID:5634</td>

                            <td>Promotion ID:5634</td>

                        </tr>



                    </table>
                </div>
            </div>





        </div>

    </body>
</html>
