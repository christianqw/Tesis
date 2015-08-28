(function ($) {

  // -------- Conector -------
  Backbone.View.prototype.event_aggregator = _.extend({}, Backbone.Events);

    var appView = new app.AppView();

   //defino los elementos que se pueden arrastrar
   //$(".arrastrable").draggable();

	 //defino elementos donde se puede soltar
   $(".contenedor_mundo").droppable();

})(jQuery);
