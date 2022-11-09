//forma 1

//1

const imagen = document.getElementsByClassName ("contenedor")[0];

console.log(imagen);


// crear elemento
//llamar elemento padre
const imagen2 = document.getElementById("img");

//2
// crear una lista a partir de los elementos guardadps 

const nombres = ["pedro", "juan", "sonia", "miguel"];
const  lista1= document.getElementById("lista1");

nombres.forEach((el) => {
    const li = document.createElement("li");
    li.textContent= el;
    lista1.appendChild(li);
});

const frutas = ["manzana","limon", "pera", "uva"];
const lista2 = document.getElementById("lista2");

frutas.forEach((el) => {
    lista2.innerHTML += `
    <li>${el}</li>
    `;
   

});