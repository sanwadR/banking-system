package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Connection connection;
    Statement statement;

    public Con(){
        try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","Sanwad@123");
                //Url of database
            statement = connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();

        }

    }
}
