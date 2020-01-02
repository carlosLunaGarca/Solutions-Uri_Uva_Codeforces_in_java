import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean com = true;

		ArrayList<String> lista = new ArrayList<String>();

		while (true) {
			String cadena = in.readLine();
			if (cadena==null) {
				
				break;
			}

			if (com) {
				cadena = in.readLine();
				lista.add(cadena);
				com = false;

			} else {
				lista.add(cadena);
				
			}
		}
		Collections.sort(lista, Collator.getInstance(new Locale("es")));

		System.out.println(lista.get(lista.size() - 1));
	}
}
