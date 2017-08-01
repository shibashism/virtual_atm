package javaapplication2;
import java.awt.Color;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Properties;
import java.util.TimeZone;


public class LoginPage extends javax.swing.JFrame {
    int admin_pin=5555;
    static Connection con;
    public static Statement st;
    public static Properties props;
    public ObjectOutputStream out;
    public static String user,email;
    public String sDate;
    public static int pin;
    static float bal=0,min_bal=100;
    int count=0,err=0,flag;
    static int blocked=0;
    Calendar c= Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    static
    {
        System.out.println("Static block of SendMail called!!!");
        String host = "smtp.gmail.com";
        props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port","587");
    }
    static String trans_details="C:\\Users\\Devendra M Naik\\Documents\\NetBeansProjects\\JavaApplication2\\src\\javaapplication2\\Transaction_Details.txt";
    static
    {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system","root");
		st=LoginPage.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	} catch (SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println("connected");
    }
    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        setResizable(false);
        Help1.setVisible(false);
            Help2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Reset = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        NewUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Help1 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Help2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.setToolTipText("Click here to clear the values");
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

        Login.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Login.setText("Login");
        Login.setToolTipText("Click here to Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password.setText("Enter Password");
        Password.setToolTipText("Please enter your PIN");
        Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });

        NewUser.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        NewUser.setText("New User Form");
        NewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewUserMouseExited(evt);
            }
        });
        NewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to SBM");
        jLabel1.setToolTipText("Header");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DMN ©");
        jLabel2.setToolTipText("Copyright");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Don't have an account? Sign up -->");

        jToggleButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jToggleButton1.setText("Help");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        Help1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Help1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Help1.setText("Enter Username Here ---->");
        Help1.setInheritsPopupMenu(false);

        Username.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Username.setText("Enter Username");
        Username.setToolTipText("Please enter your username");
        Username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });

        Help2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Help2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Help2.setText("Enter Password Here ---->");
        Help2.setInheritsPopupMenu(false);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Devendra M Naik\\Desktop\\back3.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setName("Virtual ATM"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(596, 596, 596)
                .addComponent(NewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(785, 785, 785)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(Help1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(625, 625, 625)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(Help2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(Help1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(Help2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(245, 245, 245)
                .addComponent(jToggleButton1))
        );

        Help1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
            if( (new String(Password.getPassword())).equals("Enter Password") || Username.getText().equals("Enter Username") )
            {
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Field cannot be blank", "Error Deposit", getDefaultCloseOperation());
            }
            else
            {
                LoginPage.user=Username.getText().trim();
                String temp_str=new String(Password.getPassword()).trim();
                if(LoginPage.user.matches("[a-zA-Z0-9]+")&&temp_str.matches("[0-9]+"))
                {
                    LoginPage.pin=Integer.parseInt(temp_str);
                    if(LoginPage.user.equals("admin")&&LoginPage.pin==admin_pin)
                    {
                        if(New_User_Form.count==0)
                        {
                            new admin_pack.admin_page().setVisible(true);
                            this.dispose();
                        }
                        else
                        {
                            javax.swing.JOptionPane.showMessageDialog(rootPane, "New Customer Registrations are available\nPlease close the application first","▀▀Alert▀▀",getDefaultCloseOperation());
                            Username.setText("Enter Username");
                        }
                    }
                    else
                    {
                        String query="select username,pin,balance,email from userdata where username='"+user+"' and pin="+pin;
                        sDate = Calendar.getInstance().get(Calendar.YEAR) + "-"
                                        + (Calendar.getInstance().get(Calendar.MONTH)+1)
                                        + "-" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
                                        + " at " + Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
                                        + ":" + Calendar.getInstance().get(Calendar.MINUTE)+ ":" + Calendar.getInstance().get(Calendar.SECOND)+ ":" + Calendar.getInstance().get(Calendar.MILLISECOND);
                        try 
                        {
                            java.sql.ResultSet rs= st.executeQuery(query);
                            rs.absolute(1);
                            bal=rs.getFloat("BALANCE");
                            email=rs.getString("email");
                            c.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
                            System.out.println("Logged in as "+user+"\t"+sDate);
                            new ChoiceButtons().setVisible(true);
                            this.dispose();
                        } 
                        catch (SQLException e) 
                        {
                            System.out.println("\nFalse logging in from Username: "+user+" on\t"+sDate);
                            err++;
                            if(err==3)
                            {
                                blocked=1;
                                javax.swing.JOptionPane.showMessageDialog(rootPane, "Your Card is being blocked due to security reasons\nPlease contact the bank for further details", "Alert",getDefaultCloseOperation());
                                System.exit(0);
                            }
                            else
                            {
                                javax.swing.JOptionPane.showMessageDialog(rootPane, "You have "+(3-err)+"attempts left...", "Alert",getDefaultCloseOperation());
                            }
                        }
                    }
                }
                else{
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "error","error",getDefaultCloseOperation());
                    Username.setText("Enter Username");
                    Password.setText("Enter Password");
                }
            }
    }//GEN-LAST:event_LoginActionPerformed

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        if(Username.getText().equals("Enter Username")){
            Username.setText("");
            Username.setBackground(Color.decode("#74c11d"));
        }
    }//GEN-LAST:event_UsernameFocusGained

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        if(Username.getText().equals("")){
            Username.setText("Enter Username");
            Username.setBackground(Color.decode("#ffffff"));
        }
    }//GEN-LAST:event_UsernameFocusLost

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Username.setText("Enter Username");
        Password.setText("Enter Password");
    }//GEN-LAST:event_ResetActionPerformed

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
       if(new String(Password.getPassword()).equals("Enter Password")){
            Password.setText("");
            Password.setBackground(Color.decode("#74c11d"));
       }
    }//GEN-LAST:event_PasswordFocusGained

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
        if(new String(Password.getPassword()).equals("")){
            Password.setText("Enter Password");
            Password.setBackground(Color.decode("#ffffff"));
        }
    }//GEN-LAST:event_PasswordFocusLost

    private void NewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUserActionPerformed
        new New_User_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NewUserActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(jToggleButton1.isSelected())
        {Help1.setVisible(true);
        Help2.setVisible(true);}
        else
        {
            Help1.setVisible(false);
            Help2.setVisible(false);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void ResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseEntered
        Reset.setBackground(Color.decode("#2cdd9c"));
    }//GEN-LAST:event_ResetMouseEntered

    private void ResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseExited
        Reset.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ResetMouseExited

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        Login.setBackground(Color.GREEN);
    }//GEN-LAST:event_LoginMouseEntered

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        Login.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_LoginMouseExited

    private void NewUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewUserMouseEntered
        NewUser.setBackground(Color.decode("#2cdd9c"));
    }//GEN-LAST:event_NewUserMouseEntered

    private void NewUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewUserMouseExited
        NewUser.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_NewUserMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
            out=new ObjectOutputStream(new java.io.FileOutputStream("C:\\Users\\Devendra M Naik\\Documents\\NetBeansProjects\\virtual_atm\\MyObject.ser"));
            out.writeObject(New_User_Form.arr);
            out.writeObject(New_User_Form.hs);
            out.writeObject(New_User_Form.ll);
            out.flush();
            out.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Help1;
    private javax.swing.JLabel Help2;
    private javax.swing.JButton Login;
    private javax.swing.JButton NewUser;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
