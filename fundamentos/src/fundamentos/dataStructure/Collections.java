package fundamentos.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class Collections {
	public static void main(String[] args) {
		// O Integer é uma classe que pode ser gerenciada
		
		// As chaves são únicas e se sobreescrevem
		Map<String, Integer> notas = new HashMap<>();
		notas.put("Felipe", 10);
		notas.put("Maria", 9);
		notas.put("Ana", 8);
		
//		var nota = notas.get("Felipe");
//		System.out.print(nota);
		
		for(Map.Entry<String, Integer> entry : notas.entrySet()) {
			var key = entry.getKey();
			var val = entry.getValue();
			
			System.out.println("chave " + key + ": " + val);
		}
		
	}
}
