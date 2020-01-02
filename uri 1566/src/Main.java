import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			int leng=Integer.parseInt(in.readLine());
		    int[] desorden=Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.parallelSort(desorden,0, leng);
		
			String vec=Arrays.toString(desorden).replaceAll("\\,","").replaceFirst("\\[","").replaceAll("\\]","");
				System.out.println(vec);
		}
	}

}
