package javaapplication2;

import newpackage.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

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
				// if(c1>=100)
				// t.stop();
			}
		});
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	public void msg2() {
		String str5 = "Your account was debited";
		String str6 = "Successful";
		javax.swing.JOptionPane.showMessageDialog(rootPane, str5, str6, getDefaultCloseOperation());
		String str7 = "Your account balance is " + obj_with.res;
		String str8 = "Balance";
		javax.swing.JOptionPane.showMessageDialog(rootPane, str7, str8, getDefaultCloseOperation());
		// SendMail.sendEmail(LoginPage.email,"withdrawal",obj_with.num1,obj_with.res);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		Copyright = new javax.swing.JLabel();
		btnWithdrawal = new javax.swing.JButton();
		Withdrawal_textfield = new javax.swing.JTextField();
		Header = new javax.swing.JLabel();
		Back = new javax.swing.JButton();
		Cancel = new javax.swing.JButton();
		Reset = new javax.swing.JButton();
		jProgressBar1 = new javax.swing.JProgressBar();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setForeground(new java.awt.Color(255, 51, 51));

		Copyright.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
		Copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		Copyright.setText("SAAD ©");
		Copyright.setToolTipText("Copyright");

		btnWithdrawal.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
		btnWithdrawal.setText("Withdrawal");
		btnWithdrawal.setToolTipText("Click to withdraw");
		btnWithdrawal.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnWithdrawalActionPerformed(evt);
			}
		});

		Withdrawal_textfield.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
		Withdrawal_textfield.setText("Enter the amount");
		Withdrawal_textfield.setToolTipText("Please enter the amount to Withdraw");
		Withdrawal_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				Withdrawal_textfieldFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				Withdrawal_textfieldFocusLost(evt);
			}
		});
		Withdrawal_textfield.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Withdrawal_textfieldActionPerformed(evt);
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

		Cancel.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
		Cancel.setText("Cancel");
		Cancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CancelActionPerformed(evt);
			}
		});

		Reset.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
		Reset.setText("Reset");
		Reset.setToolTipText("Click here to Reset");
		Reset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ResetActionPerformed(evt);
			}
		});

		jProgressBar1.setToolTipText("");
		jProgressBar1.setString("Processing your transaction");
		jProgressBar1.setStringPainted(true);
		jProgressBar1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jProgressBar1StateChanged(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 879,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(Copyright, javax.swing.GroupLayout.PREFERRED_SIZE, 64,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGap(201, 201, 201)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE,
												179, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 179,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257,
										Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(btnWithdrawal, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(Reset, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(153, 153, 153))
				.addGroup(layout.createSequentialGroup().addGap(401, 401, 401)
						.addComponent(Withdrawal_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 187,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
						.addComponent(Withdrawal_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(86, 86, 86)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(38, 38, 38)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(26, 26, 26)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(Copyright, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
								.addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void Withdrawal_textfieldFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_Withdrawal_textfieldFocusGained
		if (Withdrawal_textfield.getText().equals("Enter the amount"))
			Withdrawal_textfield.setText("");
	}// GEN-LAST:event_Withdrawal_textfieldFocusGained

	private void Withdrawal_textfieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_Withdrawal_textfieldFocusLost
		if (Withdrawal_textfield.getText().equals(""))
			Withdrawal_textfield.setText("Enter the amount");
	}// GEN-LAST:event_Withdrawal_textfieldFocusLost

	private void btnWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnWithdrawalActionPerformed
		// Pattern p = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
		// Matcher m = p.matcher(Withdrawal_textfield.getText());

		if (Withdrawal_textfield.getText().equals("Enter the amount")) {
			javax.swing.JOptionPane.showMessageDialog(rootPane, "Field cannot be blank", "Error Withdrawal",
					getDefaultCloseOperation());
		} else {
			if (Integer.parseInt(Withdrawal_textfield.getText()) > 0)// &&
																		// !(Withdrawal_textfield.getText().equals("!")))
			{

				obj_with.num1 = Integer.parseInt(Withdrawal_textfield.getText());

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
							+ "has been made using your Debit Card linked to SAAD Bank Account on " + sDate + ".";
					new MiniStatementGen(LoginPage.user, obj_with.num1, obj_with.res); //Start Ministatement Generation Thread
					new SendMail(LoginPage.email, str, obj_with.num1, obj_with.res); //Start Mail Sending Thread
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
	private javax.swing.JProgressBar jProgressBar1;
	// End of variables declaration//GEN-END:variables

	// @Override
	// public void run() {
	// SendMail.sendEmail(LoginPage.email,"withdrawal",obj_with.num1,obj_with.res);
	// //throw new UnsupportedOperationException("Not supported yet."); //To
	// change body of generated methods, choose Tools | Templates.
	// }

}
