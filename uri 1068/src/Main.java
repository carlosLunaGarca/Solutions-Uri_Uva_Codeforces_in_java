import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String cadena=in.readLine().replaceAll("[*-}]", "");
			if(cadena.equals(""))
				break;
			Stack<String> pila=new Stack<String>();
			for (int i = 0; i < cadena.length(); i++) {
				pila.push(cadena.charAt(i)+"");
			}
			int cierres=0,aperturas=0;
			while(!pila.empty()) {
				String aux=pila.pop();
				if(aux.equals("(")) {
					aperturas++;
					if(cierres==0||cierres<aperturas) {
						System.out.println("incorrect");
						break;
					}
				}else if(aux.equals(")")) {
					cierres++;
				}
				if(pila.empty()&&cierres==aperturas) {
					System.out.println("correct");
				}else if(pila.empty()&&cierres!=aperturas) {
					System.out.println("incorrect");
				}
			}
			
		}

	}

}
