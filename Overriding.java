class ParentHome
{
    void makeSwimingPool() //hidden
    {
        System.out.println("parent is making");
    }
    void Pool() //hidden
    {
        System.out.println("parent is making");
    }
}
class ChildHome extends ParentHome
{
    void makeSwimingPool()
    {
        System.out.println("child  making");
    }
}
class Overriding{
    public static void main(String aisrg[])
    {
        ParentHome obj=new ParentHome();
        obj.makeSwimingPool();
        obj.Pool();
        ChildHome objChildHome=new ChildHome();
        objChildHome.makeSwimingPool();
        ParentHome objHome=new ChildHome();
        objHome.makeSwimingPool();
    }
}
//keywords :  super final this 
