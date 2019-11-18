import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (true) {
			Stack<Integer> pila = new Stack<Integer>();
			for (int i = 0; i < n; i++) {
				pila.push(Integer.parseInt(sc.next()));
				if (pila.peek() == 0)
					break;
			}
			if (pila.peek() == 0)
				break;
			int[] com = new int[2];
			int fil = 0;
			while (!pila.empty()) {
				com[0] = pila.pop();
				if(!pila.empty())
					com[1] = pila.peek();
				if (com[0] - com[1] == 1 || com[1] - com[0] == 1) {
					fil++;

				}
			}

			if (fil > 3) {
				System.out.println("Yes");

			} else {
				
				System.out.println("No " );
			}
		}

	}
}
