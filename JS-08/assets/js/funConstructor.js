let constructor = function (){
    let valor0 = 0;
    let valor1 = 0;

    // declarando objeto
    let persona ={
        nombre: "david",
        apellido: "ponce de leon",
        suma: function(a, b){
            return a + b;
        },

        get nombre (){
            return this.nombre;
        }
    };
    return persona;

}