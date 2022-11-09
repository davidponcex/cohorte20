/*  */
const nombre = () => {
    const nombres = ["pepe", "pancho", "maria"]; 
  /*   setTimeout(() => {
        return nombres;
    },0);
*/
return new Promise ((resolve, reject) => { //resolve ---  proceso exitoso
    setTimeout(() => {             // reject -- proceso no exitoso
        if(true){
            resolve(nombres);
        }else{
            reject("no hay dato");
        }
    },3000)
})
    
}

//servidor

/* nuestra pc
*/

/* console.log(nombre()[0]);  */

/* nombre().then(nombres => console.log(nombres)).catch(Error => console.warn(error));
console.log(nombre());
 */

/* AZUCAR SINTACTICA */

//async -- await
//function
/* const obtenerNombre = async () => {
    try {
        let nombres = await nombre();
        console.log(nombres);
    } catch (error) {
        console.log(error);
    }

}
obtenerNombre();
 */

/* 
const url = 'https://pokeapi.co/api/v2/pokemon/1';

const pokedex = () => {
    fetch(url)
    .then(datos => datos.json())
    .then(pokemon =>console.log(pokemon))
    .catch(error => console.log(error))

    };
pokedex();
*/

const cartaPokemon = document.getElementById('pokemon');
const nombrePokemon = document.getElementById('nombre');
const imagen = document.getElementById('img');
const formulario = document.getElementById ('form')


const pokedex = async (numero) => {
    const url = `https://pokeapi.co/api/v2/pokemon/125/${numero}`;
    try {
        
        const respuesta = await fetch(url);
        const pokemon = await respuesta.json();
        
        console.log(pokemon.name);
        
        const datos = {
            nombre: pokemon.name,
            imagen: pokemon.sprites.other['official-artwork'].front_default,
        }
        
        console.log(datos.imagen);
        
        nombrePokemon.textContent = datos.nombre;
        imagen.innerHTML = `
        <img src="${datos.imagen}" alt="imagen de ${datos.nombre}" width="250"/>
        `;
        
        
    } catch (error) {
        
        
        
    }
}

form.addEventListener('submit', (evento) => {
    //codigo
    evento.preventDefault();
    const valor = document.getElementById('idp');
    console.log(valor.value); 
    
    pokedex(valor);
    form.reset();
})



/* const cartaPokemon = document.getElementById('pokemon');
const nombrePokemon = document.getElementById ('nombre');
const imagen = document.getElementById('img');

const url = 'https://pokeapi.co/api/v2/pokemon/1';
const pokedex = async () => {
    try {
        const respuesta = await await fetch(url);
        const pokemon = await respuesta.json();

        console.log(pokemon.name);
        const datos = {
            nombre: pokemon.name
            imagen: pokemon.sprites.other['official-artwork'].front_default

        }
        
        nombrePokemon.textContent = datos.nombre;
        imagen.innerHTML = `
        <img src="${datos.imagen}" alt="imagen de ${datos.nombre}
        
        `
        
    } catch (error) {
        
    }
}
pokedex(); */