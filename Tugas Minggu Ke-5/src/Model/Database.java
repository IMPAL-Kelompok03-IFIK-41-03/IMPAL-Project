package Model;

/**
 *
 * @author Irsyad Muhamad Al Anshori
 * 
 */

import java.sql.*;
import Model.*;
import java.text.ParseException;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<AkunUser> Acc_User = new ArrayList<>();
    //private ArrayList<>  = new ArrayList<>();
    
    public Database() {
        loadUser();
    }
    
    public void clearDataArray(){
        Acc_User.clear();
    }
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/db_ngampusyuk";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public void loadUser() {
        connect();
        try {
            String query = "SELECT * FROM AkunUser";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                Acc_User.add(new AkunUser(rs.getString("username"), 
                    rs.getString("password"),
                    rs.getString("user"))
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<AkunUser> getUser() {
        return Acc_User;
    }
    
    public void addUser(AkunUser accu) {
        connect();   
        int users = 0;
        
        String sql = "INSERT INTO user(nama,username,password,email,nomorhp) "
                    + "VALUES(?,?,?,?,?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
            
            // set parameters for statement
            pstmt.setString(1, accu.getEmail());
            pstmt.setString(2, accu.getPassword());
            pstmt.setString(3, accu.getUser());
 
            int rowAffected = pstmt.executeUpdate();
            if(rowAffected == 1)
            {
                // Get account users
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    users = rs.getInt(1);
                    Acc_User.add(accu);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        disconnect();
    }
    
    public boolean cekDuplikatEmail(String email){
        boolean cek = false;
        for (AkunUser usr : Acc_User) {
            if (usr.getEmail().equals(email)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public boolean cekDuplikatPassword(String email,String password){
        boolean cek = false;
        for (AkunUser usr : Acc_User) {
            if (usr.getPassword().equals(password) && usr.getEmail().equals(email)){
                cek = true;
                break;
            }
        }
        return cek;
    }   
}
