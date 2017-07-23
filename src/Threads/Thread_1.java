package Threads;

import newpackage.SendMail;

public class Thread_1 implements Runnable{
    Thread t1;
    String to,oper;
    float amt,bal;
    public Thread_1(String toEmail,String operation,float amount,float balance) {
        System.out.println("Thread started");
        to=toEmail;
        oper=operation;
        amt=amount;
        bal=balance;
        t1=new Thread(this);
        t1.start();
    }
    
    
    @Override
    public void run() {
        System.out.println("Thread is running");
        SendMail.sendEmail(to, oper, amt, bal);
        
    }
    
}
