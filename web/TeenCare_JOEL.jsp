
<!DOCTYPE html>
<html lang="es-419">
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


        <!-- progress bar -->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

        <!-- json serialize -->
        <script src="http://cdn.rawgit.com/macek/jquery-serialize-object/master/dist/jquery.serialize-object.min.js"></script>

        <script src="js/teenCare.js"></script>
        <script src="js/validaciones.js"></script>

        <meta charset="UTF-8">
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


        <div class="container" style="background-color:whitesmoke; border:2px;"> 

            <div class="container" style="position: relative;  background-color: white; width:700px; height: 400px; top:100px;"> 

                <div class="row" style="position:absolute; top:20%; left:20%;">
                    <div class="col-sm-12" >      
                        <label for="tableMatrizInfant">Matrices Infant Care</label>
                        <table id="tableMatrizInfant">

                        </table>
                    </div>         

                </div>

                <div class="row" style="position:absolute; top:80%; left:50%;">
                    <div class="col-sm-12" >
                        <button type="button" id="importar" style="  margin-right: 20px;" class="btn btn-primary btn-md">Importar</button>

                    </div>
                </div>
            </div>




            <!--TABLA      -->
            <div class="container" style="padding-top: 150px; width:700px;">
                <label for="tableMatrizTeenCare">Matrices Teen Care</label>
                <table id="tableMatrizTeenCare" >

                </table>
            </div>

            <!--FIN TABLA  TABLA      -->
        </div> 
    </body>
</html>
