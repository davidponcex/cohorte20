 const indexTest = require ("../calculadora"); 
/* import { indexTest } from "../calculadora"; //   */babel
test ("test suma", () => {
    const r =  indexTest.suma(1,2);
    expect (r).toBe(3);
});

test.todo('test de resta');
test.todo('test de multi');
test.todo('test de divi');