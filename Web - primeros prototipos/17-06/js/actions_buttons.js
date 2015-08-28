/* Mi codigo de Javascript.
	Acciones que realizan a hacer clik en los distintos botones.
*/
"use strict";

function AddMundo() {
    alert("Agrega un mundo");
}

function AddForm() {
    alert("Agregar una pesta�a de Formulas");
}

function Cuestion() {
    alert("click en la pregunta");
}

function Info() {
    alert("Ayuda");
}

function AddChancho() {
    alert("Agrega un chancho");
}

//Focus Out Formularios.
$(".input-sentence").focusout(function(){ //cuando perdes el focus de un form de sentencias
	$("#_mundos").data("_focusForm", $(this).attr('id'));
  /*Guardamos el id de la sentencia*/

	//Testing....
  //$("#_mundos").data("_charPos", $(this).focus().getSelectionStart());
	//alert("id = " +$(this).attr('id')+ "   val=" + $(this).val() + "   position=" +$(this).prop('selectionStart') );
});

//Botones:

// XXXXX ----- Insert Characters Specials -----  XXXXX

$(".btn-character").on('click', function(e) { //When you clik on in button caret

	var _char_form = ($(this).text());  //caracter a agregar
	var id_form = $("#_mundos").data("_focusForm");

	var $form = $("#"+id_form); //sentencia a modificar
	var _caretPos =  $form.focus().prop('selectionStart'); //pos del cursor

	var _textAreaTxt = $form.val();
	//Testing...
  //alert ( "_carPos: " + _caretPos + "   1 mitad: " + _textAreaTxt.substring(0, _caretPos));
	$form.val(_textAreaTxt.substring(0, _caretPos) + _char_form + _textAreaTxt.substring(_caretPos)); //agregamos el caracter

	//Testing...
  //alert("pos caracter = " + _caretPos);
	// c�digo
	// alert($(this).text()); // ---- caracter a ingresar.
	//var caretPos = document.getElementById("txt").selectionStart;
	//var textAreaTxt = jQuery("#txt").val();
	//var _char = $(this).text();
	//jQuery("#txt").val(textAreaTxt.substring(0, caretPos) + _char + textAreaTxt.substring(caretPos) );
});

// XXXXX ----- Insert Forms Sentences -----  XXXXX

$("#id_btn_add_before").on('click', function(e) {
	var $contenedor = $("#_mundos");
	var id_form = $("#_mundos").data("_focusForm"); //id del form en focus
	var $form = $("#"+id_form); //form

	$contenedor.data("_cantForm", $contenedor.data("_cantForm") + 1 );
	var nuevoId = $contenedor.data("_cantForm");
	var $nuevoElemento = $('<input type="text" id="_form'+nuevoId+'" class="input-sentence  form-control has-success" placeholder="Campo de texto">   ');
	alert($nuevoElemento.text());
	$form.before($nuevoElemento);
});

$("#id_btn_add_after").on('click', function(e) {
	var $contenedor = $("#_mundos");
	var id_form = $("#_mundos").data("_focusForm"); //id del form en focus
	var $form = $("#"+id_form); //form

	$contenedor.data("_cantForm", $contenedor.data("_cantForm") + 1 );
	var nuevoId = $contenedor.data("_cantForm");
	var $nuevoElemento = $('<input type="text" id="_form'+nuevoId+'" class="input-sentence  form-control has-success" placeholder="Campo de texto">   ');
	alert($nuevoElemento.text());
	$form.after($nuevoElemento);
});

$("#id_btn_remove").on('click', function(e) {
	var $contenedor = $("#_mundos");
	var id_form = $("#_mundos").data("_focusForm"); //id del form en focus
	var $form = $("#"+id_form); //form
	alert(id_form);
	$form.remove();
});

// XXXXX ----- Insert Elements Dom -----  XXXXX
