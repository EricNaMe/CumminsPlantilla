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
        <script src="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.js"></script>
        <script src="http://cdn.rawgit.com/mindmup/editable-table/master/mindmup-editabletable.js"></script>
        <script src="http://cdn.rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/js/bootstrap-editable.js"></script>
        <script src="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/src/extensions/editable/bootstrap-table-editable.js"></script>


        <link rel="stylesheet" href="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/dist/bootstrap-table.min.css">
        <link rel="stylesheet" href="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.1.0/css/buttons.bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/select/1.1.0/css/select.bootstrap.min.css">
        <link rel="stylesheet" href="http://cdn.rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/css/bootstrap-editable.css">

        <!-- progress bar -->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

        <!-- json serialize -->
        <script src="http://cdn.rawgit.com/macek/jquery-serialize-object/master/dist/jquery.serialize-object.min.js"></script>
        
         <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.9.1/extensions/export/bootstrap-table-export.js"></script>
     	 <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/FileSaver.js/2014-11-29/FileSaver.min.js"></script>
      	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.1.135/jspdf.min.js"></script>
      	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf-autotable/2.0.17/jspdf.plugin.autotable.js"></script>
      	<script type="text/javascript" src="https://rawgit.com/hhurz/tableExport.jquery.plugin/master/tableExport.js"></script>

        <script src="js/motor.js"></script>

        <title>Insert title here</title>
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
        
        <div class="table-responsive">
            <div class="container-body" style="margin: 20px">
              	<form id= 'formMotor' method="post">
                <div class="row">
                    <div class="col-sm-4 form-inline">
                        <label for="motor">Motor</label>
                        <input type="text" id="motor" name="motor" style="width: 150px;" class="form-control"/>
                    </div>
                    <div class="col-sm-3 form-inline">
	                	<label for="rango">Rango</label>
	                	<select id ="rango" name ="rango" class="form-control" style="width:100px;"> </select>
                	</div>

                    <div class="col-sm-2">
                        <button type="button" id="saveMotor" class="btn btn-default">Guardar</button>
                    </div>	

                </div>
                </form>
                <br><br>
                
                <br><br>
                <div class="container-body col-xs-12 col-sm-12 col-md-12 col-lg-12">
                    <form class="form-horizontal" role="form" id = 'formMotorTable'>
                       

                     
                        <div class="table-responsive" >
                            <table id="tableMotores" data-toolbar="#toolbar">
                            </table>
                        </div> 
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>