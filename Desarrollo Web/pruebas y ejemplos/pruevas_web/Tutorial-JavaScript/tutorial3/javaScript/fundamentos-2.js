
/*
Operadores Aritmeticos

Suma +
Resta -
Multiplicación *
División /
Resto %

*/

var num1 = 12;
var num2 = 5;

var total = num1+num2;

document.write("El total de " + num1 + " + "+ num2 +" es igual a " +total);
//el + tambien puede ser utilizado para concatenar.
document.write("<br>");

var contador = 15;
contador += 1;
document.write("Contador igual a " + contador);
document.write("<br>");

contador -= 1;
document.write("Decrementado vale " + contador);

/*
Operadores Relacionales

> mayor que
>= mayor o igual que 
< menor que
<= menor o igual que
== igual
!= distinto
*/

if (total == contador){
	document.write("Total es igual que Contador");
}
else{
	document.write("Total es distinto que Contador");

}

/*
Operadores Logicos

AND && 
OR  ||
NEGACION !

*/

