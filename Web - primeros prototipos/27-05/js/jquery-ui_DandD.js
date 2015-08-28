/* Mi codigo de Javascript.
	Acciones que realizan al hacer drag and drop.
*/
		$(document).ready(function(){
			//defino los elementos que se pueden arrastrar
			$(".arrastrable").draggable();
											
			//defino elementos donde se puede soltar
			$(".contenedor_mundo").droppable();
				
			//variables contadores de los ids
			$("#_mundos").data("_cantForm", 2);			
				
			//enlaces para crear nuevos elementos mundo
			$(".elemento_mundo").click(function(e){
				e.preventDefault();
    
				var nuevoElemento = $('<img class="elemento_insertado arrastrable" id="asd" src="'+ $(this).attr("src") +'" class="image "/>');
				nuevoElemento.draggable();
				nuevoElemento.removeAttr("style");
				$("#panel_mundo1").append(nuevoElemento);
				
				//nuevoElemento.css("style", "position: absolute; left: 0px; top: 0px;");
				
				});
				
				
			// Sentencias
			
			
			//Botones:
			$(".btn-character").on('click', function(e) {
			  // código
				alert($(this).text()); // ---- caracter a ingresar.
				
				
				//var caretPos = document.getElementById("txt").selectionStart;
				//var textAreaTxt = jQuery("#txt").val();
				//var _char = $(this).text();
				//jQuery("#txt").val(textAreaTxt.substring(0, caretPos) + _char + textAreaTxt.substring(caretPos) );
			});
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
			
			$(".form-control").focusout(function(){
				alert("salio del foco del form");
			});
			
			$("#id_addform").on('click', function(e) {
			var contenedor = $("#_mundos");
			contenedor.data("_cantForm", contenedor.data("_cantForm") + 1 );       
			var nuevoId = contenedor.data("_cantForm");    
			var nuevoElemento = $('<input type="text" id="_form'+nuevoId+'" class="form-control has-success" placeholder="Campo de texto">   ');
			    alert(nuevoElemento.text());
			$("#panel_form1").append(nuevoElemento);
			// código
				//alert($(this).text());  ---- caracter a ingresar.
				
				
				//var caretPos = document.getElementById("txt").selectionStart;
				//var textAreaTxt = jQuery("#txt").val();
				//var _char = $(this).text();
				//jQuery("#txt").val(textAreaTxt.substring(0, caretPos) + _char + textAreaTxt.substring(caretPos) );
			});
			
		})
