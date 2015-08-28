(function ($) {

  // -------- Model --------
    var Sentencia = Backbone.Model.extend({
        defaults:{
            nombre:"form_X",
            valor:"",
            estado:"", //blanco - none
            mensaje:""
        }
    });

  // -------- Collection --------
    var List_Sentencias = Backbone.Collection.extend({
     model:Sentencia
    });

  // -------- View --------
    var SentenciaView = Backbone.View.extend({
        tagName:"li",
        className:"item_sentencia",
        template:$("#Item_Sentencia_Template").html(),

        render:function () {
          //tmpl is a function that takes a JSON object and returns html
            var tmpl = _.template(this.template);
          //this.el is what we defined in tagName. use $el to get access to jQuery html() function
            this.$el.html(tmpl(this.model.toJSON()));
            return this;
        }
    });

    var List_SentenciasView = Backbone.View.extend({
        el:$("#lista_sentencias"),  //insertamos los elementos en este componente

        initialize:function(){
            this.collection = new List_Sentencias(var_sentencias);
            this.render(); //luego de crear elemento llamamos al render (buena practica)
        },

        render: function(){
            var that = this;
            //iteramos sobre toda la coleccion, undercode function
            _.each(this.collection.models,
                   function(item){ //funcion que se le aplica a cada elemento
                      that.renderSentencia(item);
                  }, this);
        },

        renderSentencia:function(item){
            var sentenciaView = new SentenciaView({ //genera la vista del  modelo
                model: item
            });
            this.$el.append(sentenciaView.render().el); //agrega al final
        }
    });

    //genero una instancia:

    var var_sentencias = [{nombre:"form_1", valor:" texto 1"},
                          {nombre:"form_2", valor:" texto 2", estado : "fa-arrow-left"},
                          {nombre:"form_3"}];


    var list_sentenciasView = new List_SentenciasView();

})(jQuery);
