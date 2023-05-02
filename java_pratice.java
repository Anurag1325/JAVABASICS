import java.util.Scanner;
public class anurag{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		greeting();
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
		{
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
		{//fibonacci series
			System.out.println("enter number of terms");
		int number=sc.nextInt();
		int i=0,j=1,nextTerm;
		System.out.println("Fibonacci series is ");
		for(int x=0;x<number;x++)
		{
		if(x<=1)
		nextTerm=x;
		else
		{
		nextTerm=i+j;
		i=j;
		j=nextTerm;
		}
		System.out.println(nextTerm);
		}
	}
		{// java program to calculate future investment value
			System.out.println("enter present value:");
		double present=sc.nextDouble();
		System.out.println("Enter the interest value:");
		double interest=sc.nextDouble();
		System.out.println("enter the time period:");
		double time=sc.nextDouble();
		double value=present*Math.pow((1+interest/100),time);
		System.out.println("value is:"+value);
		}
		{// Reverse A string
			System.out.println("Enter a string:");
		String Str = sc.nextLine();
		char[] ch=Str.toCharArray();
		System.out.println("Reverse of a string is:");
		int j=ch.length;
		for(int i=j;i>0;i--)
		{
			System.out.println(ch[i-1]);
		}
		}
		{java program to check leap year or not
		long a,year,c;
	   	System.out.print("enter  any  calendar year :");
        	year=sc.nextLong();	     
	    	if(year!=0)
	    {
		a=(year%400==0)?(c=1):((year%100==0)?(c=0):((year%4==0)?(c=1):(c=0)));       
		if(a==1) 
		    System.out.println(year+" is a leap year");       
               	else
		    System.out.println(year+" is not a leap year");                       
	    }
	    else
		System.out.println("year zero does not exist ");	
		
		}
		{//java program sum of digits of a number
			long n,sum;
		System.out.println("Enter a number:");
		n=sc.nextLong();
		for(sum=0;n!=0;n/=10) {
			sum+=n%10;
		}
		System.out.println("Sum of digit of a number is num: "+sum);
		}
		
		
		{// find prime numbers between 1 to n
		int i,count;
		System.out.println("enter number:");
		int number=sc.nextInt();
		System.out.println("prime numbers between 1 to "+number+ " are: ");
		for(int j=2;j<=number;j++) {
		count=0;
		for(i=1;i<=j;i++) {
		if(j%i==0) {
		count++;
					
		}
		}
		if(count==2) {
		System.out.println(j+" ");
		}
		}
	
		{ //java program convert fahrenheit to celsius
		System.out.println("enter the termperature in fahrenheit: ");
		double F=sc.nextDouble();
		double cel;
		cel=(F-32)*5/9;
		System.out.println("temperature in celsius: "+cel);
		}
			
	{// convert decimal to binary
		System.out.println("Enter a decimal number: ");
		int num=sc.nextInt();
		int bin[]=new int[100];
		int i=0;
		while(num>0)
		{
			bin[i++]=num%2;
			num=num/2;
			
		}
		System.out.println("Binary number is: ");
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(bin[j]);
		
		}
	
			
			
  }
}

      
      
