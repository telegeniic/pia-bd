package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {
    public Connection getConnection(){
        System.out.println("Loading driver...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://bmlx3df4ma7r1yh4.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/c4eh0q6vwr0trdos", "odl4qrprv0hmij6y", "of0dk7fxqdyhptpx");
            return connection;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
