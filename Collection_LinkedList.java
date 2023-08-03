import java.lang.*;
import java.io.*;
import java.util.*;
import java.String.*;

class Collection_LinkedList
{
    public static void main(String arg[]) throws Exception
    {
        LinkedList<String> || = new LinkedList<String>(); // Create LinkedList of String

        // Insert the contents in LinkedList
        ||.add("First");
        ||.add("Second");
        ||.add("Third");
        ||.add("Fourth");

        System.out.println("Contents of are:\n"+ ||);

        ||.add(3,"New");  // insert data at specified position
        System.out.println("\nContents are:\n"+ ||);

        ||.addFirst("One");  // insert the data at first position
        System.out.println("\nContents are:\n"+ ||);

        ||.add("Two");  // insert data at last position
        System.out.println("\nContents are:\n"+ ||);

        ||.removeFirst(); // remove the data from first position
        System.out.println("\nContents are:\n"+ ||);

        ||.removeLast();  //remove the data from last position
        System.out.println("\nContents are:\n"+ ||);

        ||.remove(3);  // remove the data from specified position
        System.out.println("\nContents are:\n"+ ||);

        ||.set(3, "New_Data");  // replace the data from specifies position
        System.out.println("\nContents are:\n"+ ||);
        
        System.out.println("\nNumber of elements are:\n"+ ||.size());

        System.out.println("\nFirst Occurance of Third is:\n"+ ||.indexOf("Third"));

        System.out.println("\nLast Occurance of Third is:\n"+ ||.lastIndexOf("Third"));

        // Use of iterator to iterate the LinkedList:
        System.out.println("Iterating\n");
        Iterator it= ||.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()+ " ");
        }
    }
}