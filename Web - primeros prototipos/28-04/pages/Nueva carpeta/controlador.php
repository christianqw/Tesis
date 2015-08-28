<?php
// Primero averiguamos el idioma seleccionado.
if (isset($_GET['idioma']) && $_GET['idioma']!='')
   $idioma=strtolower($_GET['idioma']);
else
   $idioma='es';
 
// Cargamos el fichero de idioma. Por defecto español.
include_once "{$idioma}_traduccion.php";
 
//..... Resto del código.
 
 
// Ejemplos de uso.
echo LABEL_MENU;
 
echo LABEL_BIENVENIDA;
echo "Hola: ".LABEL_MENU;
?>