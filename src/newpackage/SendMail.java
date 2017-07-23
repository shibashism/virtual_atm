package newpackage;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.*;
import javaapplication2.LoginPage;

public class SendMail implements Runnable {
	Thread t1;
	String to, oper;
	float amt, bal;

	public SendMail(String toEmail, String operation, float amount, float balance) {
		System.out.println("Thread started");
		to = toEmail;
		oper = operation;
		amt = amount;
		bal = balance;
		t1 = new Thread(this);
		t1.start();
	}

	static String sDate = Calendar.getInstance().get(Calendar.YEAR) + "-"
			+ (Calendar.getInstance().get(Calendar.MONTH) + 1) + "-" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
			+ " at " + Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + ":"
			+ Calendar.getInstance().get(Calendar.MINUTE) + ":" + Calendar.getInstance().get(Calendar.SECOND);

	public static void sendEmail(String toEmail, String operation, float amount, float bal) {
		System.out.println("In the method");
		String from = "saadvatm@gmail.com";
		String to = toEmail;
		String str1 = operation;
		float amt = amount;
		float avlbal = bal;
		final String password = "password13579";

		Session session = Session.getInstance(LoginPage.props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

		try {

			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress("saadvatm@gmail.com"));

			msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

			msg.setSubject("Transaction alert...saad@virtualatm.co.in");
			msg.setText("Dear Customer,\n" + "\n" + "Greetings from VTM Bank.\n" + "\n" + str1 + "\n"
					+ "The Available Balance in your account is INR " + avlbal + ".\n" + "\n"
					+ "In case you have not made this transaction, please call our Customer Care.\n" + "\n"
					+ "NEVER SHARE your Card number, CVV, PIN, OTP, Internet Banking User ID, Password or URN with anyone, even if the caller claims to be a bank employee. Sharing these details can lead to unauthorised access to your account.\n"
					+ "\n" + "Looking forward to more opportunities to be of service to you.\n" + "\n" + "Sincerely,\n"
					+ "\n" + "Customer Service Team\n" + "SAAD Bank Limited\n" + "\n"
					+ "This is an auto generated e-mail. Please do not reply.");

			Transport.send(msg);

			System.out.println("Message sent successfully....");
			System.out.println("Method ended");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		System.out.println("Thread is running");
		SendMail.sendEmail(to, oper, amt, bal);
	}

}
