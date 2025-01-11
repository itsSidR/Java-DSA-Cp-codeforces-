import java.util.Scanner;

public class diffFormula 
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    float s, a, b, c;
    double result, area;
    System.out.println("Enter length of sides of a triangle:");
    a = sc.nextFloat();
    b = sc.nextFloat();
    c = sc.nextFloat();
    s = (a+b+c)/2;
    result = s*(s-a)*(s-b)*(s-c);
    area = Math.sqrt(result);
    System.out.println("Area of the triangle: "+ area);
    }    
}
