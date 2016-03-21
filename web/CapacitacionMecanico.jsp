
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


        

        <script src="js/capacitamecanico.js"></script>


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
        <div style=" position:absolute; top:20px; left:80px; height:140%; width:90%;">
            <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Evaluación mecánico</h1>

            <div style="position:relative; display:inline-block; top:-80px; height:75px; width:333px;"  class="form-group">
                <label class="col-lg-6" >Tipo de evaluación:</label>
                <div style="width:140px; position:relative;  left:160px; top:0px; margin: 0px; height: 60px;">

                    <div style="top:-20px;" class="radio">
                        <label><input type="radio" name="TipoEva" id="tipo_eva">Evaluación</label>
                    </div>
                    <div style="top:-10px;" class="radio">
                        <label ><input type="radio" name="TipoPeva" id="tipo_eva">Pre Evaluación</label>
                    </div>

                </div>
            </div>

            <div style="position:relative;display:inline-block; top:-80px; height:75px; width:150px;"  class="form-group">
                <label class="col-lg-6" >Revisión:</label>

                <div style="width:50px; position:relative;  left:100px; top:0px; margin: 0px; height: 60px;">

                    <div style="top:-20px;" class="radio">
                        <label><input type="radio" name="No_Eva1" id="No_eva">1</label>
                    </div>

                    <div style="top:-10px;" class="radio">
                        <label ><input type="radio" name="No_Eva2" id="No_eva">2</label>
                    </div>

                </div>

            </div>


            <div style=" height:50px; top:-95px; position:relative; left:30px; width:200px;display:inline-block;">

                <label for="sel1">Año:</label>
                <div style="width:100px; position:relative; top:-20px; left:50px;"> 

                    <select class="form-control" id="anio_eva">
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


            <div> 
                <div style="position:relative;margin-left: 20px; display:inline-block; top:-70px; height:45px; width:333px;" >
                    <div class="col-md-9" >
                        <label style="" class="" for="dr">DR:</label>
                        <!--<input style="position:relative; left:30px; top:-30px;" type="text" class="col-md-5 form-control" id="usr">-->
                        <select readonly id ="dr" name="dr" class="form-control" style="width:200px; background-color:#ffffff;"></select><br>
                    </div>
                </div>   

                <div style="position:relative;margin-left: 20px; display:inline-block; top:-70px; height:45px; width:333px;" >
                    <div class="col-md-9" >
                        <label style="" class="" for="codigoDR">Código DR:</label>
                        <input style="position:relative;width:70px; left:170px; top:-5px;" name="codigoDR" id="codigoDR" type="text"  class="col-md-2 form-control">
                    </div>
                </div>  

            </div>

            <div>
                <div style="position:relative;top:-70px;display:inline-block;  height:45px; width:333px;" >
                    <div class="col-md-9" >
                        <label class="" for="dealer">Dealer:</label>
                        <!--<input style="position:relative; left:50px; top:-30px;" type="text" class="col-md-5 form-control" id="usr">-->
                        <select id ="dealer" readonly name="dealer" class="form-control" style="width:200px; background-color:#ffffff;"></select><br>
                    </div>
                </div>  

                <div style="position:relative;margin-left: 30px; display:inline-block; top:-85px; height:45px; width:280px;" >
                    <div class="" >
                        <label style="" class="" for="codigoDeal">Código Dealer:</label>
                        <input style="position:relative;width:70px; left:195px; top:-5px;" name="codigoDeal" id="codigoDeal" type="text"  class="col-md-2 form-control">
                    </div>
                </div>  
            </div>

            <div>
                <div class="col-md-9" >
                    <label style="position:relative; top:-40px;" class="" for="usr">Cantidad de mecánicos registrados en sistema:</label>
                    <input style="position:relative;width:70px; left:500px; top:-45px;" name="qtyMecRegis" id="qtyMecRegis" type="text"  class="col-md-2 form-control">
                </div>

            </div>
            <br></br></br>
            <div>
                <div class="col-md-9" >
                    <label style="position:relative;top:-40px;" class="" for="usr">Cantidad de ayudantes de mecánicos registrados en sistema:</label>
                    <input style="position:relative;width:70px; left:500px; top:-45px;" type="text" name="qtyAyudaReg" id="qtyAyudaReg" class="col-md-2 form-control" id="usr">
                </div>
            </div>    
            </br>  </br>  </br>
            <div>
                <span ><a style="text-decoration: none;"><b>Nota:</b> Si la cantidad de mecánicos y/o ayudantes de mecánicos no es correcta, favor de actualizar en base de datos de Promotion y en el perfil del Dealer para que la cantidad mínima de mecánicos requeridos sea correcta. </a></span>


            </div>

            <div style="position:relative; display:inline-block;">
                <div class="table-responsive" style='position:relative;  height: 190px; top:30px; width:400px;' class="container" >
                    <table id="tableQtyMecanicos" align="right"></table>
                </div>
            </div>

            <div style="position:relative; display:inline-block;">
                <div class="table-responsive" style='position:relative;  height: 190px; top:30px; width:850px;' >
                    <table id="tableMotoresCapacitaMec" align="right"></table>
                </div>
            </div>

            </br>
            <div style="position:relative; left:250px; display:inline-block;">
                <div class="table-responsive container" style='position:relative;  height: 190px; top:30px; width:700px;' >
                    <table id="tableMecanicosCapacitaMec" align="right"></table>
                </div>
            </div>
        </div>
    </body>
</html>
