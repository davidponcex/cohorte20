// solid 5 princios todos son responsables d esuaccion pero pueden ser modificados
//

// COHESION Y ACOPLAMIENTO 

//HERENCIA 
//    SUPER CLASE

//    SUB-CLASE  

class Persona {
    constructor (nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido; 
    }
    set nombre (nombre){
        this._nombre = nombre;
    }

    set apellido (apellido){
        this._apellido = apellido;
    }
    nombreCompleto (){
        return this._nombre + ' ' + this._apellido;
    }
    toString (){
        return this.nombreCompleto();
    }
}
// para hacer comunicacion entre clases
class Empleado extends Persona {
    constructor(nombre, apellido,empresa){
        super(nombre, apellido);
        this._empresa = empresa;
    }
    set empresa(empresa){
        this._empresa = empresa;
    }
    get empresa (){
        return this._empresa;
    }
    //sobreescritura del metodo
    nombreCompleto (){
        return super.nombreCompleto() + ' ' + this._empresa;
    }
    toString(){
        return this.nombreCompleto();
    }
    
}

let persona1 = new Persona('Monica', ' Gonzalez');
console.log(persona1.nombreCompleto());
console.log(persona1.toString());

let empleado1 = new Empleado ( 'David', 'Ponce' ,'coppel');
console.log(empleado1.nombreCompleto());
console.log(empleado1.toString());
