import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Character,Integer> f=new HashMap<Character,Integer>();
		for(char c='A';c<='C';++c)	f.put(c,2);
		for(char c='D';c<='F';++c)	f.put(c,3);
		for(char c='G';c<='I';++c)	f.put(c,4);
		for(char c='J';c<='L';++c)	f.put(c,5);
		for(char c='M';c<='O';++c)	f.put(c,6);
		for(char c='P';c<='S';++c)	f.put(c,7);
		for(char c='T';c<='V';++c)	f.put(c,8);
		for(char c='W';c<='Z';++c)	f.put(c,9);

		
		while(sc.hasNext()){
			String str=sc.nextLine();
			for(int i=0;i<str.length();++i){
				if(f.get(str.charAt(i))!=null)
					System.out.print(f.get(str.charAt(i)));
				else System.out.print(str.charAt(i));
			}
			System.out.println();
		}
	}
}
