
$(function() {
    $.ajax({
        dataType: "text",
        method: "POST",
        url: 'ObtenerQuejasCatalogo',
        beforeSend: function() {
            $('#headerModal').html('Solicitando informacion...');
            $('#closeModal').css('display', 'none');
            $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
        }
    }).done(function(e) {
        json = $.parseJSON(e);
        $('#tableQuejasCatalogo').bootstrapTable({
            dataType: 'json',
            emptytext: '-',
            data: json.data,
            idField: 'ID_Queja',
            uniqueId: 'ID_Queja',
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
                    field: 'ID_Queja',
                    title: '#',
                    type: 'text'
                }, {
                    field: 'Queja',
                    title: 'Queja',
                    type: 'text'
                }, {
                    field: 'Ponderacion',
                    title: 'Ponderación',
                    type: 'text'
                }, {
                    field: 'editar',
                    title: 'Editar/Consultar',
                    formatter: 'linkFormatterEdit',
                    align: 'center',
                    valign: 'middle'
                }, {
                    field: 'eliminar',
                    title: 'Eliminar',
                    formatter: 'linkFormatterEliminar',
                    align: 'center',
                    valign: 'middle'
                }]
        });
        $('#myModal').modal('hide');
    }).fail(function(e) {
        $('#closeModal').css('display', '');
        $('#headerModal').html('Ocurrio un error al cargar los datos');
    });

    $('#enviar').click(function() {
        $.ajax({
            dataType: "text",
            url: "GuardarQuejaCatalogo?queja=" + $('#queja').val(),
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
        $('#tableQuejasCatalogo').bootstrapTable('refresh');
        $('#tableQuejasCatalogo').bootstrapTable('refresh');
    });

});

function linkFormatterEdit(value, row) {
    return '<a href=javascript:editarRegistro(' + row.ID_Queja + ')>Doc Link</a>';
}

function editarRegistro(id) {
    var form = $('<form action="Matriz.jsp" method="post">' +
            '<input type="hidden" name="id" value="' + id + '" />' +
            '</form>');
    $(form).submit();
    //window.location = "Matriz.jsp?idPartes=" + idMotores;
}

function linkFormatterEliminar(value, row) {
    return '<a href=javascript:eliminarRegistro(' + row.ID_Queja + ')>Eliminar</a>';
}

function eliminarRegistro(id) {
    $('#tableQuejasCatalogo').bootstrapTable('removeByUniqueId', id);
    $.ajax({
        dataType: "text",
        url: "EliminarQuejasCatalogo?id=" + id,
        method: "GET",
        beforeSend: function() {
            $('#headerModal').html('Eliminando registro...');
            $('#closeModal').css('display', 'none');
            $('#closeModalEliminar').css('display', 'none');
            $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
        }
    }).done(function(e) {
        $('#headerModal').html(e);
        $('#closeModalEliminar').css('display', '');
    }).fail(function(e) {
        $('#headerModal').html('Ocurrio un error al eliminar el registro');
        $('#closeModalEliminar').css('display', '');

    });
}
