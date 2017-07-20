import javax.swing.*;
import java.sql.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author New
 */
public class sql {
    public static Connection myConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
            return con;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    
    }
}
