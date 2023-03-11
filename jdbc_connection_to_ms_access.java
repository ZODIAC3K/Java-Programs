// import java.sql.*;

// public class jdbc_connection_to_ms_access {
//     public static void main(String[] args) {
//         String url = "jdbc:ucanaccess://C:\\Users\\harsh\\OneDrive\\Documents\\zodiac.accdb";
//         String username = "";
//         String password = "";
//         try {
//             Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//             try (Connection connection = DriverManager.getConnection(url, username, password)) {
//                 System.out.println("Connected to the database.");
//                 // Your code here to interact with the database
//                 // ...
//             } catch (SQLException e) {
//                 System.out.println("Error while connecting to the database: " + e.getMessage());
//             }
//         } catch (ClassNotFoundException e) {
//             System.out.println("Could not load Ucanaccess Driver: " + e.getMessage());
//         }
//     }
// }

public class jdbc_connection_to_ms_access {
    public static void main(String[] args) {
        System.out.println("Connected to the database");
    }
}