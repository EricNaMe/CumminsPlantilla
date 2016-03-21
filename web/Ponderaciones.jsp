<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

        <script src="js/ponderaciones.js"></script>
        <script src="js/validaciones.js"></script>
		 <style type="text/css">
			.TextFormat {
				color:#000000;
			}
			.TextFormat a {
				color:#000000;
			}
		</style>

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
        <div class="container">
            <form  id = "formPonderacioneModulos">
                <div class="row">
                    <div class="col-md-4 col-md-offset-2" >

                        <label for="modulo">Modulo</label>
                        <input type="text" name="modulo" id="modulo" class="form-control">
                        <input type="button" value="Agregar modulo" id ="agregarModulo" class="btn btn-default">

                    </div>

                    <!--
                    <div class="col-md-4" >
                        <label for="ponderacion">% Modulo</label>
                        <input type="text" name="ponderacion"  id="ponderacion" class="form-control">

                    </div>
                    -->

                </div>

            </form>
            <div class="row">
                <div id="toolbar">
                    <button id="guardarTablaMod" class="btn btn-default">Guardar</button>          
                </div>
                <table class="table table-striped" id="tablePonderacionModulos" data-toolbar="#toolbar" data-toggle="table">
                    <thead>
                        <tr >
                            <th >Modulo</th>                  
                            <th >% Modulo</th>
                        </tr>
                    </thead>
                </table>

            </div>
            <div class="row">
                <br/>
                <br/>

            </div>
            <form  id = "formSubModulos">
                <div class="row">
                    <div class="col-md-4 col-md-offset-2" >
                        <label for="listaModulos">Modulos</label>
                        <select class="form-control" id="moduloSel" name="moduloSel" >

                        </select>

                        <label for="subModulo">Submodulo</label>
                        <input type="text" name="subModulo"  id="subModulo" class="form-control">
                        <input type="button" value="Agregar submodulo" id ="agregarSubmodulo" class="btn btn-default">

                    </div>



                </div>
            </form>
            <div class="row pre-scrollable">
                <div id="toolbarSub">
                    <button id="guardarTablaSub" class="btn btn-default">Guardar</button>          
                </div>
                <table class="table table-striped" id="tablePonderacion" data-toolbar="#toolbarSub" data-toggle="table">
                    <thead>
                        <tr >
                            <th >Modulo</th>
                            <th >Submodulo</th>
                            <th >% Submodulo</th>
                            <th >% Modulo</th>
                        </tr>
                    </thead>
                </table>
            </div>
        </div>

    </body>
</html>