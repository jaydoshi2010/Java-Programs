package gcd;
import java.util.*;


public class GCD {
    

    
 public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:-");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        while (a != b)
        {
            if(b>a)
            {
                b=b-a;
                //System.out.println("here GCD is:"+ b);
            }
            else if(a>b)
            {
                a=a-b;
            }
            else if(a>c)
            {
                a=a-c;
            }
            else if(b>c)
            {
                b=b-c;
            }
            
            //System.out.println("here GCD is:"+ a);
        }
        System.out.println("here GCD is:"+ b);
       
    }
    
}
