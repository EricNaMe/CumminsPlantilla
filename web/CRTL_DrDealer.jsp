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
		<label class="col-sm-4" for="dr">DR</label>
		<select id ="dr" name="dr" class="col-sm-6 form-control" style=""></select>
	</div>
	<div class="col-sm-4">
    	<label  class="col-sm-4" for="codigo_DR">Código DR</label>
    	<input class="form-control"  class="col-sm-6 form-control" name="codigo_DR" id="codigo_DR"  type="text" style="background-color:#ffffff; color:#000000; width:80px;"  disabled >
	</div>
</div>
      	
      	
<div class="row">  
	<div class="col-sm-4">
		<label class="col-sm-4" for="dealer">Dealer</label>
		<select class="col-sm-4 form-control" id ="dealer" name="dealer"  style="width:200px;"></select>	
	</div>
	<div class="col-sm-4">
		<label class="col-sm-4" for="codigoDeal">Código Dealer</label>
	 	<input class="col-sm-6 form-control"  name="codigoDeal" id="codigoDeal"  type="text" style="background-color:#ffffff; color:#000000; width:80px;"  disabled >
    </div>   
</div>