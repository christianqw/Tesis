//practicamos la utilizacion de algunos metodos del objeto windows

//http://www.w3schools.com/jsref/obj_window.asp


//-- Screen: ventana resolucion
var ancho = window.screen.width;
var alto = window.screen.height;

document.write("Ancho: "+ ancho + "   Alto: " + alto + "<br>");
//no hace referencia al tamaño de la ventana 
//sinó a la RESOLUCIOM DE LA ventana

//-- Navigator: informacion sobre el navegador de interner sobre el que se ejecuta el doc.

window.document.write(window.navigator.userAgent);

//-- Location:

//redireccionar:
/*
window.location.href = "http://www.google.com.ar";
*/

//open()

function open_window(){
	window.open("http://www.google.com.ar");

	/* Ventana emergente:
	window.open("http://www.google.com.ar", "_blank", "width=300", "height=300");
	*/
}

function create_window(){
	var ventana = window.open("", "", "width=300", "height=300");
	ventana.document.write("Soy una nueva Ventana, WIIIII!!!!");
}
