
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author febri
 */
public class koneksi {
    public static Connection konek(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection konekDB = DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","");
            return konekDB;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;       
        }
    }
}
