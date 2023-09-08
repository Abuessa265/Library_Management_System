

package Project;
import java.sql.*;
/**
 *
 * @author pc
 */
public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try{
            //Class.forName("con.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
