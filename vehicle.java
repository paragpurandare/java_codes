
import java.util.*;

abstract class Vehicle
{
    abstract void move();
}
class car extends Vehicle
{
    void move()
    {
        System.out.println("car drives on road");
    }
}
class helicopter extends Vehicle
{
    void move()
    {
        System.out.println("helicopter flies");
    }
}
class train extends Vehicle
{
    void move()
    {
        System.out.println("train runs on a track");
    }
}

public class vehicleOne
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Helicopter");
        System.out.println("2. car");
        System.out.println("3. Train");
        
        int choice = sc.nextInt();
        switch(choice)
        {
            
        case 1: 
        helicopter h1 = new helicopter();
        h1.move();
        break;
        
        case 2:
        car c = new car();
        c.move();
        break;
        
        case 3:
        train t = new train();
        t.move();
        break;
        }
            
    }
}