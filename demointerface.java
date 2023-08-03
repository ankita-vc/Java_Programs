
interface Circle
{
    public final float PI= 3.14f;

    public float Calculatearea(float Radius);    //bydefault abstarct
    public float Calculatecircumstance(float Radius);
 
}

class Demo implements Circle
{


}


class Interfacedemo
{
    public static void main(String arg[])
    {
        Demo obj= new Demo();

        float fret= 0.0f;
        fret= obj.Calculatearea(10.5f);
        System.out.println("area is:"+fret);

    }
}