(function ($) {

//----- MODELOS ------
Linea = Backbone.Model.extend({
	defaults: {
        valor: ""
    }
});

// ------ Colecciones -------
Lineas = Backbone.Collection.extend({
	initialize: function(){
		this.add({ valor: "texto 1" });
		this.add({ valor: "texto 2" });
  },
	model : Linea
});

var DocumentoView = Backbone.View.extend({
  el: $("#list"),
  tagName: "li",
  template: _.template($('#item-template').html()),
  events: {
  'click #add-template': 'insert'
  },

  initialize: function() {
		this.listota = new Lineas();
  },

  render: function() {
     $(this.el).html(this.template(this.model.toJSON()));
     return this;
  },

	insert: function(){
		this.listota.add(new Linea());
	}

});
var docview = new DocumentoView;
})(jQuery);
