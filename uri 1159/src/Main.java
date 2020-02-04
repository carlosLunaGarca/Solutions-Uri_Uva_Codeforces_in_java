import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	while (true) {
	    long num=Long.parseLong(in.readLine());
	    if(num==0)
	    	break;
	    if(num%2==0) {
	    	num=num+(num+2)+(4+num)+(8+num)+(6+num);
	    }else{
	    	num=(num+1)+(num+2+1)+(4+num+1)+(8+num+1)+(6+num+1);
	    }
		System.out.println(num);
	}

}
}
