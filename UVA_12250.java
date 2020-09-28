import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[])	throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String,String> f=new HashMap<String,String>();
		f.put("HELLO","ENGLISH");
		f.put("HOLA","SPANISH");
		f.put("HALLO","GERMAN");
		f.put("BONJOUR","FRENCH");
		f.put("CIAO","ITALIAN");
		f.put("ZDRAVSTVUJTE","RUSSIAN");
		
		int count=1;
		while(true){
			String str=br.readLine();
			if(str.charAt(0)=='#')
				break;
			str=f.get(str);
			System.out.print("Case "+count+": ");
			if(str==null)
				System.out.println("UNKNOWN");
			else System.out.println(str);
			++count;
		}
	}
}
