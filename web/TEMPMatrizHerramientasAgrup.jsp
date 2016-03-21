  <%@include file="TEMPHerramientasmain.jsp"%>      
        
        <script src="js/MatrizHerramientas.js"></script>
        
        
        <div class="table-responsive" >
            <div class="container-body">
                <div class="table-responsive">
				
            	<%@include file="CRTL_DrDealer.jsp"%>
				<br>
                    
                </div>
                <div class="table-responsive">
                    <label for="tableBody">Motores Matriz</label>
                    <table id="tableBody" data-toggle="table">
                    </table><br>
                    <button type="button" class="btn btn-default" id="consultar">Consultar</button>
                    <button type="button" class="btn btn-default" id="atras">Atras</button>
                </div>
            </div>
        </div>
 <%@include file="footer.jsp"%>    