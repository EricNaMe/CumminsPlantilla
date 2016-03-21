  
    <%@include file="header.jsp"%>
    
        <script src="js/perfilDealer.js"></script>

        
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
        
        <form name="myform" id="myform">
            <div style="margin: 20px; height: 850px;">
                <div class="container-body">
                    <div style="position:relative; display:block; left:20px; top:20px; height:25px; width:300px;"  class="form-group">
                        <label class="col-lg-10" >Tipo:</label>
                        <div style="width:200px; position:relative;  left:40px; top:0px; margin: 0px; height: 25px;">
                            <div style="width:250px; position:relative; top:-24px; left:20px;">
                                <input type="radio" name="optradio" id="optradio" value="E" checked>&nbsp;Evaluación&nbsp;&nbsp;
                                <input type="radio" name="optradio" id="optradio" value="PE">&nbsp;Pre Evaluación
                            </div> 
                        </div>
                    </div>
                    <div class="modal-body">
                 
                        
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
                            <label class="" for="usr">Código DR:</label>
                        </div>
                        <div class="col-xs-5">
                            <input type="text"  class="col-md-7 form-control" id="codigoDR">

                        </div>
                    </div>

                    <div class="col-sm-4"> 
                        <div class="col-xs-6">
                            <label for="Modl">Fecha evaluación:</label>
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
                            <label class="" for="usr">Código Dealer:</label>
                        </div>
                        <div class="col-xs-5">
                            <input type="text"  class="col-md-7 form-control" id="codigoDeal">
                        </div>
                    </div>

                    <div class="col-sm-4">
                        <div class="col-xs-6">
                            <label for="Modl">Fecha inicio evaluación:</label>
                        </div>
                        <div class="col-xs-6">
                            <input id="datepicker2" class="form-control" type="text" value=""/>
                        </div>
                    </div>    



                    <br>   <br>   <br>   


                        <div class="col-sm-4">
                        <div class="col-xs-3">
                            <label class="" for="usr">OEM:</label>
                        </div>
                        <div class="col-xs-9">
                            <select  class="col-md-5 form-control" id="oem"></select>
                        </div>
                    </div>

                       <div class="col-sm-4">
                        <div class="col-xs-6">
                            <label class="" for="usr">Fronterizo:</label>
                        </div>
                        <div class="col-xs-5">
                            <input type="text" id="fronterizo" name="fronterizo" class="col-md-7 form-control" id="oem">
                        </div>
                    </div>


                    <div style="" class="col-sm-4 ">
                        <div class="col-xs-6">
                            <label for="Modl">Fecha fin evaluación:</label>
                        </div>
                        <div class="col-xs-6">
                            <input id="datepicker3" class="form-control" type="text" value=""/>
                        </div>
                    </div> 
                    
                    <br></br><br>
                    
                      <div class="col-sm-4 col-sm-offset-4">
                        <div class="col-xs-6">
                            <label class="" for="usr">No. Bahías:</label>
                        </div>
                        <div class="col-xs-5">
                            <input type="text" id="noBahia" name="noBahia" class="col-md-7 form-control" id="oem">
                        </div>
                    </div>
      
                </div>
                        
                        
                        
                        
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-sm-6" style="">
                            <div class="table-responsive" style="max-height:150px;" >
                                <label for="tableCheckBoxObl">Motores requeridos para certificacion:</label>
                                <table id="tableCheckBoxObl" align="right" data-toggle="table">

                                </table>
                            </div>
                        </div>
                        <div class="col-sm-6" style="" >
                            <div class="table-responsive" style="max-height:150px;" >
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
        
<%@include file="footer.jsp"%>