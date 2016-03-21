<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>

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
        <script src="https://github.com/wenzhixin/bootstrap-table/blob/master/src/extensions/export/bootstrap-table-export.js"></script>

        <script src="https://github.com/hhurz/tableExport.jquery.plugin/blob/master/tableExport.min.js"></script>

        <link rel="stylesheet" href="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/dist/bootstrap-table.min.css">
        <link rel="stylesheet" href="http://cdn.rawgit.com/wenzhixin/bootstrap-table/master/src/bootstrap-table.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.1.0/css/buttons.bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/select/1.1.0/css/select.bootstrap.min.css">
        <link rel="stylesheet" href="http://cdn.rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/css/bootstrap-editable.css">

        <!-- progress bar -->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script src="http://cdn.rawgit.com/macek/jquery-serialize-object/master/dist/jquery.serialize-object.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.9.1/extensions/export/bootstrap-table-export.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/FileSaver.js/2014-11-29/FileSaver.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.1.135/jspdf.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf-autotable/2.0.17/jspdf.plugin.autotable.js"></script>
        <script type="text/javascript" src="https://rawgit.com/hhurz/tableExport.jquery.plugin/master/tableExport.js"></script>

        <script src="js/configMotor.js"></script>


    </head>
    <body>


        <div class="row">
            <div class="col-sm-4 form-inline" >
                <label for="motor">Motor</label>
                <select id ="motor" name ="motor" class="form-control" style="width:200px;"></select>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-4 form-inline" >
                <label>Partes de Motores</label>
            </div>
            <div class="col-sm-5 form-inline" >
                <table id="tableMatrizInfant" align="right"></table>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-4 form-inline" >
                <label>Herramientas</label>
            </div>
            <div class="col-sm-5 form-inline" >
                <table id="tableHerramientas" align="right"></table>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-3 form-inline" >
                <label>Capacitaci�n Administrador de Garantias</label>
            </div>
            <div class="col-sm-3 form-inline" >
                <table id="tableAdminGarantias" align="right"></table>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-3 form-inline" >
                <label>Capacitaci�n Jefe de Taller</label>
            </div>
            <div class="col-sm-3 form-inline" >
                <table id="tableJefeTaller" align="right"></table>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-3 form-inline" >
                <label>Capacitaci�n Gerente de Servicios</label>
            </div>
            <div class="col-sm-3 form-inline" >
                <table id="tableGerenteServicios" align="right"></table>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-3 form-inline" >
                <label>Capacitaci�n Mecanicos</label>
            </div>
            <div class="col-sm-3 form-inline" >
                <table id="tableMecanicos" align="right"></table>
            </div>
        </div>

<button id="guardar" class="btn btn-default">Guardar</button> 
        <div class="table-responsive">

            <table class="table table-striped" id = "tableConfigMotores"></table>
        </div>

<div id="display"></div>

    </body>
</html>