/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var idDealer = "";
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
                $('#dr').append($("<option></option>")
                        .attr("value", json[i].key)
                        .text(json[i].value));
            }
        }
    }).fail(function(e) {
        $('#headerModal').html('Ocurrio un error al enviar la informacion');
        $('#closeModal').css('display', '');
    });
	
    
    var oem = []; 
    $('#dr').on('change', function() {

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
                    oem[i]=json[i].oem;
                }
            }
        }).fail(function(e) {
            $('#headerModal').html('Ocurrio un error al cargar catalogo de rangos');
            $('#closeModal').css('display', '');
        });
        $('#codigoDR').val(this.value);
        $('#oem').val("");
        $('#codigoDeal').val("");
        
        
    });
	
	
	
	
	
    $('#dealer').on('change', function() {
        $('#tableCheckBoxObl').bootstrapTable('destroy');
        
        
		  
        $.ajax({
            dataType: "text",
            method: "POST",
            url: 'ObtenerMotoresObl?id_deal=' + this.value,
            beforeSend: function() {
                $('#headerModal').html('Solicitando informacion...');
                $('#closeModal').css('display', 'none');
                $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
            }
        }).done(function(e) {
            json = $.parseJSON(e);
            $('#tableCheckBoxObl').bootstrapTable({
                dataType: 'json',
                emptytext: '-',
                data: json.data,
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
                        field: 'ID_MOTORES_OEM',
                        title: 'IDMotoresOEM',
                        visible: false
                    }, {
                        checkbox: true,
                        field: 'check'
                    }, {
                        type: 'text',
                        title: 'Motor',
                        field: 'motor',
                        align: 'center',
                        valign: 'middle'
                    }, {
                        field: 'tipoMotor',
                        title: 'TipoMotor',
                        visible: false
                    }]
            });
            $('#myModal').modal('hide');
        }).fail(function(e) {
            $('#closeModal').css('display', '');
            $('#headerModal').html('Ocurrio un error al cargar los datos');
        });

        $('#tableCheckBoxNoDisp').bootstrapTable('destroy');
        $.ajax({
            dataType: "text",
            method: "POST",
            url: 'ObtenerMotoresOpc?id_deal=' + this.value,
            beforeSend: function() {
                $('#headerModal').html('Solicitando informacion...');
                $('#closeModal').css('display', 'none');
                $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
            }
        }).done(function(e) {
            json = $.parseJSON(e);
            $('#tableCheckBoxNoDisp').bootstrapTable({
                dataType: 'json',
                emptytext: '-',
                data: json.data,
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
                        field: 'ID_MOTORES_OEM',
                        title: 'IDMotoresOEM',
                        visible: false
                    }, {
                        checkbox: true,
                        field: 'check'
                    }, {
                        type: 'text',
                        title: 'Motor',
                        field: 'motor',
                        align: 'center',
                        valign: 'middle'
                    }, {
                        field: 'tipoMotor',
                        title: 'TipoMotor',
                        visible: false
                    }]
            });
            $('#myModal').modal('hide');
        }).fail(function(e) {
            $('#closeModal').css('display', '');
            $('#headerModal').html('Ocurrio un error al cargar los datos');
        });
        
        
        //alert(oem[1]);
        //$('#oem').val('JAJA');
        $('#oem').val(oem[$("#dealer").prop('selectedIndex')-1]);

        $('#tableBody').bootstrapTable('destroy');
        $.ajax({
            dataType: "text",
            method: "POST",
            url: 'PerfilDealer?id_deal=' + this.value,
            beforeSend: function() {
                $('#headerModal').html('Solicitando informacion...');
                $('#closeModal').css('display', 'none');
                $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
            }
        }).done(function(e) {
            json = $.parseJSON(e);
            $('#tableBody').bootstrapTable({
                dataType: 'json',
                emptytext: '-',
                data: json.data,
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
                        field: 'no',
                        title: 'No.',
                        type: 'text',
                        align: 'center',
                        valign: 'middle'
                    }, {
                        field: 'nombre',
                        title: 'Nombre',
                        type: 'text',
                        align: 'center',
                        valign: 'middle'
                    }, {
                        field: 'status',
                        title: 'Estatus',
                        type: 'text',
                        align: 'center',
                        valign: 'middle'
                    }]
            });
            $('#noMecProm').val(json.data.length);
            $('#myModal').modal('hide');
        }).fail(function(e) {
            $('#closeModal').css('display', '');
            $('#headerModal').html('Ocurrio un error al cargar los datos');
        });
        $('#codigoDeal').val(this.value);

        $('#tableBodyChk').bootstrapTable('destroy');
        $.ajax({
            dataType: "text",
            method: "POST",
            url: 'ObtenerNivelServicio?id_deal=' + this.value,
            beforeSend: function() {
                $('#headerModal').html('Solicitando informacion...');
                $('#closeModal').css('display', 'none');
                $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
            }
        }).done(function(e) {
            json = $.parseJSON(e);
            $('#tableBodyChk').bootstrapTable({
                dataType: 'json',
                emptytext: '-',
                data: json.data,
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
                        field: 'ID_MOTORES_OEM',
                        title: 'idMotoresOEM',
                        visible: false
                    }, {
                        checkbox: true,
                        field: 'status'
                    }, {
                        type: 'text',
                        title: 'Motor',
                        field: 'motor',
                        align: 'center',
                        valign: 'middle'
                    }, {
                        type: 'text',
                        title: 'Autorizado',
                        field: 'autorizado',
                        align: 'center',
                        valign: 'middle',
                        class: 'TextFormat',
                        editable: {
                            defaultValue: 'autorizado',
                            emptytext: 'autorizado',
                            emptyclass: 'TextFormat',
                            type: 'select',
                            source: [{value: 'autorizado', text: 'autorizado'}, {value: 'Nautorizado', text: 'No autorizado'}]
                        }
                    }]
            });
            $('#myModal').modal('hide');
        }).fail(function(e) {
            $('#closeModal').css('display', '');
            $('#headerModal').html('Ocurrio un error al cargar los datos');
        });


		//$('#oem').val(oem[$("#dealer").prop('selectedIndex')-1]);
	/*	
        $.ajax({
            dataType: "text",
            url: "ObtenerOEM?id_deal=" + this.value,
            method: "POST",
            beforeSend: function() {
            }
        }).done(function(e) {
            if (e === 'error') {
                alert('Ocurrio un error al cargar catalogo de distribuidores');
            } else {
                json = $.parseJSON(e);
                for (var i = 0; i < json.length; i++) {
                    $('#oem').val(json[i].oem);
                }
            }
        }).fail(function(e) {
            $('#headerModal').html('Ocurrio un error al enviar la informacion');
            $('#closeModal').css('display', '');
        });
        
        */
        
    });

    $('#guardarPerfil').click(function() {
        idDealer = $('#codigoDeal').val();
        //alert(idDealer);
        if (idDealer != '') {
            jsonPerfil = JSON.stringify($('#myform').serializeArray());
            $.ajax({
                data: {data: jsonPerfil},
                dataType: "text",
                url: "GuardarPerfil",
                method: "GET",
                beforeSend: function() {
                    $('#headerModal').html('Agregando registro...');
                    $('#closeModal').css('display', 'none');
                    $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
                }
            }).done(function(e) {
                $('#headerModal').html(e);
                $('#closeModalEliminar').css('display', '');
            }).fail(function(e) {
                $('#closeModal').css('display', '');
                $('#headerModal').html('Ocurrio un error al guardar los datos');
            });

            jsonPerfil = JSON.stringify($('#tableCheckBoxObl').bootstrapTable('getAllSelections'));
            $.ajax({
                data: {data: jsonPerfil},
                dataType: "text",
                url: "GuardarMotoresPerfil?id_deal=" + idDealer,
                method: "GET",
                beforeSend: function() {
                    $('#headerModal').html('Agregando registro...');
                    $('#closeModal').css('display', 'none');
                    $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
                }
            }).done(function(e) {
                $('#headerModal').html(e);
                $('#closeModalEliminar').css('display', '');
            }).fail(function(e) {
                $('#closeModal').css('display', '');
                $('#headerModal').html('Ocurrio un error al guardar los datos');
            });

            jsonPerfil = JSON.stringify($('#tableCheckBoxNoDisp').bootstrapTable('getAllSelections'));
            $.ajax({
                data: {data: jsonPerfil},
                dataType: "text",
                url: "GuardarMotoresPerfilOpc?id_deal=" + idDealer,
                method: "GET",
                beforeSend: function() {
                    $('#headerModal').html('Agregando registro...');
                    $('#closeModal').css('display', 'none');
                    $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
                }
            }).done(function(e) {
                $('#headerModal').html(e);
                $('#closeModalEliminar').css('display', '');
            }).fail(function(e) {
                $('#closeModal').css('display', '');
                $('#headerModal').html('Ocurrio un error al guardar los datos');
            });
            $('#tableBodyChk').bootstrapTable('refresh');
            $('#tableBodyChk').bootstrapTable('refresh');
        } else {
            alert('Selecciona un OEM para poder guardar.');
        }
    });
});


