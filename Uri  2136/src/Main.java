
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		ArrayList<Estudiante> lista = new ArrayList<>();
		ArrayList<String> YES = new ArrayList<String>();
		ArrayList<String> NO = new ArrayList<String>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String registro = "";
		int i = 0;
		while (true) {
			registro = in.readLine();
			if (registro.equals("FIM")) {
				break;
			}
			if (registro.split(" ")[1].equals("YES")) {

				Estudiante n = new Estudiante(registro + " " + i);
				lista.add(n);
				if (YES.contains(registro) == false) {
					YES.add(registro);
				}
			} else {
				NO.add(registro);
			}

			i++;
		}
		Collections.sort(lista);
		Collections.sort(NO);
		Collections.sort(YES);
	
		for (int j = 0; j < YES.size(); j++) {
			System.out.println(YES.get(j).split(" ")[0]);
		}
		for (int j = 0; j < NO.size(); j++) {
			System.out.println(NO.get(j).split(" ")[0]);

		}
		System.out.println();
		System.out.println("Amigo do Habay:");
		System.out.println(lista.get(0).Registro.split(" ")[0]);
	}

}

class Estudiante implements Comparable<Estudiante> {
	public String Registro;

	public Estudiante(String Registro) {
		this.Registro = Registro;
	}

	@Override
	public int compareTo(Estudiante o) {
		if (Registro.split(" ")[0].length() > o.Registro.split(" ")[0].length()) {
			return -1;
		}
		if (Registro.split(" ")[0].length() == o.Registro.split(" ")[0].length()
				&& Integer.parseInt(Registro.split(" ")[2]) > Integer.parseInt(o.Registro.split(" ")[2])) {
			return 1;
		}
		return 0;
	}

}
