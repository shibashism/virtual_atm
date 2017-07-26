package javaapplication2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import newpackage.SendMail;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import javax.swing.Timer;
import newpackage.MiniStatementGen;

public class Deposit extends javax.swing.JFrame {
    ChoiceButtons obj_dep=new ChoiceButtons();
    Calendar c= Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    /**
     * Creates new form NewJFrame
     */
    Timer t;
    final int waitingTime = 4 * 70 * 1000;
        int c1=0;
        int f=1;
        final int delay = waitingTime / 1000;
        String sDate = c.getInstance().get(Calendar.YEAR) + "-" 
							+ (c.getInstance().get(Calendar.MONTH)+1)
							+ "-" + c.getInstance().get(Calendar.DAY_OF_MONTH) 
							+ " at " + c.getInstance().get(Calendar.HOUR_OF_DAY) 
							+ ":" + c.getInstance().get(Calendar.MINUTE)+ ":" + c.getInstance().get(Calendar.SECOND)+ ":" + c.getInstance().get(Calendar.MILLISECOND);
    public Deposit() {
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
    public void msg1()
	{
		String str1="Your account was credited";
		String str2="Successful";
		javax.swing.JOptionPane.showMessageDialog(rootPane, str1, str2, getDefaultCloseOperation());
		String str3="Your account balance is "+obj_dep.res;
		String str4="Balance";
		javax.swing.JOptionPane.showMessageDialog(rootPane, str3, str4, getDefaultCloseOperation());
	}
	
	
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Deposit = new javax.swing.JButton();
        Deposit_textfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Header = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Deposit.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Deposit.setText("Deposit");
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });

        Deposit_textfield.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Deposit_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Deposit_textfield.setText("Enter the amount");
        Deposit_textfield.setToolTipText("Please enter the amount to be deposited");
        Deposit_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Deposit_textfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Deposit_textfieldFocusLost(evt);
            }
        });
        Deposit_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deposit_textfieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel1.setText("SBM ©");
        jLabel1.setToolTipText("Copyright");

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

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setText("Reset");
        jButton1.setToolTipText("Click here to Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar1.setString("Processing your transaction");
        jProgressBar1.setStringPainted(true);
        jProgressBar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(Deposit_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(Deposit_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Deposit_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deposit_textfieldActionPerformed
        
    }//GEN-LAST:event_Deposit_textfieldActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        //Pattern p = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
        //Matcher m = p.matcher(Deposit_textfield.getText());
        //m.find();
        if(Deposit_textfield.getText().equals("Enter the amount"))
			{
				javax.swing.JOptionPane.showMessageDialog(rootPane, "Field cannot be blank", "Error Deposit", getDefaultCloseOperation());
			}
			else
			{
				if( Integer.parseInt(Deposit_textfield.getText())>0)// || m.hitEnd())
				{
					obj_dep.num1=Integer.parseInt(Deposit_textfield.getText());
					obj_dep.res=LoginPage.bal+obj_dep.num1;
					msg1();
					LoginPage.bal=obj_dep.res;
					Deposit_textfield.setText("");
					obj_dep.change();
                                        String str="A Deposit of INR"+obj_dep.num1+ "has been made using your Debit Card linked to SAAD Bank Account on "+sDate+".";
                                        new MiniStatementGen(LoginPage.user,obj_dep.num1, obj_dep.res); //Start Ministatement Generation Thread
                                        SendMail obj=new SendMail(LoginPage.email,str,obj_dep.num1,obj_dep.res);
                                        t.start();
                                        System.out.println("Deposited amount: "+obj_dep.num1+" on "+sDate);
                                        try(BufferedWriter bw = new BufferedWriter(new FileWriter(LoginPage.trans_details,true)))
                                        {
                                            bw.append("Username: "+LoginPage.user+" Deposited amount: "+obj_dep.num1+" on "+obj_dep.sDate);
                                            bw.newLine();
                                        }
                                        catch(IOException e)
                                        {
                                            e.printStackTrace();
                                        }
				}
				else
				{
					javax.swing.JOptionPane.showMessageDialog(rootPane, "Value entered is invalid", "Error", getDefaultCloseOperation());
                                        Deposit_textfield.setText("Enter the amount");
				}
			}
    }//GEN-LAST:event_DepositActionPerformed

    private void Deposit_textfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Deposit_textfieldFocusGained
        if(Deposit_textfield.getText().equals("Enter the amount"))
            Deposit_textfield.setText("");
    }//GEN-LAST:event_Deposit_textfieldFocusGained

    private void Deposit_textfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Deposit_textfieldFocusLost
        if(Deposit_textfield.getText().equals(""))
            Deposit_textfield.setText("Enter the amount");
    }//GEN-LAST:event_Deposit_textfieldFocusLost

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new ChoiceButtons().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        System.out.println("Session closed");
        System.exit(0);
    }//GEN-LAST:event_CancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Deposit_textfield.setText("Enter the amount");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jProgressBar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jProgressBar1StateChanged
        if(f==0)
        {            
            new ChoiceButtons().setVisible(true);
            this.dispose();
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Transaction is successfull", "Success",getDefaultCloseOperation());
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
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
     /*   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Deposit;
    private javax.swing.JTextField Deposit_textfield;
    private javax.swing.JLabel Header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
    
}
