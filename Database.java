import java.sql.*;          // 1

class Database
{
    public static void main(String arg[]) throws Exception
    {
        try
        {
            String URL = "jdbc:mysql://localhost:3306/ppa49"; // local variables
            String Username = "root";   // default username and password of sql
            String Password = "root";    
            String Query = "select * from student";  // you can write any query of sql

            Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
            
            Statement sobj = cobj.createStatement();        // 3

            ResultSet robj = sobj.executeQuery(Query);      // 4

            while(robj.next())          // 5
            {
                System.out.println("RID : "+robj.getInt("rno"));
                System.out.println("Name : "+robj.getString("name"));
                System.out.println("City : "+robj.getString("city"));
                System.out.println("Marks : "+robj.getInt("marks"));                                    
            }
        }
        catch(Exception eobj)
        {}

        finally
        {
            close(robj);
            close(sobj);
            close(cobj);
        }   
    }
}

// execute()            Create table
// executeQuery()       select
// executeUpdate()      delete / update / alter / insert


// install mysql driver for jdbc driver manager step. 