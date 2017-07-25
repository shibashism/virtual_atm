package javaapplication2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class PIN_Change extends javax.swing.JFrame {

    /**
     * Creates new form PIN_Change
     */
      Timer t;
    final int waitingTime = 4 * 70 * 1000;
        int c1=0;
        int f=1;
        final int delay = waitingTime / 1000;
    public PIN_Change() {
        initComponents();
        t = new Timer(delay, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(c1 <= 100){
                    jProgressBar1.setValue(++c1);
                    if(c1==10)
                        jProgressBar1.setString("Contacting the server");
                    if(c1==45)
                        jProgressBar1.setString("Please wait");
                    if(c1==80)
                        jProgressBar1.setString("Dispensing your money");
                    if(c1==99)
                       f=0;
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Old_Pin_label = new javax.swing.JLabel();
        New_Pin_label = new javax.swing.JLabel();
        Old_PIN = new javax.swing.JPasswordField();
        New_PIN = new javax.swing.JPasswordField();
        Change_PIN = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Header = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Old_Pin_label.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Old_Pin_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Old_Pin_label.setText("Old PIN :");
        Old_Pin_label.setToolTipText("");

        New_Pin_label.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        New_Pin_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        New_Pin_label.setText("New PIN :");

        Old_PIN.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        Old_PIN.setText("Enter your Old PIN");
        Old_PIN.setToolTipText("Please enter your Old PIN");
        Old_PIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Old_PINFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Old_PINFocusLost(evt);
            }
        });
        Old_PIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Old_PINActionPerformed(evt);
            }
        });

        New_PIN.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        New_PIN.setText("Enter your New PIN");
        New_PIN.setToolTipText("Please enter your New PIN");
        New_PIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                New_PINFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                New_PINFocusLost(evt);
            }
        });

        Change_PIN.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Change_PIN.setText("Change PIN");
        Change_PIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_PINActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setText("SBM ©");

        Header.setBackground(new java.awt.Color(0, 204, 153));
        Header.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Welcome To SBM");
        Header.setToolTipText("");
        Header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Header.setDoubleBuffered(true);
        Header.setName(""); // NOI18N

        Back.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jProgressBar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 140, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Old_Pin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(New_Pin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(New_PIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Old_PIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(269, 269, 269))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(318, 318, 318)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Change_PIN, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Old_Pin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Old_PIN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(New_PIN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(New_Pin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Change_PIN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Old_PINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Old_PINActionPerformed
       
    }//GEN-LAST:event_Old_PINActionPerformed

    private void Old_PINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Old_PINFocusGained
        if(new String(Old_PIN.getPassword()).equals("Enter your Old PIN"))
            Old_PIN.setText("");
    }//GEN-LAST:event_Old_PINFocusGained

    private void Old_PINFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Old_PINFocusLost
        if(new String(Old_PIN.getPassword()).equals(""))
            Old_PIN.setText("Enter your Old PIN");
    }//GEN-LAST:event_Old_PINFocusLost

    private void New_PINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_New_PINFocusGained
        if(new String(New_PIN.getPassword()).equals("Enter your New PIN"))
            New_PIN.setText("");
    }//GEN-LAST:event_New_PINFocusGained

    private void New_PINFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_New_PINFocusLost
        if(new String(New_PIN.getPassword()).equals(""))
            New_PIN.setText("Enter your New PIN");
    }//GEN-LAST:event_New_PINFocusLost

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Old_PIN.setText("Enter your Old PIN");
        New_PIN.setText("Enter your New PIN");
    }//GEN-LAST:event_ResetActionPerformed

    private void Change_PINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_PINActionPerformed
         //Pattern p = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
         //Matcher m1 = p.matcher(new String(Old_PIN.getPassword()));
         //Matcher m2 = p.matcher(new String(New_PIN.getPassword()));
         String pass1=new String(Old_PIN.getPassword());
         String pass2=new String(New_PIN.getPassword());
         int row;
         if(pass1.equals("Enter your Old PIN")||pass2.equals("Enter your New PIN"))
         {
             javax.swing.JOptionPane.showMessageDialog(rootPane, "Field cannot be left blank.", "Error", getDefaultCloseOperation());
         }
         else
         {
            //if(m1.hitEnd()||m2.hitEnd())
           // {
            if(pass1.equals(pass2))
            {
               javax.swing.JOptionPane.showMessageDialog(rootPane, "Old PIN and New PIN is same", "Error Same PIN", getDefaultCloseOperation());
            }
            else
            {
               if(Integer.parseInt(pass1)==LoginPage.pin)
               {
                   try {
                       row=LoginPage.st.executeUpdate("update userdata set pin="+Integer.parseInt(pass2)+" where username='"+LoginPage.user+"'");
                   } catch (SQLException ex) {
                       Logger.getLogger(PIN_Change.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   javax.swing.JOptionPane.showMessageDialog(rootPane, "PIN was changed successfully!\nPlease do remember your New PIN", "Success", getDefaultCloseOperation());
                   new ChoiceButtons().setVisible(true);
                   this.dispose();
               }
               else
               {
                   javax.swing.JOptionPane.showMessageDialog(rootPane, "You have entered wrong credentials", "Error", getDefaultCloseOperation());
               }
            }
         //  }
          //  else
          //  {
          //      javax.swing.JOptionPane.showMessageDialog(rootPane, "You have entered wrong credentials", "Error", getDefaultCloseOperation());
          ///  }
         }
    }//GEN-LAST:event_Change_PINActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new ChoiceButtons().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        System.out.println("Session closed");
        System.exit(0);
    }//GEN-LAST:event_CancelActionPerformed

    private void jProgressBar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jProgressBar1StateChanged
        if(f==0)
        {
            new ChoiceButtons().setVisible(true);
            this.dispose();
            javax.swing.JOptionPane.showMessageDialog(rootPane, "PIN Changed successfully", "Success",getDefaultCloseOperation());
        }
    }//GEN-LAST:event_jProgressBar1StateChanged

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
            java.util.logging.Logger.getLogger(PIN_Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PIN_Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PIN_Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PIN_Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PIN_Change().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Change_PIN;
    private javax.swing.JLabel Header;
    private javax.swing.JPasswordField New_PIN;
    private javax.swing.JLabel New_Pin_label;
    private javax.swing.JPasswordField Old_PIN;
    private javax.swing.JLabel Old_Pin_label;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
