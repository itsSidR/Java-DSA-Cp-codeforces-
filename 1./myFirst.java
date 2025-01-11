import java.util.*;

class myFirst
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = s.nextLine();
        System.out.println("Welcome " + name);
        s.close();
    }
}