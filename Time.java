import java.util.Scanner;


public class Time {
    
    int hour;
    int minute;
    int second;

    
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    

    
    public void gettime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour: ");
        hour = sc.nextInt();
        System.out.println("Enter minute: ");
        minute = sc.nextInt();
        System.out.println("Enter second: ");
        second = sc.nextInt();
    }

    
    public void showtime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

   
    public Time addtime(Time t) {
        Time result = new Time();
        result.second = this.second + t.second;
        result.minute = this.minute + t.minute + (result.second / 60);
        result.second = result.second % 60;
        result.hour = this.hour + t.hour + (result.minute / 60);
        result.minute = result.minute % 60;
        result.hour=result.hour%24;
        return result;
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        t1.gettime();
        t2.gettime();
        System.out.println("Time 1 is :");
        t1.showtime();
        System.out.println("Time 2 is :");
        t2.showtime();
        System.out.println("Addition of two times :");
        Time t3 = t1.addtime(t2);
        t3.showtime();
    }
}