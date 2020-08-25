import java.nio.channels.CancelledKeyException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {
		System.out.println(reversar("Camilo Valderrama!"));
		
		
		System.out.println(
				palabraMasLarga(Arrays.asList("unossssss", "dos", "tres", "cuatro", "cincos"))
		);
		
	}
	

	public static String reversar(String texto) {
		// Escribe  tu código
		StringBuilder reverseText = new StringBuilder();
		reverseText.append(texto);
		return reverseText.reverse().toString();
	}
	
	public static String palabraMasLarga(List<String> palabras) {
		int size = 0;
		int index = 0;
		int indexWord = 0;
		
		for (String p : palabras) {
			int sizeWord = p.length();
			
			if(sizeWord > size) {
				indexWord = index;
				size = sizeWord;
			}
			index++;
			
		}
		return palabras.get(indexWord);
	}

}