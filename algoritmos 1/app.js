alert("hola mundo desde visual code!");
// declarar de una variable (let) se puede guardar vacia 

let mivariable;

//inicializar variable con = se inicializa la variable y poder guardar un dato


const otravariable = 5;
mivariable = "hola";
let nombre = "david";  

console.log(otravariable);
console.log(mivariable);
console.log(nombre);


// mutacion de valor, reasignacion 

mivariable = "adios";

console.log(mivariable);

//valores primitivos

//string cadena de texto(palabras, nombres caracteres)
let palabra ="lo que sea"
console.log(palabra);

//number - numeros 
let num = 8;
let num2 = 8.88;
let num3 = 8546
console.log(num);
console.log(num2);
console.log(num3);
//operaciones de suma
console.log(num + num2 + num3);
// cadena de texto mas numero da concatenacion 
console.log("este numero es " , num);
console.log("este numero es " + num);

console.log("1" + 1);
console.log("1" + "1");

//boolean - boleano
// dos estados (true - false)

let verdadero = true
let falso = false

console.log(verdadero);
console.log(falso);

//null
let valornulo = null;
console.log(valornulo +1);
// null variable vacia intencionalmente

//undefined
// es un estado esta variable ocupa un espacio 
//esperando valor 
let varundefine;
console.log(varundefine);


//operador typof- nos permite conocer el tipo de dato

let a = 1;
let b = "hola"
let c = true;

console.log(typeof a);
console.log(typeof (b));
console.log(typeof(c));
console.log(typeof(null));
console.log(typeof(6243));

