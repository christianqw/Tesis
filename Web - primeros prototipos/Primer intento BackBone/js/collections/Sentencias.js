/*global Backbone */
var app = app || {};

(function (){
  'use strict';

  //Conjunto de Sentencias
  //----------------------

  var Sentencias = Backbone.Collection.extend({

    model.app.Sentencia,

    initialize: function(){
    var elementos = 2;
		this.add({ identificador: "sentencia_1" });
		this.add({ identificador: "sentencia_2" });
    },

    agregar_antes:function(){

    },
    agregar_despues:function(){

    },
    clear_all:funcion(){

    },
    eliminar:funcion(){

    }
  });

  app.Sentencias = new Sentencias();

}

)();
