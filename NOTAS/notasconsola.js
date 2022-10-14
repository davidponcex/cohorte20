/*FUNDAMENTOS DE LA TERMINAL

existen diferentes sistemas operativos con 
diferente terminal

que hacer la terminal?
 
se teclean comandos, a la terminal se le conoce 
como cli 

la terminal tambien llamada bash

en windows es cmd
pero se pueden usar otras herramientas como
windows power shell

TAREA

function numeros (){
    let num1 = parseInt (prompt ("inserte numero 1:"));
    let num2 = parseInt (prompt ("inserte numero 2:"));
    let num3 = parseInt (prompt ("inserte numero 3"));
    
if( (num1 > num2 ) && (num1 > num3)){
   
return ("NUMERO MAYOR"+ num1);

} else if ((num1 > num2) && (num2 > num3)){
 
    return  ("NUMERO MEDIO"+ num2);

} else if ((num3 < num1) && (num3 < num2)){

    return ("NUMERO MENOR"+ num3)

}




}
console.log (numeros());