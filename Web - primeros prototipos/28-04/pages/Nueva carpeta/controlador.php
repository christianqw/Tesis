<?php
// Primero averiguamos el idioma seleccionado.
if (isset($_GET['idioma']) && $_GET['idioma']!='')
   $idioma=strtolower($_GET['idioma']);
else
   $idioma='es';
 
// Cargamos el fichero de idioma. Por defecto espa�ol.
include_once "{$idioma}_traduccion.php";
 
//..... Resto del c�digo.
 
 
// Ejemplos de uso.
echo LABEL_MENU;
 
echo LABEL_BIENVENIDA;
echo "Hola: ".LABEL_MENU;
?>