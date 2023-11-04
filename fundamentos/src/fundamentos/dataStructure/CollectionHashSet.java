package fundamentos.dataStructure;

import java.util.HashSet;

public class CollectionHashSet {
	public static void main(String[] args) {
		// No HashSet não mantemos uma ordem especifica dos elementos
		// Os elementos do HashSet tbm são únicos
		HashSet<Integer> numeros = new HashSet<>();
		
		numeros.add(1);
		numeros.add(10);
		numeros.add(15);
		numeros.add(22);
		
		var lenght = numeros.size();
		
		numeros.remove(15);
		
		for(Integer elemento : numeros) {
			System.out.println(elemento);
		}
		
		System.out.print(lenght);
	}
}
