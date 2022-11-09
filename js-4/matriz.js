let arreglo = [
    [1, 2, 3], 
    [4, 5, 6],
    [7, 8, 9] 

];

//recorrer elementos del arreglo
//se utilizan bucles 
//FOR
/* for (inicializacion; test condicion; iteracion statemens){
    satatmet(s) para ser ejecutado si la condicion de prueba es true} */
  /*   un for busca por fila
    for (let i = 0; i <= 2; i++){               }
console.log(arreglo [i]) */
// for estructuras que encapsulan un proceso de repeticion

// para buscar filas y columnas 
 let fila = 0
 do {
    for (let columna = 0; columna <=2; columna++){
        console.log(arreglo[fila][columna]);
    }
    fila++;
    console.log("---");
 }while(fila <= 2)

/* 
while(fila < 3 ){
    for (let columna = 0; columna <= 2; columna++){
        console.log(arreglo [fila][columna]); 
    }
    fila++;
    console.log("--------------");
}  */
// ciclo while repeticion con caracteristicas esepeciales
// en el proceso ejecuta una prueba logica
// el ciclo while comprueba una condicion 
/* while (expresion){
    statemts para ser ejecutados si la esxpresion es true
} */
/* let contador = 0; */
/* while(contador <10){
    console.log(contador);
    contador = contador + 1;
} */
/* do{
    console.log(contador);
    contador ++
}while(contador <= 10);
 */
let matrizA = [[2, 2, 2],[1, 2, 3],[6, 1, 5]];
let matrizB = [[1, 2, 4],[4, 5, 6],[7, 8, 9]];

