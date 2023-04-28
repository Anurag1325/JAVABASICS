import java.util.Scanner;
class anurag{
  public static void main(String[] args){
    {
      Scanner sc=new Scanner(System.in);
    System.out.println("enter number:");//write a program to find sum of n numbers
    int number=sc.nextInt();
    int sum=0;
    int i=1;
    
    while(i<=number){
      sum+=i;
      i++;
    }
    System.out.println(sum);    
    } 
    //Write a program to calculate the sum of first 10 natural number.
    {
      
      int i=1;
    int sum=0;
    while(i<=10){
    sum+=i;
    i++;
    }
    System.out.println(sum);
  }
    //reverse of two number
    {
      System.out.println("enter number:");
      int a=sc.nextInt();
      System.out.println("enter number:");
      int b=sc.nextInt();
      int temp=a;
      a=b;
      b=temp;
      System.out.println(a);
      System.out.println(b);
    }
    {
      System.out.println("enter number:");//write a program to print multiplication of n number
    int number=sc.nextInt();
    for(int i=1;i<=10;i++){
    System.out.println(number+"*"+i+"="+number*i);
    }
      
    
    
    
    
  }
}
