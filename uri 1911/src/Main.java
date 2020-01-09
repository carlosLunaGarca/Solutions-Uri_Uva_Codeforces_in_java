
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String comp=in.readLine().replaceAll("[^\\d0-9]","");
			if(comp.equals(""))
				continue;
			int NumeroEstudiantesC = Integer.parseInt(comp);
			if (NumeroEstudiantesC == 0) {
				break;
			}
			TreeMap<String, String> Lista = new TreeMap<String, String>();
			for (int i = 0; i < NumeroEstudiantesC; i++) {
				String cadena = in.readLine();
				Lista.put(cadena.split(" ")[0], cadena.split(" ")[1]);
			}
			int NumeroAsistentes = Integer.parseInt(in.readLine());
			int cont = 0;
			for (int x = 0; x < NumeroAsistentes; x++) {
				String alumno = in.readLine();
				String firmaO = Lista.get(alumno.split(" ")[0]);
				String firmaA = alumno.split(" ")[1];
				if (firmaA.equals(firmaO) == false) {
					firmaA = firmaA.replaceAll("[^\\dA-Z]", "");
					firmaO = firmaO.replaceAll("[^\\dA-Z]", "");
					int Tam1 = firmaA.length();
					int Tam2 = firmaO.length();
					if (Tam1 > Tam2) {
						if (Tam1 - Tam2 < 2) {
							for (int j = 0; j < Tam2; j++) {
								if (firmaO.charAt(j) != firmaA.charAt(j)) {
									cont++;
								    j=Tam2;
								}
							}

						} else {
							cont++;

						}
					} else {
						if (Tam2 - Tam1 < 2) {
							for (int j = 0; j < Tam1; j++) {
								if (firmaO.charAt(j) != firmaA.charAt(j)) {
									cont++;
									j=Tam1;
								}
							}

						} else {
							cont++;
						}
					}

				}
			}
			System.out.println(cont);
		}
		}

}
