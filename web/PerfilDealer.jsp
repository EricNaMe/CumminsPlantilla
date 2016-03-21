<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>

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

        <script src="js/perfilDealer.js"></script>
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
        <form name="myform" id="myform">
            <div style="margin: 20px; height: 850px;">
                <div class="container-body">
                    <div style="position:relative; display:block; left:20px; top:20px; height:25px; width:300px;"  class="form-group">
                        <label class="col-lg-10" >Tipo:</label>
                        <div style="width:200px; position:relative;  left:40px; top:0px; margin: 0px; height: 25px;">
                            <div style="width:250px; position:relative; top:-24px; left:20px;">
                                <input type="radio" name="optradio" id="optradio" value="E" checked>&nbsp;Evaluaci�n&nbsp;&nbsp;
                                <input type="radio" name="optradio" id="optradio" value="PE">&nbsp;Pre Evaluaci�n
                            </div> 
                        </div>
                    </div>






                    <br>  <br><br>

                    <div class="col-sm-4">
                        <div class="col-xs-3">
                            <label class="" for="usr">DR:</label>
                        </div>
                        <div class="col-xs-9">
                            <select  class="col-md-5 form-control" id="dr"></select>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="col-xs-6">
                            <label class="" for="usr">C�digo DR:</label>
                        </div>
                        <div class="col-xs-5">
                            <input type="text"  class="col-md-7 form-control" id="codigoDR">

                        </div>
                    </div>

                    <div class="col-sm-4"> 
                        <div class="col-xs-6">
                            <label for="Modl">Fecha evaluaci�n:</label>
                        </div>
                        <div class="col-xs-6">
                            <input id="datepicker" class="form-control" type="text" value=""/>
                        </div>
                    </div>



                    <br> <br>   <br>   


                    <div class="col-sm-4">
                        <div class="col-xs-3">
                            <label class="" for="usr">Dealer:</label>
                        </div>
                        <div class="col-xs-9">
                            <select  class="col-md-5 form-control" id="dealer"></select>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="col-xs-6">
                            <label class="" for="usr">C�digo Dealer:</label>
                        </div>
                        <div class="col-xs-5">
                            <input type="text"  class="col-md-7 form-control" id="codigoDeal">
                        </div>
                    </div>

                    <div class="col-sm-4">
                        <div class="col-xs-6">
                            <label for="Modl">Fecha inicio evaluaci�n:</label>
                        </div>
                        <div class="col-xs-6">
                            <input id="datepicker2" class="form-control" type="text" value=""/>
                        </div>
                    </div>    



                    <br>   <br>   <br>   


                        <div class="col-sm-4">
                        <div class="col-xs-3">
                            <label class="" for="usr">Dealer:</label>
                        </div>
                        <div class="col-xs-9">
                            <select  class="col-md-5 form-control" id="dealer"></select>
                        </div>
                    </div>

                       <div class="col-sm-4">
                        <div class="col-xs-6">
                            <label class="" for="usr">OEM:</label>
                        </div>
                        <div class="col-xs-5">
                            <input type="text"  class="col-md-7 form-control" id="oem">
                        </div>
                    </div>


                    <div style="" class="col-sm-4 col-sm-offset-8">
                        <div class="col-xs-6">
                            <label for="Modl">Fecha fin evaluaci�n:</label>
                        </div>
                        <div class="col-xs-6">
                            <input id="datepicker3" class="form-control" type="text" value=""/>
                        </div>
                    </div> 




                    <div class="modal-body">
                        <div class="col-sm-3 form-inline">
                            <div style=" margin-bottom: 15px;">
                                <label style="margin-left: 22px;" for="dr">DR:</label>&nbsp;
                                <select readonly id ="dr" name="dr" class="form-control" style="width:200px; background-color:#ffffff;"></select><br>
                            </div>
                            <div style="  margin-bottom: 15px;">
                                <label for="dealer">Dealer:</label>&nbsp;
                                <select id ="dealer" readonly name="dealer" class="form-control" style="width:200px; background-color:#ffffff;"></select><br>
                            </div>
                            <div style="">
                                <label style="margin-left: 12px;" for="oem">OEM:</label>&nbsp;
                                <input type="text" readonly style="background-color:#ffffff;" class="form-control" name="oem" id="oem">
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
                            <div style="  margin-bottom: 15px;">
                                <label fro="fronterizo">Fronterizo:</label>&nbsp;
                                <input style="  margin-left: 28px;" id="fronterizo" name="fronterizo" type="text" size="2" class="form-control"><br>
                            </div>
                            <div style="">
                                <label for="noBahia">No. de Bahias:</label>&nbsp;
                                <input style="  margin-left: 4px;" id="noBahia" name="noBahia" type="text" size="1" class="form-control"><br>
                            </div>
                        </div>
                        <div  style="padding-bottom: 10px;height:180px;position:relative; top:20px; left:140px; width:400px;display:inline-block;">
                            <div style="position:relative; padding-bottom: 10px;">
                                <label class="col-xs-4" for="fechaEval">Fecha evaluaci�n:</label>
                                <input style= "position:relative;  top:18px;" id="fechaEval" name="fechaEval" type="date" value=""/>
                                <img style="position:relative; left:160px; top:-5px;" class="img-responsive" src="calendar5.png" alt="Chania" width="20" height="20"> 
                            </div>    
                            <div style="position:relative; padding-bottom: 10px;">
                                <label class="col-xs-4" for="fechaIniEval">Fecha inicio evaluaci�n:</label>
                                <input style= "position:relative;  top:18px;" id="fechaIniEval" name="fechaIniEval" type="date" value=""/>
                                <img style="position:relative; left:160px; top:-5px;" class="img-responsive" src="calendar5.png" alt="Chania" width="20" height="20"> 
                            </div>
                            <div>
                                <label class="col-xs-4" for="fechaFinEval">Fecha fin evaluaci�n:</label>
                                <input style= "position:relative;  top:18px;" id="fechaFinEval" name="fechaFinEval" type="date" value=""/>
                                <img style="position:relative; left:160px; top:-5px;" class="img-responsive" src="calendar5.png" alt="Chania" width="20" height="20"> 
                            </div>
                        </div>
                    </div>
                    <br>
                    <div>
                        <div style="margin-left:150px;width:310px; display:inline-block;">
                            <div class="table-responsive" style="height:150px;" >
                                <label for="tableCheckBoxObl">Motores requeridos para certificacion:</label>
                                <table id="tableCheckBoxObl" align="right" data-toggle="table">

                                </table>
                            </div>
                        </div>
                        <div style="margin-left:120px;width:310px; display:inline-block;" >
                            <div class="table-responsive" style="height:150px;" >
                                <label for="tableCheckBoxNoDisp">Motores opcionales para certificacion:</label>
                                <table id="tableCheckBoxNoDisp" align="right" data-toggle="table">
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="container" style=" position:relative; top:40px; height: 50px; width:1200px;">
                        <div style="" class="col-sm-3 form-inline">
                            <label for="noMecProm">No. mecanicos promotion:</label>&nbsp;
                            <input style="width:44px; background-color:#ffffff;" readonly id="noMecProm" name="noMecProm" type="text" class="form-control" size="1" >
                        </div>
                        <div style="display:inline-block; " class="col-sm-3 form-inline">
                            <label for="noMeca">No. de mecanicos:</label>&nbsp;
                            <input style="width:44px;" type="text" id="noMeca" name="noMeca" class="form-control" size="1" >
                        </div>
                        <div style="display:inline-block; " class="form-inline">
                            <label for="noAyudantes">No. de ayudantes:</label>&nbsp;
                            <input style="width:44px;" id="noAyudantes" name="noAyudantes" type="text" class="form-control" size="1" >
                        </div>
                    </div>
                    <div style="margin-left: 0px; position:relative; top:50px;" class="modal-body col-sm-4">
                        <form class="form-horizontal" role="form">
                            <div class="table-responsive" style="height:150px;" >
                                <table id="tableBody" data-toggle="table">
                                </table>
                            </div> 
                        </form>
                    </div><br>
                    <div style="position:relative; top:60px;" class="modal-body col-sm-12">
                        <div class="col-sm-2 form-inline">
                            <label>Nivel de servicio:</label>
                        </div>
                        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                            <form class="form-horizontal" role="form">
                                <div class="table-responsive" style="height:150px;" >
                                    <table id="tableBodyChk" data-toggle="table">
                                    </table>
                                </div> 
                            </form>
                        </div>
                        <div class="col-sm-1 form-inline">
                            <button type="button" class="btn btn-default" id="guardarPerfil">Guardar</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>