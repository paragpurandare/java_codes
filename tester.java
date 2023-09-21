
import java.util.Scanner;

class shape
{
    double ar;
    void Setarea(double r)
    {
        ar = 3.14f*r*r;
        System.out.println("The area of circle is : " + ar);
        
    }
    void Setarea(int side)
    {
        ar = side*side;
        System.out.println("The area of square is : " + ar);
    }
    void Setarea(int b,int h)
    {
        ar = 0.5f*b*h;
        System.out.println("The area of triangle is : " + ar);
    }
}
class circle extends shape
{
    void getInput()
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius : ");
    double r = sc.nextDouble();
    Setarea(r);
        
    }
}
class square extends shape
{
    void getInput()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side : ");
        int side = sc.nextInt();
        Setarea(side);
        
    }
}
class triangle extends shape
{

        void getInput()
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter h : ");
        int h = sc.nextInt();
        Setarea(b, h);
        }
}
class tester
{
    public static void main(String args[])
    {
        circle c = new circle();
        c.getInput();
        square sq = new square();
        sq.getInput();
        triangle t = new triangle();
        t.getInput();
    }
}