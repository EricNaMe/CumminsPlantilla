/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function() {
    $('#atras').hide(true);
    $('#consultar').hide(true);
    $('#tableBody').hide(true);
    $('#dealer').on('change', function() {
        $('#atras').hide(true);
        $('#tableBody').bootstrapTable('destroy');
        $.ajax({
            dataType: "text",
            method: "POST",
            url: 'MatrizHerramientas?id_deal=' + this.value,
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
                pagination: true,
                maintainSelected: true,
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
                        checkbox: true,
                        field: 'status'
                    }, {
                        field: 'motorId',
                        title: 'Motor ID',
                        type: 'text',
                        align: 'center',
                        valign: 'middle'
                    }, {
                        field: 'matriz',
                        title: 'Matriz',
                        type: 'text',
                        align: 'center',
                        valign: 'middle'
                    }]
            });
            $('#myModal').modal('hide');
        }).fail(function(e) {
            $('#closeModal').css('display', '');
            $('#headerModal').html('Ocurrio un error al cargar los datos');
        });
        $('#codigoDeal').val(this.value);
        $('#consultar').show(true);
        $('#tableBody').show(true);
    });

    $('#consultar').click(function() {
        jsonMatriz = JSON.stringify($('#tableBody').bootstrapTable('getAllSelections'));
        //if (jsonMatriz != "[]") {+
            $('#consultar').hide(true);
            $('#tableBody').bootstrapTable('destroy');
            $.ajax({
                data: {data: jsonMatriz},
                dataType: "text",
                method: "POST",
                url: 'MatrizHerramientas?id_matriz=1',
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
                    idField: 'idInfantBdy',
                    uniqueId: 'idInfantBdy',
                    pagination: true,
                    maintainSelected: true,
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
                            field: 'idInfantBdy',
                            title: 'Id Infant Body',
                            visible: false
                        }, {
                            field: 'producto',
                            title: 'Producto',
                            type: 'text',
                            align: 'center',
                            valign: 'middle'
                        }, {
                            field: 'noParte',
                            title: 'No. Parte',
                            type: 'text',
                            align: 'center',
                            valign: 'middle'
                        }, {
                            field: 'noParteAnt',
                            title: 'No. Parte Ant',
                            type: 'text',
                            align: 'center',
                            valign: 'middle'
                        }, {
                            field: 'descripcion',
                            title: 'Descripcion',
                            type: 'text',
                            align: 'center',
                            valign: 'middle'
                        }, {
                            field: 'comentariosNP',
                            title: 'Comentarios del N/P',
                            type: 'text',
                            align: 'center',
                            valign: 'middle'
                        }, {
                            field: 'cantidadMin',
                            title: 'Cantidad Minima',
                            type: 'text',
                            align: 'center',
                            valign: 'middle'
                        }, {
                            field: 'existencia',
                            title: 'Existencia',
                            align: 'center',
                            valign: 'middle',
                            editable: {
                                defaultValue: '-',
                                emptytext: '-',
                                url: 'GuardarMatrizAgrupada',
                                type: 'text'
                            }
                        }, {
                            field: 'ponderacion',
                            title: 'Ponderacion',
                            type: 'text',
                            align: 'center',
                            valign: 'middle'
                        }, {
                            field: 'ubicacion',
                            title: 'Ubicacion',
                            type: 'text',
                            align: 'center',
                            valign: 'middle'
                        }, {
                            field: 'volumenVentas',
                            title: 'Volumen de Ventas',
                            type: 'text',
                            align: 'center',
                            valign: 'middle'
                        }, {
                            field: 'url',
                            title: 'URL',
                            type: 'text',
                            align: 'center',
                            valign: 'middle'
                        }]
                });
                $('#myModal').modal('hide');
            }).fail(function(e) {
                $('#closeModal').css('display', '');
                $('#headerModal').html('Ocurrio un error al cargar los datos');
            });
            $('#atras').show(true);
            $('#tableBody').show(true);
        //} else {
        //    alert("Seleccione al menos una Matriz");
        //}+
    });

    $('#atras').click(function() {
        $('#tableBody').bootstrapTable('removeAll');
        $('#atras').hide(true);
        $('#tableBody').hide(true);
        $('#codigoDeal').val("");
        $('#dealer').val("");
    });
});