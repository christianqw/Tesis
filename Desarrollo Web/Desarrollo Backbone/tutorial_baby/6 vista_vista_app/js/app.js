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

  // -------- Conector -------
  Backbone.View.prototype.event_aggregator = _.extend({}, Backbone.Events);

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

        events:{
          "click #asd" :"mensaje2"
        },

        initialize:function(){                    //var_sentencias
            _.bindAll(this, "addNewSentencia");

            this.collection = new List_Sentencias();
            //this.collection.add(new Sentencia({nombre:"form_01"}));
            this.cargar();
            this.render(); //luego de crear elemento llamamos al render (buena practica)

            this.collection.on("add", this.renderSentencia, this); //actualiza la vista cada agregado.
             this.event_aggregator.bind("sentencia:add_Before", this.addNewSentencia);
        },

        loadTaskPopup: function() {
                alert("llamado desde otra vista");
        },

        cargar : function(){
          var formData1 = {};
            this.collection.add(new Sentencia(formData1));
          var formData2 = { nombre:"form_02" };
            this.collection.add(new Sentencia(formData2));
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
        },

        addNewSentencia: function(){
          alert("agregar sentencia  - lista ");
//           var formData = { nombre:"form_11" }; //agregar manejo contador
//           var_sentencias.push(formData);
                                                     //formData
            this.collection.add(new Sentencia());
        },

        mensaje2 : function(){
          alert("apretaste asd dentro");
        }
    });

    var appView = Backbone.View.extend({
        el:$("#app_container"),  //Panel de Trabajo

        events:{
          "click #id_btn_add_before" :"addNewBefore"
        },

        initialize:function(){
          var list_sentenciasView = new List_SentenciasView();
        },

        render: function(){
          this.$el.append(this.list_sentenciasView.render().el);
          return this;
        },

        addNewBefore: function(){
            this.event_aggregator.trigger("sentencia:add_Before");
        },

        mensaje : function(){
          alert("apretaste afuera")
        }
    });

    //genero una instancia:
/*
    var var_sentencias = [{nombre:"form_1", valor:" texto 1"},
                          {nombre:"form_2", valor:" texto 2", estado : "fa-arrow-left"},
                          {nombre:"form_3"}];

*/
    var appView = new appView();

})(jQuery);
