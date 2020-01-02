import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(in.readLine());
			if (n <= 0)
				break;
			Queue<Integer> cola = new LinkedList<Integer>();
			for (int i = 0; i < n; i++) {
				cola.add(i + 1);
			}
			int[] vec = new int[n - 1];
			int i = 0;
			while (cola.size() != 1) {
				vec[i] = cola.poll();
				cola.add(cola.poll());
				i++;
			}
			System.out.println("Discarded cards:" + Arrays.toString(vec).replaceAll("\\[", " ").replaceAll("\\]", ""));
			System.out.println("Remaining card: " + cola.peek());
		}
	}
}
