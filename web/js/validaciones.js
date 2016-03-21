/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validateNumber(value, req) {

    if (req === true) {
        if (validateEmpty(value) !== '')
            return 'Este campo es requerido';
    }


    if (isNaN(value)) {
        return 'Este campo debe ser numerico';
    }
    return '';
}


function validateEmpty(value) {
    value = $.trim(value);
    if (!value) {
        return 'Este campo es requerido';
    }
    return '';
}


