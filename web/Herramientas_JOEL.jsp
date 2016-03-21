
<html>
    <head>

        <meta charset="utf-8"> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

        <script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.10/js/dataTables.bootstrap.min.js"></script>
        <script src="https://cdn.datatables.net/buttons/1.1.0/js/dataTables.buttons.min.js"></script>
        <script src="https://cdn.datatables.net/buttons/1.1.0/js/buttons.bootstrap.min.js"></script>
        <script src="https://cdn.datatables.net/select/1.1.0/js/dataTables.select.min.js"></script>
        <script src="https://rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.js"></script>
        <script src="https://rawgit.com/mindmup/editable-table/master/mindmup-editabletable.js"></script>
        <script src="https://rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/js/bootstrap-editable.js"></script>
        <script src="https://rawgit.com/wenzhixin/bootstrap-table/master/src/extensions/editable/bootstrap-table-editable.js"></script>


        <link rel="stylesheet" href="https://rawgit.com/wenzhixin/bootstrap-table/master/dist/bootstrap-table.min.css">
        <link rel="stylesheet" href="https://rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.1.0/css/buttons.bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/select/1.1.0/css/select.bootstrap.min.css">
        <link rel="stylesheet" href="https://rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/css/bootstrap-editable.css">

        <link rel="stylesheet" href="css/infantCare.css">
        <!-- progress bar -->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

        <!-- json serialize -->
        <script src="http://cdn.rawgit.com/macek/jquery-serialize-object/master/dist/jquery.serialize-object.min.js"></script>

        <script src="js/herramientas.js"></script>
        <script src="js/validaciones.js"></script>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>

        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">

                        <h4 class="modal-title" id="headerModal">Enviando informacion</h4>
                    </div>
                    <div class="modal-body">
                        <div class="progress">
                            <div class="progress-bar progress-bar-striped active" role="progressbar"
                                 aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width:100%">

                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal" id="closeModal" style="display: none">Close</button>
                    </div>
                </div>

            </div>
        </div>



        <div class="container" style=" border-style:solid;
             background-color: white;  height: 430px;  width: 800px;"> 


            <!-- Fila modulo-->             
            <form id="formHerramientas">   
                <div  style="padding-top: 20px;height:50px;border-bottom-style: solid;">            

                    <label class="col-xs-2" for="Modl">&nbsp;&nbsp;&nbsp;Producto:</label>
                    <input type="text" id="producto" name="producto"/>

                    
                </div>

                <!-- Fila modulo-->




                <!-- Fila modulo-->
                <div  style="height:50px;border-bottom-style: solid;">            


                    <label class="col-xs-2"  for="Modl">Revision:</label>
                    <div class="radio">
                        <label class="col-xs-1"><input type="radio" value="1" name="revision">1</label>
                    </div>
                    <div class="radio">
                        <label class="col-xs-1"><input type="radio" value="2" name="revision">2</label>
                    </div>

                    <label class="col-xs-1" for="Modl">A�o:</label>    
                    <select class="col-xs-2" id="anio" name="anio">
                        <option>1993</option>
                        <option>2000</option>

                    </select>

                    <label class="col-xs-1" for="Modl">Status dealer</label>

                    <label class="col-xs-2"><input type="radio" value="Y" name="statusDealer">Active</label>


                    <label class="col-xs-2"><input  type="radio" value="N" name="statusDealer">Inactive</label>

                </div>
            </form>     
            <!-- Fila modulo-->

            <!-- Fila modulo-->

            <div  style="padding-top: 20px;height:150px;border-bottom-style: solid;">            


                <label class="col-xs-3" for="Modl">Unidad de negocio:</label>


                <select class="col-xs-8" id="sel1">
                    <option>1</option>
                    <option>2</option>

                </select>
            </div>

            <!-- Fila modulo-->

            <!-- Fila modulo-->
            <div  style="padding-top: 20px;height:60px;border-bottom-style: solid;">            


                <label class="col-xs-3" for="Modl">Tipo de herramienta:</label>


                <select class="col-xs-3" id="sel1">
                    <option>Required</option>

                </select>
            </div>

            <!-- Fila modulo-->

            <!-- Fila modulo-->

            <div  style="padding-top: 30px;height:60px;">            


                <label class="col-xs-3" for="Modl">Nivel de servicio:</label>


                <select class="col-xs-3" id="sel1">
                    <option>Required</option>
                </select>
            </div>

            <!-- Fila modulo-->
            <div id="DivBotones" >
                <button type="button" style=" margin-right: 20px;" class="btn btn-primary btn-md" id="generar">Generar</button>
                <button type="button" style=" margin-right: 20px;" class="btn btn-primary btn-md">Salir/Cancelar</button>

            </div>

        </div>






        <!--TABLA      -->
        <div class="container" >

            <table id="tblMatrizTeen">

            </table>
        </div>

        <!--FIN TABLA  TABLA      -->

    </body>
</html>
