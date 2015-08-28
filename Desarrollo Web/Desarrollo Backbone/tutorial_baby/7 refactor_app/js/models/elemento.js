/*global Backbone */
var app = app || {};

(function () {
	'use strict';

	// Sentencia Model
	// ----------

	// Nuestro moledo basico de **Elemento** posee los atributos: 'nombre', 'valor', 'estado', 'mensaje'
  app.Elemento = Backbone.Model.extend({
		// Atributos por defecto de un Elemento
		// de faltar un campo, se está asumiendo que simepre se asigna dicho atributo al crearlo
    defaults:{
        nombre:"e1",
        img:"none",
        posx:0,
        posy:0,
        att1:"chico",
        att2:"despierto"
    }
	});
})();
