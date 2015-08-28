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

        initialize:function(){

					// $(this.el)
				},

        render:function () {
          //tmpl is a function that takes a JSON object and returns html
          var tmpl = _.template(this.template);
          //this.el is what we defined in tagName. use $el to get access to jQuery html() function
          this.$el.html(tmpl(this.model.toJSON()));
          //this.$el.attr("id",this.model.get("nombre"));
          this.$el.draggable();
          return this;
        }
    });
  })(jQuery);
