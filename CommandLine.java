
class CommandLine
{
    public static void main(String arg[])
    {
        System.out.println("Demonstration of command line..");

        int No1= Integer.parseInt(arg[0]);
        int No2= Integer.parseInt(arg[1]);

        int Ans= No1 + No2;

        System.out.println("Addition is:" +Ans);
        System.out.println("number of command line arguments are;"+ arg.length);
    }
}

// javac CommandLine.java
// java CommandLine 11 21