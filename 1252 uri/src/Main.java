import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class numero implements Comparable<numero> {
	public int n;
	public int M;

	public numero(int n, int m) {
		this.n = n;
		M = m;
	}

	@Override
	public int compareTo(numero o) {
		
		if (n % M > o.n % M) {
			return 1;
		}
		if (n % M < o.n % M) {
			return -1;
		}
		if (n % M == o.n % M && n % 2 == 0 && o.n % 2 != 0 || n % M == o.n % M && o.n % 2 == 0 && n % 2 != 0) {
			if (n % 2 == 0) {
				return 1;
			} else {
				return -1;
			}

		}
		if (n % M == o.n % M && n % 2 == 0 && o.n % 2 == 0) {
			if(n<o.n) {
				return -1;
			}
			return 1;
		}
		if (n % M == o.n % M && n % 2 != 0 && o.n % 2 != 0) {
			if(n>o.n) {
				return -1;
			}
			return 1;
		}

		return 0;
	}

	

}
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String cadena=in.readLine();
			if(cadena.equals("0 0") ){
				break;
			}
			String[] NM = cadena.split(" ");
			int n = Integer.parseInt(NM[0]);
			int M = Integer.parseInt((NM[1]));

			numero[] Numeros = new numero[n];
			for (int i = 0; i < n; i++) {
				numero x = new numero(Integer.parseInt(in.readLine()), M);
				Numeros[i] = x;

			}
			Arrays.parallelSort(Numeros);
			System.out.println(cadena);
			for (int k = 0; k < n; k++) {
				System.out.println(Numeros[k].n);
			}

		}
		System.out.println("0 0");

	}
}
