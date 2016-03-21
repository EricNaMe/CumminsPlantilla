/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var count;

$(document).ready(function() {


    $('#TableCalenEval').bootstrapTable({
        idField: 'idBody',
        uniqueId: 'idBody',
        pagination: true,
        search: true,
        dataType: 'json',
        //----------------------------
        showExport: true,
        exportTypes:['excel', 'pdf'],
        exportDataType:'all',
        exportOptions: {
            fileName: 'Motores'
        },
        //----------------------------
        url: 'ServletEvaluaciones',
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
                field: 'idBody',
                title: 'idBody',
                visible: false
            }, {
                field: 'numEval',
                title: 'Num. Eval.',
                class: 'TextFormat',
                editable: {
                    url: 'UpdateEval',
                    defaultValue: '-',
                    emptytext: '-',
                    type: 'select',
                    class: 'TextFormat',
                    source: [{value: 1, text: '1'}, {value: 2, text: '2'}]
                    //source: 'SelectNumEval'
                }
            }, {
                field: 'tipoEval',
                title: 'Tipo Eval.',
                class: 'TextFormat',
                editable: {
                    url: 'UpdateEval',
                    defaultValue: '-',
                    emptytext: '-',
                    type: 'select',
                    class: 'TextFormat',
                    source: [{value: 1, text: 'EVALUACION'}, {value: 2, text: 'PRE EVALUACION'}]
                }
            }, {
                field: 'anioEval',
                title: 'Año Eval.',
                class: 'TextFormat',
                editable: {
                    url: 'UpdateEval',
                    type: 'select',
                    class: 'TextFormat',
                    source: [
                        {value: '2014', text: '2014'}, 
                        {value: '2015', text: '2015'},
                        {value: '2016', text: '2016'},
                        {value: '2017', text: '2017'},
                        {value: '2018', text: '2018'}
                       
                    ]


                }
            }, {
                field: 'fecIniEval',
                title: 'Fecha Inicio',
                class: 'TextFormat',
                editable: {
                    url: 'UpdateEval',
                    value: 'fecIniEval',
                    type: 'date',
                    class: 'TextFormat',
                    format: 'dd/mm/yyyy',
                    viewformat: 'dd/mm/yyyy',
                    datepicker: {
                        weekStart: 1
                    }

                }
            }, {
                field: 'fecFinEval',
                title: 'Fecha Fin',
                class: 'TextFormat',
                editable: {
                    url: 'UpdateEval',
                    class: 'TextFormat',
                    value: 'fecFinEval',
                    type: 'date',
                    class: 'TextFormat',
                    format: 'dd/mm/yyyy',
                    viewformat: 'dd/mm/yyyy',
                    datepicker: {
                        weekStart: 1
                    }

                }

            }, {
                field: 'estatus',
                title: 'Estatus',
                class: 'TextFormat',
                editable: {
                    url: 'UpdateEval',
                    class: 'TextFormat',
                    defaultValue: '-',
                    emptytext: '-',
                    class: 'TextFormat',
                    type: 'select',
                    source: [{value: 'Y', text: 'ACTIVO'}, {value: 'N', text: 'INACTIVO'}]
                }

            }]

    });
    count = $('#tableBody').bootstrapTable('getData').length;

    $("#Guardar").click(function() {
        if (
                $('#fecFinEval').val() !== '' &&
                $('#anioEval').val() !== null &&
                $('#fecIniEval').val() !== '' &&
                $('input:radio:checked').length > 2
                ) {
            jsonHeader = $('#formCalenEval').serializeJSON();
            $.ajax({
                dataType: "text",
                url: "GuardarEvaluaciones",
                method: "POST",
                beforeSend: function() {
                    $('#headerModal').html('Enviando Informacion...');
                    $('#closeModal').css('display', 'none');
                    $('#myModal').modal({keyboard: false, backdrop: 'static'}, 'show');
                },
                data: {"data": jsonHeader}
            }).done(function(e) {
                $('#headerModal').html(e);
                $('#closeModal').css('display', '');
                $('#formCalenEval')[0].reset();
                $('#TableCalenEval').bootstrapTable('refresh');
            })
                    .fail(function(e) {
                        $('#headerModal').html('Ocurrio un error al enviar la informacion');
                        $('#closeModal').css('display', '');
                    });
        } else {

            alert('Llene todos los campos');
        }


    });


    $('#fecIniEval').datepicker({
        format: "dd/mm/yyyy",
        language: 'es',
        autoclose: true
    });

    $('#fecFinEval').datepicker({
        format: "dd/mm/yyyy",
        language: 'es',
        autoclose: true
    });





});



