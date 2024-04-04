import java.util.Scanner; 
class Practical2 { 
    public static void main(String[] args) 
    { 
        int N = 6, total_marks = 0; 
        float percentage; 
      
        int marks[] = { 89, 75, 82, 60, 95, 96}; 
  
        for (int i = 0; i < N; i++) { 
            total_marks += marks[i]; 
        } 
        System.out.println("Total Marks : " + total_marks); 

        percentage = (total_marks / (float)N); 
        System.out.println( 
            "Total Percentage : " + percentage + "%"); 
    } 
}