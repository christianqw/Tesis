/*  CONTROL DE FLUJO  */

// --- IF-ELSE ---
//Analizar la utilizacion de ; al finalizar los bloques del if

var num1 = 10, num2 = 10;

if (num2 != num1){
	document.write(num1 + " y " + num2 + " son distintos" + "<br>");
}
else if (num1 = num2) {
	document.write("Son IGUALES  <br>");
	}
	else{
	document.write("La condición no se cumple <br>");
	}



// ---- SWTCH ----
var nombre = "Nacha";

switch(nombre){

	case "Luis":
	document.write("Luis ha sido encontrado <br>");
	break;

	case "Nacha":
	document.write("Nacha ha sido encontrado <br>");
	break;

	case "Fer":
	document.write("Fer ha sido encontrado <br>");
	break;

	default:
	document.write("No se encontro el Valor <br>");
	break;	

}