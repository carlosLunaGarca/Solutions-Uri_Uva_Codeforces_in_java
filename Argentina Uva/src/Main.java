import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class jugador implements Comparable<jugador> {
	public String Nombre;
	public int Ataque;
	public int defenza;

	public jugador(String nombre, int ataque, int defenza) {
		super();
		Nombre = nombre;
		Ataque = ataque;
		this.defenza = defenza;
	}

	@Override
	public int compareTo(jugador o) {
		if (Ataque < o.Ataque) {
			return -1;
		}
		if (Ataque > o.Ataque) {
			return 1;
		}
		if (Ataque == o.Ataque && defenza > o.defenza) {
			return -1;
		}
		if (Ataque == o.Ataque && defenza < o.defenza) {
			return 1;
		}
		if (Ataque == o.Ataque && defenza == o.defenza && Nombre.charAt(0) > o.Nombre.charAt(0)) {
			return -1;
		}
		if (Ataque == o.Ataque && defenza == o.defenza && Nombre.charAt(0) < o.Nombre.charAt(0)) {
			return 1;
		}
		return 0;

	}

}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for (int j = 0; j < n; j++) {
			jugador[] equipo = new jugador[10];
			String[] vec = null;
			for (int i = 0; i < 10; i++) {
				vec = in.readLine().split(" ");
				jugador Jugador = new jugador(vec[0], Integer.parseInt(vec[1]), Integer.parseInt(vec[2]));
				equipo[i] = Jugador;
			}
			Arrays.sort(equipo);
			String[] def = new String[5];
			String[] at = new String[5];

			for (int i = 0; i < 10; i++) {
				if (i < 5) {
					def[i] = equipo[i].Nombre;
				} else if (i - 5 < 5)
					at[i - 5] = equipo[i].Nombre;
			}
			Arrays.parallelSort(def);
			Arrays.parallelSort(at);
			System.out.println("Case " + (j + 1) + ":");
			for (int i = 0; i < 10; i++) {
				if (i < 5) {
					if (i < 4) {
						if (i == 0) {
							System.out.print("(" + at[i] + ",");
						} else {
							System.out.print(" " + at[i] + ",");
						}
					} else if (i == 4)
						System.out.println(" " + at[i] + ")");
				} else {
					if (i - 5 < 4) {
						if (i - 5 == 0) {
							System.out.print("(" + def[i - 5] + ",");
						} else {
							System.out.print(" " + def[i - 5] + ",");
						}
					} else if (i - 5 == 4)
						System.out.println(" " + def[i - 5] + ")");

				}
			}
		}
	}
}
