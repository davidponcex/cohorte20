

let num1 = parseInt (prompt ("inserte numero 1:"));
let num2 = parseInt (prompt ("inserte numero 2:"));
let num3 = parseInt (prompt ("inserte numero 3:"));



function numero ( num1, num2, num3 ){
    
    
if ( (num1 == num2 ) && (num1 == num3)){
   
return (" LOS TRES NUMEROS SON IGUALES" );

} else if ((num1 > num2) && (num2 > num3)){

   return (num1);
   
     
}
/*
else if ((num1 > num3) && (num3 > num2)){

  
}

else if ((num2 > num1) && (num1 > num3)){

 

}

else if ((num2 > num3) && (num3 > num1)){

    
}

else if ((num3 > num1) && (num1 > num2)){

   

}


else  ((num3 > num2) && (num2 > num1))
{

 

}*/
}
let valores = numero (num1, num2, num3);

console.log(valores);





 /*
    return  ("NUMERO MAYOR=" + num1);

} else if ((num2 > num1) && (num2 > num3)){

    return ("NUMERO MAYOR=" + num2)

}  else {

    return("NUMERO MAYOR=" + num3)

}
}
console.log (numeromayor( num1, num2, num3));


/*

function numeromedio ( num1, num2, num3 ){

    if ( (num1 == num2 ) && (num1 == num3)){
   
return (" LOS TRES NUMEROS SON IGUALES" );

}

 else if ( (num2 > num1 ) && (num1 > num3)){
   
    return ("NUMERO MEDIO=" + num1);

    
    } else  ((num1 > num2) && (num2 > num3)) 
     
        return  ("NUMERO MEDIO=" + num2);

    
    
    }


console.log (numeromedio ( num1, num2, num3));



    function numeromenor ( num1, num2, num3 ){

        if ( (num1 == num2 ) && (num1 == num3)){
   
return (" LOS TRES NUMEROS SON IGUALES" );

        }

    if ((num3 > num1 ) && (num2 > num1)){
   
        return ("NUMERO MENOR=" + num1);
        
        } else if ((num1 > num2) && (num3 > num2)){
         
            return  ("NUMERO MENOR=" + num2);
        
        } else { ((num1 > num3) && (num2 > num3))
        
            return ("NUMERO MENOR=" + num3)
        
        }

    }


        

console.log (numeromenor( num1, num2, num3));*/