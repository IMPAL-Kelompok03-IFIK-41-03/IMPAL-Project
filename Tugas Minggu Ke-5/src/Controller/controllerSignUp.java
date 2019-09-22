package Controller;

import Model.Database;
import Model.*;
import View.viewSignUp;
import java.awt.HeadlessException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class controllerSignUp extends MouseAdapter implements ActionListener{
    private viewSignUp view;
    private Database db;

    public controllerSignUp() {
        view = new viewSignUp();
        db = new Database();
        view.addActionListener(this);
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       Object source = ae.getSource();
        if (source.equals(view.getbSignUp())){
           try {
               bSignUpActionPerformed();
           } catch (Exception ex) {
               Logger.getLogger(controllerSignUp.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }
    
    public void bSignUpActionPerformed() {
        String nama = view.getTfFullName();
        String gender = view.getTfGender();
        String email = view.getTfPassword();
        String password = view.getTfEmail();
        
        if(nama.isEmpty() || gender.isEmpty() ||  
            email.isEmpty() || password.isEmpty()){
            view.showMessage("Semua Data Masih Kosong ", "Error", 0);
        }else if (nama.isEmpty()){
                view.showMessage("Username Masih Kosong ", "Error", 0);
        }else if (gender.isEmpty()){
                view.showMessage("Password Masih Kosong ", "Error", 0);
        }else if (email.isEmpty()){
                view.showMessage("Email Masih Kosong ", "Error", 0);
        }else if (password.isEmpty()){
                view.showMessage("Nomor HP Masih Kosong ", "Error", 0);
        }else{
            if (db.cekDuplikatEmail(email)){
                view.showMessage("Username Sudah Terdaftar", "Error", 0); 
            }/*else {
                db.addUser(new User(nama, gender, email, password));
                view.reset();
                view.showMessage("Username Terdaftar", "Success", 1);
                view.dispose();
                new controllerLogin(); 
            }*/
        }
    }
}
