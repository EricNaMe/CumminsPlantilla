 <%@include file="TEMPquejas.jsp"%>

        <script src="js/infantcare.js"></script>
        <script src="js/perfilDealer.js"></script>
        <script src="js/quejascaptura.js"></script>
        
       <div class="table-responsive">

            <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Captura de Quejas</h1>

   			<div class="row">
            	 <%@include file="CTRL_evalDatos.jsp"%>
    		</div>   
			<br>
            <%@include file="CTRL_Fechas.jsp"%>

            <%@include file="CRTL_DrDealer.jsp"%>
			<br>
			
           <table  class="table table-striped" id="tableQuejasCaptura"></table>
			
        </div>
 
 <%@include file="footer.jsp"%>