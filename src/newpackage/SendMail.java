package newpackage;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import java.util.*;
import javaapplication2.LoginPage;
import static newpackage.MiniStatementGen.txnId;
import static newpackage.MiniStatementGen.userName;

public class SendMail implements Runnable {
	Thread t1;
	String to, oper;
	float amt, bal;

	public SendMail(String toEmail, String operation, float balance) {
		System.out.println("Mail Thread started");
		to = toEmail;
		oper = operation;
		bal = balance;
		t1 = new Thread(this);
		t1.start();
	}

	static String sDate = Calendar.getInstance().get(Calendar.YEAR) + "-"
			+ (Calendar.getInstance().get(Calendar.MONTH) + 1) + "-" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
			+ " at " + Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + ":"
			+ Calendar.getInstance().get(Calendar.MINUTE) + ":" + Calendar.getInstance().get(Calendar.SECOND);

	public static void sendEmail(String toEmail, String operation, float bal) {
		System.out.println("In the method");
		String from = "saadvatm@gmail.com";
		String to = toEmail;
		String str1 = operation;
		float avlbal = bal;
		final String password = "password13579";

		Session session = Session.getInstance(LoginPage.props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});
		try {
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			
			msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			
			msg.setSubject("Transaction Alert");
			
			
			BodyPart msgPart = new MimeBodyPart();
			
			
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(msgPart);
			String fileName = "C:/Users/Devendra M Naik/Documents/NetBeansProjects/virtual_atm/" + userName + txnId + ".pdf";
			DataSource source = new FileDataSource(fileName);
			msgPart.setDataHandler(new DataHandler(source));
			msgPart.setFileName("MiniStatement.pdf");
                        System.out.println("attachment attached");


			msgPart = new MimeBodyPart();
                        if(avlbal!=0){
			msgPart.setText("Dear Customer,\n" + "\n" + "Greetings from SADA Bank.\n" + "\n" + str1 + "\n"
					+ "The Available Balance in your account is INR " + avlbal + ".\n" + "\n"
					+ "In case you have not made this transaction, please call our Customer Care.\n" + "\n"
					+ "NEVER SHARE your Card number, CVV, PIN, OTP, Internet Banking User ID, Password or URN with anyone, even if the caller claims to be a bank employee. Sharing these details can lead to unauthorised access to your account.\n"
					+ "\n" + "Looking forward to more opportunities to be of service to you.\n" + "\n" + "Sincerely,\n"
					+ "\n" + "Customer Service Team\n" + "SAAD Bank Limited\n" + "\n"
					+ "This is an auto generated e-mail. Please do not reply.");}
                        else
                        {
                            msgPart.setText("Dear Customer,\n" + "\n" + "Greetings from SBM Bank.\n" + "\n" + "Your PIN is successfully changed."
					+ "In case you have not made this Change of PIN, please call our Customer Care.\n" + "\n"
					+ "NEVER SHARE your Card number, CVV, PIN, OTP, Internet Banking User ID, Password or URN with anyone, even if the caller claims to be a bank employee. Sharing these details can lead to unauthorised access to your account.\n"
					+ "\n" + "Looking forward to more opportunities to be of service to you.\n" + "\n" + "Sincerely,\n"
					+ "\n" + "Customer Service Team\n" + "SAAD Bank Limited\n" + "\n"
					+ "This is an auto generated e-mail. Please do not reply.");
                        }
			
			multipart.addBodyPart(msgPart);
			msg.setContent(multipart);
			
			Transport.send(msg);
			
			System.out.println("Message sent successfully....");

			System.out.println("Send mail Method ended");
		} catch (Exception e) {
			e.printStackTrace();
		}

        }
        
	@Override
	public void run() {
		System.out.println("Thread is running");
		SendMail.sendEmail(to, oper, bal);
	}

}
