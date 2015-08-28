/*
Metodos para trabajar con FECHAS

getDay() -> Retorna el dia de la semana, con un digito del 0 al 6
			El primer elemento es un 0 que corresponde al dia Domingo.

getDate()  -> Retorna el dia del mes, como un digito del 1 al 31


getMonth() -> Retorna el mes del año, como un digito del 0 al 11
			  El primer elemento es un 0, que corresponde a Enero

getFullYear() -> Retorna el año con 4 digitos

*/


var fecha_hora = new Date();

document.write(fecha_hora + "<br>");

document.write("El numero del dia es: "+fecha_hora.getDate()+ "<br>");

document.write("El dia de la semana es: "+fecha_hora.getDay()+ "<br>");

/*
Metodos para trabajar con la Hora

getHours() -> Retorna la hora

getMinutes() -> Retorna los minutos

getSeconds() -> Retorna los segundos

*/

document.write("Ahora son las: " + fecha_hora.getHours() + ":" + fecha_hora.getMinutes()+ ":" + fecha_hora.getSeconds() + "<br>");