class Final
{
    public static void main(String arg[])
    {
        Base obj= new Base(10, 20, 30);

        System.out.println("obj.A"+obj.no1);
        System.out.println("obj.A"+obj.no2);
        System.out.println("obj.A"+obj.no3);

        obj.no1++;
    //    obj.no3++;
    //    obj.no2++;

        System.out.println("obj.A"+obj.no1);
        System.out.println("obj.A"+obj.no2);
        System.out.println("obj.A"+obj.no3);

    }

}

class Base extends Final
{
    public int no1;
    final public int no2;
    final public int no3;

    public Base(int i, int j, int k)
    {
        no1= i;
        no2= j;
        no3= k;
    }
}