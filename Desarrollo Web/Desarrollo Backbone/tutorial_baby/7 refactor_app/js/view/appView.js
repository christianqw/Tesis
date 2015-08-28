/*global Backbone, jQuery, _, ENTER_KEY, ESC_KEY */
var app = app || {};

(function ($) {
	'use strict';

  // The Application
	// ---------------

    app.AppView = Backbone.View.extend({
        el:$("#app_container"),  //Panel de Trabajo

        events:{
          "click #id_btn_add_before" :"addNewBefore"
        },

        initialize:function(){
          var list_sentenciasView = new app.List_SentenciasView();
        },

        render: function(){
          this.$el.append(app.list_sentenciasView.render().el);
          return this;
        },

        addNewBefore: function(){
            this.event_aggregator.trigger("event_sentencia:add_Before");
        },

        mensaje : function(){
          alert("apretaste afuera")
        }
    });

  })(jQuery);
