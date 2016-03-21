
$(function() {
    $.ajax({
        dataType: "text",
        method: "POST",
        url: 'ObtenerQuejasCaptura',
        beforeSend: function() {
            $('#headerModal').html('Solicitando informacion...');
            $('#closeModal').css('display', 'none');
            $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
        }
    }).done(function(e) {
        json = $.parseJSON(e);
        $('#tableQuejasCaptura').bootstrapTable({
            dataType: 'json',
            emptytext: '-',
            data: json.data,
            idField: 'Folio',
            uniqueId: 'Folio',
            search: true,
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
                    field: 'Folio',
                    title: 'Folio',
                    type: 'text'
                }, {
                    field: 'F_Creacion',
                    title: 'Fecha de Creación',
                    type: 'text'
                }, {
                    field: 'F_Queja',
                    title: 'Fecha de Queja',
                    type: 'text'
                }, {
                    field: 'Cliente',
                    title: 'Cliente',
                    type: 'text'
                }, {
                    field: 'C_Cliente',
                    title: 'Contacto del Cliente',
                    type: 'text'
                }, {
                    field: 'ID_Queja',
                    title: 'Queja',
                    type: 'text'
                }, {
                    field: 'D_Queja',
                    title: 'Descripción de la Queja',
                    type: 'text'
                }, {
                    field: 'S_Queja',
                    title: 'Seguimiento de la Queja',
                    type: 'text'
                }, {
                    field: 'Reporta',
                    title: 'Reporta',
                    type: 'text'
                }, {
                    field: 'Soporte',
                    title: 'Soporte',
                    type: 'text'
                }, {
                    field: 'R_Seguimiento',
                    title: 'Responsable del Seguimiento',
                    type: 'text'
                }, {
                    field: 'C_Responsable',
                    title: 'Correo del Responsable',
                    type: 'text'
                }, {
                    field: 'Estatus',
                    title: 'Estatus de la Queja',
                    type: 'text'
                }, {
                    field: 'F_Cierre',
                    title: 'Fecha de Cierre',
                    type: 'text'
                }, {
                    field: 'Compromiso',
                    title: 'Compromiso con el Dealer',
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

});

function linkFormatterEdit(value, row) {
    return '<a href=javascript:editarRegistro(' + row.Folio + ')>Doc Link</a>';
}

function editarRegistro(id) {
    var form = $('<form action="Matriz.jsp" method="post">' +
            '<input type="hidden" name="id" value="' + id + '" />' +
            '</form>');
    $(form).submit();
    //window.location = "Matriz.jsp?idPartes=" + idMotores;
}

function linkFormatterEliminar(value, row) {
    return '<a href=javascript:eliminarRegistro(' + row.Folio + ')>Eliminar</a>';
}

function eliminarRegistro(id) {
    $('#tableQuejasCaptura').bootstrapTable('removeByUniqueId', id);
    $.ajax({
        dataType: "text",
        url: "EliminarQuejasCaptura?id=" + id,
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
