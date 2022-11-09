const titulo = document.getElementById("titulo");
const parrafos = document.getElementsByClassName("parrafo");

titulo.textContent = "hola"
parrafos[0].innerHTML = "soy un parrafo"

console.log(titulo.textContent);
console.log(parrafos[1].textContent);

/* parrafos[1].style.color = "blue"; 
parrafos[1].style.backgroundColor = "azure" */

parrafos[1].classList.add("colores");

//crear elementos html

const padre =document.getElementById("padre");
const enlace = document.createElement("a");
enlace.href = "https://www.google.com";
enlace.textContent = "ir a Google";

/* document.body.appendChild(enlace) */
/* document.body.insertAdjacentElement("afterbegin", enlace) */
padre.appendChild(enlace);
console.log(document.body);