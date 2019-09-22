package Controller;

/**
 *
 * @author Irsyad Muhamad Al Anshori
 * 
 */

import Model.*;
import View.viewLogin;
import java.awt.HeadlessException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class controllerLogin extends MouseAdapter implements ActionListener{
    private viewLogin view;
    private Database db;
    private User u;
    private static String email;

    public controllerLogin() {
        view = new viewLogin();
        db = new Database();
        view.addActionListener(this);
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // Login
        if (source.equals(view.getBLogin())){
            bLoginActionPerformed();
        }
        // SignUp
        else if (source.equals(view.getBSignUp())){
//            view.dispose();
//            try {
//                new controllerSignUp();
//            } catch (Exception ex) {
//                Logger.getLogger(controllerLogin.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }
    
    private void bLoginActionPerformed() {
        String email = view.getTfEmail();
        String password = view.getPfPassword();
        if (email.isEmpty() && password.isEmpty()){
            view.showMessage("Anda Belum memasukkan Username dan Password", "Error", 0);
        }else if (email.isEmpty() ){
                view.showMessage("Anda Belum memasukkan Username", "Error", 0);
        }else if ( password.isEmpty() ){
                view.showMessage("Anda Belum memasukkan Password", "Error", 0);
        }else{
            if (!db.cekDuplikatEmail(email)){
                view.showMessage("Username Salah atau Belum Terdaftar","Error", 0);
            }else{
                if(!db.cekDuplikatPassword(email,password)){
                view.showMessage("Password Salah atau Belum Terdaftar","Error", 0);
                }else {
                    controllerLogin.email = email;
                    view.dispose();
                    new controllerSignUp();
                }
            }
        }  
    }  
}
