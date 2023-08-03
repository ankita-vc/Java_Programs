
final class Base
{
    public void fun()
    {
        System.out.println("base fun.");
    }

    final public void gun()
    {
        System.out.println("base gun.");
    }

}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("derived fun.");
    }

   /*  final public void gun()
    {
        System.out.println("derived gun.");
    }

    */
}
class Final3
{
    public static void main(String arg[])
    {
        Base bobj= new Base();
        dobj.fun();
        dobj.gun();

    }
}