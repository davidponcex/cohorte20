// propiedades de arreglos
// length

const frutas = ["x", "manzana", "guayaba"];
console.log(frutas);

console.log(frutas.length);

//Metodos    - aciones

// push () agrega al final

frutas.push("sandia ", "limon");
console.log(frutas);

// unshift agrega elementos al inicio del array

frutas.unshift("guanabana");
console.log(frutas);

// metodos para quitar elementos (del final) del array y 
// almacenar en una variable (let elemento = frutas.pop())
// pop()

frutas.pop();
console.log(frutas);

// shift() 

let elemento = frutas.shift();
console.log(frutas);
console.log(elemento);

// index of()
// busca la posicion del elemento en el arreglo

console.log(frutas.indexOf('x'));

// reverse()
// invierte el orden de los elementos el primero al ultimo
// el ultimo al primero

frutas.reverse();
console.log(frutas);

frutas.reverse();
console.log(frutas);

// sort()
// ordena con numeros ordena solo el primer 
//numero en la cifra 

frutas.sort();
console.log(frutas);

const letras = [a, f, h, i, w, n,];
letras.sort();
console.log(letras);

// para ordenar numeros se utiliza un algoritmo 
// de comparacion se utiliza una funcion callback 
// 

const numeros = [4, 567, 2, 4566, 45, 78, 1];
//para acomodar numeros en un arreglo  se utiliza esta 
// funcion sort((a,b) => a -b);

numeros.sort((a,b) => a -b);
console.log(numeros)

