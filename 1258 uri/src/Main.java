import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class alumno implements Comparable<alumno> {
	public String color;
	public String talla;
	public String Nombre;

	public alumno(String color, String talla, String nombre) {
		this.color = color;
		this.talla = talla;
		Nombre = nombre;
	}

	@Override
	public int compareTo(alumno o) {
		if (color.equals("branco") && o.color.equals("vermelho")) {
			return -1;
		}
		if (color.equals("vermelho") && o.color.equals("branco")) {
			return 1;
		}
		if (color.equals(o.color) && talla.equals("P") && o.talla.equals("M")
				|| talla.equals("P") && o.talla.equals("G")) {
			return -1;
		}
		if (color.equals(o.color) && talla.equals("M") && o.talla.equals("G")) {
			return -1;
		}
		String[] vec = { o.Nombre, Nombre };
		Arrays.parallelSort(vec);
		if (talla.equals(o.talla) && vec[0].equals(Nombre)) {
			return -1;
		}
		if (talla.equals(o.talla) && vec[0].equals(o.Nombre)) {
			return 1;
		}

		return 0;
	}

}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean ber = false;
		while (true) {
			int n = Integer.parseInt(in.readLine());
			alumno[] alumnos = new alumno[n];
			if (n == 0) {
				break;
			} else if (ber) {
				System.out.println();
			}
			ber = true;
			for (int i = 0; i < n; i++) {
				alumno a = new alumno(null, null, in.readLine());
				String[] vec = in.readLine().split(" ");
				a.color = vec[0];
				a.talla = vec[1];
				alumnos[i] = a;
			}
			Arrays.parallelSort(alumnos);
			for (int i = 0; i < n; i++) {
				System.out.println(alumnos[i].color + " " + alumnos[i].talla + " " + alumnos[i].Nombre);
			}

		}
	}
}
