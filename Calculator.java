import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator C=new Calculator();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Chooce You Want ");
        System.out.println("Enter + for Addition Two Number");
        System.out.println("Enter - for Substraction Two Number");
        System.out.println("Enter * for Multiplication Two Number");
        System.out.println("Enter / for division Two Number");
        String c =Sc.next();
        char j=c.charAt(0);
        System.out.println("Enter First Number");
         int a= Sc.nextInt();
         System.out.println("Enter Second Number");
        int b= Sc.nextInt();
        if(a>0 && b>0)
        switch(j)
        {
            case '+' :
               C.Add(a,b);
                break;
            case '-':
                C.Sub(a,b);
                break;
            case '*' :
                C.Mul(a,b);
                break;
            case '/':
                C.Div(a, b);
                
                break;
            default :
                System.out.println("Not opration is available");
                
                
        }
        else 
        {
            System.out.println("Enter number is must be greter than zero");
        }               
    }
     void Add(int a,int b)
        {
             int d;
                d=a+b;
                System.out.println("Addition is"+d);
               
        }
     void Sub(int a,int b)
     {
                int e;
                e=a-b;
                System.out.println("Substraction is"+e);
     }          
     void Mul(int a,int b)
     {
         int f;
                f=a*b;
                System.out.println("Multiplication is"+f);
                
     }
      void Div(int a,int b)
      {          
          int g;
                g=a/b;
                System.out.println("Division is"+g);
      }
    
    
}
