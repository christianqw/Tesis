app.models.Elemento = Backbone.Model.extend({
    // Symbolic Constants
    XXX: 'value',

  	// Default attributes for the model
    defaults: {
        name: '',
        posX: 0,
        posY: 0,
        image:'',
        //atributo:
        Tamaño: "mediano", //valor por defecto?
        Dormido: "Despierto"
      }

});
