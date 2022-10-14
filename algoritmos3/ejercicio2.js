const personas = ["Maria", "Dani", "Luis", "Juan", "Camila"];


//splice(indice, cantidad de elementos a cortar)
//si se agrega un tercer parametro se repone el elemento cortado
// por el tercer elemento
// ejemplo personas.splice(1, 1, "x");
// escribe comando para remover a "dani"
personas.splice(1, 1,);
console.log(personas);

// escribe comando para remover a juam del arreglo
// al eliminarse dani los numeros de las posiciones 
// se recorren 
personas.splice(2, 1);
console.log(personas);

// escribe un comando para agregar a luis al inicio del arreglo
personas.unshift("Luis");
console.log(personas);
// escribe un comando para agregar tu nombre al areglo
personas.push("minombre");
console.log(personas);

//escibe un comando para mostrar la posiciom de maria 
console.log(personas.indexOf("Maria"));

// escribe un comando para mostrar la posicion de tu nombre
console.log(personas.indexOf("minombre"));
