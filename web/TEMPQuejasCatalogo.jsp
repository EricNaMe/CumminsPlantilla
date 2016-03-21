 <%@include file="TEMPquejas.jsp"%>


   <script src="js/quejascatalogo.js"></script>
        <script src="js/infantcare.js"></script>

 <div class="table-responsive" >
            <h1 class="text-center" >Cátalogo quejas</h1> 
            
            <div class="row">
              
                    <div class="col-xs-2">
                        <label class="" for="usr">Quejas:</label>
                    </div>
                    <div class="col-xs-6">
                        <input type="text" class="col-md-5 form-control" id="queja">

                    </div>
                    <div>
                        <button type="button" class="btn btn-default"  id="enviar">Guardar</button>
                    </div>

             

            </div>

            <br>

                
                    <table class="table table-striped" id="tableQuejasCatalogo"></table>
                  
            
            <h4 class="text-center" ><b>Nota:</b> Validar que la suma de las ponderaciones de las quejas sea 100%</h4> 

        </div>    
 <%@include file="footer.jsp"%>

