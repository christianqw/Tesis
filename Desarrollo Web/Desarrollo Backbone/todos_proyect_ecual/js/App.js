// App.js
var app = (function() {

    /* definir un ambito que encapsule todo el codigo propio de la aplicacion,
    de esta forma se evitar el uso de funciones y variables globales.
    Todos los elementos creados viven dentro del elemento app
    */

    var api = {
        views: {},                            // vistas
        models: {},                           // modelos
        collections: {},                      // colecciones
        content: null,
        router: null,
        todos: null,
        init: function() {                                 // constructor
            this.content = $("#content");             // obtenemos el obj del contenido
            this.todos = new api.collections.ToDos();   //inicializamos las colecciones a utilizar
            ViewsFactory.menu();                           //agregamos la visualizacion del menu
            Backbone.history.start();
            return this;
        },

        /* Definicion de funciones "publicas"  */

        changeContent: function(el) {         // modificar el contenido
            this.content.empty().append(el);
            return this;
        },
        title: function(str) {                // modificar el titulo
            // $("#titulo").text(str);
            $("h1").text(str);              //esto se hace así por que es el unico titulo.
            return this;
        }
    };
    /*
    Una buena practica es inicializar las visitas sólo una vez y dejarlos con vida.
    Una vez que se cambian los datos , llamamos métodos de la vista y actualizamos
    el contenido de su objeto "el". */

    var ViewsFactory = {
              menu: function() {
               if(!this.menuView) { //si la vista no existe
                   this.menuView = new api.views.menu({  //llamamos a la funcion publica que crea la vista
                       el: $("#menu")
                   });
               }
               return this.menuView;
              },
              list: function() {
                  if(!this.listView) {
                      this.listView = new api.views.list({
                      model: api.todos
                      });
                  }
                  return this.listView;
              },
              form: function() {
                  if(!this.formView) {
                      this.formView = new api.views.form({
                          model: api.todos
                      }).on("saved", function() {
                          api.router.navigate("", {trigger: true});
                      })
                  }
                  return this.formView;
              }
            };

    var Router = Backbone.Router.extend({
              routes: {
                // "<ruta>" : "<nomb_funcion>"
                  "archive": "archive",       // index.html#archive
                  "new": "newToDo",     // index.html#new
                  "edit/:index": "editToDo",    // index.html#edit/1
                  "delete/:index": "delteToDo",
                  "": "list"    //index.html#
              },
              list: function(archive) {
                var view = ViewsFactory.list();
                api
                  .title(archive ? "Archive" : "Your ToDos:")
                  .changeContent(view.$el);
                  view.setMode(archive ? "archive" : null).render();
              },
              archive: function() {
                 this.list(true);
              },
              newToDo: function() {
                var view = ViewsFactory.form();
                api.title("Create new ToDo:").changeContent(view.$el);
                view.render()
              },
              editToDo: function(index) {
                var view = ViewsFactory.form();
                api.title("Edit:").changeContent(view.$el);
                view.render(index);
              },   // pasa el elemento que se está editando.
              delteToDo: function(index) {
                api.todos.remove(api.todos.at(parseInt(index)));
                api.router.navigate("", {trigger: true});
              }
    });

    api.router = new Router();

    return api;

})();

/* Dato de color.
El otro enfoque muy popular, es recrear la vista entera o reemplazar todo el elemento DOM .
Sin embargo , eso no es muy bueno desde el punto de vista del rendimiento .
Así , normalmente terminamos con una clase de utilidad que crea una instancia de la vista y
lo devuelve cuando lo necesitamos .
*/
