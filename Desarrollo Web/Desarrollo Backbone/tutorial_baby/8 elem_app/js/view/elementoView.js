/*global Backbone, jQuery, _, ENTER_KEY, ESC_KEY */
var app = app || {};

(function ($) {
  'use strict';

  // Sentencia Item View
  // --------------
    app.ElementoView = Backbone.View.extend({

        tagName:"div",
        className:"elemento_insertado arrastrable ui-draggable ui-draggable-handle ",
        template:$("#Elemento_Template").html(),

        events{
          'stop .draggable': 'edit_position_model'
        },

        initialize:function(){

					// $(this.el)
				},

        edit_position_model: function( a, b){
          this.model.stop_drop(ui.position.left, ui.position.top);
        }

        render:function () {
          //tmpl is a function that takes a JSON object and returns html
          var tmpl = _.template(this.template);
          //this.el is what we defined in tagName. use $el to get access to jQuery html() function
          this.$el.html(tmpl(this.model.toJSON()));
          var modelo = this.model;

          //this.$el.attr("id",this.model.get("nombre"));
          this.$el.draggable({
                  stop: function( event, ui ) {
                  alert("left: " + ui.position.left+ " top: " + ui.position.top )
                  //this.model.stop_drop(ui.position.left, ui.position.top);
                  }
          });
          return this;
        }
    });
  })(jQuery);
