import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char b=sc.nextLine().charAt(0);
		int vo=0;
		int cont=1;
		for(int i=0; i<a.length(); i++)
		{
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vo+=1;
			}
			else {
				cont+=1;
				System.out.println(vo);
				System.out.println(cont);
			}
		}
	    
	}
}