import Ankita.Demo01;
import Ankita.Demo02;

class Demo03
{
    public static void main(String arg[])
    {
        Demo01 dobj1= new Demo01();
        Demo02 dobj2= new Demo02();

        int ret= dobj1.Addition(11,21);
        System.out.println("addition is:"+ret);

        ret= dobj1.Subtraction(11, 21);
        System.out.println("subtraction is:"+ret);

        ret= dobj2.Multiplication(11, 21);
        System.out.println("multiplication is:"+ret);

        float fret= dobj2.Division(11, 21);
        System.out.println("division is:"+fret);
    }
}