<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

         <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
         <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
         <link rel="stylesheet" href="/resources/demos/style.css">
    
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

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
              <script>
  $(function() {
    $( "#datepicker" ).datepicker();
  });
  
   $(function() {
    $( "#datepicker2" ).datepicker();
  });
  
   $(function() {
    $( "#datepicker3" ).datepicker();
  });
  </script>
  
        <style>
               body{
                text-align: center;
            }
            .eficiencia-container{
                display: inline-block;
                width: 100%;
                max-width: 1100px;
                text-align: left;
            }
          </style>  
        
        
        <div class="eficiencia-container container-fluid">

            <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Evaluaci�n de herramienta electr�nica</h1>
            <br></br>
            
            <div class="row ">
                <div class="col-md-8">
                    <div class="row">
                        <div class="Evaluacion col-xs-6">
                            <div class="col-lg-7">
                                <label >Tipo de evaluaci�n:</label>
                            </div>
                            <div class="col-sm-5">
                                <div>
                                    <label><input type="radio" name="TipoEva">Evaluaci�n</label>
                                </div>
                                <div>
                                    <label ><input type="radio" name="TipoPeva">Pre Evaluaci�n</label>
                                </div>
                            </div>
                        </div>
                        <div class="revision col-xs-3">
                            <div class="col-sm-6 text-right">
                                <label >Revisi�n:</label>
                            </div>
                            <div class="col-sm-6">
                                <div>
                                    <label><input type="radio" name="No_Eva1">1</label>
                                </div>
                                <div>
                                    <label ><input type="radio" name="No_Eva2">2</label>
                                </div>
                            </div>
                        </div>
                        <div class="col-xs-3">
                            <div class="col-sm-3 text-right">
                                <label for="sel1">A�o:</label>
                            </div>
                            <div class="col-sm-9">
                                <select class="form-control" id="sel1">
                                    <option>2016</option>
                                    <option>2015</option>
                                    <option>2014</option>
                                    <option>2013</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="col-xs-4">
                                <label class="" for="usr">Dealer:</label>
                            </div>
                            <div class="col-xs-6">
                                <input type="text" class="col-md-5 form-control" id="usr">
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="col-xs-4">
                                <label class="" for="usr">C�digo Dealer:</label>
                            </div>
                            <div class="col-xs-6">
                                <input type="text"  class="col-md-2 form-control" id="usr">
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="col-xs-4">
                                <label class="" for="usr">DR:</label>
                            </div>
                            <div class="col-xs-6">
                                <input type="text" class="col-md-5 form-control" id="usr">
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="col-xs-4">
                                <label class="" for="usr">C�digo DR:</label>
                            </div>
                            <div class="col-xs-6">
                                <input type="text"  class="col-md-2 form-control" id="usr">
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-4">
                    <div class="row">
                        <div class="col-xs-4">
                            <label for="Modl">Fecha evaluaci�n:</label>
                        </div>
                        <div class="col-xs-6">
                            <input  class="form-control" id="datepicker" type="text" value=""/>
                        </div>

                    </div>
                    </br>
                    <div class="row">
                        <div class="col-xs-4">
                            <label for="Modl">Fecha inicio evaluaci�n:</label>
                        </div>
                        <div class="col-xs-6">
                            <input  class="form-control" id="datepicker2" type="text" value=""/>
                        </div>

                    </div>
                    </br>
                    <div class="row">
                        <div class="col-xs-4">
                            <label for="Modl">Fecha fin evaluaci�n:</label>
                        </div>
                        <div class="col-xs-6">
                            <input  class="form-control" id="datepicker3" type="text" value=""/>
                        </div>

                    </div>
                </div>
            </div>

            <br></br>    <br></br>

            <div class="col-sm-4">
                <div class="col-xs-8">
                    <label class="" for="usr">Mec�nicos registrados:</label>
                </div>
                <div class="col-xs-3">
                    <input type="text" class="col-md-3 form-control" id="usr">
                </div>
            </div>

            <div class="col-sm-6">
                <div class="col-xs-7">
                    <label class="" for="usr">Ayudantes de mec�nicos registrados:</label>
                </div>
                <div class="col-xs-2">
                    <input type="text" class="col-md-4 form-control" id="usr">
                </div>
            </div>



            <br></br>    <br></br>

            <div  class="col-sm-12" style="">
                <label><a style="font-size: 18px; font-weight: bold; font-family: arial;">Criterios de evaluaci�n:</a></label>
            </div>
            <!-- CUADRO DONDE SE INDICAN LOS PORCENTAJES-->
            <div class="col-sm-4"  style="font-size: 20px; border-style:solid; background-color: whitesmoke;  height:70px; width:340px;">           

                <label style="padding-left: 5px;" for="SubPorc"><a style="color:black; font-size: 18px;  font-family: arial;">INSITE/INLINE por cada 3 T�cnicos sin contar rescatistas</a> </label>

            </div>  

            <div style="margin-left:190px;" class="col-sm-6">
                <div class="col-xs-5">
                    <label class="" for="usr">INSITE/INLINE requerido:</label>
                </div>
                <div class="col-xs-2">
                    <input type="text" class="col-md-4 form-control" id="usr">
                </div>
            </div>
            <br></br>  <br></br>  
            <div style="margin-left:190px;" class="col-sm-6" >
                <div class="col-xs-7">
                    <label class="" for="usr">Conteos de calibraci�n (m�nimo 2):</label>
                </div>
                <div class="col-xs-2">
                    <input type="text" class="col-md-4 form-control" id="usr">
                </div>
            </div>

            <br></br> <br>  
            <div class="col-sm-6" style="margin-left:530px;">
                <div class="col-xs-7">
                    <label class="" for="usr">Zap it (m�nimo 1):</label>
                </div>
                <div class="col-xs-2">
                    <input type="text" class="col-md-4 form-control" id="usr">
                </div>
            </div>
            <br></br>
            <div class="col-sm-12">
                <label><a style="font-size: 18px; font-weight: bold; font-family: arial; color:black;">Informaci�n de INLINE's:</a></label>
            </div>
            <br></br>
            <div class="col-sm-6">
                <div class="col-xs-7">
                    <label class="" for="usr">�Cu�ntos INLINE's tienen para el taller?:</label>
                </div>
                <div class="col-xs-2">
                    <input type="text" class="col-md-4 form-control" id="usr">
                </div>
            </div>



            <br></br>    <br></br>

            <div class="container" >

                <table class="table table-striped"  data-toggle="table">
                    <thead>
                        <tr >
                            <th >PCID</th>       
                            <th >Fecha de Expiraci�n</th>      
                            <th >Cliente</th>      
                            <th style="width:100px; word-wrap: break-word;" >En BD de Htas</th>      
                            <th >V�lido para auditor�a</th>      
                            <th >Comentarios</th>      

                        </tr>
                    </thead>
                    <tr>
                        <td>1</td>
                        <td>ISMX</td>
                        <td>289332</td>
                        <td></td>
                        <td>Sensor </td>
                        <td></td>



                    </tr>
                </table>
            </div>


            <br></br>


            <div style='margin-left: 30px; margin-top: 20px;' class="col-md-2">
                <button type="button" class="btn-default"  id="enviar">Evaluar</button>
            </div>





            <div class='col-md-9' >

                <table class="table table-striped"  data-toggle="table">
                    <thead>
                        <tr >
                            <th >INSITE's/INLINE's requeridos</th>       
                            <th >INSITE's/INLINE's registrados</th>      
                            <th >% Obtenido</th>      


                        </tr>
                    </thead>
                    <tr>
                        <td>1</td>
                        <td>ISMX</td>
                        <td>289332</td>

                    </tr>
                </table>



            </div>  



        </div>


    </body>
</html>