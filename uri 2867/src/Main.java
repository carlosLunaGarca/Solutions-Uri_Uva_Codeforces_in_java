import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int N =Integer.parseInt(in.readLine());
	for (int i = 0; i < N; i++) {
		String [] nm=in.readLine().split(" ");
		int n=Integer.parseInt(nm[0]);
		int m=Integer.parseInt(nm[1]);
		BigInteger num=new BigInteger(""+n);
		System.out.println(num.pow(m).toString().length());
	}
}
}
