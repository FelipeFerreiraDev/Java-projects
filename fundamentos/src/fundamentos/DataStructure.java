package fundamentos;
import java.util.ArrayList;
import java.util.List;

public class DataStructure {
	public static void main(String[] args) {
		// Lista
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Maria");
		nomes.add("Ana");
		nomes.add("Camila");
		
//		nomes.forEach(nome -> System.out.print("\n" + nome));
		
		// Método por refêrencia
//		nomes.forEach(System.out::println);
		
		for(String nome : nomes) {
			System.out.print("\n" + nome);
		}
	}
}
