/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air;

import java.sql.*;

/**
 *
 * @author NVT
 */
public class Database {
    
    public Connection con;
    
    public Database(){
     
        
        try{
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airticket","root","root");
            System.out.println("connected to database successfully");
        }catch(Exception e){
            System.out.println("cannot connect to database"+e);
        }
    
    }
}
