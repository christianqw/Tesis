/*global Backbone */
var app = app || {};

(function () {
	'use strict';

	// Sentencia Model
	// ----------

	// Nuestro moledo basico de **Elemento** posee los atributos: 'nombre', 'valor', 'estado', 'mensaje'
  app.Elemento = Backbone.Model.extend({
		cte_vaca:"images/icon_vaca.png",
		cte_gallina:"images/icon_gallina.png",
		// Atributos por defecto de un Elemento
		// de faltar un campo, se está asumiendo que simepre se asigna dicho atributo al crearlo
    defaults:{
        nombre:"e1",
        img: "images/icon_vaca.png",
        left: 0,
        top: 0,
        att1:"chico",
        att2:"despierto"
    }
	});
})();
