package colecciones;

import java.util.*;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List - ArrayList
		//valores de un  mismo tipo
		
		System.out.println("------ArrayList-----");
		
		List<String> miArray = new ArrayList<String>();
		
		miArray.add("CUL");
		miArray.add("GML");
		miArray.add("MAZ");
		miArray.add(1, "Mochis");
		String valorRemovido = miArray.remove(1);
	//	boolean valorRemovido = miArray.remove(1);
		
		System.out.println(miArray);
		System.out.println(valorRemovido);
		System.out.println(miArray.size());//size() == length
		
		imprimir(miArray);
		
		System.out.println("------HashSet------");
		// es la variacion mas rapida de todas
		//no permiten elementos duplicados
		//no maneja indice
		Set<String> miSet = new HashSet<String>();
		
		miSet.add("ale");
		miSet.add("mariana");
		miSet.add("kenia");
		miSet.add("mariana");
		miSet.add("abi");
		System.out.println(miSet);
		imprimir(miSet);
		
		
		System.out.println(miSet.contains("kenia"));
		
		System.out.println("------HashMap------");
		//pares de valores LLAVE -- VALOR
		Map<String, Integer> miMap = new HashMap<String, Integer>();
		miMap.put("valor 1", 8);
		miMap.put("valor 2", 8);
		miMap.put("valor 3", 9);
		System.out.println(miMap);
		System.out.println(miMap.get("valor 3"));
		System.out.println(miMap.keySet());
		
		for(String llave : miMap.keySet()) {
			System.out.println(llave + " : " + miMap.get(llave));
		}

	}
	public static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion ) {
			System.out.println("Elemento = " + elemento);
		}
	}

}
