class Building1
{
    Building1()
    {
        System.out.println("Default Constructor");
    }
    Building1(int num1)
    {
        System.out.println("Parameterized Constructor");
    }
    Building1(int num1,int num2)
    {
        System.out.println(" Dual Parameterized Constructor");
    }
}
public class ConstructorOverlodingPolymorphism {
    public static void main(String[] args) 
    {
        Building1 objbuild1=new Building1();
        Building1 objbuild2=new Building1(10);
        Building1 objbuild3=new Building1(10,10);

    }
}
