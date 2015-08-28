(function ($) {

  // -------- Conector -------
  Backbone.View.prototype.event_aggregator = _.extend({}, Backbone.Events);

    var appView = new app.AppView();

})(jQuery);
