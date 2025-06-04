import java.util.*;
public class Main4
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int[]a=new int[5];
	    int m=a[0];
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<a.length;i++){
	        if(a[i]>m){
	        m=a[i];
	        }
	    }
		System.out.println(m);
}
}