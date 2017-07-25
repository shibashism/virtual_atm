package newpackage;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class MiniStatementGen implements Runnable {
	
	static String txnId = "0000001";
	Thread tr;
	static String userName;
	static float txnAmt;
	static float bal;
	
	public MiniStatementGen(String username, float amount, float balance) {
		System.out.println("PDF Thread started");
		userName = username;
		txnAmt = amount;
		bal = balance;
		tr = new Thread(this);
		tr.start();
	}
	
	public static void generatePDF(){
            Date now = new Date();
            SimpleDateFormat date = new SimpleDateFormat("EEEE    dd/MM/YYYY");
            SimpleDateFormat time = new SimpleDateFormat("kk:mm:ss zzz");
            String atmId = "ATM007";
            String accNo = "XXXXXXXX75459645";

            String txnAmount = ""+ txnAmt;
            String avlBalance = "" + bal;

            String outputFileName = userName + txnId + ".pdf";
    	
    	

    	try {
			PdfReader reader = new PdfReader("SBMshort.pdf");
			
			PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(outputFileName));
			
			PdfContentByte content = stamper.getOverContent(1);
			content.beginText();
			BaseFont font = BaseFont.createFont(BaseFont.COURIER,BaseFont.WINANSI, BaseFont.EMBEDDED);
			content.setFontAndSize(font, 6);
			content.showTextAligned(PdfContentByte.ALIGN_LEFT, date.format(now), 47.5f, 215.6f, 0);
			content.showTextAligned(PdfContentByte.ALIGN_LEFT, time.format(now), 47.5f, 208.2f, 0);
			content.showTextAligned(PdfContentByte.ALIGN_LEFT, atmId, 47.5f, 200.9f, 0);
			content.showTextAligned(PdfContentByte.ALIGN_LEFT, txnId, 55, 171.6f, 0);
			content.showTextAligned(PdfContentByte.ALIGN_LEFT, accNo, 55, 164.2f, 0);
			content.showTextAligned(PdfContentByte.ALIGN_LEFT, userName, 55, 156.9f, 0);
			content.showTextAligned(PdfContentByte.ALIGN_LEFT, txnAmount, 90, 142.25f, 0);
			content.showTextAligned(PdfContentByte.ALIGN_LEFT, avlBalance, 70, 127.3f, 0);
			content.showTextAligned(PdfContentByte.ALIGN_LEFT, "SUCCESSFUL", 70, 120.2f, 0);
			content.endText();			
			stamper.close();
			System.out.println("PDF Generated!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		System.out.println("Thread is running");
		MiniStatementGen.generatePDF();
	}
}
