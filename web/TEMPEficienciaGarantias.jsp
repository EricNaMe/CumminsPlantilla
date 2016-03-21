 <%@include file="TEMPeficiencia.jsp"%>  

        <script src="js/garantias.js"></script>
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

            <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Eficiencia garantías</h1>

            <br></br>
           
           	<%@include file="CTRL_FeDrDealer.jsp"%>  
            
		
            
                        <br></br>
          
               <h3 style="text-align: center;">Garantías y políticas</h3>
            

        <div class="row">
               <div class="col-sm-12">
                <div class="table-responsive" >
                    <table id="tableGarantias" align="right"></table>
                </div>
               </div>   
        </div>   
    

            <br>

     
                <h3 style="text-align: center;">Eficiencia</h3>
  
    <br></br>

      <div class="row">
               <div class="col-sm-12">
                    <div class="table-responsive"  >
                        <table id="tableEficiencia" align="right"></table>
                    </div>
               </div>
      </div>
        
    

            <br>
            
            <div class="row">
                <div class="col-md-4">
                    <button  type="button" class="btn btn-default"  id="enviar">Calcular</button>
                </div> 

                <div class="col-md-4">
                    <button  type="button" class="btn btn-default"  id="enviar">Enviar auditoría</button>
                </div> 

                <div class="col-md-4">
                    <button  type="button" class="btn btn-default"  id="enviar">Guardar</button>
                </div> 

            </div>

       



 <%@include file="footer.jsp"%>  