import java.sql.Connection;
import java.sql.SQLException;

public class Close {
    public static void run(Connection conn){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}
