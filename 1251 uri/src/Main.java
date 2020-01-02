import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;;

class Ascii implements Comparable<Ascii> {
	public int valor;
	public int cant;

	public Ascii(int valor, int cant) {
		super();
		this.valor = valor;
		this.cant = cant;
	}

	@Override
	public int compareTo(Ascii o) {
		if (cant < o.cant) {
			return -1;
		}
		if (cant > o.cant) {
			return 1;
		}
		return 0;
	}

}

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
			String n = "";
			while (true) {
				if (n.equals(""))
				n = sc.readLine();
				String[] cadena = n.split("");
				Arrays.sort(cadena);
				int leng=cadena.length;
				ArrayList<Ascii> lista = new ArrayList<Ascii>();
				String aux = "";
				Ascii a = null;
				int cant = 0;
				for (int i = 0; i < leng; i++) {
					if (cadena[i].equals(aux) == false) {
						aux = cadena[i];

						if (a != null) {
							lista.add(a);
							cant = 0;
						}
						a = new Ascii(cadena[i].hashCode(), cant);
						if (i == leng - 1) {
							cant++;
							lista.add(a);
						}
					} else if (i == leng - 1) {
						lista.add(a);
					}
					a.cant++;

				}
				Collections.sort(lista);
				for (int i = 0; i < lista.size(); i++) {
					System.out.println(lista.get(i).valor + " " + lista.get(i).cant);
				}
			   if((n=sc.readLine()).equals("")==false) {
				   System.out.println();
			   }else {
				   break;
			   }
			}

		
	}
}