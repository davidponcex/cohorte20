/* formas de declarar variables let var
en java script existen  tipos de dato
 //valores primitivos
//string
//number
//boolean
//null
//undefined
*/
let miVariable = prompt("cuales es tu nombre:")

function saludoDavid(miVariable){
    alert (miVariable);

}
//let num1 = parseInt (prompt("da el valor de numero 1"));
//let num2 = parseInt (prompt("da el valor de numero 2"))
function suma(){
   let num1
   let num2
    let resultado = num1 + num2;
 return resultado;

}
saludoDavid(miVariable);
suma();

//funcion 

function suma2 () {

let valor1 = 8;
let valor2 = 8;

return valor1 + valor2
}
console.log  ("el resultado de la suma:" + suma2());

function resta (){

    let valor1 = 234;
    let valor2 = 143;
    return valor1 - valor2;
}

console.log ("el resultado de la resta:"+ resta());