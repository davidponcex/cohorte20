package mis_clases.cloecciones;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		  
	       
        list.add("A");
        list.add("B");
        list.add(null);
        list.add("D");
  
       
        System.out.println("ArrayList: " + list);
       
  
       
        HashMap<Integer, String> hm  = new HashMap<Integer, String>();
  
       
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
  
        
        System.out.println("HashMap: " + hm.get(1));
        System.out.println("HashMap: " + hm.get(3));


	}

}
