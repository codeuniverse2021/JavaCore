// 1. No of parameters must be different.
// 2. Data type must be different.
// 3. Sequence of parameters must be different.
class Shape
{
    void defineshape()
    {
        System.out.println("Default shape");
    }
    void defineshape(int num)
    {
        System.out.println("Aline");
    }
    void defineshape(int num,int num2)
    {
        System.out.println("Aline");
    }
}
 class MethodOverlodingPolymorphism 
{
    public static void main(String[] args) {
        Shape newobj=new Shape();
        newobj.defineshape();
        newobj.defineshape(5);
        newobj.defineshape(5,5);
    }    
}
