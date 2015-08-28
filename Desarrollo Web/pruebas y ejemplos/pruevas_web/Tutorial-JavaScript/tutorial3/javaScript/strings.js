/*
Trabajo con STRINGS
*/

//Acceder a un determindado caracter de un STRINGS
var string = "cache";
var caracter = string[4];
//funciona como el acceso a un arreglo.
document.write("El caracter de la posicion n° 4 es una: " + caracter +"<br>");


//Inclusion de comillas en los strings.
var string = "Hola 'mundo'";
document.write(string + "<br>");

var string2 = "Hola \"MundoEncomillado\"";
document.write(string2 + "<br>");


//Obtener la longitud
var size = string.length;
document.write("la longitud del string "+ string + " es: "+ size +"<br>");


//Encontrar la primer posicion dentro de un string
var frace = "Busca la primer posicion de un string";
var pos = frace.indexOf("primer");//pasamos la palabra a buscar
document.write(pos + "<br>");

//Encontrar una palabra dentro de un String utilizando Match()
var frace = "Buscando en este string";
if (frace.match("este")){
	document.write("Encontrado <br>");
} else {
	document.write("No encontrado <br>");
}

//Reemplazar String
var texto = "Reemplazame";
var reemplazar = texto.replace("Reemplazame", "''Reemplazado''");
document.write(texto + "<br>");

//           /string/g  -> reeemplaza todas las repeticiones
//           /string/i  -> ignora mayus/minusc.
//      /reemplazame/gi -> las 2 cosas

//Convertir de minuscula a mayusculas:
var texto = "minusculas";
document.write(texto.toUpperCase() + "   ");

//Convertir a mayusculas
var texto = "MAYUSCULAS";
document.write(texto.toLowerCase() + "<br>");

//Convertir un string en Array - split()
var numeros = "uno dos tres cuatro cinco";
var array = numeros.split(" "); //utilizamos el espacio como separador

for (var i = 0; i < array.length ; i++) {
	document.write(array[i]+ "<br>");
};

//cortar strings
var substring = numeros.substr(8, 18);
document.write("Cortamos de la pos 8 a la 18: "+substring+ "<br>");

document.write("si cortamos con -5: "+numeros.substr(-5)+ "<br>");
//indexa de derecha a izquierda al utilizar un indice negativo-