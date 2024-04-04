import java.util.Scanner;
public class vowels{
    public static void main(String[] args) {
        String s=new String();
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
       
        s = sc.nextLine();
        s=s.toLowerCase();
        int v=0 , c=0;
        char ch;
         for (int i=0 ;i<s.length() ; i++)
         {
            ch=s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u')
            {
                v++;
            }

            else if( ch>'a'  &&  ch<'z') 
            {
                c++;
            }

          
}
            System.out.println("The vowels are:"+v);
            System.out.println("The consonants are:"+c);
}
}