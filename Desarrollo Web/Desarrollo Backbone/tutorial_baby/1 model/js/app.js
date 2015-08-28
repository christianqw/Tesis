(function ($) {

    var Book = Backbone.Model.extend({
        defaults:{
            coverImage:"img/placeholder.png",
            title:"Some title",
            author:"John Doe",
            releaseDate:"2012",
            keywords:"JavaScript Programming"
        }
    });

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



})(jQuery);
