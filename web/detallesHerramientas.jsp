<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
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
        <script src="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.js"></script>
        <script src="http://cdn.rawgit.com/mindmup/editable-table/master/mindmup-editabletable.js"></script>
        <script src="http://cdn.rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/js/bootstrap-editable.js"></script>
        <script src="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/src/extensions/editable/bootstrap-table-editable.js"></script>


        <link rel="stylesheet" href="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/dist/bootstrap-table.min.css">
        <link rel="stylesheet" href="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.1.0/css/buttons.bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/select/1.1.0/css/select.bootstrap.min.css">
        <link rel="stylesheet" href="http://cdn.rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/css/bootstrap-editable.css">

        <link rel="stylesheet" href="css/infantCare.css">
        <!-- progress bar -->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

        <!-- json serialize -->
        <script src="http://cdn.rawgit.com/macek/jquery-serialize-object/master/dist/jquery.serialize-object.min.js"></script>

        <!-- excel export --> 
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.9.1/extensions/export/bootstrap-table-export.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/FileSaver.js/2014-11-29/FileSaver.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.1.135/jspdf.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf-autotable/2.0.17/jspdf.plugin.autotable.js"></script>
        <script type="text/javascript" src="https://rawgit.com/hhurz/tableExport.jquery.plugin/master/tableExport.js"></script>

        
        <script src="js/detallesHerramientas.js"></script>
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
                        <button type="button" class="btn btn-default" data-dismiss="modal" id="closeModalEliminar" style="display: none">Close</button>
                    </div>
                </div>

            </div>
        </div>
        <div class="container">
            <div class="page-header">
                <h2>Herramientas</h2>
            </div>

            <div class="row well">
                <form role="form" id="formHeader">
                    <input type="hidden" id="idMatriz" name="idMatriz" value="<%=request.getParameter("id")%>"/>
                    <input type="hidden" id="matriz"  name="matriz">
                    <fieldset>

                        <div class="row">
                           
                                <legend id="matrizLabel">
                                </legend>      
                        </div>

                        <div class="col-md-6">


                            <div class="form-group">
                                <label for="oem">OEM:</label>
                                <select class="form-control" id="oem" name="oem">

                                </select>
                            </div>
                            <div class="form-group">
                                <label for="revision">Revisíon:</label>
                                <select class="form-control" id="revision" name="revision">
                                    <option></option>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="anio">Año:</label>
                                <input type="text" class="form-control" id="anio" name="anio"/>
                            </div>
                            <div class="form-group">
                                <label for="para">Para:</label>
                                <select class="form-control" id="para" name="para">

                                </select>
                            </div>

                            <label>Producto Nuevo:</label>
                            <label class="radio-inline">
                                <input type="radio" name="productoNuevo" value="Y" id="productoNuevoY">Si
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="productoNuevo" value="N" id="productoNuevoN">No
                            </label>
                            <div class="checkbox">
                                <label><input type="checkbox" id="statusDealer" name="statusDealer">Status Dealer Evaluation </label>
                            </div>



                        </div>
                        <div class="col-md-6">

                            <div class="form-group">
                                <label for="tipoProducto">Tipo de producto:</label>
                                <select class="form-control" id="tipoProducto" name="tipoProducto">
                                    <option></option>
                                    <option>Infant Care</option>
                                    <option>Teen Care</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="rango">Rango:</label>
                                <select class="form-control" id="rango" name="rango">

                                </select>
                            </div>
                            <div class="form-group">
                                <label for="mercado">Mercado:</label>
                                <select class="form-control" id="mercado" name="mercado">

                                </select>
                            </div>
                            <div class="form-group">
                                <button type="button" class="btn-default" disabled="disabled" id="enviar">Enviar</button>
                            </div>
                        </div>

                    </fieldset>
                </form>
            </div>




            <div class="row progress">
                <div id="progress" class="progress-bar progress-bar-striped active" role="progressbar"  aria-valuemin="0" aria-valuemax="100" >

                </div>
            </div>


            <div class="row">
                <div id="toolbar">
                    <button id="buttonAdd" class="btn btn-default">Agregar registro</button>
                </div>
                <div class="table-responsive" >
                    <table id="tableBody" data-toolbar="#toolbar">

                    </table>
                </div>

            </div>


        </div>
    </body>

</html>