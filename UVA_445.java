import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(sc.hasNext()){
			String str=sc.nextLine();
			int rep=0;
			for(int i=0;i<str.length();++i)
			{
				char temp=str.charAt(i);
				if(temp>='0' && temp<='9')
					rep+=(int)temp-(int)'0';
					
				else if(temp=='!')	System.out.print("\n");
				else {
					for(int x=0;x<rep;++x){
						if(temp=='b')	System.out.print(" ");
						else System.out.print(temp);
					}
					rep=0;
				}
				
			}
			System.out.println();
		}
	}
}
