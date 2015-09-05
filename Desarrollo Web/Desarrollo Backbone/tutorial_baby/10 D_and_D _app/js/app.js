(function ($) {

  // -------- Conector -------
  Backbone.View.prototype.event_aggregator = _.extend({}, Backbone.Events);

    //defino receptor donde se pueden soltar los elementos
    $(".contenedor_modelo").droppable();

    var appView = new app.AppView();


})(jQuery);
