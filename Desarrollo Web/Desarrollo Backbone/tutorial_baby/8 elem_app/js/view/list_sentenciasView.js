/*global Backbone, jQuery, _, ENTER_KEY, ESC_KEY */
var app = app || {};

(function ($) {
	'use strict';

	// Sentencia Collection View
	// --------------
    app.List_SentenciasView = Backbone.View.extend({
        el:$("#lista_sentencias"),  //insertamos los elementos en este componente

        events:{
          "click #asd" :"mensaje2"
        },

        initialize:function(){                    //var_sentencias
            _.bindAll(this, "addNewSentencia");

            //this.collection = new List_Sentencias();  eliminado
            //this.collection.add(new Sentencia({nombre:"form_01"})); utilizado en una funcíon aparte. 
            this.cargar();
            this.render(); //luego de crear elemento llamamos al render (buena practica)

            app.sentencia_collention.on("add", this.renderSentencia, this); //actualiza la vista cada agregado.
            this.event_aggregator.bind("event_sentencia:add_Before", this.addNewSentencia);
        },

        cargar : function(){
          var formData1 = {};
            app.sentencia_collention.add(new app.Sentencia(formData1));
          var formData2 = { nombre:"form_02" };
            app.sentencia_collention.add(new app.Sentencia(formData2));
        },

        render: function(){
            var that = this;
            //iteramos sobre toda la coleccion, undercode function
            _.each(app.sentencia_collention.models,
                   function(item){ //funcion que se le aplica a cada elemento
                      that.renderSentencia(item);
                  }, this);
        },

        renderSentencia:function(item){
            var sentenciaView = new app.SentenciaView({ //genera la vista del  modelo
                model: item
            });
            this.$el.append(sentenciaView.render().el); //agrega al final
        },

        addNewSentencia: function(){
          alert("agregar sentencia  - lista ");
//           var formData = { nombre:"form_11" }; //agregar manejo contador
//           var_sentencias.push(formData);
                                                     //formData
            app.sentencia_collention.add(new app.Sentencia());
        },

        mensaje2 : function(){
          alert("apretaste asd dentro");
        }
    });

  })(jQuery);
