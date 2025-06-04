import java.util.*;
public class Main13
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    int i=0;
	    int count=0;
	    char b=sc.next().charAt(0);
	    for(i=0;i<a.length();i++){
	    if(a.charAt(i)==b){
	    count=count+1;
	    }
	    }
	   System.out.println(count);
	    }
}
