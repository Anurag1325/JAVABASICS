//A Perfecr number is a positive integer that is equal to the sum of its proper divisors,excluding itself.Write a function to check if a given number is a perfect number 

import java.util.Scanner;

public class Main {
    public static boolean  perfect(int num){
        boolean found=false;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum==num;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
          int num=sc.nextInt();
          boolean ans=perfect(num);
          System.out.print(ans);
    } 
}
