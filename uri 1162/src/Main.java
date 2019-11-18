import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
public class Main {
	public static void main(String[] args)throws IOException {
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
     int n=Integer.parseInt(in.readLine());
     int itera=0;
     for (int i = 0; i < n; i++) {
		int leng=Integer.parseInt(in.readLine());
		int[] vecAux=Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		  int k, j, aux;
	        for (k = 0; k < leng - 1; k++) {
	            for (j = 0; j < leng - k - 1; j++) {
	                if (vecAux[j + 1] < vecAux[j]) {
	                    aux = vecAux[j + 1];
	                    vecAux[j + 1] = vecAux[j];
	                    vecAux[j] = aux;
	                    itera++;
	                }
	            }
	        }
		System.out.println("Optimal train swapping takes "+itera+" swaps.");
		itera=0;
	}
	}

}
