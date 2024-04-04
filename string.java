import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        String s=new String();
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        int n=s.length();
        System.out.println(s.length());
        System.out.println("The Second Half of String is "+s.substring(n/2));

}
}
