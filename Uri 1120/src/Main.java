import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] cadenas = in.readLine().split(" ");
			if (cadenas[1].equals("0") && cadenas[0].equals("0"))
				break;
			String vec = cadenas[1].replaceAll(cadenas[0], "");
			if (vec.equals("")) {
				vec = "0";
				System.out.println(vec);
			} else {
				BigInteger con = new BigInteger(vec);
				System.out.println(con);
			}
		}
	}
}
