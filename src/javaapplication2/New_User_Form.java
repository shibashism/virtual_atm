/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Devendra M Naik
 */
public class New_User_Form extends javax.swing.JFrame implements Serializable{

    /**
     * Creates new form New_User_Form
     */
    
    public static ArrayList<String> arr;
    public static HashSet<String> hs;
    public static LinkedList<String> ll;
    public Date date;
    public String strDate;
    public ObjectInputStream ois;
    public static int count=0;
    public New_User_Form() {
        initComponents();
        arr=new ArrayList<>();
        hs=new HashSet<>();
        ll=new LinkedList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Firstname_text = new javax.swing.JTextField();
        Lastname_text = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address_text = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        Register_User = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Username_text = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(0, 204, 153));
        Header.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        Header.setForeground(new java.awt.Color(255, 255, 255));
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Welcome To SBM");
        Header.setToolTipText("");
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Header.setDoubleBuffered(true);
        Header.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("First Name :");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Last Name :");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Address :");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("D.O.B :");

        Firstname_text.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Firstname_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Firstname_text.setText("Enter Firstname");
        Firstname_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Firstname_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Firstname_textFocusLost(evt);
            }
        });

        Lastname_text.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Lastname_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lastname_text.setText("Enter Lastname");
        Lastname_text.setToolTipText("Please enter your Lastname");
        Lastname_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Lastname_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Lastname_textFocusLost(evt);
            }
        });

        Address_text.setColumns(20);
        Address_text.setRows(5);
        Address_text.setText("Enter Address");
        Address_text.setToolTipText("Please enter your address");
        Address_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Address_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Address_textFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(Address_text);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("New User Registration Form");

        Register_User.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Register_User.setText("Register");
        Register_User.setToolTipText("Please click here to register");
        Register_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Register_UserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Register_UserMouseExited(evt);
            }
        });
        Register_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_UserActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Back.setText("Back");
        Back.setToolTipText("Please click here to register");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Username :");

        Username_text.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Username_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Username_text.setText("Enter Username");
        Username_text.setToolTipText("Please enter your Lastname");
        Username_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Username_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Username_textFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SBM ©");
        jLabel7.setToolTipText("Copyright");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 2, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Username should be in between 4-10 alphanumeric characters");

        jLabel9.setText("jLabel9");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Devendra M Naik\\Downloads\\wallp7.jpg")); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Firstname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGap(605, 605, 605)
                .addComponent(Register_User, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(Username_text, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(Lastname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(886, 886, 886)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jLabel8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Firstname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jLabel8)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(13, 13, 13)
                .addComponent(Register_User, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(585, 585, 585)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(Username_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(Lastname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(668, 668, 668)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(765, 765, 765)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Firstname_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Firstname_textFocusGained
        if(Firstname_text.getText().equals("Enter Firstname"))
            Firstname_text.setText("");
    }//GEN-LAST:event_Firstname_textFocusGained

    private void Firstname_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Firstname_textFocusLost
        if(Firstname_text.getText().equals(""))
            Firstname_text.setText("Enter Firstname");
    }//GEN-LAST:event_Firstname_textFocusLost

    private void Lastname_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Lastname_textFocusGained
        if(Lastname_text.getText().equals("Enter Lastname"))
            Lastname_text.setText("");
    }//GEN-LAST:event_Lastname_textFocusGained

    private void Lastname_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Lastname_textFocusLost
        if(Lastname_text.getText().equals(""))
            Lastname_text.setText("Enter Lastname");
    }//GEN-LAST:event_Lastname_textFocusLost

    private void Address_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Address_textFocusGained
        if(Address_text.getText().equals("Enter Address"))
            Address_text.setText("");
    }//GEN-LAST:event_Address_textFocusGained

    private void Address_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Address_textFocusLost
        if(Address_text.getText().equals(""))
            Address_text.setText("Enter Address");
    }//GEN-LAST:event_Address_textFocusLost

    private void Username_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Username_textFocusGained
        if(Username_text.getText().equals("Enter Username"))
            Username_text.setText("");
    }//GEN-LAST:event_Username_textFocusGained

    private void Username_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Username_textFocusLost
        if(Username_text.getText().equals(""))
            Username_text.setText("Enter Username");
        String query="select username from userdata";
        try {
            ResultSet rs=LoginPage.st.executeQuery(query);
            while(rs.next())
            {
                if(rs.getString("username").equals(Username_text.getText())){
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "This Username is already taken", "Error", getDefaultCloseOperation());
                    Username_text.setText("Enter Username");
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(New_User_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Username_textFocusLost

    private void Register_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_UserActionPerformed
            if(!Firstname_text.getText().equals("Enter Firstname") || !Lastname_text.getText().equals("Enter Lastname") || !Address_text.getText().equals("Enter Address"))
            {
                if(Firstname_text.getText().trim().matches("[a-zA-Z]+")&&Lastname_text.getText().trim().matches("[a-zA-Z]+")){
                date = jDateChooser2.getDate();
                strDate=DateFormat.getDateInstance().format(date);
                arr.add((Firstname_text.getText()+" "+Lastname_text.getText()));
                hs.add(Username_text.getText());
                ll.add(Address_text.getText());
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Account created successfully","Success",getDefaultCloseOperation());
                New_User_Form.count++;}
                else{
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid Input\nPlease fill your information again.","Error",getDefaultCloseOperation());
                Firstname_text.setText("Enter Firstname");
                Lastname_text.setText("Enter Lastname");
                Address_text.setText("Enter Address");
                Username_text.setText("Enter Username");
                jDateChooser2.setDate(date);
                }
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Field(s) cannot be left blank.","Error",getDefaultCloseOperation());                
            }
    }//GEN-LAST:event_Register_UserActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back.setBackground(Color.decode("#2cdd9c"));
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_BackMouseExited

    private void Register_UserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_UserMouseEntered
        Register_User.setBackground(Color.GREEN);
    }//GEN-LAST:event_Register_UserMouseEntered

    private void Register_UserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_UserMouseExited
        Register_User.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_Register_UserMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address_text;
    private javax.swing.JButton Back;
    private javax.swing.JTextField Firstname_text;
    private javax.swing.JLabel Header;
    private javax.swing.JTextField Lastname_text;
    private javax.swing.JButton Register_User;
    private javax.swing.JTextField Username_text;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
