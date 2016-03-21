   <%@include file="TEMPcatalogos.jsp"%>

		<script src="js/teenCare.js"></script>
        <script src="js/validaciones.js"></script>

                <div class="row" >
                    <div class="col-md-5 col-md-offset-2" >      
                        <label for="tableMatrizInfant">Matrices Infant Care</label>
                        <table id="tableMatrizInfant"></table>
                    </div>
                </div>

                <div class="row" >
                    <div class="col-md-1 col-md-offset-4" >
                        <button type="button" id="importar"  class="btn btn-default" >Importar</button>
                    </div>
                </div>

				<br><br>
        
                <label for="tableMatrizTeenCare">Matrices Teen Care</label>
                <table id="tableMatrizTeenCare" > </table>
  
 <%@include file="footer.jsp"%>