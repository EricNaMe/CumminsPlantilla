<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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
        <script src="js/infantcare.js"></script>

        <script src="js/perfilDealer.js"></script>

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
                });
            });
        </script>

        <script src="js/quejascaptura.js"></script>
		

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
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
        <div style="height:100%; width:100%; position:absolute;">

            <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Captura de Quejas</h1>

            <div style="top:70px; left:20px; width:300px; height:200px; position:absolute; display:inline-block;"> 

                <div style="position:relative;  top:20px; height:45px; width:300px;" >


                    <div class="col-md-9" >
                        <label style="" class="" for="dr">DR:</label>
						<select readonly id ="dr" name="dr" class="form-control" style="width:200px; background-color:#ffffff;"></select><br>
                    </div>
                </div>   


                <div style="position:relative;  top:30px; height:45px; width:300px;" >


                    <div class="col-md-9" >
                        <label style="" class="" for="dealer">Dealer:</label>
                        <select id ="dealer" readonly name="dealer" class="form-control" style="width:200px; background-color:#ffffff;"></select>
                    </div>
                </div>  

            </div>


            <div  style="padding-bottom: 10px;height:180px;position:absolute; top:90px; left:330px; width:400px;display:inline-block;">            

                <div style="position:relative; padding-bottom: 10px;">
                    <label class="col-xs-4" for="Modl">Fecha Inicial:</label>


                    <input style= "position:relative;  top:0px; width:170px;" id="meeting" class="form-control" type="date" value=""/>
                    <img style="position:relative; left:320px; top:-25px;" class="img-responsive" src="calendar5.png" alt="Chania" width="20" height="20"> 
                </div>    
                <div style="position:relative; padding-bottom: 10px;">
                    <label class="col-xs-4" for="Modl">Fecha Final:</label>


                    <input style= "position:relative;  top:0px; width:170px;" id="meeting" class="form-control" type="date" value=""/>
                    <img style="position:relative; left:320px; top:-25px;" class="img-responsive" src="calendar5.png" alt="Chania" width="20" height="20"> 
                </div>  

            </div>



            <div style="position:absolute; display:inline-block; left:700px; top:150px; height:25px; width:300px;"  class="form-group">
                <label class="col-lg-10" >Revisión:</label>

                <div style="width:200px; position:relative;  left:40px; top:0px; margin: 0px; height: 25px;">


                    <div style="width:250px; position:relative; top:-24px; left:50px;"> 

                        <label class="checkbox-inline">
                            <input type="checkbox" value="" name="No_Eva" id="No_Eva">1
                        </label>

                        <label class="checkbox-inline">
                            <input type="checkbox" value="" name="No_Eva" id="No_Eva">2
                        </label>
                    </div> 

                </div>

            </div>

            <div style="position:relative; display:inline-block; left:700px; top:50px; height:25px; width:300px;"  class="form-group">
                <label class="col-lg-10" >Tipo:</label>

                <div style="width:200px; position:relative;  left:40px; top:0px; margin: 0px; height: 25px;">


                    <div style="width:250px; position:relative; top:-24px; left:20px;"> 

                        <label class="checkbox-inline">
                            <input type="checkbox" value="" name="TipoEva" id="TipoEva">Evaluación
                        </label>

                        <label class="checkbox-inline">
                            <input type="checkbox" value="" name="TipoEva" id="TipoEva">Pre Evaluación
                        </label>
                    </div> 

                </div>

            </div>

            <div style=" height:50px; top:85px; position:relative; left:740px; width:200px;display:inline-block;">

                <label for="sel1">Año:</label>
                <div style="width:100px; position:relative; top:-30px; left:50px;"> 

                    <select class="form-control" id="sel1">
                        <option>2016</option>
                        <option>2015</option>
                        <option>2014</option>
                        <option>2013</option>
                    </select>
                </div> 
            </div>


            <div  class="table-responsive" style='position: relative;  height: 500px; top:150px; left:0px;'>
                <div class="container" >
                    <table  class="table table-striped" id="tableQuejasCaptura"></table>
                </div>
            </div>

        </div>
    </body>
</html>
