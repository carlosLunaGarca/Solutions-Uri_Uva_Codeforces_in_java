import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			String[] nm = in.readLine().split(" ");
			int n = Integer.parseInt(nm[0]), m = Integer.parseInt(nm[1]);
			reno[] lista = new reno[n];
			for (int j = 0; j < n; j++) {
				reno x = new reno(in.readLine());
				lista[j] = x;
			}
			Arrays.parallelSort(lista);
			System.out.println("CENARIO {" + (i+1) + "}");
			for (int j = 0; j < m; j++) {
				System.out.println(j+1 + " - " + lista[j].Nombre);
			}
		}

	}

}

class reno implements Comparable<reno> {
	public String Nombre;
	public int peso;
	public int edad;
	public double altura;

	public reno(String info) {
		super();
		String[] vec = info.split(" ");
		Nombre = vec[0];
		peso = Integer.parseInt(vec[1]);
		edad = Integer.parseInt(vec[2]);
		altura = Double.parseDouble(vec[3]);
	}

	@Override
	public int compareTo(reno o) {
		if(peso<o.peso) {
			return 1;
		}else
		if(peso>o.peso) {
			return -1;
		}else
		if(peso==o.peso&&edad<o.edad) {
			return -1;
		}else
		if(peso==o.peso&&edad>o.edad) {
			return 1;
		}else
		if(peso==o.peso&&edad==o.edad&&altura<o.altura) {
			return -1;
		}else
		if(peso==o.peso&&edad==o.edad&&altura>o.altura) {
			return 1;
		}else
		if(peso==o.peso&&edad==o.edad&&altura==o.altura) {
			return Nombre.compareTo(o.Nombre);
		}  		
		
		return 0;
	}
}
