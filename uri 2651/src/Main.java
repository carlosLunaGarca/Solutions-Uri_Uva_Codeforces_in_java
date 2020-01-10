import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
     BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
     String cadena =in.readLine();
     cadena=cadena.toLowerCase();
     if(cadena.contains("zelda")) {
    	 System.out.println("Link Bolado");
     }else {
    	 System.out.println("Link Tranquilo");
     }
	}

}
