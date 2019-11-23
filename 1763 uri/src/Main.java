import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
public static void main(String[] args)throws IOException {
	try {
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	TreeMap<String, String> mapa= new TreeMap<String, String>();
	mapa.put("brasil","Feliz Natal!");
	mapa.put("alemanha","Frohliche Weihnachten!");
	mapa.put("austria","Frohe Weihnacht!");
	mapa.put("coreia","Chuk Sung Tan!");
	mapa.put("espanha","Feliz Navidad!");
	mapa.put("grecia" , "Kala Christougena!");
	mapa.put("estados-unidos","Merry Christmas!");
    mapa.put("inglaterra","Merry Christmas!");
    mapa.put("australia" ,"Merry Christmas!");
    mapa.put("portugal","Feliz Natal!");
    mapa.put("suecia","God Jul!");
    mapa.put("turquia","Mutlu Noeller");
    mapa.put("argentina","Feliz Navidad!");
    mapa.put("chile","Feliz Navidad!");
    mapa.put("mexico","Feliz Navidad!");
    mapa.put("antardida","Merry Christmas!");
    mapa.put("canada","Merry Christmas!");
    mapa.put("irlanda","Nollaig Shona Dhuit!");
    mapa.put("belgica","Zalig Kerstfeest!");
    mapa.put("italia","Buon Natale!");
    mapa.put("libia","Buon Natale!");
    mapa.put("siria","Milad Mubarak!");
    mapa.put("marrocos","Milad Mubarak!");
    mapa.put("japao","Merii Kurisumasu!");
    String pais="";
    boolean con=false;
    while (true) {
		if(con==false) {
			pais=in.readLine();
			con=true;
		}
		String saludo=mapa.get(pais);
		if(saludo==null) {
		System.out.println("--- NOT FOUND ---");	
		}else {
		System.out.println(saludo);
		}
		if((pais=in.readLine()).equals("")) {
			break;
		}
	}
	}catch (Exception e) {
		// TODO: handle exception
	}
}
}