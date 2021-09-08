// this represents to current class object 
// used to differentiate b/w local and global variable
// this()
class Person
{
    String name="nothing";
    
    Person()
    {
        this("Aman");
        System.out.println("default constructor");
    }
    Person(String name)
    {
        // this();
        System.out.println("parameterized constructor");
        this.name=name;
    }
    void display()
    {
        System.out.print("the name is "+name);
    }
}
class ThisCon
{
    public static void main(String args[])
    {
        // Person obj=new Person("Aman");
        Person obj=new Person();//default
        obj.display();
    }
}
