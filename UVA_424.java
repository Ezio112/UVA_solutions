import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger sum=new BigInteger("0");
		String num=br.readLine();
		while(!num.equals("0")){
			if(num.length()>=1)
				sum=sum.add(new BigInteger(num));
			num=br.readLine();
		}
		System.out.println(sum);
	}
}
