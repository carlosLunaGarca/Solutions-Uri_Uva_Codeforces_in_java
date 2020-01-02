import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    TreeMap<String, String>	mapa=new TreeMap<>();
    int pc=Integer.parseInt(in.readLine());
    for(int i=0;i<pc;i++) {
      mapa.put(in.readLine(), in.readLine());
    }
    int sc=Integer.parseInt(in.readLine());
    for (int i = 0; i <sc; i++) {
		System.out.println(in.readLine());
		System.out.println(mapa.get(in.readLine()));
		System.out.println();
	}
}
}
