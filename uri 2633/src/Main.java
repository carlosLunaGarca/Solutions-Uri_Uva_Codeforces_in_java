import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String cadena=in.readLine();
			if(cadena==null) {
				break;
			}
			int numero=Integer.parseInt(cadena);
			amigo[] lista= new amigo[numero];
			for (int i = 0; i < numero; i++) {
				String Amigo=in.readLine();
				lista[i]=new amigo(Amigo.split(" ")[0],Integer.parseInt(Amigo.split(" ")[1]));
			}
			Arrays.parallelSort(lista);
			for (int i = 0; i < numero; i++) {
				if(i==numero-1) {
					System.out.print(lista[i].Nombre);

				}else {
				System.out.print(lista[i].Nombre+" ");
				}
			}
			System.out.println();
		}
	}

}
class amigo implements Comparable<amigo>{
	public int numero;
	public String Nombre;
	public amigo(String Nombre,int numero) {
		this.Nombre= Nombre;
		this.numero=numero;
	}
	public int compareTo(amigo o) {
	if(numero>o.numero) {
		return 1;
	}
	if(numero<o.numero) {
		return -1;
	}
		return 0;
	}
}
