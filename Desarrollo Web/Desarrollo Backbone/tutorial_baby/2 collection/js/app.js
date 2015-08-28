(function ($) {

  // -------- Model --------
    var Book = Backbone.Model.extend({
        defaults:{
            coverImage:"img/placeholder.png",
            title:"Some title",
            author:"John Doe",
            releaseDate:"2012",
            keywords:"JavaScript Programming"
        }
    });

  // -------- Collection --------
    var Library = Backbone.Collection.extend({
    model:Book
    });

  // -------- View --------
    var BookView = Backbone.View.extend({
        tagName:"div",
        className:"bookContainer",
        template:$("#bookTemplate").html(),

        render:function () {
          //tmpl is a function that takes a JSON object and returns html
            var tmpl = _.template(this.template);
          //this.el is what we defined in tagName. use $el to get access to jQuery html() function
            this.$el.html(tmpl(this.model.toJSON()));
            return this;
        }
    });

    var LibraryView = Backbone.View.extend({
        el:$("#books"),  //insertamos los elementos en este componente

        initialize:function(){
            this.collection = new Library(var_books);
            this.render(); //luego de crear elemento llamamos al render (buena practica)
        },

        render: function(){
            var that = this;
            //iteramos sobre toda la coleccion, undercode function
            _.each(this.collection.models,
                   function(item){ //funcion que se le aplica a cada elemento
                      that.renderBook(item);
                  }, this);
        },

        renderBook:function(item){
            var bookView = new BookView({ //genera la vista del  modelo
                model: item
            });
            this.$el.append(bookView.render().el); //agrega al final
        }
    });

    //libros en el arreglo para la coleccion
    var var_books = [{title:"JS the good parts", author:"John Doe", releaseDate:"2012", keywords:"JavaScript Programming"},
        {title:"CS the better parts", author:"John Doe", releaseDate:"2012", keywords:"CoffeeScript Programming"},
        {title:"Scala for the impatient", author:"John Doe", releaseDate:"2012", keywords:"Scala Programming"},
        {title:"American Psyco", author:"Bret Easton Ellis", releaseDate:"2012", keywords:"Novel Splatter"},
        {title:"Eloquent JavaScript", author:"John Doe", releaseDate:"2012", keywords:"JavaScript Programming"}];

    var libraryView = new LibraryView();
/* Inicion_codigo_reemplazado
    //genero un libro
    var book = new Book({
       title:"Some title",
       author:"John Doe",
       releaseDate:"2000",
       keywords:"JavaScript Programming"
   });

   //genero una nueva vista
   bookView = new BookView({
       model: book //var libro
   });

   //Contenedor del los elementos a visualizar
   $("#books").html(bookView.render().el);

  Fin_codigo_reemplazado */

})(jQuery);
