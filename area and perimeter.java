import java.util.Scanner;
class anurag{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
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
