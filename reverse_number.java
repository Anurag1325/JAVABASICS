//write a code to reverse a number
import java.util.Scanner;

public class Main {
    public static int  reverse_number(int num){
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
       
        return reverse;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
          int num=sc.nextInt();
          int ans=reverse_number(num);
          System.out.print(ans);




    } 
}
