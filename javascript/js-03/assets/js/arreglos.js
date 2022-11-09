/* const / let / var */
/*  */

const numeros =[2, 4, 6, 57, 200];
let suma = 0; 

/* metodo  */
// forEach
// recorre todo el arreglo y ejecuta el codigoque le indiquemos sobre los valores guardados

/*  numeros.forEach(function sumar (elemento){
    suma = suma + elemento;
    return suma;
    /* console.log(elemento * elemento); */
    /* suma += suma hace lo mismo  */
/* });
console.log(suma); */ 

numeros.forEach((el, indice, arreglo) => {
    console.log(el, indice, arreglo);
});
console.log(numeros);

/* map 
   gernera una copia del arreglo original*/
let nuevoArr = numeros.map((el) => {
    return el * el;
});
console.log(nuevoArr);

/* filter
   crea una copia del arreglo original y nos permite filtrar  */

   const frutas = ["papaya", "manzana", "manzana", "uva" ];
   let frutaFiltrada = frutas.filter((fruta) => fruta.length > 3);
   console.log(frutaFiltrada);