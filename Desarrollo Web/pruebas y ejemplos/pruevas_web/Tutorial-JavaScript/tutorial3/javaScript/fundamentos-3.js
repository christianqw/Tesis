/*
ARRAYS
son vectores con el comportamiento ya conocido.
Comienzan en 0
Los elementos tienen que ser todos del mismo tipo.
*/

//Declaramos un arreglo.
var nombres = new Array ("Luis", "Cris", "Nacha", "Fer");

document.write(nombres[2] + "<br>");

//Otra forma de generarlo :
var apodos = ["Mante", "Tia", "Nacha", "Fer"]
document.write(nombres[0] + "<br>");

/*
ARRAYS ASOCIATIVOS
SON ARREGLOS A LOS QUE SE LES PUEDE ASIGNAR UNA CLAVE STRING
PARA ACCEDER A DICHOS ELEMENTOS.
*/

var monedas = new Array();

monedas["España"]  = "Euro";
monedas["EEUU"] = "Dolar";
monedas["Argentina"] = "Pesos";

document.write("la moneda Argentina es " + monedas["Argentina"] + "<br>" );
//otra forma de acceder al Arreglo:
document.write("la moneda de EEUU es " + monedas.EEUU + "<br>" );

/*
ARRAYS MULTIDIMENSIONALES
Los elementos son arreglos.
*/

var usuarios = [["Cristian", 26], ["Luisina", 24], ["Luciano", 16]];

document.write("Nombre: " + usuarios[1][0] + "    Edad: " + usuarios[1][1]);