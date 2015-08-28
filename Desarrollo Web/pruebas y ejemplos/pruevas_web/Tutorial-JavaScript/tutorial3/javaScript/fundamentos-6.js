//FUNCIONES


mensaje = function(){
	return "Hola, soy una funcion";
}

document.write(mensaje() + "<br>");

//parametros: 
imprimir = function(tex){
	return tex + "<br>";
}

var texto = "usando la funcion imprimir";
document.write(imprimir(texto));


//otra forma de declarar funciones
function otro_mensaje(){
	var string = "Hola, Soy otra funcion <br>";
	return string;
}

document.write(otro_mensaje());

//con parametros:
function suma(n1, n2){
	var sumar = n1 + n2;
	return sumar;
}

document.write(suma(12, 12)+ "<br>");


//PARAMETROS OPCIONALES
//funciones con parametros faltantes:
function multiplicar(num, opcional){

	if (opcional == undefined){
		opcional = 2;
	}
	return num * opcional;
}

document.write(multiplicar (2, 3) + "<br>");

document.write(multiplicar (2) + "<br>");


//funciones que no retornan nada.

function imprimite(texto){
	document.write(texto + "<br>");
}

imprimite("Soy una Funcion que se cree Procedimiento :P ");

//

function imprime_array(array){

	var elementos = '';
	for (var i = 0 ; i < array.length ; i++) {
		elementos += array[i] + "<br>";
	}
	return elementos;
}

document.write(imprime_array(["Uno", "Dos", "Tres"]));