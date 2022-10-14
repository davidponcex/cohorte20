function suma2() {
  let valor1 = 8;
  let valor2 = 8;

  return valor1 + valor2;
}
console.log("el resultado de la suma:" + suma2());

function resta() {
  let valor1 = 234;
  let valor2 = 143;
  return valor1 - valor2;
}

console.log("el resultado de la resta:" + resta());

function multi() {
  let valor1 = 234;
  let valor2 = 143;
  return valor1 * valor2;
}

console.log("el resultado de la multiplicacion es :" + multi());

function div() {
  let valor1 = 1;
  let valor2 = 0;
  return valor1 / valor2;
}

alert("el resultado de la division es:" + div());

function resto() {
  let valor1 = 7;
  let valor2 = 2;
  let resultado = valor1 % valor2;
  return resultado;
}

alert("el resultado es " + resto());

function div() {
  let valor1 = 1;
  let valor2 = 0;
  if (valor2 != 0) {
    return valor1 / valor2;
    alert("el resultado de la division es:" + div());
  }
}



function adicionales() {
  let valor1 = 7;
  valor1 /= valor1;
  return valor1;
}
alert("la adicion es:" + adicionales());

// funcion de control que se necesita ejecutar
// funcion if(){}

function logico() {
  let valido = 5;
  let valido2 = 3;
  if (valido > valido2) {
    console.log("el numero es :" + valido2);
  }
  //console.log ("el valor boleano es:"+ valido)
}
logico();
