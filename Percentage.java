abstract class Marks
{
    abstract void getPercentage();
}

class A extends Marks
{
    int s1,s2,s3;
    public A(int s1, int s2, int s3)
    {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        
        void getPercentage()
        {
            double sum = (s1 + s2 + s3) * 100;
            double per = sum/300;
            
            
        }
        
    }
}
class B extends Marks
{
    int sub1,sub2,sub3,sub4;
    public B(int sub1, int sub2, int sub3, int sub4)
    {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        
        void getPercentage()
        {
            double sum = (sub1+sub2+sub3+sub4)*100;
            double per = sum/400;
        }
    }
}

class Percentage()
{
    public static void main(string args[])
    {
        A a = new A(50,50,50);
        a.getPercentage();
        
        B b = new B(70,90,80,30);
        b.getPercentage();
    }
}