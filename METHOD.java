import java.util.Scanner;
class anurag{
  public static void main(String[] args){
    greeting();
  }
    
    
static void greeting(){
Scanner sc=new Scannner(System.in);
System.out.println("enter your name:");
String name=sc.nextInt();
System.out.println("enter your age:");
int age=sc.nextInt();
if(age>18){
  System.out.println("eligible for vacination");
}else if (age>18 && age>50){
  System.out.println("booster is must");
}else{
  System.out.println("not eligible for vacination");
}
  
}
}
