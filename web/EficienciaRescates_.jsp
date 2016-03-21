
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
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

        <!-- json serialize -->
        <script src="http://cdn.rawgit.com/macek/jquery-serialize-object/master/dist/jquery.serialize-object.min.js"></script>

        <script src="js/rescates.js"></script>
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
                    $('#codigoDR').val(this.value);
                    $('#codigoDeal').val("");
                });

                $('#dealer').on('change', function() {
                    $('#codigoDeal').val(this.value);
                });
            });
        </script>

        <script src="js/infantcare.js"></script>
        <script src="js/rescates.js"></script>

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
        <div style=" position:absolute; top:20px; left:80px; height:210%; width:90%;">

            <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Eficiencia Rescates</h1>


            <div style="position:relative; display:inline-block; top:-50px; height:75px; width:333px;"  class="form-group">
                <label class="col-lg-6" >Tipo de evaluación:</label>

                <div style="width:140px; position:relative;  left:160px; top:0px; margin: 0px; height: 60px;">

                    <div style="top:-20px;" class="radio">
                        <label><input type="radio" name="TipoEva" id="TipoEva">Evaluación</label>
                    </div>
                    <div style="top:-10px;" class="radio">
                        <label ><input type="radio" name="TipoPeva" id="TipoEva">Pre Evaluación</label>
                    </div>

                </div>

            </div>



            <div style="position:relative;display:inline-block; top:-50px; height:75px; width:150px;"  class="form-group">
                <label class="col-lg-6" >Revisión:</label>

                <div style="width:50px; position:relative;  left:100px; top:0px; margin: 0px; height: 60px;">

                    <div style="top:-20px;" class="radio">
                        <label><input type="radio" name="No_Eva" id="No_Eva">1</label>
                    </div>

                    <div style="top:-10px;" class="radio">
                        <label ><input type="radio" name="No_Eva" id="No_Eva">2</label>
                    </div>

                </div>

            </div>


            <div style=" height:50px; top:-65px; position:relative; left:30px; width:200px;display:inline-block;">

                <label for="sel1">Año:</label>
                <div style="width:100px; position:relative; top:-20px; left:50px;"> 

                    <select class="form-control" name="anio_e" id="anio_e">
                        <option>2016</option>
                        <option>2015</option>
                        <option>2014</option>
                        <option>2013</option>
                    </select>
                </div> 
            </div>



            <div  style="padding-bottom: 10px;height:180px;position:relative; top:30px; left:30px; width:400px;display:inline-block;">            
                <div style="position:relative; padding-bottom: 10px;">
                    <label class="col-xs-4" for="Modl">Fecha evaluación:</label>
                    <input style= "position:relative;  top:18px;" id="fecha_eval" type="date" value=""/>
                    <img style="position:relative; left:160px; top:-5px;" class="img-responsive" src="calendar5.png" alt="Chania" width="20" height="20"> 
                </div>    
                <div style="position:relative; padding-bottom: 10px;">
                    <label class="col-xs-4" for="Modl">Fecha inicio evaluación:</label>
                    <input style= "position:relative;  top:18px;" id="fecha_inicio" type="date" value=""/>
                    <img style="position:relative; left:160px; top:-5px;" class="img-responsive" src="calendar5.png" alt="Chania" width="20" height="20"> 
                </div>  
                <div>
                    <label class="col-xs-4" for="Modl">Fecha fin evaluación:</label>
                    <input style= "position:relative;  top:18px;" id="fecha_fin" type="date" value=""/>
                    <img style="position:relative; left:160px; top:-5px;" class="img-responsive" src="calendar5.png" alt="Chania" width="20" height="20"> 
                </div>
            </div>

            <div> 
                <div style="position:relative;margin-left: 20px; display:inline-block; top:-70px; height:45px; width:333px;" >
                    <div class="col-md-9" >
                        <label style="" for="dr">DR:</label>
                        <select readonly id ="dr" name="dr" class="col-md-5 form-control" style="position:relative; left:30px; top:-30px; background-color:#ffffff;"></select>
                    </div>
                </div>   
                <div style="position:relative;margin-left: 20px; display:inline-block; top:-70px; height:45px; width:333px;" >
                    <div class="col-md-9" >
                        <label style="" class="" for="codigoDR">Código DR:</label>
                        <input type="text" readonly style=" position:relative;width:70px; left:170px; top:-5px; background-color:#ffffff;" id="codigoDR" name="codigoDR" size="4" class="col-md-2 form-control">
                    </div>
                </div>
            </div>

            <div>
                <div style="position:relative;top:-70px;display:inline-block;  height:45px; width:333px;" >
                    <div class="col-md-9" >
                        <label class="" for="dealer">Dealer:</label>
                        <select id ="dealer" readonly name="dealer" class="col-md-5 form-control" style="position:relative; left:50px; top:-30px; background-color:#ffffff;"></select>
                    </div>
                </div>
                <div style="position:relative;margin-left: 30px; display:inline-block; top:-85px; height:45px; width:280px;" >
                    <div class="" >
                        <label style="" class="" for="codigoDeal">Código Dealer:</label>
                        <input readonly style="position:relative;width:70px; left:195px; top:-5px; background-color:#ffffff;" type="text"  class="col-md-2 form-control" id="codigoDeal" name="codigoDeal">
                    </div>
                </div>  
            </div>

            <div style="position:relative;  height:500px; display:inline-block; width:550px; ">
                <div style="position:relative; left:50px; display:inline-block;">
                    <div class="table-responsive" style='position:relative;  height: 500px; top:0px; width:470px;' >
                        <table class="table table-striped" id="tableDatosEvalua"></Table>
                    </div>
                </div>
            </div>

            <div style="position:relative; top:0px; width:550px; height:500px;  display:inline-block;">   
                <div style="position:absolute; display:inline-block;   height:245px; width:100%;" >
                    <label style="position:absolute; top:40px; " class="" for="usr">Placas:</label>
                    <input style="position:absolute; width:100px; top:35px; left:110px;" type="text" class="col-md-2 form-control" name="placas" id="placas">

                    <div style="display:inline-block;">   
                        <label style="position:absolute; top:120px;" class="" for="usr">Marca:</label>
                        <input style="position:absolute; width:100px; top:115px; left:110px;" type="text"  class="col-md-2 form-control" name="marca" id="marca">
                    </div>

                    <div style="display:inline-block;">   
                        <label style="position:absolute; top:120px;left:240px;" class="" for="usr">No. de Serie:</label>
                        <input style="position:absolute; width:180px; top:115px; left:350px;" type="text"  class="col-md-2 form-control" name="NoSerie" id="NoSerie">
                    </div>

                    <label style="position:absolute; top:200px;" class="" for="usr">Número de celular:</label>
                    <input style="position:absolute; width:180px; top:195px; left:160px;" type="text"  class="col-md-2 form-control" name="NoCelular" id="NoCelular">

                </div>  

                <div style="width:550px; height:100px; position:absolute; top:300px; ">
                    <div style="left:25px; height:40px; top:25px; position:relative;  width:400px;">
                        <label style= "position: relative;" for="sel1">¿Cuántos INLINE's tienen?</label>

                        <div style="width:500px; position:relative; top:-20px; left:50px;"> 
                            <input style="position:relative;width:80px; left:185px; top:-10px;" type="number"  class="col-md-2 form-control" name="CuantosInLine" id="CuantosInLine">
                        </div> 
                    </div>
                </div>  
            </div>
            <br></br></br>
            <div style="position:relative; left:50px; display:inline-block;">
                <div class="table-responsive" style='position:relative;  height: 180px; top:0px; width:1050px;' >

                    <table class="table table-striped" id="tablePCID" ></table>
                </div>
            </div>

            <div style=" position:relative;">
                <button style="position:relative; left:550px; top:-80px;" type="button" class="btn-default"  id="enviar">Calcular</button>
            </div> 

            <div>
                <div style="position:relative; left:50px; display:inline-block;">
                    <div class="table-responsive" style='position:relative;  height: 180px; top:0px; width:1050px;' >
                        <table class="table table-striped" id="tableRescates"></table>
                    </div>
                </div>
            </div>

            </br></br></br>

            <div style="position:relative;top:-40px;">
                <span ><h3 style="text-align: center;">NO DISPONIBILIDADES</h3></span>
            </div>

            <div>
                <div style="position:relative; left:50px; display:inline-block;">
                    <div class="table-responsive" style='position:relative;  height: 180px; top:0px; width:1050px;' >
                        <table class="table table-striped" id="tableNoDispo"></table>
                    </div>
                </div>

            </div>

            </br></br>

            <div>     
                <div style=" position:relative; display:inline-block;">
                    <button style="position:relative; left:500px; top:-40px;" type="button" class="btn-default"  id="enviar">Enviar evaluación</button>
                </div>
                <div style="position:relative; left:650px; display:inline-block;">
                    <div class="table-responsive" style='position:relative;  height: 90px; top:0px; width:250px;' >
                        <table class="table table-striped" id="tablePosible"></table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
