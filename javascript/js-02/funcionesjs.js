let miNombre = "davidponce";
console.log(miNombre);


function miFuncion (){
    let nombre = "david";
    console.log(nombre)
}
miFuncion();

function funcion1 (){
    let valor = 2;
    valor = valor + 3;
    return valor;
}
let resultado = funcion1();
console.log("el resultado es: " + resultado);

function funcion2(){
    let valor1 = 5;
    valor1 = valor1 + 10;
    console.log("el resultado de valor1 es:  " + valor1);
}
funcion2();

/* ambito de una funcion
ambito global y ambito local */
/* ambito local:
variable declarada adentro de la funcion */
/* anbito global:
la variable esta fuera de la funcnion */
let variableGlobal = 5;
function funcion3(){
    let variableLocal = "El valor es. ";
    console.log(variableLocal + variableGlobal);
}
funcion3();
/* parametros */
function funcion4 (valorx = 4){
    let numero = 6;
    numero = numero * valorx;
    return numero;
}
let salida = funcion4();
console.log ("el producto es: " + salida);

/* funciones anonimas(no se les asigna un nombre o identificador) */

/* se asigan directamente a una variable */

let miFuncion0 = function (parametro){
    parametro = parametro * 2;
    return parametro;
};
console.log("llamando la funcion anonima  " + miFuncion0 (5));

let funicion01 = function( caracteres){
    return("k pex " + caracteres);
}("wex");
console.log("el resultado es: " + funicion01);

/* FUNCION FLECHA*/

let suma = (x, y) => { return x + y };
let result = suma (2, 8);
console.log("la suma es " + result);

/* Realizar una funcion (calcularPrecioTotal)
para Calcular el precio total de una compra tomando encuenta 
impuestos = 1.16, gartos de envio = 10, y como parametro el precio
donde 
precioTotal = (precio * impuesto ) + gartosEnvio;

como salida precio Total
precioTotal = calcularPrecioTotal(23.34);
Para que el ejemplo anterior sea más completo, se puede añadir otro argumento a la función que indique el porcentaje de impuestos que se debe añadir al precio del producto. Evidentemente, el nuevo argumento se debe añadir tanto a la definición de la función como a su llamada:let precioConImpuestos = (1 + porcentajeImpuestos/100) * precio
calculaPrecioTotal(precio, porcentajeImpuestos)
;


 */
function precio(){
    let impuesto = 1.16
    let envio = 10
    let precio = 23.34
    let precioTotal = (impuesto * precio) + envio;
    return precioTotal;
}
let costoTotal = precio();
console.log("el precio total es: " + costoTotal);

let calcularTotal = function (precio){
    let impuestos = 1.16;
    let gastosenvio = 10;
    let precioTotal = (impuestos * precio) + gastosenvio;
    return precioTotal;
}
let precioTotal = calcularTotal(23.34);
console.log("el precio total es: " + precioTotal);

/* FUNCION ORIENTACION A OBJETOS */
/* todo lo que esta dentro del lenguaje de programacion son objetos */
/* abstracion: descripcion de algo de forma genral. */

/* objeto es una estructura que tiene atributos y metodos
los atibutos se asignan con : si se asignan mas atributos se pone una , al cerrar las llaves se terminan con ; 
en el mundo de los objetos a la llamada del objeto se le 
llama instancia*/

let miObjeto = {
    nombre: "David",
    edad: 29,
    datos: function (){
        
        let mensaje = "tu nombre es: " + this.nombre;
        console.log (mensaje);
        mensaje += "tienes" + this.edad + " años";
        console.log(mensaje);
    }
};
/* instancia */

miObjeto.datos();
/* CONSTRUCTOR */
/* para crear un contstructo se define una variable y es como una 
funcion anonima, dentro de esa funcion se construye el objeto
 */
let constructor = function (){
    let objPersona = {
        nombre: "persona X ",
        nss: 15432,
        datosPersona: function (){
            let msj = "eres " + this.nombre + "numero nss es " + this.nss;
            console.log(msj);
        },
        otroMetodo: function(parametro){
            let numero = 8;
            console.log("la suma es : "+ (numero + parametro));
        }
    };
    return objPersona;  
};
let varObjReg = constructor()//se creo la variable llamada objeto
varObjReg.datosPersona();
varObjReg.otroMetodo(5);