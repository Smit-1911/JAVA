import java.util.Scanner; 
class PracticalArth
 { 
    public static void main(String[] args)
    {
    int a,b,c;
    System.out.println("Enter Two numbers for mathematical Operations");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=a+b;
    System.out.println("Your addition is:"+c);
    c=a-b;
    System.out.println("Your substraction is:"+c);
    c=a*b;
    System.out.println("Your multiplication is:"+c);
    c=a/b;
    System.out.println("Your division is:"+c);
    c=a%b;
    System.out.println("Your modulo is:"+c);
    }
}