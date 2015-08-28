/*global Backbone */
var app = app || {};

(funcion (){
  'use strict';

  //modelo Sentencia
  //----------------
  app.Sentencia = Backbone.Model.extend({
      idAttribute: "_id", //identificador propio de los modelos? anda esto ?

      defaults: {
          titulo: "-- sentencia --", //ver que es
          identificador:"",
          valor: "", //formula a evaluar
          resultado: "",  //resultado - erro, falsa, valida
          mensaje:"" // mensaje de error.
          //id unico.
      }
  });


}) ();
