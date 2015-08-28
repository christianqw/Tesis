/* OBJTOS */

function coche(){

	/*
	Objeto que de referencua a sí mismo
	*/
	var self = this;
	//--Atributos del objeto--
	self._color = "Azul";
	self._puertas = 5;
	self._velocidad = 200;

	//--Metodos--
	coche.prototype.Color = function(c) {
		if (c == undefined){
			self._color = self._color;
		} else {
			self._color = c;
		}
		return self._color; //Retornamos el valor del atributo modificado.
	};

	coche.prototype.Velocidad = function(v) {
		if (v == undefined){
			self._velocidad = self._velocidad;
		} else {
			self._velocidad = v;
		}
		return self._velocidad; //Retornamos el valor del atributo modificado.
	};

	coche.prototype.Puertas = function(p) {
		if (p == undefined){
			self._puertas = self._puertas;
		} else {
			self._puertas = p;
		}
		return self._puertas; //Retornamos el valor del atributo modificado.
	};

	coche.prototype.Ruedas = function(){
		var ruedas = 4;
		return ruedas;
	}
/*De esta forma los Gets y los Sets son la misma funcion dependiendo si el parametro esta o no definido.
Esto es una practica valida? 
*/

}