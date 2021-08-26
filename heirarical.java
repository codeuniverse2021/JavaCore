class GrandPa{
    int Gdata=1000;
    void gfxn(){
        System.out.println("I am Grandfather");
    }
}
class Guardian1 extends GrandPa
{
    int G1data=500;
    void g1fxn(){
        System.out.println("I am Guardian1");
    }
}
class Guardian2 extends GrandPa
{
    int G2data=500;
    void g2fxn(){
        System.out.println("I am Guardian2");
    }
}
class Guardian3 extends GrandPa
{
    int G3data=500;
    void g3fxn(){
        System.out.println("I am Guardian3");
    }
}
class SubGuardian2 extends Guardian2
{
    int G3data=50;
    void sg2fxn(){
        System.out.println("I am Child of Gaurdian2");
    }
}
class hierarical
{
    public static void main(String[] args) {
    SubGuardian2 obj1=new SubGuardian2();
    obj1.sg2fxn();
    obj1.g2fxn();
    obj1.gfxn();
    
}
}

