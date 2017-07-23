package javaapplication2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import static javaapplication2.LoginPage.st;

public class MoneyTransfer extends javax.swing.JFrame {
    ChoiceButtons obj_MT=new ChoiceButtons();
    Calendar c= Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    static float bal_payee=0;
    /**
     * Creates new form NewJFrame
     */
    public MoneyTransfer() {
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

        Transfer_label = new javax.swing.JLabel();
        Payee = new javax.swing.JTextField();
        Amount_label = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Transfer = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Header = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Transfer_label.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        Transfer_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Transfer_label.setText("Transfer To :");

        Payee.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        Payee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Payee.setText("Enter the Username");
        Payee.setToolTipText("Please enter the username");
        Payee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PayeeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PayeeFocusLost(evt);
            }
        });
        Payee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayeeActionPerformed(evt);
            }
        });

        Amount_label.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        Amount_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Amount_label.setText("Amount :");

        Amount.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        Amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Amount.setText("Enter the amount");
        Amount.setToolTipText("Enter the amount to be transferred");
        Amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AmountFocusLost(evt);
            }
        });
        Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setText("SAAD ©");
        jLabel3.setToolTipText("Copyright");

        Transfer.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        Transfer.setText("Transfer");
        Transfer.setToolTipText("Click here to transfer");
        Transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.setToolTipText("Click here to cancel the transaction");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.setToolTipText("Click here to reset the values");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Header.setBackground(new java.awt.Color(0, 204, 153));
        Header.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Welcome To SBM");
        Header.setToolTipText("");
        Header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Header.setDoubleBuffered(true);
        Header.setName(""); // NOI18N

        Back.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Amount_label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Transfer_label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Payee, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Payee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Transfer_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amount_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountActionPerformed
       
    }//GEN-LAST:event_AmountActionPerformed

    private void PayeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PayeeFocusGained
        if(Payee.getText().equals("Enter the Username"))
            Payee.setText("");
    }//GEN-LAST:event_PayeeFocusGained

    private void PayeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PayeeFocusLost
        if(Payee.getText().equals(""))
            Payee.setText("Enter the Username");
    }//GEN-LAST:event_PayeeFocusLost

    private void AmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AmountFocusGained
        if(Amount.getText().equals("Enter the amount"))
            Amount.setText("");
    }//GEN-LAST:event_AmountFocusGained

    private void AmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AmountFocusLost
        if(Amount.getText().equals(""))
            Amount.setText("Enter the amount");
    }//GEN-LAST:event_AmountFocusLost

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        System.out.println("Activity was cancelled by the user");
        System.exit(0);
    }//GEN-LAST:event_CancelActionPerformed

    private void PayeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PayeeActionPerformed

    private void TransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferActionPerformed
//        Pattern p1 = Pattern.compile("[^0-9]", Pattern.CASE_INSENSITIVE);
//        Pattern p2 = Pattern.compile("[a-z]*", Pattern.CASE_INSENSITIVE);
//        Matcher m1 = p1.matcher(Amount.getText());
//        Matcher m2 = p2.matcher(Payee.getText());
//        m2.find();
//        m1.find();

        if( Payee.equals("Enter the Username") || Amount.getText().equals("Enter the amount") )
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Field cannot be blank", "Error in Money Transfer", getDefaultCloseOperation());
        }
        else
        {
            if(Integer.parseInt(Amount.getText())>0 && Integer.parseInt(Amount.getText())<LoginPage.bal )//&& m2.hitEnd() && m1.hitEnd())
            {
                String query1="select balance from userdata where username='"+Payee.getText()+"'";
                String query2="update userdata set balance="+((LoginPage.bal)-(Integer.parseInt(Amount.getText())))+" where username='"+LoginPage.user+"'";
                String query3="update userdata set balance="+(MoneyTransfer.bal_payee+Integer.parseInt(Amount.getText()))+" where username='"+Payee.getText()+"'";
                String query4="commit";
                try 
                {
                    LoginPage.con.setAutoCommit(false);
                    java.sql.ResultSet rs= st.executeQuery(query1);
                    rs.absolute(1);
                    MoneyTransfer.bal_payee=rs.getFloat("BALANCE");
                    LoginPage.st.executeUpdate(query2);
                    LoginPage.st.executeUpdate(query3);
                    LoginPage.con.setAutoCommit(true);
                    LoginPage.st.executeUpdate(query4); 
                }
                catch (java.sql.SQLException e)
                {
                    e.printStackTrace();
                }
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Transaction Successfull", "Success", getDefaultCloseOperation());
                String sDate = c.getInstance().get(Calendar.YEAR) + "-" 
							+ (c.getInstance().get(Calendar.MONTH)+1)
							+ "-" + c.getInstance().get(Calendar.DAY_OF_MONTH) 
							+ " at " + c.getInstance().get(Calendar.HOUR_OF_DAY) 
							+ ":" + c.getInstance().get(Calendar.MINUTE)+ ":" + c.getInstance().get(Calendar.SECOND)+ ":" + c.getInstance().get(Calendar.MILLISECOND);
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(LoginPage.trans_details,true)))
                {
                    bw.append("Username: "+LoginPage.user+" transferred amount: "+Integer.parseInt(Amount.getText())+" to "+Payee.getText()+" on "+sDate);
                    bw.newLine();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                new ChoiceButtons().setVisible(true);
                this.dispose();
            }
            else
            {
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid credentials", "Error Deposit", getDefaultCloseOperation());
            }
        }
    }//GEN-LAST:event_TransferActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Amount.setText("Enter the amount");
        Payee.setText("Enter the Username");
    }//GEN-LAST:event_ResetActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new ChoiceButtons().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(MoneyTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoneyTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoneyTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoneyTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyTransfer().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JLabel Amount_label;
    private javax.swing.JButton Back;
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel Header;
    private javax.swing.JTextField Payee;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Transfer;
    private javax.swing.JLabel Transfer_label;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
