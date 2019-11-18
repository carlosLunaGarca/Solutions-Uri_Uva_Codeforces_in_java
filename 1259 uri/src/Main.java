import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(in.readLine());
			ArrayList<Integer> vecp = new ArrayList<Integer>();
			ArrayList<Integer> vecin = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				int num = Integer.parseInt(in.readLine());
				if (num % 2 == 0) {
					vecp.add(num);
				} else {
					vecin.add(num);
				}
			}

			Collections.sort(vecp);
			Collections.sort(vecin);
			for (int i = 0; i < vecp.size(); i++) {
				System.out.println(vecp.get(i));
			}
			for (int j = vecin.size()-1; j >= 0; j--) {
				System.out.println(vecin.get(j));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
