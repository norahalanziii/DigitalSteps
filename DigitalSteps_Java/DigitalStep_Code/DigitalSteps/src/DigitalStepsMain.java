
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author THINKPAD
 */
public class DigitalStepsMain {

    // static lists can be access anywhere
   public static PlayerList myPlayers = new PlayerList();
   public static AdminList myAdmins = new AdminList();
   public static Connection con;
   
    public static void main(String[] args) {
       
       WelcomeToDigitalStepsFrame obj = new WelcomeToDigitalStepsFrame();
       obj.setVisible(true);
       //closeDB(con);
    }

    public static Connection connectDB() {
        con = null;
        try {
            // register jdbc.driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // open a connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/digitalstep1", "root", "1115811372nn");
            return con;
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
            return null;
        }
    }
 
    public static void closeDB(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Database connection closed.");
            }
        } catch (Exception ex) {
            System.out.println("Error while closing database connection: " + ex.getMessage());
        }
    }
    
}
