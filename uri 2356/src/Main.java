
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    while(true) {
    	String bacteria=in.readLine();
    	if(bacteria.equals("")) {
    		break;
    	}
    	String cadena=in.readLine();
    	if(bacteria.contains(cadena)) {
    		System.out.println("Resistente");
    	}else {
    		System.out.println("Nao resistente");
    	}
    }
	}

}
