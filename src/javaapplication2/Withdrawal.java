package javaapplication2;

import java.awt.Color;
import newpackage.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import javax.swing.Timer;

public class Withdrawal extends javax.swing.JFrame { // implements Runnable {
	ChoiceButtons obj_with = new ChoiceButtons();
	public int count = 0, err = 0, flag;
	Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	Timer t;
	final int waitingTime = 4 * 70 * 1000;
	int c1 = 0;
	int f = 1;
	final int delay = waitingTime / 1000;
        
	String sDate = Calendar.getInstance().get(Calendar.YEAR) + "-" + (Calendar.getInstance().get(Calendar.MONTH) + 1)
			+ "-" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + " at "
			+ Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + ":" + Calendar.getInstance().get(Calendar.MINUTE) + ":"
			+ Calendar.getInstance().get(Calendar.SECOND) + ":" + Calendar.getInstance().get(Calendar.MILLISECOND);

	/**
	 * Creates new form Withdrawal
	 */
	public Withdrawal() {
		initComponents();
		t = new Timer(delay, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (c1 <= 100) {
					jProgressBar1.setValue(++c1);
					if (c1 == 10)
						jProgressBar1.setString("Contacting the server");
					if (c1 == 45)
						jProgressBar1.setString("Please wait");
					if (c1 == 80)
						jProgressBar1.setString("Dispensing your money");
					if (c1 == 99)
						f = 0;
				}
			}
		});
                setResizable(false);
	}
	public void msg2() {
		String str5 = "Your account was debited";
		String str6 = "Successful";
		javax.swing.JOptionPane.showMessageDialog(rootPane, str5, str6, getDefaultCloseOperation());
		String str7 = "Your account balance is " + obj_with.res;
		String str8 = "Balance";
		javax.swing.JOptionPane.showMessageDialog(rootPane, str7, str8, getDefaultCloseOperation());
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Copyright = new javax.swing.JLabel();
        btnWithdrawal = new javax.swing.JButton();
        Withdrawal_textfield = new javax.swing.JTextField();
        Header = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 51, 51));

        Copyright.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        Copyright.setForeground(new java.awt.Color(255, 255, 255));
        Copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Copyright.setText("SADA ©");
        Copyright.setToolTipText("Copyright");

        btnWithdrawal.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnWithdrawal.setText("Withdrawal");
        btnWithdrawal.setToolTipText("Click to withdraw");
        btnWithdrawal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnWithdrawal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnWithdrawalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnWithdrawalMouseExited(evt);
            }
        });
        btnWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawalActionPerformed(evt);
            }
        });

        Withdrawal_textfield.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Withdrawal_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Withdrawal_textfield.setText("Enter the amount");
        Withdrawal_textfield.setToolTipText("Please enter the amount to Withdraw");
        Withdrawal_textfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Withdrawal_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Withdrawal_textfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Withdrawal_textfieldFocusLost(evt);
            }
        });

        Header.setBackground(new java.awt.Color(0, 204, 153));
        Header.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        Header.setForeground(new java.awt.Color(255, 255, 255));
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Welcome To SADA");
        Header.setToolTipText("");
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Header.setDoubleBuffered(true);
        Header.setName(""); // NOI18N

        Back.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Back.setText("Back");
        Back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
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

        Cancel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelMouseExited(evt);
            }
        });
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.setToolTipText("Click here to Reset");
        Reset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResetMouseExited(evt);
            }
        });
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jProgressBar1.setBackground(new java.awt.Color(255, 51, 51));
        jProgressBar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar1.setToolTipText("");
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);
        jProgressBar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar1StateChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Devendra M Naik\\Desktop\\back3.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(Withdrawal_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257)
                .addComponent(btnWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257)
                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(926, 926, 926)
                .addComponent(Copyright, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(Withdrawal_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(Copyright, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseEntered
        Cancel.setBackground(Color.red);
    }//GEN-LAST:event_CancelMouseEntered

    private void CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseExited
        Cancel.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_CancelMouseExited

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back.setBackground(Color.decode("#2cdd9c"));
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_BackMouseExited

    private void btnWithdrawalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithdrawalMouseEntered
        btnWithdrawal.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnWithdrawalMouseEntered

    private void btnWithdrawalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithdrawalMouseExited
        btnWithdrawal.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnWithdrawalMouseExited

    private void ResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseEntered
        Reset.setBackground(Color.decode("#2cdd9c"));
    }//GEN-LAST:event_ResetMouseEntered

    private void ResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseExited
        Reset.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ResetMouseExited

	private void Withdrawal_textfieldFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_Withdrawal_textfieldFocusGained
		if (Withdrawal_textfield.getText().equals("Enter the amount")){
			Withdrawal_textfield.setText("");
                        Withdrawal_textfield.setBackground(Color.decode("#74c11d"));
                }
	}// GEN-LAST:event_Withdrawal_textfieldFocusGained

	private void Withdrawal_textfieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_Withdrawal_textfieldFocusLost
		if (Withdrawal_textfield.getText().trim().equals("")){
			Withdrawal_textfield.setText("Enter the amount");
                        Withdrawal_textfield.setBackground(Color.decode("#ffffff"));
                }
	}// GEN-LAST:event_Withdrawal_textfieldFocusLost

	private void btnWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnWithdrawalActionPerformed

		if (Withdrawal_textfield.getText().equals("Enter the amount")) {
			javax.swing.JOptionPane.showMessageDialog(rootPane, "Field cannot be blank", "Error Withdrawal",
					getDefaultCloseOperation());
		} else {
			if (Integer.parseInt(Withdrawal_textfield.getText().trim()) > 0&&Withdrawal_textfield.getText().trim().matches("[0-9]+"))
			{
				obj_with.num1 = Integer.parseInt(Withdrawal_textfield.getText().trim());

				if ((LoginPage.bal - obj_with.num1) >= LoginPage.min_bal && count < 3) {
					obj_with.res = LoginPage.bal - obj_with.num1;
					this.msg2();
					LoginPage.bal = obj_with.res;
					Withdrawal_textfield.setText("Enter the amount");
					count++;
					if (count == 3) {
						flag = 1;
					}
					obj_with.change();
					String str = "A Withdrawal of INR" + obj_with.num1
							+ "has been made using your Debit Card linked to SBM Bank Account on " + sDate + ".";
                                        new MiniStatementGen(LoginPage.user,"WITHDRAWN", obj_with.num1, obj_with.res); //Start Ministatement Generation Thread
                                                       
					t.start();
					System.out.println("Withdrawed amount: " + obj_with.num1 + " on " + sDate);
					Cancel.setEnabled(false);
					Back.setEnabled(false);
					btnWithdrawal.setEnabled(false);
					Reset.setEnabled(false);
					Withdrawal_textfield.setEnabled(false);
					try (BufferedWriter bw = new BufferedWriter(new FileWriter(LoginPage.trans_details, true))) {
						bw.append("Username: " + LoginPage.user + " Withdrawed amount: " + obj_with.num1 + " on "
								+ sDate);
						bw.newLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					if (flag == 1)
						javax.swing.JOptionPane.showMessageDialog(rootPane,
								"You cannot withdraw three times in a streak", "Error", getDefaultCloseOperation());
					else
						javax.swing.JOptionPane.showMessageDialog(rootPane, "Insufficient balance available", "Error",
								getDefaultCloseOperation());
				}
			} else {
				javax.swing.JOptionPane.showMessageDialog(rootPane, "Value entered is invalid", "Error",
						getDefaultCloseOperation());
				Withdrawal_textfield.setText("Enter the amount");
			}
		}
	}// GEN-LAST:event_btnWithdrawalActionPerformed

	private void Withdrawal_textfieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Withdrawal_textfieldActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_Withdrawal_textfieldActionPerformed

	private void BackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BackActionPerformed
		new ChoiceButtons().setVisible(true);
		this.dispose();
	}// GEN-LAST:event_BackActionPerformed

	private void CancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CancelActionPerformed
		System.out.println("Session closed");
		System.exit(0);
	}// GEN-LAST:event_CancelActionPerformed

	private void ResetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ResetActionPerformed
		Withdrawal_textfield.setText("Enter the amount");
	}// GEN-LAST:event_ResetActionPerformed

	private void jProgressBar1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jProgressBar1StateChanged
		if (f == 0) {

			new ChoiceButtons().setVisible(true);
			this.dispose();
			javax.swing.JOptionPane.showMessageDialog(rootPane, "Transaction is successfull", "Success",
					getDefaultCloseOperation());
		}
	}// GEN-LAST:event_jProgressBar1StateChanged

	/**
	 * @param args
	 *            the command line arguments
	 */
	/*
	 * public static void main(String args[]) { /* Set the Nimbus look and feel
	 */
	// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
	// (optional) ">
	/*
	 * If Nimbus (introduced in Java SE 6) is not available, stay with the
	 * default look and feel. For details see
	 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
	 */
	/*
	 * try { for (javax.swing.UIManager.LookAndFeelInfo info :
	 * javax.swing.UIManager.getInstalledLookAndFeels()) { if
	 * ("Nimbus".equals(info.getName())) {
	 * javax.swing.UIManager.setLookAndFeel(info.getClassName()); break; } } }
	 * catch (ClassNotFoundException ex) {
	 * java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.
	 * util.logging.Level.SEVERE, null, ex); } catch (InstantiationException ex)
	 * {
	 * java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.
	 * util.logging.Level.SEVERE, null, ex); } catch (IllegalAccessException ex)
	 * {
	 * java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.
	 * util.logging.Level.SEVERE, null, ex); } catch
	 * (javax.swing.UnsupportedLookAndFeelException ex) {
	 * java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.
	 * util.logging.Level.SEVERE, null, ex); } //</editor-fold>
	 * 
	 * /* Create and display the form
	 */
	/*
	 * java.awt.EventQueue.invokeLater(new Runnable() { public void run() { new
	 * Withdrawal().setVisible(true); } }); }
	 */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel Copyright;
    private javax.swing.JLabel Header;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField Withdrawal_textfield;
    private javax.swing.JButton btnWithdrawal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables


}
