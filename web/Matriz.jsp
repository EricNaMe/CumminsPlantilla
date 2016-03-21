<%-- 
    Document   : Matriz
    Created on : 25/02/2016, 02:17:05 PM
    Author     : nc784
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matriz Agrupada</title>
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

        <script src="js/matriz.js"></script>

        <script>
            $(document).ready(function() {
                $.ajax({
                    dataType: "text",
                    url: "ObtenerDR",
                    method: "POST",
                    beforeSend: function() {
                    }
                }).done(function(e) {
                    if (e === 'error') {
                        alert('Ocurrio un error al cargar catalogo de distribuidores');
                    } else {
                        json = $.parseJSON(e);
                        $('#dr').html($("<option></option>"));
                        for (var i = 0; i < json.length; i++) {
                            $('#dr').append($("<option></option>")
                                    .attr("value", json[i].key)
                                    .text(json[i].value));
                        }
                    }
                }).fail(function(e) {
                    $('#headerModal').html('Ocurrio un error al enviar la informacion');
                    $('#closeModal').css('display', '');
                });

                $('#dr').on('change', function() {
                    $('#atras').hide(true);
                    $('#consultar').hide(true);
                    $('#tableBody').hide(true);
                    $.ajax({
                        dataType: "text",
                        url: "ObtenerDealer?id_dr=" + this.value,
                        method: "GET",
                        beforeSend: function() {

                        }
                    }).done(function(e) {
                        if (e === 'error') {
                            alert('Ocurrio un error al cargar catalogo de rangos');
                        } else {
                            json = $.parseJSON(e);
                            $('#dealer').html($("<option></option>"));
                            for (var i = 0; i < json.length; i++) {
                                $('#dealer')
                                        .append($("<option></option>")
                                                .attr("value", json[i].key)
                                                .text(json[i].value));
                            }
                        }
                    }).fail(function(e) {
                        $('#headerModal').html('Ocurrio un error al cargar catalogo de rangos');
                        $('#closeModal').css('display', '');
                    });
                    $('#codigoDR').val(this.value);
                    $('#codigoDeal').val("");
                });
            });
        </script>
    </head>
    <body>
        <%
            System.out.println("****ID: " + request.getParameter("id"));
        %>
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">
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
        <div class="table-responsive" style="margin: 20px">
            <div class="container-body">
                <div class="table-responsive">
                    <div class="col-sm-3 form-inline">
                        <div style=" margin-bottom: 15px;">
                            <label style="margin-left: 22px;" for="dr">DR:</label>&nbsp;
                            <select readonly id ="dr" name="dr" class="form-control" style="width:200px; background-color:#ffffff;"></select><br>
                        </div>
                        <div style="  margin-bottom: 15px;">
                            <label for="dealer">Dealer:</label>&nbsp;
                            <select id ="dealer" readonly name="dealer" class="form-control" style="width:200px; background-color:#ffffff;"></select><br>
                        </div>
                    </div>
                    <div class="col-sm-3 form-inline">
                        <div style="  margin-bottom: 15px;">
                            <label for="codigoDR">Codigo DR:</label>&nbsp;
                            <input type="text" readonly style=" margin-left: 22px;background-color:#ffffff;" id="codigoDR" name="codigoDR" size="4" class="form-control"><br>
                        </div>
                        <div style="  margin-bottom: 15px;">
                            <label for="codigoDeal">Codigo Dealer:</label>&nbsp;
                            <input type="text" readonly style="background-color:#ffffff;" name="codigoDeal" id="codigoDeal" size="4" class="form-control"><br>
                        </div>
                    </div>
                </div>
                <div class="table-responsive">
                    <label for="tableBody">Matrices Agrupadas</label>
                    <table id="tableBody" data-toggle="table">
                    </table><br>
                    <button type="button" class="btn btn-default" id="consultar">Consultar</button>
                    <button type="button" class="btn btn-default" id="atras">Atras</button>
                </div>
            </div>
        </div>
    </body>
</html>