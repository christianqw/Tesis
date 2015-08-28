/*
El objeto Math
*/
//Propiedad para obtener el número PI

const pi = Math.PI;
//generacion de la constante PI
document.write("El valor del num Pi: " +  pi + "<br>");

//Obtener la raiz cuadrada de un número
var raiz_cuadrada = Math.sqrt(4);
document.write("El valor calculado es: " + raiz_cuadrada + "<br>");

//Redondear un número en base a su parte decimal
var num_real = Math.round(3.66);
//redondea los numero mayores a 0.5 con el techo y
//menores a 0.5 como piso.

//Quitar la parte decimal de un número.
var num_real = Math.floor(4.15);
//Toma el piso del número real.


//Recortar la cantidad de numeros decimales.
var decimal = 6.138230213902390234;
document.write(decimal.toFixed(2) + "<br>");


//Obtener un número aleatorio
var aleatorio = Math.floor(Math.random()*10)+1;
document.write("Numero aleatorio: "+ aleatorio+ "<br>");

//Convertir un numero decimal a integer.
var decimal = 4.15;
var integer = parseInt(decimal);
document.write("4.15 convertido a integer es : " + integer +"<br>");

document.write("suma normal "+ (decimal+decimal)+ "<br>");
document.write("suma casteado real "+ parseFloat(decimal + decimal) + "<br>");

/*
Prioridad de las operaciones matematicas:
En este leguaje las operaciones matematicas tienen la
asociatividad y prioridade de operaciones natural.
*/