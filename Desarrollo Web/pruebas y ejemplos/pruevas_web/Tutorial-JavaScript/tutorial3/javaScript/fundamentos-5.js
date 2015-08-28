/* Bucles */

// --- Sentencia FOR ---
var paises = ["España", "Argentina", "Uruguay", "Peru"] ;

document.write("Recorrido Incremental: <br>");
for (var i = 0; i <= paises.length-1; i++) {
	document.write(paises[i] + " - " );
};

//Recorrido autocompletado
document.write("<br> Recorrido Decreciente: <br>");
for (var i = paises.length - 1; i >= 0; i--) {
	document.write(paises[i] + " - " );
};

// --- FOR IN (Arreglos Indexados) ---
var ingredientes = new Array();

ingredientes["Harina"] = "600g";
ingredientes["Huevos"] = "4";
ingredientes["Manteca"] = "200g";

document.write(" <br>  Ingredientes : <br>");
for (var clave in ingredientes){
	document.write(clave + ":" +  ingredientes[clave] + "<br>");
}

// ---- WHILE ----
document.write(" <br> Nombres: <br>");

nombres = new Array ("AAA", "BBB", "CCC", "DDD");

var i = 0;
while (i <= nombres.length-1){
	document.write(nombres[i] + "<br>");
	i++;
}

// .---- BREAk ----.
 //Puede ser utilizado para interrumpir cualquiera de los bucles.

document.write(" <br> Iteración Interrumpida : <br>");
var i = 0;
while (i <= nombres.length-1){
	document.write(nombres[i] + "  -  ");
	if (nombres[i]  == "CCC"){
		break;
	}
	i++;
}