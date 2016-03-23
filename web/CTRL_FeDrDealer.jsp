

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


	<script>

	$(function() {
		
		 $.ajax({
		        dataType: "text",
		        url: "ObtenerDR",
		        method: "POST",
		        beforeSend: function() {

		        }

		    }).done(function(e) {
		        if (e === 'error') {
		            alert('Ocurrio un error al cargar catalogo de distribuidores');
		        } else {
		            json = $.parseJSON(e);
		            $('#dr').html($("<option></option>"));
		            for (var i = 0; i < json.length; i++) {
		                $('#dr')
		                        .append($("<option></option>")
		                                .attr("value", json[i].key)
		                                .text(json[i].value));
		            }
		        }
		    }).fail(function(e) {
		                $('#headerModal').html('Ocurrio un error al enviar la informacion');
		                $('#closeModal').css('display', '');
		    });

				

		 $('#dr').on('change', function() {
			 
			 	$('#codigo_DR').val($('#dr').val());
			 	$("#codigoDeal").val("");
			 	
		 		$.ajax({
		 	          dataType: "text",
		 	          url: "ObtenerDealer?id_dr=" + this.value,
		 	          method: "GET",
		 	          beforeSend: function() {

		 	          }
		 	      }).done(function(e) {
		 	          if (e === 'error') {
		 	              alert('Ocurrio un error al cargar catalogo de rangos');
		 	          } else {
		 	              json = $.parseJSON(e);
		 	              $('#dealer').html($("<option></option>"));
		 	              for (var i = 0; i < json.length; i++) {
		 	                  $('#dealer').append($("<option></option>")
		 	                                  .attr("value", json[i].key)
		 	                                  .text(json[i].value));
		 	                  		//oem[i]=json[i].oem;
		 	                  //oem[i]=json[i].oem;
		 	              }
		 	          }
		 	      }).fail(function(e) {
		 		        $('#headerModal').html('Ocurrio un error al cargar catalogo de rangos');
		 		        $('#closeModal').css('display', '');
		 	      });
		 		
		 		
		 	});
		 
		 $('#dealer').on('change', function() {
		    	$("#codigoDeal").val($('#dealer').val());
		    });


	});

	


</script>
	     


<div class="row">
    <div class="col-sm-4">
        <div class="col-sm-4">
            <label  for="tipo_eval">Tipo de Evaluación:</label>
        </div>
        <div class="col-sm-8" >
            <select class="form-control" id ="tipo_eval" name="tipo_eval" class="form-control" >
                <option value = '1' >Evaluación</option>
                <option value = '2' >Pre evaluación</option>
            </select>
        </div>
    </div>

    <div class="col-sm-4">
        <div class="col-sm-4">
            <label  for="revision">Revisión:</label>
        </div>
        <div class="col-sm-6">
            <select class="form-control" id ="revision" name="revision" class="form-control" >
                <option value = '1' >1a</option>
                <option value = '2' >2a</option>
                <option value = '3' >3a</option>
            </select>
        </div>    
    </div>


    <div class="col-xs-3">
        <div class="col-sm-3 text-right">
            <label for="sel1">Año:</label>
        </div>
        <div class="col-sm-9">
            <select class="form-control" id="anio">
                <option>2005</option> <option>2006</option> <option>2007</option>
                <option>2008</option> <option>2009</option> <option>2010</option>
                <option>2011</option> <option>2012</option> <option>2013</option>
                <option>2014</option> <option>2015</option> <option>2016</option>
                <option>2017</option> <option>2018</option> <option>2019</option>
                <option>2020</option> <option>2021</option> <option>2022</option>
                <option>2023</option> <option>2024</option> <option>2025</option>
                <option>2026</option> <option>2027</option> <option>2028</option>
                <option>2029</option> <option>2030</option>
            </select>
        </div>
    </div>
</div>


</div>


<br>  

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






<div style="" class="col-sm-4 col-sm-offset-8">
    <div class="col-xs-6">
        <label for="Modl">Fecha fin evaluación:</label>
    </div>
    <div class="col-xs-6">
        <input id="datepicker3" class="form-control" type="text" value=""/>
    </div>
</div> 

