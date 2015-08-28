/*global Backbone, jQuery, _, ENTER_KEY, ESC_KEY */
var app = app || {};

(function ($) {
	'use strict';

	// Sentencia Item View
	// --------------
    app.SentenciaView = Backbone.View.extend({
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
  })(jQuery);
