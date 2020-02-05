import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String cont = in.readLine();
			if (cont==null) {
				break;
			}
			int x = Integer.parseInt(cont.split(" ")[0]);
			estudiante[] lista = new estudiante[x];
			for (int i = 0; i < x; i++) {
				lista[i] = new estudiante(in.readLine());
			}
			Arrays.parallelSort(lista);
			for (int i = 0; i < x; i++) {
				if (i != x - 1) {
					System.out.println(lista[i].nombre);
				} else {
					System.out.print(lista[i].nombre);
				}
			}
		}
	}

}

class estudiante implements Comparable<estudiante> {
	public String nombre;
	public String direccion;
	public int costo;

	public estudiante(String info) {
		String[] vec = info.split(" ");
		nombre = vec[0];
		direccion = vec[1];
		costo = Integer.parseInt(vec[2]);
	}

	@Override
	public int compareTo(estudiante es) {
		if (costo < es.costo) {
			return 1;
		}
		if (costo == es.costo && es.direccion.equals(direccion) == false) {
			return direccion.compareTo(es.direccion);
		} else if (costo == es.costo && es.direccion.equals(direccion)) {
			return nombre.compareTo(es.nombre);
		}
		return 0;
	}
}
