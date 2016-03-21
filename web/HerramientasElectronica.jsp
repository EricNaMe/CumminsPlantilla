<%-- 
    Document   : HerramientasElectronica
    Created on : 3/03/2016, 03:53:37 PM
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
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="js/herramientasElectronica.js"></script>
        <script>
            $(document).ready(function() {
                
            });
        </script>
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
        

            <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Evaluación de herramienta electrónica</h1>
            
            <div style="position:relative; display:inline-block; top:0px; height:75px; width:333px;"  class="form-group">
                <label class="col-lg-6" >Tipo de evaluación:</label>
                <div style="width:140px; position:relative;  left:160px; top:0px; margin: 0px; height: 60px;">
                    <div style="top:-20px;" class="radio">
                        <label><input type="radio" name="TipoEva">Evaluación</label>
                    </div>
                    <div style="top:-10px;" class="radio">
                        <label ><input type="radio" name="TipoPeva">Pre Evaluación</label>
                    </div>
                </div>
            </div>
            <div style="position:relative;display:inline-block; top:0px; height:75px; width:150px;"  class="form-group">
                <label class="col-lg-6" >Revisión:</label>
                <div style="width:50px; position:relative;  left:100px; top:0px; margin: 0px; height: 60px;">
                    <div style="top:-20px;" class="radio">
                        <label><input type="radio" name="No_Eva1">1</label>
                    </div>
                    <div style="top:-10px;" class="radio">
                        <label ><input type="radio" name="No_Eva2">2</label>
                    </div>
                </div>
            </div>
            <div style=" height:50px; top:-15px; position:relative; left:30px; width:200px;display:inline-block;">
                <label for="sel1">Año:</label>
                <div style="width:100px; position:relative; top:-20px; left:50px;">
                    <select class="form-control" id="sel1">
                        <option>2016</option>
                        <option>2015</option>
                        <option>2014</option>
                        <option>2013</option>
                    </select>
                </div> 
            </div>
            <div  style="padding-bottom: 10px;height:180px;position:relative; top:70px; left:30px; width:400px;display:inline-block;">
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
                <div style="position:relative;margin-left: 20px; display:inline-block; top:0px; height:45px; width:333px;" >
                    <div class="col-md-9" >
                        <label for="dr">DR:</label>
                        <select readonly id ="dr" name="dr" class="col-md-5 form-control" style="position:relative; left:30px; top:-30px; background-color:#ffffff;"></select>
                    </div>
                </div>
                <div style="position:relative;margin-left: 20px; display:inline-block; top:0px; height:45px; width:333px;" >
                    <div class="col-md-9" >
                        <label for="codigoDR">Código DR:</label>
                        <input type="text" readonly style="position:relative;width:70px; left:170px; top:-5px; background-color:#ffffff;" id="codigoDR" 
                               name="codigoDR" size="4" class="col-md-2 form-control">
                    </div>
                </div>  
            </div>
            <div>
                <div style="position:relative;top:0px;display:inline-block;  height:45px; width:333px;" >
                    <div class="col-md-9" >
                        <label for="dealer">Dealer:</label>
                        <select id ="dealer" readonly name="dealer" class="col-md-5 form-control" style="position:relative; left:50px; top:-30px; background-color:#ffffff;"></select>
                    </div>
                </div>  
                <div style="position:relative;margin-left: 30px; display:inline-block; top:-25px; height:45px; width:280px;" >
                    <div class="" >
                        <label for="codigoDeal">Código Dealer:</label>
                        <input type="text" readonly style="position:relative;width:70px; left:195px; top:-5px; background-color:#ffffff;" 
                               name="codigoDeal" id="codigoDeal" size="4" class="col-md-2 form-control">
                    </div>
                </div>  
            </div>
            <div>                  
                <div style=" height:50px; top:-15px; position:relative; left:30px; width:300px;display:inline-block;">
                    <label for="sel1">Mecánicos Registrados:</label>
                    <div style="width:500px; position:relative; top:-20px; left:50px;"> 
                        <input style="position:relative;width:80px; left:140px; top:-5px;" type="number"  class="col-md-2 form-control" id="usr">
                    </div> 
                </div>
                <div style=" height:50px; top:-15px; position:relative; left:30px; width:380px;display:inline-block;">
                    <label for="sel1">Ayudantes de mecánicos registrados:</label>
                    <div style="width:500px; position:relative; top:-20px; left:50px;"> 
                        <input style="position:relative;width:80px; left:220px; top:-5px;" type="number"  class="col-md-2 form-control" id="usr">
                    </div> 
                </div>
            </div>   
            <div style=" margin-left: 80px; width:250px;">
                <label><a style="font-size: 18px; font-weight: bold; font-family: arial;">Criterios de evaluación:</a></label>
            </div>
            <!-- CUADRO DONDE SE INDICAN LOS PORCENTAJES-->
            <div   style="top: 10px; font-size: 20px; border-style:solid; position:relative; background-color: whitesmoke; left:40px; height:70px; width:300px;">
                <label style="padding-left: 5px;" for="SubPorc"><a style="color:black; font-size: 18px;  font-family: arial;">INSITE/INLINE por cada 3 Técnicos sin contar rescatistas</a> </label>
            </div>  
            <!--FIN CUADRO-->
            <div style=" position: relative; top:-100px; width: 400px; float:right; height:150px;">      
                <div style=" height:40px; top:0px; position:relative;  width:300px;display:block;">
                    <label for="sel1">INSITE/INLINE requerido:</label>
                    <div style="width:500px; position:relative; top:-20px; left:50px;"> 
                        <input style="position:relative;width:80px; left:140px; top:-5px;" type="number"  class="col-md-2 form-control" id="usr">
                    </div> 
                </div>
                <div style=" height:40px; top:0px; position:relative;  width:300px;display:block;">
                    <label  for="sel1">Conteos de calibración(mínimo 2):</label>
                    <div style="width:500px; position:relative; top:-20px; left:50px;"> 
                        <input style="position:relative;width:80px; left:195px; top:-15px;" type="number"  class="col-md-2 form-control" id="usr">
                    </div> 
                </div>
                <div style=" height:40px; top:25px; position:relative;  width:300px;display:block;">
                    <label style= "position: relative;left: -80px" for="sel1">Zap it(mínimo1):</label>
                    <div style="width:500px; position:relative; top:-20px; left:50px;"> 
                        <input style="position:relative;width:80px; left:115px; top:-5px;" type="number"  class="col-md-2 form-control" id="usr">
                    </div> 
                </div>
            </div>
            <div style=" position:relative; top:20px; margin-left: 80px; width:250px;">
                <label><a style="font-size: 18px; font-weight: bold; font-family: arial; color:black;">Información de INLINE's:</a></label>
            </div>
            <div style="left:25px; height:40px; top:25px; position:relative;  width:400px;display:block;">
                <label style= "position: relative;" for="sel1">¿Cuántos INLINE's tienen para el taller?:</label>
                <div style="width:500px; position:relative; top:-20px; left:50px;"> 
                    <input style="position:relative;width:80px; left:255px; top:-5px;" type="number"  class="col-md-2 form-control" id="usr">

                </div> 
            </div>
            <div style="position:relative; top:30px; margin-left: 80px; width:250px;">
                <label><a style="font-size: 18px; font-weight: bold; font-family: arial; color:black;">Información de INLINE's:</a></label>
            </div>
            <div class="container" >
                <table class="table table-striped" id="tableBody">
                </table>
            </div>
            <div style='position: relative; display:inline-block; top:50px; left:200px;' class="col-md-6">
                <button type="button" class="btn-default"  id="enviar">Evaluar</button>
            </div>
            <div style='position:relative; left:-250px; width:400px; display:inline-block;'>
                <div style='position:relative; top:30px; width:680px;' class="container" >
                    <table class="table table-striped"  id="tableInsite">
                    </table>
                </div>
            </div>
      
    </body>
</html>
