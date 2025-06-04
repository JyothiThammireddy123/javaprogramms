import java.util.*;
public class Main6
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int even=0;int odd=0;
	    int[]a=new int[5];
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<a.length;i++){
	      if(a[i]%2==0){
	          even=even+1;
	    }
	    else
	    {
	        odd=odd+1;
	    }
	    }
	    System.out.println(even);
		System.out.println(odd);
}
}