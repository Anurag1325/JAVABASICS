import java.util.Scanner;
class Main{
    public static int   fib(int n){
        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int sumofDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumofDigits(n/10);
    }
    public static String reverse(String input){
        if(input.isEmpty()){
            return input;
        }
        return reverse(input.substring(1))+input.charAt(0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fib(n);
        System.out.println("Fibonaci series of "+n+" is: "+ans);
        int ans1=fact(n);
        System.out.println("Factorial of "+n+" is: "+ans1);
        int ans2=sumofDigits(n);
        System.out.println("Sum of Digits "+n+" is: "+ans2);
        sc.nextLine();
        String input=sc.nextLine();
        String reversed=reverse(input);
        System.out.println("Reversed string: "+reversed);
    }
}
