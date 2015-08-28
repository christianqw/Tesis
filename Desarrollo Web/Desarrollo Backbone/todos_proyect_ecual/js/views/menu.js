// views/menu.js
app.views.menu = Backbone.View.extend({
    template: _.template($("#tpl-menu").html()),
    /* _.template(templateString, [data], [settings])
    */
    initialize: function() {     //constructor de la vista.
      this.render();
    },
    render: function() {       //actualizacion de la vista.
      this.$el.html(this.template({}));    //se cambia el contenido del componente.
      /*  "this.$el" es un objeto creado por defecto y cada vista
      tiene uno. Por defecto es un <div></div> vacio.

      //esto es distinto, acá se asigna un nuevo elemento
      this.$el = $(this.template({}));
      */
    }
});
