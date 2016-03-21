/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
	
	var a = $.get("id_header");
	
	
	
    $('#tableMatrizInfant').bootstrapTable({
        idField: 'idBody',
        uniqueId: 'idBody',
        pagination: true,
        search: true,
        dataType: 'json',
        url: 'GetMatrizInfantTeen?id_header=' + a,
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
                title: 'Agregar',
                field: 'check',
                checkbox: true

            }, {
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

            }]

    });


    $('#tableHerramientas').bootstrapTable({
        idField: 'idBody',
        uniqueId: 'idBody',
        pagination: true,
        search: true,
        dataType: 'json',
        url: 'GetMatrizTeenCareHerramientas?id_header=' + a,
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
                title: 'Agregar',
                field: 'check',
                checkbox: true

            }, {
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

            }]

    });


    $.ajax({
        dataType: "text",
        url: "ObtenerMotores",
        method: "POST",
        beforeSend: function() {

        }

    }).done(function(e) {
        if (e === 'error') {
            alert('Ocurrio un error al cargar catalogo de motores');
        } else {
            jsonMotor = $.parseJSON(e);
            $('#motor').html($("<option></option>"));
            for (var i = 0; i < jsonMotor.length; i++) {
                $('#motor')
                        .append($("<option></option>")
                                .attr("value", jsonMotor[i].key)
                                .text(jsonMotor[i].value));
            }
        }

    }).fail(function(e) {
                $('#headerModal').html('Ocurrio un error al cargar catalogo de motores');
                $('#closeModal').css('display', '');
            });


    $('#tableAdminGarantias').bootstrapTable({
        idField: 'idCurso',
        uniqueId: 'idCurso',
        pagination: true,
        search: true,
        dataType: 'json',
        url: 'GetCursos?id=1&id_header=' + a,
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
                title: 'Agregar',
                field: 'check',
                checkbox: true

            }, {
                field: 'idCurso',
                title: 'Id',
                visible: false
            }, {
                field: 'nombreCurso',
                title: 'Nombre Curso'
            }]

    });

    $('#tableJefeTaller').bootstrapTable({
        idField: 'idCurso',
        uniqueId: 'idCurso',
        pagination: true,
        search: true,
        dataType: 'json',
        url: 'GetCursos?id=2&id_header=' + a,
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
                title: 'Agregar',
                field: 'check',
                checkbox: true

            }, {
                field: 'idCurso',
                title: 'Id',
                visible: false
            }, {
                field: 'nombreCurso',
                title: 'Nombre Curso'
            }]

    });


    $('#tableGerenteServicios').bootstrapTable({
        idField: 'idCurso',
        uniqueId: 'idCurso',
        pagination: true,
        search: true,
        dataType: 'json',
        url: 'GetCursos?id=3&id_header=' + a,
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
                title: 'Agregar',
                field: 'check',
                checkbox: true

            }, {
                field: 'idCurso',
                title: 'Id',
                visible: false
            }, {
                field: 'nombreCurso',
                title: 'Nombre Curso'
            }]

    });



    $('#tableMecanicos').bootstrapTable({
        idField: 'idCurso',
        uniqueId: 'idCurso',
        pagination: true,
        search: true,
        dataType: 'json',
        url: 'GetCursos?id=4&id_header=' + a,
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
                title: 'Agregar',
                field: 'check',
                checkbox: true

            }, {
                field: 'idCurso',
                title: 'Id',
                visible: false
            }, {
                field: 'nombreCurso',
                title: 'Nombre Curso'
            }]

    });


    $("#guardar").click(function() {

        jsonMotores = JSON.stringify($('#tableMatrizInfant').bootstrapTable('getSelections'));
        jsonHerramientas = JSON.stringify($('#tableHerramientas').bootstrapTable('getSelections'));

        jsonAdmin = JSON.stringify($('#tableAdminGarantias').bootstrapTable('getSelections'));
        jsonJefe = JSON.stringify($('#tableJefeTaller').bootstrapTable('getSelections'));
        jsonGerente = JSON.stringify($('#tableGerenteServicios').bootstrapTable('getSelections'));
        jsonMecanico = JSON.stringify($('#tableMecanicos').bootstrapTable('getSelections'));



        //data = '{"motor":' + $('#motor').val() + ', "dataMotores":' + jsonMotores + ', "dataHerramientas":' + jsonHerramientas + ', "dataAdmin":' + jsonAdmin + ', "dataJefe":' + jsonJefe + ', "dataGerente":' + jsonGerente + ', "dataMecanico":' + jsonMecanico + '}';
        data=null;
        data = '{"dataMotores":' + jsonMotores + ', "dataHerramientas":' + jsonHerramientas + ', "dataAdmin":' + jsonAdmin + ', "dataJefe":' + jsonJefe + ', "dataGerente":' + jsonGerente + ', "dataMecanico":' + jsonMecanico + '}';
        
        if(jsonAdmin =="[]" || jsonJefe =="[]" || jsonGerente =="[]" || jsonMecanico =="[]" || jsonMotores =="[]"|| jsonHerramientas =="[]"){
        	alert('Por favor revise que no haya campos vacios o sin seleccionar');        	
        }else {
        	
        	$.ajax({
                dataType: "text",
                url: "SaveEditConfMotor?id_header=" + a,
                method: "POST",
                beforeSend: function() {
                    $('#headerModal').html('Enviando Informacion...');
                    $('#closeModalEliminar').css('display', 'none');
                    $('#closeModal').css('display', 'none');
                    $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
                },
                data: {"data": data}
            }).done(function(e) {
                $('#headerModal').html(e);
                $('#closeModal').css('display', '');


            }).fail(function(e) {
                    $('#headerModal').html('Ocurrio un error al enviar la informacion');
                    $('#closeModal').css('display', '');
            });
             
            window.location.href = "ConfigMotor.jsp";
        	
        }

        
    });

    
});






(function($) {  
    $.get = function(key)   {  
        key = key.replace(/[\[]/, '\\[');  
        key = key.replace(/[\]]/, '\\]');  
        var pattern = "[\\?&]" + key + "=([^&#]*)";  
        var regex = new RegExp(pattern);  
        var url = unescape(window.location.href);  
        var results = regex.exec(url);  
        if (results === null) {  
            return null;  
        } else {  
            return results[1];  
        }  
    }  ;
})(jQuery);  
