import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
class palabra implements Comparable<palabra>{
        public int tam;
        public String Palabra;
		public palabra( String palabra) {
			super();
			tam = palabra.length();
			Palabra = palabra;
		}


		@Override
		public int compareTo(palabra o) {
		    if (tam<o.tam) {
		    	return 1;
		    }if (tam>o.tam) {
		    	return -1;
		    }
			return 0;
		}
		
	}
public class Main {
	
public static void main(String[] args)throws IOException {
  BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
  int n=Integer.parseInt(in.readLine());
  for (int i = 0; i < n; i++) {
	StringTokenizer palabras=new StringTokenizer(in.readLine()," ");
	palabra[] VecPalabras=new palabra[palabras.countTokens()];
	for (int j = 0; j < VecPalabras.length; j++) {
		palabra p=new palabra(palabras.nextToken());
		VecPalabras[j]=p;
	}
	Arrays.parallelSort(VecPalabras);
	for (int j = 0; j < VecPalabras.length; j++) {
		if(j==VecPalabras.length-1) {
		System.out.println(VecPalabras[j].Palabra);
		}else {
			System.out.print(VecPalabras[j].Palabra+" ");
			
		}
	}
}
}
}
