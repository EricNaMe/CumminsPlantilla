 <%@include file="TEMPcapacitacion.jsp"%>
     
        <script src="js/capacitamecanico.js"></script>
        
       
        
        
        
			
            <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Evaluaci�n mec�nico</h1>
            
           

		

            <%@include file="CTRL_FeDrDealer.jsp"%>
            
          
    		

            <br></br><br>
            <div class="row">
                <div class="col-md-6" >
                    <div class="col-md-9">
                    <label  class="" for="qtyMecRegis">Cantidad de mec�nicos registrados en sistema:</label>
                   </div>
                     <div class="col-md-3">
                    <input  name="qtyMecRegis" id="qtyMecRegis" type="text"  class="form-control">
                    </div>
                 </div>

                <div class="col-md-6" >
                      <div class="col-md-9">
                    <label  for="qtyAyudaReg">Cantidad de ayudantes de mec�nicos registrados en sistema:</label>
                      </div>
                    <div class="col-md-3">
                    <input  type="text" name="qtyAyudaReg" id="qtyAyudaReg" class="form-control" >
                    </div>
                </div>
            </div>    
            <br>  <br>  <br>
            <div>
                <span ><a style="text-decoration: none;"><b>Nota:</b> Si la cantidad de mec�nicos y/o ayudantes de mec�nicos no es correcta, favor de actualizar en base de datos de Promotion y en el perfil del Dealer para que la cantidad m�nima de mec�nicos requeridos sea correcta. </a></span>
            </div>

                <div class="table-responsive"  class="container" >
                    <table id="tableQtyMecanicos" align="right"></table>
                </div>
			
			<br>
			
                <div class="table-responsive"  >
                    <table id="tableMotoresCapacitaMec" align="right"></table>
                </div>
            <br>

                <div class="table-responsive"  >
                    <table id="tableMecanicosCapacitaMec" data-height="250"></table>
                </div>



 <%@include file="footer.jsp"%>