<%-- 
    Document   : HerramientasEvaluar
    Created on : 3/03/2016, 09:01:56 AM
    Author     : nc784
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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

        <!-- progress bar -->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

        <!-- json serialize -->
        <script src="http://cdn.rawgit.com/macek/jquery-serialize-object/master/dist/jquery.serialize-object.min.js"></script>

        <script src="js/herramientasEvaluar.js"></script>

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
                    $('#oem').val("");
                    $('#codigoDeal').val("");
                });
                $('#dealer').on('change', function() {
                    $('#codigoDeal').val(this.value);
                    $.ajax({
                        dataType: "text",
                        url: "ObtenerOEM?id_deal=" + this.value,
                        method: "POST",
                        beforeSend: function() {
                        }
                    }).done(function(e) {
                        if (e === 'error') {
                            alert('Ocurrio un error al cargar catalogo de distribuidores');
                        } else {
                            json = $.parseJSON(e);
                            for (var i = 0; i < json.length; i++) {
                                $('#oem').val(json[i].oem);
                            }
                        }
                    }).fail(function(e) {
                        $('#headerModal').html('Ocurrio un error al enviar la informacion');
                        $('#closeModal').css('display', '');
                    });
                });
            });
        </script>

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
        <div style=" position:absolute; top:20px; left:80px; height:94%; width:80%;">

            <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Evaluación de herramienta evaluar</h1>

            <div style=' height:100px; position:relative; top:35px;'>            
                <div style="position:relative; display:inline-block; top:0px; height:75px; width:333px;"  class="form-group">
                    <label class="col-lg-6" >Tipo de evaluación:</label>

                    <div style="width:140px; position:relative;  left:160px; top:0px; margin: 0px; height: 60px;">


                        <div style="width:150px; position:relative; top:-27px; left:0px;"> 

                            <select class="form-control" id="sel1">
                                <option>Evaluación</option>
                                <option>Pre</option>
                            </select>
                        </div> 
                    </div>

                </div>



                <div style="position:relative;display:inline-block; top:0px; height:75px; width:150px;"  class="form-group">
                    <label class="col-lg-6" >Revisión:</label>

                    <div style="width:50px; position:relative;  left:100px; top:0px; margin: 0px; height: 60px;">

                        <div style="width:80px; position:relative; top:-27px; left:-15px;"> 

                            <select class="form-control" id="sel1">
                                <option>1era</option>
                                <option>2da</option>

                            </select>
                        </div> 

                    </div>

                </div>


                <div style=" height:50px; top:0px; position:relative; left:30px; width:200px;display:inline-block;">

                    <label for="sel1">Año:</label>
                    <div style="width:100px; position:relative; top:-25px; left:45px;"> 

                        <select disabled class="form-control" id="sel1">
                            <option>2016</option>
                            <option>2015</option>
                            <option>2014</option>
                            <option>2013</option>
                        </select>
                    </div> 
                </div>




                <div style="position:relative; left:40px; display:inline-block; top:0px; height:45px; width:280px;" >


                    <div class="col-md-9" >
                        <label style="" class="" for="usr">Tipo de producto:</label>
                        <input style="position:relative;width:150px; left:140px; top:-25px;" type="text"  class="col-md-2 form-control" id="usr">
                    </div>
                </div> 


            </div>



            <div  style="padding-bottom: 10px;height:180px;position:relative; top:50px; left:450px; width:350px;display:inline-block;">            

                <div style="position:relative; padding-bottom: 10px;">
                    <label class="col-xs-4" for="Modl">Fecha evaluación:</label>


                    <input style= "position:relative;  top:18px;" id="meeting" type="date" value=""/>
                    <img style="position:relative; left:160px; top:-5px;" class="img-responsive" src="calendar5.png" alt="Chania" width="20" height="20"> 
                </div>    
                <div style="position:relative; padding-bottom: 10px;">
                    <label class="col-xs-4" for="Modl">Fecha inicio evaluación:</label>


                    <input style= "position:relative;  top:18px;" id="meeting" type="date" value=""/>
                    <img style="position:relative; left:160px; top:-5px;" class="img-responsive" src="calendar5.png" alt="Chania" width="20" height="20"> 
                </div>  
                <div>
                    <label class="col-xs-4" for="Modl">Fecha fin evaluación:</label>


                    <input style= "position:relative;  top:18px;" id="meeting" type="date" value=""/>

                    <img style="position:relative; left:160px; top:-5px;" class="img-responsive" src="calendar5.png" alt="Chania" width="20" height="20"> 
                </div>  
            </div>




            <div style="position:relative; display:inline-block; top:50px; float:left; height:45px; width:333px;" >
                <div class="col-md-9" >
                    <label style="" class="" for="usr">Matriz:</label>
                    <input style="position:relative; left:50px; top:-30px;" type="text" class="col-md-4 form-control" id="usr">
                </div>
            </div>   

            <div style=' position:relative; width:780px; top:-70px;'>            
                <div> 
                    <div style="position:relative;margin-left: 20px; display:inline-block; top:0px; height:45px; width:333px;" >


                        <div class="col-md-9" >
                            <label style="" class="" for="usr">DR:</label>
                            <select readonly id ="dr" name="dr" class="col-md-5 form-control" style="position:relative; left:30px; top:-30px; background-color:#ffffff;"></select><br>

                        </div>   
                    </div>   


                    <div style="position:relative;margin-left: 20px; display:inline-block; top:0px; height:45px; width:333px;" >


                        <div class="col-md-9" >
                            <label style="" class="" for="codigoDR">Código DR:</label>
                            <input style="position:relative;width:70px; left:170px; top:-5px;" type="text"  class="col-md-2 form-control" id="codigoDR">
                        </div>  
                    </div>  

                </div>




                <div>
                    <div style="position:relative;top:0px;display:inline-block;  height:45px; width:333px;" >


                        <div class="col-md-9" >
                            <label class="" for="dealer">Dealer:</label>
                            <select id ="dealer" readonly name="dealer" class="form-control" style="width:200px; background-color:#ffffff; position:relative; left:50px; top:-30px;"></select><br>

                        </div>  
                    </div>  


                    <div style="position:relative;margin-left: 30px; display:inline-block; top:-25px; height:45px; width:280px;" >


                        <div class="" >
                            <label style="" class="" for="codigoDeal">Código Dealer:</label>
                            <input style="position:relative;width:70px; left:195px; top:-5px;" type="text"  class="col-md-2 form-control" id="codigoDeal"><br>

                        </div>  
                    </div>
                </div>


            </div>      

            <div style=' width:300px; position:relative; top:-80px;'>       
                <div style=" height:50px; top:0px; position:relative; left:18px; width:200px;">

                    <label for="oem">OEM:</label>
                    <div style="width:100px; position:relative; top:-25px; left:45px;"> 
                        <input type="text" readonly style="background-color:#ffffff;" class="form-control" name="oem" id="oem">
                    </div> 
                </div>

                <div style=" height:50px; top:0px; position:relative; left:18px; width:200px;display:inline-block;">

                    <label for="sel1">Para:</label>
                    <div style="width:100px; position:relative; top:-25px; left:45px;">


                        <select  class="form-control" id="sel1">
                            <option>Dealer</option>


                        </select>
                    </div> 
                </div>

            </div>       


            <div style=" left:700px; position:relative; top:-50px; width:250px; alignment-adjust: central">
                <label><a style="font-size: 18px; font-weight: bold; font-family: arial; color:black;">Porcentaje requerido:15%</a></label>
            </div>




            <div class="table-responsive" style='position: relative;  width: 1200px; height: 240px; top:-50px; left:-10px;' >
                <div class="container" >

                    <table class="table table-striped" id="tableBody" >
                    </table>
                </div>




            </div> 

            <div style=' display:inline-block; left:-520px; top:-80px; height:80px; width:300px; position:relative;'>

                <div class="form-group">
                    <label for="comment">Comentario evaluación:</label>
                    <textarea style="position:relative; top:-30px; left:180px;" class="form-control" rows="3" id="comment"></textarea>
                </div>
            </div>

            <div style='position: relative; display:inline-block; top:20px;  left:600px;' class="col-md-6">
                <button type="button" class="btn-default"  id="enviar">Calcular</button>
            </div>



            <div style='display:inline-block; width:80px;position: relative;  top:-20px; left:-80px;' >
                <div style='width:140px;position: relative;' class="container" >

                    <table class="table table-striped" id="tableBody2">
                    </table>
                </div>




            </div>


            <div style='position: relative; display:inline-block; top:-125px; left:1150px;' class="col-md-6">
                <button type="button" class="btn-default"  id="enviar">Guardar</button>
            </div>


        </div>


    </body>
</html>
