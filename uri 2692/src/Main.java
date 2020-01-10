import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<Character, String> teclas = new TreeMap<Character, String>();
        while(true) {
        	String NM=in.readLine();
        	if(NM.equals("")) {
        		break;
        	}
        	int N=Integer.parseInt(NM.split(" ")[0]);
        	int M=Integer.parseInt(NM.split(" ")[1]);
        	for (int i = 0; i < N; i++) {
				String[] Teclas=in.readLine().split(" ");
				teclas.put(Teclas[0].charAt(0),Teclas[1]);
				teclas.put(Teclas[1].charAt(0),Teclas[0]);
			}
        	
        	for (int i = 0; i < M; i++) {
				String cadena=in.readLine();
				String cadenaCorregida="";
				for (int j = 0; j < cadena.length(); j++) {
					char caracter=cadena.charAt(j);
					if(teclas.containsKey(caracter)) {
					cadenaCorregida+=teclas.get(caracter);
					}else {
						cadenaCorregida+=caracter;
					}
				}
				if(i!=M-1) {
				System.out.println(cadenaCorregida);
				}else {
					System.out.print(cadenaCorregida);
				}
			}
        }
	}

}
