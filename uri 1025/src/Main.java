import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args)throws IOException {
	
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] NQ=null;
		int i=0;
		int N=0;
		int Q=0;
		String cadena;
		boolean com=true;
		while (true) {
			i++;
			if(com) {
			NQ=in.readLine().split(" ");
			 N=Integer.parseInt(NQ[0]);
			 Q =Integer.parseInt(NQ[1]);
			 com=false;
			}
			int[] Canicas=new int[N];
			for (int j = 0; j < N; j++) {
				Canicas[j]=Integer.parseInt(in.readLine()); 
			}
			Arrays.parallelSort(Canicas);
			for (int j = 0; j < Q; j++) {
				if(j==0) {
				System.out.println("CASE# "+i+":");
				}
				int pregunta=Integer.parseInt(in.readLine());
				int index=Arrays.binarySearch(Canicas,pregunta);
				if(index<0) {
					System.out.println(pregunta+" not found");
				}else {
					System.out.println(pregunta+" found at "+(index+1));
				}
			}
			if((cadena=in.readLine()).equals("0 0")) {
				break;
			}else {
				NQ=cadena.split(" ");
				 N=Integer.parseInt(NQ[0]);
				 Q =Integer.parseInt(NQ[1]);
			}
		}
		
	}
}
