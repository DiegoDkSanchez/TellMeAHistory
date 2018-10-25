<?php

    include "historia.php";
    include "seccion.php";

    $historias = array();

    $historia = new historia;
    $historia->id = 0;
    $historia->titulo = "La ranita presumida";
    $historia->autor = "Estefanía Esteban";
    $historia->idAutor = 0;
    $historia->portada = "https://static.guiainfantil.com/media/246/ranita-presumida-p.jpg";
    $historia->categoria = "Infantil";
    
    $secciones = array();
        $seccion = new seccion;
        $seccion->id = 0;
        $seccion->subtitulo = "La ranita";
        $seccion->contenido = "Había una vez, una ranita presumida que se creía la reina de todos los batracios del jardín. La ranita se pasaba el día mirándose en la superficie de las charcas como quien se mira en un espejo, y se creía tan linda que su orgullo y vanidad la hicieron insoportable. Una mañana de primavera, la ranita se hallaba tomando sol entre las flores de la orilla, cuando se le acercó un sapo, no demasiado guapo...";
        $seccion->imagen = "https://thumbs.dreamstime.com/b/pr%C3%ADncipe-coronado-de-la-rana-en-una-hoja-en-el-lago-22996729.jpg";
    $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El Sapo";
        $seccion->contenido = "- Buenos días, señorita - dijo el sapo-. La veo tan linda que de mil amores me casaría con su alteza. \n - Oiga, oiga, don Sapo -lo interrumpió indignada la ranita-, sepa que no me arreglo para gente de poca monta como usted. Lárguese de ahí enseguida a buscar una pareja de su clase, que me da miedo mirarlo. ¿No se ha visto en el espejo?";
        $seccion->imagen = "https://png.pngtree.com/element_origin_min_pic/16/11/27/cfa27c5aa09a3522f02afc8048a6acd0.jpg";
     $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El Sapo";
        $seccion->contenido = "El pobre sapo, avergonzado de su fealdad, se hundió en el lodo llorando su desventura. Pero, muy pronto, halló la rana un castigo a su soberbia. \n Un día, la ranita, mirándose en una charca, se encontró con una culebra de agua que, aproximándose demasiado al pequeño anfibio, le dijo:";
        $seccion->imagen = "https://png.pngtree.com/element_origin_min_pic/16/11/27/cfa27c5aa09a3522f02afc8048a6acd0.jpg";
 $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Cena";
        $seccion->contenido = "- Me parece, preciosa mía, que vas a servirme de suculento banquete esta mañana. \n La culebra saltó y le mordió en la patita a la rana. Ésta, sintiéndose malherida, empezó a croar desesperada y, acordándose del sapo, comenzó a llamarlo a grandes voces. \n - ¡Don Sapo! ¡Don Sapo! ¡Venga por favor! ¡Socorro! ¡Ay, don Sapo! ¡Que me devora un monstruo!";
        $seccion->imagen = "https://cdn5.dibujos.net/dibujos/pintados/201341/sapo-hambriento-monstruos-pintado-por-ivanzito-9851992.jpg";
 $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Cena";
        $seccion->contenido = "El sapo acudió tan deprisa como pudo y, dando con su boca un enorme tirón a la cola de la culebra, la obligó a soltar su presa. \n - Usted perdone, don Sapo, aquello que le dije hace un rato- \n  se explicó la rana- Estaba muy nerviosa. En verdad no me parece usted tan feo y… creo tenerle cariño. \n  Al fin se casaron. Ella se convenció que la fealdad del cuerpo no es cosa importante si está compensada con la belleza del alma.";
        $seccion->imagen = "https://pre00.deviantart.net/6a6a/th/pre/f/2012/262/2/b/married_frogs_by_shiray21-d5faim9.jpg";

    $secciones[] = $seccion;
    $historia->secciones = $secciones;

    $historias[] = $historia;

//Rellenuto *********************************************************************************


$historia = new historia;
    $historia->id = 0;
    $historia->titulo = "Caperucita roja";
    $historia->portada = "https://www.chiquipedia.com/images/cuento-leer-caperucita-roja.jpg";
    $historia->categoria = "Infantil";
    
    $secciones = array();
        $seccion = new seccion;
        $seccion->id = 0;
        $seccion->subtitulo = "La niña";
        $seccion->contenido = "A orillas del bosque vivía una niña llamada Caperucita. \n  Un día su abuela cayó enferma y ella salió a llevarle una rica tarta. Pero en un cruce de caminos apareció un enorme lobo que la engañó y le aconsejó otro camino diciendo que era más corto, para adelantarse y aparecer antes que ella.";
        $seccion->imagen = "https://cdn.shopify.com/s/files/1/1397/4145/articles/Capericita_1024x1024.progressive.jpg?v=1493944081";
    $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El lobo";
        $seccion->contenido = "Cuando el lobo llegó a casa de la abuelita, golpeó la puerta y se hizo pasar por Caperucita, hasta que la abuelita lo dejó entrar.  \n  Una vez dentro, el lobo se comió a la anciana y luego se disfrazó con su ropa para esperar a la niña. Caperucita llegó y al acercarse a la cama encontró a su abuelita muy cambiada, y de pronto, el lobo abrió la boca y se la tragó.";
        $seccion->imagen = "https://st2.depositphotos.com/1005314/10233/v/950/depositphotos_102337982-stock-illustration-red-riding-hood-and-wolf.jpg";
      $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El lobo";
        $seccion->contenido = "Unos animalitos del bosque lo habían visto todo y habían avisado a un cazador. Cuando encontraron al malvado lobo lo ataron a la rama de un árbol cabeza abajo y le obligaron a expulsar a Caperucita y a su abuelita. Para sorpresa de todos, el lobo las devolvió sanas y salvas y, arrepentido, les pidió perdón.";
        $seccion->imagen = "http://cdn5.dibujos.net/dibujos/pintados/201221/caperucita-roja-15-cuentos-y-leyendas-la-caperucita-roja-pintado-por-tuangel-9741417.jpg";

    $secciones[] = $seccion;
    $historia->secciones = $secciones;

    $historias[] = $historia;

$historia = new historia;
    $historia->id = 0;
    $historia->titulo = "Los animales";
    $historia->portada = "https://i.ytimg.com/vi/2k2IZceeytQ/maxresdefault.jpg";
    $historia->categoria = "Drama";
    
$secciones = array();
        $seccion = new seccion;
        $seccion->id = 0;
        $seccion->subtitulo = "Conejo";
        $seccion->contenido = "Co-ne-jo";
        $seccion->imagen = "https://previews.123rf.com/images/tigatelu/tigatelu1704/tigatelu170400021/76841490-ilustraci%C3%B3n-de-vector-de-conejo-de-dibujos-animados-posando.jpg";
    $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Zorro";
        $seccion->contenido = "Zo-rro";
        $seccion->imagen = "https://st2.depositphotos.com/4769585/12384/v/950/depositphotos_123846344-stock-illustration-fox-sketch-color-hand-drawn.jpg";
     $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Mariposa";
        $seccion->contenido = "Mari-po-sa";
        $seccion->imagen = "http://www.dibucolor.com/Imagenes/mariposa-roja.jpg";


    $secciones[] = $seccion;
    $historia->secciones = $secciones;

    $historias[] = $historia;

$historia = new historia;
    $historia->id = 0;
    $historia->titulo = "La ranita presumida";
    $historia->autor = "Estefanía Esteban";
    $historia->idAutor = 0;
    $historia->portada = "https://static.guiainfantil.com/media/246/ranita-presumida-p.jpg";
    $historia->categoria = "Infantil";
    
    $secciones = array();
        $seccion = new seccion;
        $seccion->id = 0;
        $seccion->subtitulo = "La ranita";
        $seccion->contenido = "Había una vez, una ranita presumida que se creía la reina de todos los batracios del jardín. La ranita se pasaba el día mirándose en la superficie de las charcas como quien se mira en un espejo, y se creía tan linda que su orgullo y vanidad la hicieron insoportable. Una mañana de primavera, la ranita se hallaba tomando sol entre las flores de la orilla, cuando se le acercó un sapo, no demasiado guapo...";
        $seccion->imagen = "https://thumbs.dreamstime.com/b/pr%C3%ADncipe-coronado-de-la-rana-en-una-hoja-en-el-lago-22996729.jpg";
    $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El Sapo";
        $seccion->contenido = "- Buenos días, señorita - dijo el sapo-. La veo tan linda que de mil amores me casaría con su alteza. \n - Oiga, oiga, don Sapo -lo interrumpió indignada la ranita-, sepa que no me arreglo para gente de poca monta como usted. Lárguese de ahí enseguida a buscar una pareja de su clase, que me da miedo mirarlo. ¿No se ha visto en el espejo?";
        $seccion->imagen = "https://png.pngtree.com/element_origin_min_pic/16/11/27/cfa27c5aa09a3522f02afc8048a6acd0.jpg";
     $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El Sapo";
        $seccion->contenido = "El pobre sapo, avergonzado de su fealdad, se hundió en el lodo llorando su desventura. Pero, muy pronto, halló la rana un castigo a su soberbia. \n Un día, la ranita, mirándose en una charca, se encontró con una culebra de agua que, aproximándose demasiado al pequeño anfibio, le dijo:";
        $seccion->imagen = "https://png.pngtree.com/element_origin_min_pic/16/11/27/cfa27c5aa09a3522f02afc8048a6acd0.jpg";
 $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Cena";
        $seccion->contenido = "- Me parece, preciosa mía, que vas a servirme de suculento banquete esta mañana. \n La culebra saltó y le mordió en la patita a la rana. Ésta, sintiéndose malherida, empezó a croar desesperada y, acordándose del sapo, comenzó a llamarlo a grandes voces. \n - ¡Don Sapo! ¡Don Sapo! ¡Venga por favor! ¡Socorro! ¡Ay, don Sapo! ¡Que me devora un monstruo!";
        $seccion->imagen = "https://cdn5.dibujos.net/dibujos/pintados/201341/sapo-hambriento-monstruos-pintado-por-ivanzito-9851992.jpg";
 $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Cena";
        $seccion->contenido = "El sapo acudió tan deprisa como pudo y, dando con su boca un enorme tirón a la cola de la culebra, la obligó a soltar su presa. \n - Usted perdone, don Sapo, aquello que le dije hace un rato- \n  se explicó la rana- Estaba muy nerviosa. En verdad no me parece usted tan feo y… creo tenerle cariño. \n  Al fin se casaron. Ella se convenció que la fealdad del cuerpo no es cosa importante si está compensada con la belleza del alma.";
        $seccion->imagen = "https://pre00.deviantart.net/6a6a/th/pre/f/2012/262/2/b/married_frogs_by_shiray21-d5faim9.jpg";

    $secciones[] = $seccion;
    $historia->secciones = $secciones;

    $historias[] = $historia;

//Rellenuto *********************************************************************************


$historia = new historia;
    $historia->id = 0;
    $historia->titulo = "Caperucita roja";
    $historia->portada = "https://www.chiquipedia.com/images/cuento-leer-caperucita-roja.jpg";
    $historia->categoria = "Infantil";
    
    $secciones = array();
        $seccion = new seccion;
        $seccion->id = 0;
        $seccion->subtitulo = "La niña";
        $seccion->contenido = "A orillas del bosque vivía una niña llamada Caperucita. \n  Un día su abuela cayó enferma y ella salió a llevarle una rica tarta. Pero en un cruce de caminos apareció un enorme lobo que la engañó y le aconsejó otro camino diciendo que era más corto, para adelantarse y aparecer antes que ella.";
        $seccion->imagen = "https://cdn.shopify.com/s/files/1/1397/4145/articles/Capericita_1024x1024.progressive.jpg?v=1493944081";
    $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El lobo";
        $seccion->contenido = "Cuando el lobo llegó a casa de la abuelita, golpeó la puerta y se hizo pasar por Caperucita, hasta que la abuelita lo dejó entrar.  \n  Una vez dentro, el lobo se comió a la anciana y luego se disfrazó con su ropa para esperar a la niña. Caperucita llegó y al acercarse a la cama encontró a su abuelita muy cambiada, y de pronto, el lobo abrió la boca y se la tragó.";
        $seccion->imagen = "https://st2.depositphotos.com/1005314/10233/v/950/depositphotos_102337982-stock-illustration-red-riding-hood-and-wolf.jpg";
      $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El lobo";
        $seccion->contenido = "Unos animalitos del bosque lo habían visto todo y habían avisado a un cazador. Cuando encontraron al malvado lobo lo ataron a la rama de un árbol cabeza abajo y le obligaron a expulsar a Caperucita y a su abuelita. Para sorpresa de todos, el lobo las devolvió sanas y salvas y, arrepentido, les pidió perdón.";
        $seccion->imagen = "http://cdn5.dibujos.net/dibujos/pintados/201221/caperucita-roja-15-cuentos-y-leyendas-la-caperucita-roja-pintado-por-tuangel-9741417.jpg";

    $secciones[] = $seccion;
    $historia->secciones = $secciones;

    $historias[] = $historia;

$historia = new historia;
    $historia->id = 0;
    $historia->titulo = "Los animales";
    $historia->portada = "https://i.ytimg.com/vi/2k2IZceeytQ/maxresdefault.jpg";
    $historia->categoria = "Educación";
    
$secciones = array();
        $seccion = new seccion;
        $seccion->id = 0;
        $seccion->subtitulo = "Conejo";
        $seccion->contenido = "Co-ne-jo";
        $seccion->imagen = "https://previews.123rf.com/images/tigatelu/tigatelu1704/tigatelu170400021/76841490-ilustraci%C3%B3n-de-vector-de-conejo-de-dibujos-animados-posando.jpg";
    $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Zorro";
        $seccion->contenido = "Zo-rro";
        $seccion->imagen = "https://st2.depositphotos.com/4769585/12384/v/950/depositphotos_123846344-stock-illustration-fox-sketch-color-hand-drawn.jpg";
     $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Mariposa";
        $seccion->contenido = "Mari-po-sa";
        $seccion->imagen = "http://www.dibucolor.com/Imagenes/mariposa-roja.jpg";


    $secciones[] = $seccion;
    $historia->secciones = $secciones;

    $historias[] = $historia;
$historia = new historia;
    $historia->id = 0;
    $historia->titulo = "La ranita presumida";
    $historia->autor = "Estefanía Esteban";
    $historia->idAutor = 0;
    $historia->portada = "https://static.guiainfantil.com/media/246/ranita-presumida-p.jpg";
    $historia->categoria = "Infantil";
    
    $secciones = array();
        $seccion = new seccion;
        $seccion->id = 0;
        $seccion->subtitulo = "La ranita";
        $seccion->contenido = "Había una vez, una ranita presumida que se creía la reina de todos los batracios del jardín. La ranita se pasaba el día mirándose en la superficie de las charcas como quien se mira en un espejo, y se creía tan linda que su orgullo y vanidad la hicieron insoportable. Una mañana de primavera, la ranita se hallaba tomando sol entre las flores de la orilla, cuando se le acercó un sapo, no demasiado guapo...";
        $seccion->imagen = "https://thumbs.dreamstime.com/b/pr%C3%ADncipe-coronado-de-la-rana-en-una-hoja-en-el-lago-22996729.jpg";
    $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El Sapo";
        $seccion->contenido = "- Buenos días, señorita - dijo el sapo-. La veo tan linda que de mil amores me casaría con su alteza. \n - Oiga, oiga, don Sapo -lo interrumpió indignada la ranita-, sepa que no me arreglo para gente de poca monta como usted. Lárguese de ahí enseguida a buscar una pareja de su clase, que me da miedo mirarlo. ¿No se ha visto en el espejo?";
        $seccion->imagen = "https://png.pngtree.com/element_origin_min_pic/16/11/27/cfa27c5aa09a3522f02afc8048a6acd0.jpg";
     $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El Sapo";
        $seccion->contenido = "El pobre sapo, avergonzado de su fealdad, se hundió en el lodo llorando su desventura. Pero, muy pronto, halló la rana un castigo a su soberbia. \n Un día, la ranita, mirándose en una charca, se encontró con una culebra de agua que, aproximándose demasiado al pequeño anfibio, le dijo:";
        $seccion->imagen = "https://png.pngtree.com/element_origin_min_pic/16/11/27/cfa27c5aa09a3522f02afc8048a6acd0.jpg";
 $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Cena";
        $seccion->contenido = "- Me parece, preciosa mía, que vas a servirme de suculento banquete esta mañana. \n La culebra saltó y le mordió en la patita a la rana. Ésta, sintiéndose malherida, empezó a croar desesperada y, acordándose del sapo, comenzó a llamarlo a grandes voces. \n - ¡Don Sapo! ¡Don Sapo! ¡Venga por favor! ¡Socorro! ¡Ay, don Sapo! ¡Que me devora un monstruo!";
        $seccion->imagen = "https://cdn5.dibujos.net/dibujos/pintados/201341/sapo-hambriento-monstruos-pintado-por-ivanzito-9851992.jpg";
 $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Cena";
        $seccion->contenido = "El sapo acudió tan deprisa como pudo y, dando con su boca un enorme tirón a la cola de la culebra, la obligó a soltar su presa. \n - Usted perdone, don Sapo, aquello que le dije hace un rato- \n  se explicó la rana- Estaba muy nerviosa. En verdad no me parece usted tan feo y… creo tenerle cariño. \n  Al fin se casaron. Ella se convenció que la fealdad del cuerpo no es cosa importante si está compensada con la belleza del alma.";
        $seccion->imagen = "https://pre00.deviantart.net/6a6a/th/pre/f/2012/262/2/b/married_frogs_by_shiray21-d5faim9.jpg";

    $secciones[] = $seccion;
    $historia->secciones = $secciones;

    $historias[] = $historia;

//Rellenuto *********************************************************************************


$historia = new historia;
    $historia->id = 0;
    $historia->titulo = "Caperucita roja";
    $historia->portada = "https://www.chiquipedia.com/images/cuento-leer-caperucita-roja.jpg";
    $historia->categoria = "Infantil";
    
    $secciones = array();
        $seccion = new seccion;
        $seccion->id = 0;
        $seccion->subtitulo = "La niña";
        $seccion->contenido = "A orillas del bosque vivía una niña llamada Caperucita. \n  Un día su abuela cayó enferma y ella salió a llevarle una rica tarta. Pero en un cruce de caminos apareció un enorme lobo que la engañó y le aconsejó otro camino diciendo que era más corto, para adelantarse y aparecer antes que ella.";
        $seccion->imagen = "https://cdn.shopify.com/s/files/1/1397/4145/articles/Capericita_1024x1024.progressive.jpg?v=1493944081";
    $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El lobo";
        $seccion->contenido = "Cuando el lobo llegó a casa de la abuelita, golpeó la puerta y se hizo pasar por Caperucita, hasta que la abuelita lo dejó entrar.  \n  Una vez dentro, el lobo se comió a la anciana y luego se disfrazó con su ropa para esperar a la niña. Caperucita llegó y al acercarse a la cama encontró a su abuelita muy cambiada, y de pronto, el lobo abrió la boca y se la tragó.";
        $seccion->imagen = "https://st2.depositphotos.com/1005314/10233/v/950/depositphotos_102337982-stock-illustration-red-riding-hood-and-wolf.jpg";
      $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "El lobo";
        $seccion->contenido = "Unos animalitos del bosque lo habían visto todo y habían avisado a un cazador. Cuando encontraron al malvado lobo lo ataron a la rama de un árbol cabeza abajo y le obligaron a expulsar a Caperucita y a su abuelita. Para sorpresa de todos, el lobo las devolvió sanas y salvas y, arrepentido, les pidió perdón.";
        $seccion->imagen = "http://cdn5.dibujos.net/dibujos/pintados/201221/caperucita-roja-15-cuentos-y-leyendas-la-caperucita-roja-pintado-por-tuangel-9741417.jpg";

    $secciones[] = $seccion;
    $historia->secciones = $secciones;

    $historias[] = $historia;

$historia = new historia;
    $historia->id = 0;
    $historia->titulo = "Los animales";
    $historia->portada = "https://i.ytimg.com/vi/2k2IZceeytQ/maxresdefault.jpg";
    $historia->categoria = "Drama";
    
$secciones = array();
        $seccion = new seccion;
        $seccion->id = 0;
        $seccion->subtitulo = "Conejo";
        $seccion->contenido = "Co-ne-jo";
        $seccion->imagen = "https://previews.123rf.com/images/tigatelu/tigatelu1704/tigatelu170400021/76841490-ilustraci%C3%B3n-de-vector-de-conejo-de-dibujos-animados-posando.jpg";
    $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Zorro";
        $seccion->contenido = "Zo-rro";
        $seccion->imagen = "https://st2.depositphotos.com/4769585/12384/v/950/depositphotos_123846344-stock-illustration-fox-sketch-color-hand-drawn.jpg";
     $secciones[] = $seccion;
        $seccion = new seccion;
        $seccion->id = 1;
        $seccion->subtitulo = "Mariposa";
        $seccion->contenido = "Mari-po-sa";
        $seccion->imagen = "http://www.dibucolor.com/Imagenes/mariposa-roja.jpg";


    $secciones[] = $seccion;
    $historia->secciones = $secciones;

    $historias[] = $historia;


//Rellenuto *********************************************************************************

    header('Content-type: application/json');
	echo json_encode($historias);
        
?>