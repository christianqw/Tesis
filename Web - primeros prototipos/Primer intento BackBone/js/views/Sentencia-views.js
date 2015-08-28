var app = app || {};

(funcion($){
  'use strict';

  //Vista de las Sentencias
  //----------------------

  app.Sentencia-View = Backbone.View.extend({
    //trabaja sobre un elemento que ya existe dentro del html
    //en este caso es la vista asociada al
    el:  '.lista_sentencias',

    //Los eventos del DOM especificos de cada elemento
    // (cada item)

    events: {
      //propio de casa sentencia
      'click .item_sentencia': 'editarSentencia', //escribimos y focus
      'click .destroy':'clear', //eliminamos sentencia
      'keypress .editarSentencia': 'actualizarConEnter', //apretar Enter termina la edicion
			'keydown .editarSentencia': 'deshacerConEsc', //apretar tecla Esc deshace lo editado.
			'blur .editarSentencia': 'edicionTerminada', //hacer click en otro lado termina la edicion.
      //con focus en una sentencia
      'click .btn-character':  //agrega caracteres especiales en la pos del cursor
      'click #id_btn_add_before': 'agregarAntes', //agregamso antes del focus
      'click #id_btn_add_after': 'agregarDespues', //agregamos despues del focus
      //sobre todas las sentencias en simultaneo
      'click #id_btn_clear': 'limpiar', //limpiamos todas las sentencias
      'click #id_btn_action': 'accion', //ejecutamos la verificacion?
    },

    initialize: function () {

    },
    render: function () {

    },

    editarSentencia:function(){
      var antigua = $('.seleccionada');
      antigua.removeClass('seleccionada');
      this.$el.addClass('seleccionada');
      this.$input.focus();
    }

  })
})
