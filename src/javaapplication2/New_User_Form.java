/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.table.TableModel;

/**
 *
 * @author Devendra M Naik
 */
public class New_User_Form extends javax.swing.JFrame implements Serializable{

    /**
     * Creates new form New_User_Form
     */
    
    ArrayList<String> arr=new ArrayList<>();
    HashSet<String> hs=new HashSet<>();
    LinkedList<String> ll=new LinkedList<>();
    Vector<String> v=new Vector<>();
    Date date;
    String strDate;
    ObjectInputStream ois;
    ObjectOutputStream out;
    public New_User_Form() {
        initComponents();
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
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Username_text = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(0, 204, 153));
        Header.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Welcome To SBM");
        Header.setToolTipText("");
        Header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Header.setDoubleBuffered(true);
        Header.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("First Name :");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Last Name :");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Address :");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
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
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("New User Registration Form");

        Register_User.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Register_User.setText("Register");
        Register_User.setToolTipText("Please click here to register");
        Register_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_UserActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.setToolTipText("Please click here to register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
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

        jDateChooser1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jDateChooser1.setMaxSelectableDate(new java.util.Date(4102428662000L));
        jDateChooser1.setMaximumSize(new java.awt.Dimension(200, 200));
        jDateChooser1.setMinSelectableDate(new java.util.Date(-1577940738000L));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(217, 217, 217)
                .addComponent(Register_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Firstname_text, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lastname_text)
                            .addComponent(Username_text)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(218, 218, 218))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Firstname_text)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lastname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register_User, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }//GEN-LAST:event_Username_textFocusLost

    private void Register_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_UserActionPerformed
        try
        {
            date = jDateChooser1.getDate();
            strDate=DateFormat.getDateInstance().format(date);
            if(!Firstname_text.getText().equals("Enter Firstname") || !Lastname_text.getText().equals("Enter Lastname") || !Firstname_text.getText().equals("Enter Address"))
            {
                arr.add((Firstname_text.getText()+Lastname_text.getText()));
                hs.add(Username_text.getText());
                ll.add(Address_text.getText());
                v.add(strDate);
            }
            else
                throw new IOException();               
            out = new java.io.ObjectOutputStream(new java.io.FileOutputStream("MyObject.ser",true));
            out.writeObject(arr);
            out.writeObject(hs);
            out.writeObject(ll);
            out.close();
            System.out.println("Completed Serialization Successfully");
//            ois= new ObjectInputStream(new FileInputStream("MyObject.ser")); 
//            New_User_Form x=  (New_User_Form) ois.readObject();
//            for(String s:x.arr)
//            {
//                System.out.println(s);
//            }
//            ois.close();

            //FileInputStream door = new FileInputStream("MyObject.ser");
            //ObjectInputStream reader = new ObjectInputStream(door); 
            //New_User_Form x =(New_User_Form)reader.readObject();
            //System.out.println(x.arr.get(0));
            //System.out.println(x.hs.contains(x));
            //System.out.println(x.ll.get(0));
        }
        catch(IOException e)//|ClassNotFoundException e)                        //pending work for deserialization
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Field(s) cant be left blank", "Error", getDefaultCloseOperation());
        }
    }//GEN-LAST:event_Register_UserActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(New_User_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_User_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_User_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_User_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_User_Form().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address_text;
    private javax.swing.JTextField Firstname_text;
    private javax.swing.JLabel Header;
    private javax.swing.JTextField Lastname_text;
    private javax.swing.JButton Register_User;
    private javax.swing.JTextField Username_text;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}