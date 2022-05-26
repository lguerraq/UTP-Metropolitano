let velocidad = 0;
let distancia = 0;
let tiempo = 0;
let longitud1 = 0;
let longitud2 = 0;
let hora = 0;
let minutos = 0;
let textoHora = '';
window.onload = function () {
    cargarRutasInicialesA();
}
function cargarRutasInicialesA() {
    let cbParadaOrigen = document.getElementById('cbParadaOrigen')
    let cbParadaDestino = document.getElementById('cbParadaDestino')
    let contenido = "";
    contenido += "<option value=''>--ELEGIR--</option> ";
    contenido += "<option value='0'>Naranjal</option>"
    contenido += "<option value='800'>Izaguirre</option>"
    contenido += "<option value='1500'>Pacifico</option>"
    contenido += "<option value='2300'>Independencia</option>"
    contenido += "<option value='3000'>Los Jazmines</option>"
    contenido += "<option value='3800'>Tomas Valle</option>"
    contenido += "<option value='4500'>El Milagro</option>"
    contenido += "<option value='5200'>Honorio Delgado</option>"
    contenido += "<option value='6000'>UNI</option>"
    contenido += "<option value='6700'>Parque del Trabajo</option>"
    contenido += "<option value='7400'>Caqueta</option>"
    contenido += "<option value='9200'>Ramon Castilla</option>"
    contenido += "<option value='10000'>Tacna</option>"
    contenido += "<option value='10800'>Jirón de la Unión</option>"
    contenido += "<option value='11500'>Colmena</option>"
    contenido += "<option value='14400'>Estación Central</option>"
    cbParadaOrigen.innerHTML = contenido;
    cbParadaDestino.innerHTML = contenido;
    velocidad = 40;
}
function obternerVelocidad(ruta) {
    if (ruta === 'A')
        return 40;
    if (ruta === 'B')
        return 40;
    if (ruta === 'C')
        return 30;
    if (ruta === 'D')
        return 20;
    if (ruta === '1')
        return 50;
    if (ruta === '2')
        return 50;
    if (ruta === '3')
        return 50;
    if (ruta === '4')
        return 50;
    if (ruta === '5')
        return 50;
    if (ruta === '6')
        return 50;
    if (ruta === '7')
        return 50;
    if (ruta === '8')
        return 50;
    if (ruta === '9')
        return 50;
    if (ruta === 'superExpreso')
        return 60;
}

function calcularRuta() {
    let paradaOrigen = document.getElementById("cbParadaOrigen").value;
    let paradaDestino = document.getElementById("cbParadaDestino").value;
    if (paradaOrigen != '' && paradaDestino != '') {
        //---Obtener velocidad
        let cbRuta = document.getElementById("ruta").value;
        velocidad = obternerVelocidad(cbRuta);
        //---Obtener longitud de paraderos
        //let paradaOrigen = document.getElementById("cbParadaOrigen").value;
        longitud1 = parseInt(paradaOrigen);
        //--distancia final
        //let paradaDestino = document.getElementById("cbParadaDestino").value;
        longitud2 = parseInt(paradaDestino);
        //--longitud de paraderos
        distanciaTemp = longitud1 - longitud2;
        distancia = Math.abs(distanciaTemp);
        distancia = distancia / 1000;
        //---Calcular el tiempo
        tiempo = distancia / velocidad;
        tiempo = parseFloat(tiempo).toFixed(2);
        let tiempoString = tiempo.toString().split('.');
        hora = tiempoString[0];
        minutos = (parseInt(tiempoString[1]) / 100) * 60;
        minutos = minutos.toFixed(2);
        //--validar texto hora
        if (hora == '0')
            textoHora = ' horas';
        else {
            textoHora = ' hora';
        }

        //---Imprimir velocidad, tiempo y distancia
        let velocidadImprimir = document.getElementById("velocidad");
        velocidadImprimir.value = velocidad + ' Km/h';
        let tiempoImprimir = document.getElementById("tiempo");
        tiempoImprimir.value = hora + textoHora + '\n' + minutos + ' minutos';
        let distanciaImprimir = document.getElementById("distancia");
        distanciaImprimir.value = distancia + ' Km';
    } else {
        if (paradaOrigen === '' && paradaDestino === '')
            alert('Debe Seleccionar Parada Origen y Parada Destino');
        else
            if (paradaOrigen === '')
                alert('Debe Seleccionar Parada Origen');
            else
                alert('Debe Seleccionar Parada Destino');

    }
}
function cambiarRuta() {
    let ruta = document.getElementById('ruta').value;
    let cbParadaOrigen = document.getElementById('cbParadaOrigen')
    let cbParadaDestino = document.getElementById('cbParadaDestino')
    if (ruta === 'A') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option> ";
        contenido += "<option value='0'>Naranjal</option>"
        contenido += "<option value='800'>Izaguirre</option>"
        contenido += "<option value='1500'>Pacifico</option>"
        contenido += "<option value='2300'>Independencia</option>"
        contenido += "<option value='3000'>Los Jazmines</option>"
        contenido += "<option value='3800'>Tomas Valle</option>"
        contenido += "<option value='4500'>El Milagro</option>"
        contenido += "<option value='5200'>Honorio Delgado</option>"
        contenido += "<option value='6000'>UNI</option>"
        contenido += "<option value='6700'>Parque del Trabajo</option>"
        contenido += "<option value='7400'>Caqueta</option>"
        contenido += "<option value='9200'>Ramon Castilla</option>"
        contenido += "<option value='10000'>Tacna</option>"
        contenido += "<option value='10800'>Jirón de la Unión</option>"
        contenido += "<option value='11500'>Colmena</option>"
        contenido += "<option value='14400'>Estación Central</option>"
        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;
    }
    if (ruta === 'B') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option> "
        contenido += "<option value='0'>Naranjal</option>"
        contenido += "<option value='800'>Izaguirre</option>"
        contenido += "<option value='1500'>Pacifico</option>"
        contenido += "<option value='2300'>Independencia</option>"
        contenido += "<option value='3000'>Los Jazmines</option>"
        contenido += "<option value='3800'>Tomas Valle</option>"
        contenido += "<option value='4500'>El Milagro</option>"
        contenido += "<option value='5200'>Honorio Delgado</option>"
        contenido += "<option value='6000'>UNI</option>"
        contenido += "<option value='6700'>Parque del Trabajo</option>"
        contenido += "<option value='7400'>Caqueta</option>"
        contenido += "<option value='12200'> Dos de Mayo</option>"
        contenido += "<option value='12900'>Quilca</option>"
        contenido += "<option value='13700'>España</option>"
        contenido += "<option value='14400'>Estación Central</option>"
        contenido += "<option value='15200'>Estadio Nacional</option>"
        contenido += "<option value='16000'>Mexico</option>"
        contenido += "<option value='16700'>Canada</option>"
        contenido += "<option value='17400'>Javier Prado</option>"
        contenido += "<option value='18200'>Canaval y Moreyra</option>"
        contenido += "<option value='19000'>Aramburu</option>"
        contenido += "<option value='19700'>Domingo Orue</option>"
        contenido += "<option value='20400'>Angamos</option>"
        contenido += "<option value='21200'>Ricardo Palma</option>"
        contenido += "<option value='22000'>Benavides</option>"
        contenido += "<option value='22700'>28 de Julio</option>"
        contenido += "<option value='23400'>Plaza de Flores</option>"
        contenido += "<option value='24200'>Balta</option>"
        contenido += "<option value='25000'>Bulevar</option>"
        contenido += "<option value='25800'>Estadio Unión</option>"
        contenido += "<option value='26600'>Escuela Militar</option>"
        contenido += "<option value='27300'>Teran</option>"
        contenido += "<option value='30000'>Rosario de Villa</option>"
        contenido += "<option value='30800'>Matellini</option>"
        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;
    }
    if (ruta === 'C') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option> "
        contenido += "<option value='9200'>Ramon Castilla</option>"
        contenido += "<option value='10000'>Tacna</option>"
        contenido += "<option value='10800'>Jirón de la Unión</option>"
        contenido += "<option value='11500'>Colmena</option>"
        contenido += "<option value='14400'>Estación Central</option>"
        contenido += "<option value='16000'>Mexico</option>"
        contenido += "<option value='16700'>Canada</option>"
        contenido += "<option value='17400'>Javier Prado</option>"
        contenido += "<option value='18200'>Canaval y Moreyra</option>"
        contenido += "<option value='19000'>Aramburu</option>"
        contenido += "<option value='19700'>Domingo Orue</option>"
        contenido += "<option value='20400'>Angamos</option>"
        contenido += "<option value='21200'>Ricardo Palma</option>"
        contenido += "<option value='22000'>Benavides</option>"
        contenido += "<option value='22700'>28 de Julio</option>"
        contenido += "<option value='23400'>Plaza de Flores</option>"
        contenido += "<option value='24200'>Balta</option>"
        contenido += "<option value='25000'>Bulevar</option>"
        contenido += "<option value='25800'>Estadio Unión</option>"
        contenido += "<option value='26600'>Escuela Militar</option>"
        contenido += "<option value='27300'>Teran</option>"
        contenido += "<option value='30000'>Rosario de Villa</option>"
        contenido += "<option value='30800'>Matellini</option>"
        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;
    }
    if (ruta === 'D') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option> "
        contenido += "<option value='0'>Naranjal</option>"
        contenido += "<option value='800'>Izaguirre</option>"
        contenido += "<option value='1500'>Pacifico</option>"
        contenido += "<option value='2300'>Independencia</option>"
        contenido += "<option value='3000'>Los Jazmines</option>"
        contenido += "<option value='3800'>Tomas Valle</option>"
        contenido += "<option value='4500'>El Milagro</option>"
        contenido += "<option value='5200'>Honorio Delgado</option>"
        contenido += "<option value='6000'>UNI</option>"
        contenido += "<option value='6700'>Parque del Trabajo</option>"
        contenido += "<option value='7400'>Caqueta</option>"
        contenido += "<option value='12200'> Dos de Mayo</option>"
        contenido += "<option value='12900'>Quilca</option>"
        contenido += "<option value='13700'>España</option>"
        contenido += "<option value='14400'>Estación Central</option>"
        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;
    }
    if (ruta === '1') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option> "
        contenido += "<option value='14400'>Estación Central</option>"
        contenido += "<option value='15200'>Estadio Nacional</option>"
        contenido += "<option value='17400'>Javier Prado</option>"
        contenido += "<option value='18200'>Canaval y Moreyra</option>"
        contenido += "<option value='20400'>Angamos</option>"
        contenido += "<option value='22700'>28 de Julio</option>"
        contenido += "<option value='24200'>Balta</option>"
        contenido += "<option value='25000'>Bulevar</option>"
        contenido += "<option value='25800'>Estadio Unión</option>"
        contenido += "<option value='26600'>Escuela Militar</option>"
        contenido += "<option value='27300'>Teran</option>"
        contenido += "<option value='30000'>Rosario de Villa</option>"
        contenido += "<option value='30800'>Matellini</option>"
    }
    if (ruta === '2') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option> "
        contenido += "<option value='0'>Naranjal</option>"
        contenido += "<option value='16700'>Canada</option>"
        contenido += "<option value='17400'>Javier Prado</option>"
        contenido += "<option value='21200'>Ricardo Palma</option>"
        contenido += "<option value='22700'>28 de Julio</option>"
        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;
    }
    if (ruta === '3') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option> "
        contenido += "<option value='0'>Naranjal</option>"
        contenido += "<option value='20400'>Angamos</option>"
        contenido += "<option value='22000'>Benavides</option>"
        contenido += "<option value='22700'>28 de Julio</option>"
        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;
    }
    if (ruta === '4') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option> "
        contenido += "<option value='0'>Naranjal</option>"
        contenido += "<option value='800'>Izaguirre</option>"
        contenido += "<option value='3800'>Tomas Valle</option>"
        contenido += "<option value='6000'>UNI</option>"
        contenido += "<option value='7400'>Caqueta</option>"
        contenido += "<option value='12200'> Dos de Mayo</option>"
        contenido += "<option value='13700'>España</option>"
        contenido += "<option value='14400'>Estación Central</option>"
        contenido += "<option value='17400'>Javier Prado</option>"
        contenido += "<option value='18200'>Canaval y Moreyra</option>"
        contenido += "<option value='20400'>Angamos</option>"
        contenido += "<option value='23400'>Plaza de Flores</option>"

        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;

    }
    if (ruta === '5') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option> "
        contenido += "<option value='0'>Naranjal</option>"
        contenido += "<option value='1500'>Pacifico</option>"
        contenido += "<option value='3800'>Tomas Valle</option>"
        contenido += "<option value='6000'>UNI</option>"
        contenido += "<option value='13700'>España</option>"
        contenido += "<option value='14400'>Estación Central</option>"
        contenido += "<option value='16700'>Canada</option>"
        contenido += "<option value='17400'>Javier Prado</option>"
        contenido += "<option value='18200'>Canaval y Moreyra</option>"
        contenido += "<option value='20400'>Angamos</option>"
        contenido += "<option value='21200'>Ricardo Palma</option>"
        contenido += "<option value='23400'>Plaza de Flores</option>"
        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;

    }
    if (ruta === '6') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option>"
        contenido += "<option value='800'>Izaguirre</option>"
        contenido += "<option value='14400'>Estación Central</option>"
        contenido += "<option value='17400'>Javier Prado</option>"
        contenido += "<option value='18200'>Canaval y Moreyra</option>"
        contenido += "<option value='20400'>Angamos</option>"
        contenido += "<option value='22000'>Benavides</option>"
        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;

    }
    if (ruta === '7') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option>"
        contenido += "<option value='3800'>Tomas Valle</option>"
        contenido += "<option value='14400'>Estación Central</option>"
        contenido += "<option value='17400'>Javier Prado</option>"
        contenido += "<option value='18200'>Canaval y Moreyra</option>"
        contenido += "<option value='20400'>Angamos</option>"

        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;
    }
    if (ruta === '8') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option>"
        contenido += "<option value='800'>Izaguirre</option>"
        contenido += "<option value='2300'>Independencia</option>"
        contenido += "<option value='3800'>Tomas Valle</option>"
        contenido += "<option value='6000'>UNI</option>"
        contenido += "<option value='7400'>Caqueta</option>"
        contenido += "<option value='13700'>España</option>"
        contenido += "<option value='14400'>Estación Central</option>"
        contenido += "<option value='17400'>Javier Prado</option>"
        contenido += "<option value='18200'>Canaval y Moreyra</option>"
        contenido += "<option value='20400'>Angamos</option>"
        contenido += "<option value='22000'>Benavides</option>"
        contenido += "<option value='23400'>Plaza de Flores</option>"
        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;

    }
    if (ruta === '9') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option>"
        contenido += "<option value='6000'>UNI</option>"
        contenido += "<option value='7400'>Caqueta</option>"
        contenido += "<option value='16700'>Canada</option>"
        contenido += "<option value='18200'>Canaval y Moreyra</option>"
        contenido += "<option value='20400'>Angamos</option>"
        contenido += "<option value='22000'>Benavides</option>"
        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;

    }
    if (ruta === 'superExpreso') {
        let contenido = "";
        contenido += "<option value=''>--ELEGIR--</option>"
        contenido += "<option value='0'>Naranjal</option>"
        contenido += "<option value='18200'>Canaval y Moreyra</option>"
        contenido += "<option value='19000'>Aramburu</option>"
        contenido += "<option value='21200'>Ricardo Palma</option>"
        cbParadaOrigen.innerHTML = contenido;
        cbParadaDestino.innerHTML = contenido;
    }
}

function limpiar() {

    document.getElementById("ruta").value = "A";
    document.getElementById("cbParadaOrigen").value = "";
    document.getElementById("cbParadaDestino").value = "";
    document.getElementById("velocidad").value = "";
    document.getElementById("tiempo").value = "";
    document.getElementById("distancia").value = "";
    cargarRutasInicialesA();
}