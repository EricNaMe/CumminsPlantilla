

$(function() {
    $('#tableMatrizInfantCare').bootstrapTable({
        idField: 'id',
        dataType: 'json',
        url: 'GetMatriz',
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
                formatter:'linkFormatter',
                class: 'TextFormat'
            }]
    });  
    });

function linkFormatter(value,row) {
  return '<a href=TEMPdetallesTeenCare.jsp?id='+row.id+'> Ver detalles</a>';
}

























