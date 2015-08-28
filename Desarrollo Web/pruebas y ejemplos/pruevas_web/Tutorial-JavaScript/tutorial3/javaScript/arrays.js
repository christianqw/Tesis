/*
Funciones y manejo de los Arreglos.
*/

//length: la cantidad de elementos que posee el arreglo.

var numeros = ["uno", "dos", "tres", "cuatro", "cincio"];
var size = numeros.length;
document.write("El arreglo 'numeros'  posee " + size + "elementos <br>");

//indexOf(string): la posicion en la que se encuentra el string dentro del arreglo.
var buscado = "tres";

document.write("Encontrado en la pos: " +numeros.indexOf(buscado)+ "<br>");

document.write("Buscando algo que no está retorna: " +numeros.indexOf("patito")+ "<br>");

//join: une todos los elementos de un arreglo en un string.
// utilizando como separador el string definido.

var unidos = numeros.join("-");
document.write(unidos + "<br>");

//pop: eliminar el ultimo elemento de un arreglo.

var eliminado = numeros.pop();

document.write("En 'numeros' quedaron " +numeros.length+ " elementos <br>");
document.write("Se elimino el string " + eliminado + " del arreglo 'numeros' <br>");

//push: se agrega un nuevo elemento al final del arreglo.
numeros.push("ocho");
document.write("Mostramos el ultimo elemento: " + numeros[numeros.length-1] + " <br>");

//shift: elimina el primer elemento.
var eliminado = numeros.shift();
document.write("Eliminado el primero --> " +eliminado+ " <br>");

//unshift: agrega un nuevo elemento al principio del arreglo.
document.write("Primer elemento --> " +numeros[0]+ " <br>");
numeros.unshift("cero");
document.write("Nuevo primer elemento --> " +numeros[0]+ " <br>");

//sort: Ordenar elementos
var lista = new Array ("ximena", "matias", "lucas", "ana");
lista.sort();

for (var i = 0; i <lista.length ; i++) {
	document.write("--> " +lista[i]+ " <br>");
};

//Ordenar numeros
var int_numeros = [9, 3, 2, 6, 8 ,7 ];
int_numeros.sort(function (a, b){return a-b});

for (var i = 0; i <int_numeros.length ; i++) {
	document.write("->" +int_numeros[i]+ " <br>");
};

//toString: convertir un arreglo en un string, separando cada elemento con una coma (,)
var string_convertido = numeros.toString();
document.write(" Arreglo nuemros, convertido en un string:  " +string_convertido+ " <br>");

//reverse:  invierto la posicion de los elementos del arreglo.

var array_invertido = numeros.reverse();

for (var i = 0; i <array_invertido.length ; i++) {
	document.write("##" +array_invertido[i]+ " <br>");
};