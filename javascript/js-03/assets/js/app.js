/*  contorl de flujo  */

/* let edad = Number (prompt("escribe tu edad"));
 */
/* if(condicion === true){
    bloque
    codigo
} */
/* operadores logicos 
   && - AND
   || - OR
   ¡¡ - NOT */

/* console.log(edad === 18) */
/* if( edad > 0 && edad <= 17){
    document.write("tas meco ");
}else if(edad === 18){
    document.write("eres mayor de edad ");
} else if(edad > 18){
    document.write("tas ruco");
}else if (edad < 0 ){
    document.write("es un numero negativo");
}else{
    document.write("esto no es un numero valido ");
}
 */
/* mostrar el dia de la semana segun el valor de dia */
let dia = 1;
if (dia === 1){
    document.write("Lunes")
}else if(dia === 2){
    document.write("martes")
}
else if(dia === 3){
    document.write("miercoles")
}
else if(dia === 4){
    document.write("jueves")
}
else if(dia === 5){
    document.write("viernes")
}
else if(dia === 6){
    document.write("sabado")
}
else if(dia === 7){
    document.write("domingo")
}else{
    document.write("no es un numero valido")
};


/* operador ternario */
// es un if simplificado
/* condicion ? en caso de se verdad : en caso de ser
falso */
/*  */
let edad = 18;

edad >= 18 ? console.log("es mayor de edad ")  : console.log(" tas meco ");
/*  */
let mensaje = (edad >= 18)
? "es mayor de edad"
: "tas meco";
console.log(mensaje);
/*  */
console.log(`yo soy david y soy ${ edad >= 18 ? "soy mayor de edad" : "soy menor de edad"}`);



/*  */