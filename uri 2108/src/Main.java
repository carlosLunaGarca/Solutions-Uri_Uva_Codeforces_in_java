import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int Mayor=0;
		ArrayList<String> Palabra=new ArrayList<String>();
		while(true) {
			String[] cadena=in.readLine().split(" ");
			if(cadena[0].equals("0")) {
				System.out.println();
				System.out.println("The biggest word: "+Palabra.get(0));
				break;
			}
			int x=cadena.length;
			for (int i = 0; i < x; i++) {
				int pala=cadena[i].length();
				if(pala>Mayor) {
					Mayor=pala;
					Palabra.clear();
					Palabra.add(cadena[i]);
				}else if(pala==Mayor) {
					Palabra.add(cadena[i]);
					
				}
				if(i<x-1&&x!=1) {
					System.out.print(pala+"-");
				}else if(i==x-1&&x!=1){
					System.out.println(pala);
				}else if(x==1){
					System.out.println(pala);
				}
			}
			Collections.sort(Palabra);
		}

	}

}
