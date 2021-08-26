class Parent1
{
    int pdata=1000;
    void pfxn()
    {
        System.out.println("hello i am parent fxn");
    }
}
class Child1 extends Parent1
{
    int cdata=200;
    void cfxn()
    {
        System.out.println("hello i am child fxn");
    }
}
class SubChild extends Child1
{
    int scdata=2000;
    void scfxn()
    {
        System.out.println("hello i am SubChild fxn");
    }
}
public class Multilevel{
public static void main(String[] args) {
    SubChild objChild=new SubChild();
    objChild.pfxn();
    objChild.cfxn();
    objChild.scfxn();
    System.out.println("Subchild data "+objChild.scdata+" child data "+objChild.cdata+" parent data "+objChild.pdata);
}  
}