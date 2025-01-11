import java.util.Scanner;

class calcArea
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        float base, height, area;
        System.out.println("Enter base and height of the triangle");
        base = s.nextFloat();
        height = s.nextFloat();
        area = base/(2*height);
        System.out.println("Area of triangle is: "+area);
    }
}