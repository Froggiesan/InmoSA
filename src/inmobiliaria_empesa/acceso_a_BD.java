package inmobiliaria_empesa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Properties;

import oracle.ucp.jdbc.PoolDataSourceFactory;
import oracle.ucp.jdbc.PoolDataSource;



public class acceso_a_BD{
    // The following connection string is pointing to Oracle XE database.
    // Change this URL to match your target Oracle database (XE or else)
    final static String DB_URL="jdbc:oracle:thin:@//localhost:9090:XE";
    // Enter the database user
    final static String DB_USER = "alex";
    // Enter the database password
    final static String DB_PASSWORD = "1234";
    final static String CONN_FACTORY_CLASS_NAME="oracle.jdbc.pool.OracleDataSource";

    public static void main(String[] args) throws SQLException {
        // Get a pooled connection
        PoolDataSource pds = PoolDataSourceFactory.getPoolDataSource();
        // Set the connection factory
        pds.setConnectionFactoryClassName(CONN_FACTORY_CLASS_NAME);
        pds.setURL(DB_URL);
        pds.setUser(DB_USER);
        pds.setPassword(DB_PASSWORD);
        pds.setConnectionPoolName("JDBC_UCP_POOL");

        // Set the connection pool properties
        pds.setInitialPoolSize(5);
        pds.setMinPoolSize(5);
        pds.setMaxPoolSize(20);
        pds.setTimeoutCheckInterval(5);
        pds.setInactiveConnectionTimeout(10);

        // Get the database connection from UCP
        try (Connection conn = pds.getConnection()) {
            //doSQLWork(conn);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

