import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		Stack<String> pila=new Stack<String>();
		for (int i = 0; i < n; i++) {
		String CadenaRedu=in.readLine().replaceAll("\\.","");
		String[] CadenaD=CadenaRedu.split("");
		int leng=CadenaD.length;
      		for(int j=0;j<leng;j++) {
      			pila.push(CadenaD[j]);
      		}
      		int Apertura=0;
      		int Diamante=0;
      		while (!pila.empty()) {
				String aux=pila.pop();
				if(aux.equals("<")&&Apertura==0) {
					continue;
				}
				if(aux.equals(">")) {
					Apertura++;
				} 
				if(aux.equals("<")&&Apertura>0) {
					Diamante++;
					Apertura--;
				}
				
			}
      		System.out.println(Diamante);
		}

	}
}