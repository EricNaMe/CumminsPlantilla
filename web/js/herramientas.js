

$(function() {



    $('#tblMatrizTeen').bootstrapTable({
        idField: 'id',
        dataType: 'json',
        url: 'GetMatrizTeenCareHerramientas',
        emptytext: '-',
        formatLoadingMessage: function() {
            return 'Cargando...';
        },
        formatRecordsPerPage: function(pageNumber) {
            return pageNumber + ' registros por pagina';
        },
        formatShowingRows: function(pageFrom, pageTo, totalRows) {
            return 'Mostrando ' + pageFrom + ' a ' + pageTo + ' de ' + totalRows + ' registros';
        },
        formatSearch: function() {
            return 'Buscar';
        },
        formatNoMatches: function() {
            return 'No se encontraron registros';
        },
        formatPaginationSwitch: function() {
            return 'Ocultar/Mostrar paginacioon';
        },
        formatRefresh: function() {
            return 'Actualizar';
        },
        formatToggle: function() {
            return 'Toggle';
        },
        formatColumns: function() {
            return 'Columnas';
        },
        formatAllRows: function() {
            return 'Todos';
        },
        columns: [{
                field: 'id',
                title: 'Id',
                visible: false
            }, {
                field: 'nombreMatrizTeenCare',
                title: 'Matriz'
            }, {
                field: 'para',
                title: 'para'

            }, {
                field: 'ultimaModificacion',
                title: 'Ultima modificacion'

            }, {
                field: 'link',
                title: 'Detalles',
                class: 'TextFormat',
                formatter:'linkFormatter'
            }]
    });


    $("#generar").click(function() {
        
        if($('input:radio:checked').length > 0){
        
        jsonBody =  $('#formHerramientas').serializeJSON();
        $.ajax({
            dataType: "text",
            url: "ImportarHerramientas",
            method: "POST",
            data: {"data": jsonBody},
            beforeSend: function() {
                $('#headerModal').html('Enviando Informacion...');
                $('#closeModal').css('display', 'none');
                $('#myModal').modal({keyboard:false,backdrop:'static'},'show');
            }
           
        }).done(function(e) {
            $('#closeModal').css('display', '');
            $('#headerModal').html("El cambio fue hecho con exito");
            $('#tblMatrizTeen').bootstrapTable('refresh');
            
            
        })
                .fail(function(e) {
                    $('#closeModal').css('display', '');
                    $('#headerModal').html('Ocurrio un error al enviar los datos');
                    
                    
                });
            }else{
                alert('Seleccione al menos una matriz');
                
            }
        });
    });



function linkFormatter(value,row) {
  return '<a href=detallesHerramientas.jsp?id='+row.id+'> Ver detalles</a>';
}

























