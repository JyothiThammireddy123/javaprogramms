import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=Sc.nextLine();
        String b=Sc.nextLine();
        for(int i=0;i<a.length()-1;i>-1;i--)
        {
            b=b+a.charAt(i);
        }
        System.out.prinln(b);
    }
}