/* Mi codigo de Javascript.
	Acciones que realizan al hacer drag and drop.
*/
		$(document).ready(function(){
			//defino los elementos que se pueden arrastrar
			$(".arrastrable").draggable();

			//defino elementos donde se puede soltar
			$(".contenedor_mundo").droppable();

			//---- variables contadores de los ids
			/*cuenta la cantidad de casilleros de formulas para generar los Id */
			$("#_mundos").data("_cantForm", 2);
			/*mantiene el ultimo formulario de sentencia seleccionado*/
			$("#_mundos").data("_focusForm", "_form1");
			/*cuenta la cantidad de elementos agregados al Dominio*/
			$("#_mundos").data("_cantElem", 0);

			// Sentencias
			$("#id_addmundo").on('click', function(e) {
				var img = $("#imagen_fondo");
				alert(img.height());
				alert(img.width());
				alert(img.clientWidth);
				//alert(img.naturalHeight());
				//alert(img.naturalWwidth());
			});

			/* resolve the icons behavior with event delegation
			$( "ul.gallery > li" ).click(function( event ) {
			  var $item = $( this ),
				$target = $( event.target );

			  if ( $target.is( "a.ui-icon-trash" ) ) {
				deleteImage( $item );
			  } else if ( $target.is( "a.ui-icon-zoomin" ) ) {
				viewLargerImage( $target );
			  } else if ( $target.is( "a.ui-icon-refresh" ) ) {
				recycleImage( $item );
			  }
			*/

			//Para crear nuevos elementos mundo
			$(".elemento_mundo").click(function(e){
			  e.preventDefault();

			  var $contenedor = $("#_mundos");
				$contenedor.data("_cantElem", $contenedor.data("_cantElem") + 1 );
			  var nuevoId = 'e'+$contenedor.data("_cantElem");  // e1; e2; e3 ...
			  //Testing...
			  alert('Nuevo elemento  nombrado: ' + nuevoId);

			  var nuevoElemento = $('<img class="elemento_insertado arrastrable" id="'+ nuevoId +'" src="'+ $(this).attr("src") +'" />');
			  alert(nuevoElemento);
				nuevoElemento.draggable();
			  nuevoElemento.removeAttr("style");
			  $("#panel_mundo1").append(nuevoElemento);
			  //nuevoElemento.css("style", "position: absolute; left: 0px; top: 0px;");

			  });

			$("#btn_zoom_in").on('click', function(e) {
				var img = $("#imagen_fondo");
				var aux = img.css("max-height");
				alert(aux + '    ' + img.css("max-height"));
				alert(img.width() + '    '+ img.css("max-width"));

				//jQuery('#sidebar-a #block-book-navigation').css({max-height: navHeight + 'px; });
				//img.css({max-height:
				//alert(img.naturalHeight());
				//alert(img.naturalWwidth());
			});

		})
