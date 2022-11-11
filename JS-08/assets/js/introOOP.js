
let persona = {
    nombre: "david",
    apellido: "ponce",
    nombreCompleto: function () {
        return "el nombre es " + this.nombre + " " + this.apellido;

}
}

for (nombrePropiedad in persona) {
    console.log("valor: " + persona[nombrePropiedad]);
}

console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());
console.log(persona["apellido"]);
persona.tel = "453452345";
console.log(persona);
console.log(persona.tel);
delete persona.tel
let personaArreglo = Object.values(persona);
console.log(personaArreglo);
let personaString = JSON.stringify(persona);
console.log(personaString);



/* let persona2 = new Object();
persona2.edad = 23;
console.log(persona2);
console.log(persona2.edad); */

