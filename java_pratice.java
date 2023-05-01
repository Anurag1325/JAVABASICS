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
		{
			//Java Program to Add Two Matrices
		int row, col,i,j;
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Enter the number of rows");
		row = in.nextInt();
		 
		System.out.println("Enter the number columns");
		col = in.nextInt();
		 
		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int res[][] = new int[row][col];
		 
		System.out.println("Enter the elements of matrix1");
		 
		for ( i= 0 ; i < row ; i++ )
		{ 
		 
		for ( j= 0 ; j < col ;j++ )
		mat1[i][j] = in.nextInt();
		 
		System.out.println();
		}
		System.out.println("Enter the elements of matrix2");
		 
		for ( i= 0 ; i < row ; i++ )
		{
		 
		for ( j= 0 ; j < col ;j++ )
		mat2[i][j] = in.nextInt();
		 
		System.out.println();
		}
		 
		for ( i= 0 ; i < row ; i++ )
		for ( j= 0 ; j < col ;j++ )
		res[i][j] = mat1[i][j] + mat2[i][j] ; 
		 
		System.out.println("Sum of matrices:-");
		 
		for ( i= 0 ; i < row ; i++ )
		{ 
		for ( j= 0 ; j < col ;j++ )
		System.out.print(res[i][j]+"\t");
		 
		System.out.println();
		}
	}
		{// write a program to find factorial of n number
			System.out.println("enter number:");
  			int number=sc.nextInt();
  			int i=1;
  
  			int factorial=1;
  			while(i<number){
      
      			factorial+=factorial*i;
      				i++;
     
  	}
   	System.out.println(factorial);
		}
		 {
            //area of circle
            System.out.println("radius of circle=");
        int r=sc.nextInt(); //radius of circle 
        double area=2*3.14*r*r;
        System.out.println("area of circle="+area);
        }
        {
        //area and perimeter of square
            System.out.println("side of square=");
        int side=sc.nextInt(); // side of the square
        int area=side*side;
        System.out.println("area of square="+area);
        int perimeter=4*side;
        System.out.println("perimeter of the square:"+perimeter);
        }
        {
        //area and perimeter of rectangle
            System.out.println("Length of the rectangle:");
            int l=sc.nextInt();
            System.out.println("breath of the rectangle:");
            int b=sc.nextInt();
            int area=l*b;
            System.out.println("area of the rectangle:"+area);
            int perimeter=2*(l+b);
            System.out.println("perimeter of the rectangle: "+perimeter);
        
            
        }
			
			
		
  }
}

      
      
