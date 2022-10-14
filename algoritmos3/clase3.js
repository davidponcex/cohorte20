function edad(){

    let miEdad = 20
    if ( miEdad >= 21){
        console.log ("eres mayor de edad");

    } else {console.log ("no eres mayor de edad");
    }
    }
edad()
// los operadores logicos hacen estrategias de controles mas grandes 
// and, or, not, and &&, or ||, not !

function conjuncion (){

    let valor1 = false;
    let valor2 = false;
    if ( valor1 && valor2){
        console.log ("el valor 1 y l valor 2 son verdaderos");
    } else{
        console.log ("un valor es falso");
    }
}
conjuncion ()

function disjuncion (){
    let valor1 = false;
    let valor2 = true;
    if(valor1 || valor2 ){
        console.log("el operador or es verdadero ")
    } else {
        console.log("el operador or es falso");
    }
}
disjuncion();

function negacion (){
    let valor1 = false;
    if (!(!valor1)){
        console.log ("el valor es: "+ valor1);
    } else{
        console.log("el valor negado es: "+ valor1);
    }
}
negacion ();