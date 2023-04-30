import java.util.Scanner;
public class anurag{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    {
    //finding the average marks for n subjects
    System.out.println("enter the number of subjects:");
		int n=sc.nextInt();
		int i=0;
		int total_marks=0;
		while(i<n) {
			System.out.println("enter the marks:");
			int marks=sc.nextInt();
		
			total_marks=total_marks+marks;
		
		i++;
		}
		int average;
		average=total_marks/n;
		System.out.println(average);
    }
    {
      //calculate the distance between two point
      double x1,x2,y1,y2;
	      System.out.println("enter the value of x1:");
	      x1=sc.nextDouble();
	      System.out.println("enter the value of y1:");
	      y1=sc.nextDouble();
	      System.out.println("enter the value of x2:");
	      x2=sc.nextDouble();
	      System.out.println("enter the value of y2:");
	      y2=sc.nextDouble();
	      double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	      System.out.println("distance:"+distance);
    }
    {
      //calculate the electricity bill
      System.out.println("consumes power per hour:");
		int power=sc.nextInt();
		System.out.println("rate per unit:");
		int unit=sc.nextInt();
		int total_unit=500*24*30;  //total power consume in one month
		total_unit=500*24*30/1000;  //total unit consume in one month
		int amount;
		amount=total_unit*unit;
		System.out.println("amount:"+amount);
    }
  }
}

      
      
