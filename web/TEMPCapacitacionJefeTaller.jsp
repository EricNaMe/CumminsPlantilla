 <%@include file="TEMPcapacitacion.jsp"%>
     
<script src="js/capacitacionJefeTaller.js"></script>



          <h1 style="font-family: arial; font-size: 18px; font-weight: bold; text-align: center;">Evaluación Jefe de Taller</h1>

			<div class="row">
            	 <%@include file="CTRL_evalDatos.jsp"%>
    		</div>   
			<br>
            <%@include file="CTRL_Fechas.jsp"%>

            <%@include file="CRTL_DrDealer.jsp"%>

     		<span ><a style="color:black;text-decoration: none;"><b>Nota:</b>El jefe del taller deberá tener al menos una calificación y el Gerente de servicio deberá tener al menos una familiarización en algunos de los siguientes motores</a></span>
          
          <div class="table-responsive" style='position:relative;  height: 180px;  width:250px;' >
              <table class="table table-striped"  id="tableBody" >       
              </table>
          </div>

	<button  type="button" class="btn btn-default"  id="enviar">Evaluar</button>

          <div class="table-responsive" style='position:relative;  height: 180px;  width:550px;' >
              <table class="table table-striped"  id="tableBody2" >
              </table>
          </div>

          <div class="table-responsive" style='position:relative;  height: 180px;  width:250px;' >
              <table class="table table-striped" id="tableBody4" >    
              </table>
          </div>

          <div class="table-responsive" style='position:relative;  height: 180px;  width:550px;' >
              <table class="table table-striped" id="tableBody3" >
              </table>
          </div>
     
          <div class="table-responsive" style='position:relative;  height: 180px;  width:250px;' >
              <table class="table table-striped"  id="tableBody5" >
              </table>
          </div> 
   

 <%@include file="footer.jsp"%>
