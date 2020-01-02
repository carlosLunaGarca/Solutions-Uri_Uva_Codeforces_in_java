import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int N =Integer.parseInt(in.readLine());
	for (int i = 0; i < N; i++) {
	 String[] cadena=in.readLine().split("");
	 Arrays.parallelSort(cadena);
     int Preguntas=Integer.parseInt(in.readLine());
     for (int j = 0; j < cadena.length; j++) {
		System.out.println(cadena[j]);
		
	}
	}
	
}
}
