package app;
import static app.DBConnection.*;
import static app.Utilities.*;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jdesktop.swingx.JXDatePicker;

import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@SuppressWarnings("serial")
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        
    }
   
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        FirstNameTxt = new javax.swing.JTextField();
        LastNameTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        Password1 = new javax.swing.JLabel();
        Uniqueusername = new javax.swing.JLabel();
        Password1Txt = new javax.swing.JPasswordField();
        Email = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTxt = new javax.swing.JTextArea();
        Address = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DOB = new org.jdesktop.swingx.JXDatePicker();
        
        
        Register = new javax.swing.JButton();
        Password2 = new javax.swing.JLabel();
        Password2Txt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setText("Sign Up!");

        FirstName.setText("First Name");

        usernameTxt.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                usernameTxtInputMethodTextChanged(evt);
            }
        });

        LastName.setText("Last Name");

        username.setText("username");

        Password1.setText("Password");

        Email.setText("Email");

        AddressTxt.setColumns(20);
        AddressTxt.setRows(5);
        jScrollPane1.setViewportView(AddressTxt);

        Address.setText("Address");

        jLabel1.setText("Date of Birth");

   
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstName)
                            .addComponent(LastName)
                            .addComponent(username)
                            .addComponent(Password1)
                            .addComponent(Address)
                            .addComponent(jLabel1))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(Header)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(EmailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                            .addComponent(Password1Txt)
                                            .addComponent(usernameTxt)
                                            .addComponent(LastNameTxt)
                                            .addComponent(FirstNameTxt))
                                        .addGap(18, 18, 18)
                                        .addComponent(Uniqueusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 180, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Email)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Header)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName)
                    .addComponent(FirstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username)
                    .addComponent(Uniqueusername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Address)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Password1Txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Register.setText("Register!");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        Password2.setText("Confirm Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(Register))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Password2)
                        .addGap(44, 44, 44)
                        .addComponent(Password2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password2)
                    .addComponent(Password2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(Register)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
public class Emailvalidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN = 
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public Emailvalidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    /**
     * Validate hex with regular expression
     * 
     * @param hex
     *            hex for validation
     * @return true valid hex, false invalid hex
     */
    public boolean validate(final String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

    }
}
    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        try {
            String username = usernameTxt.getText();
            SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
            String dateStr =DOB.getDate().toString();
            DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
            Date date = (Date)formatter.parse(dateStr);    
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);
            java.util.Date date1 = formater.parse(formatedDate);
            java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
            char[] pass1 = Password1Txt.getPassword(); // Collecting the input
            String pwd1 = String.copyValueOf(pass1);
            char[] pass2 = Password2Txt.getPassword(); // Collecting the input
            String pwd2 = String.copyValueOf(pass2);
            Emailvalidator emailValidator = new Emailvalidator();
            String email = EmailTxt.getText();
            
            ResultSet rs = getResult("SELECT CURDATE();");
            rs.next();            
            java.sql.Date today = rs.getDate("CURDATE()");
            
            if(FirstNameTxt.getText().length()==0 || LastNameTxt.getText().length()==0 || usernameTxt.getText().length()==0 || AddressTxt.getText().length()==0 || EmailTxt.getText().length()==0 || dateStr.length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
            else if(CheckusernameExists(username))
            {
                JOptionPane.showMessageDialog(null,"username already exists, try another one");
            }
            else if(!PasswordEquality(pwd1,pwd2))
            {
                JOptionPane.showMessageDialog(null,"Passwords don't match.");
            }
            else if(!emailValidator.validate(email))
            {
                JOptionPane.showMessageDialog(null,"Enter a valid email id.");
            }
            else if(getDateDifference(today, convertDate(date1)) < 4745){
                JOptionPane.showMessageDialog(null, "According to Indian CyberLaw, you must be atleast 13 years old to use this service");
            }
            else
            {
                String address = AddressTxt.getText();
                String firstname = FirstNameTxt.getText();
                String lastname = LastNameTxt.getText();
                String password = pwd1;
                String query = 
                        
                        
                        
                        
                        "INSERT INTO user_info (username, firstname, lastname, password, DOB, address,email) VALUES(\"" + username + "\",\"" + firstname + "\",\"" +  lastname + "\",\"" + password + "\",\"" + sqlDate + "\",\"" + address + "\",\"" + email + "\")";
                System.out.println(query);
                InsertRow(query);
                JOptionPane.showMessageDialog(null,"Successfully registered.");
                this.dispose();
               
            }
            
        
        
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_RegisterActionPerformed

    private void usernameTxtInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_usernameTxtInputMethodTextChanged
//        try{
//            Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
//       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_booking_app?zeroDateTimeBehavior=convertToNull","root","test");     
//       String input=usernameTxt.getText();
//       PreparedStatement pst = conn.prepareStatement("Select * from user_info where username=?");
//       pst.setString(1,input);
//       ResultSet rs = pst.executeQuery();            
//       if(rs.next())            
//           Uniqueusername.setText("Unique.");    
//       else
//           Uniqueusername.setText("username is already taken."); 
//        }
//        catch(Exception e){
//            FirstNameTxt.setText("Exception");
//       e.printStackTrace();
//   } 
        
    }//GEN-LAST:event_usernameTxtInputMethodTextChanged

    public static boolean CheckusernameExists(String username)
{
    boolean usernameExists = false;

    try
    {

       String query="SELECT * FROM user_info WHERE username=\""+username+"\"";
        ResultSet r1=getResult(query);
         if(r1.next()) 
         {
           usernameExists = true;
         }


     }catch (Exception e) 
     {
        JOptionPane.showMessageDialog(null,"Exception");
     } 
     

 return usernameExists;
 }
    
    public static boolean PasswordEquality(String s1,String s2)
    {
    boolean equal = false;

    if(Objects.equals(s1,s2))
        equal=true;

    return equal;
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
          
                   // javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    new Registration().setVisible(true);
                 
            
           
            
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JTextArea AddressTxt;
    private org.jdesktop.swingx.JXDatePicker DOB;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameTxt;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameTxt;
    private javax.swing.JLabel Password1;
    private javax.swing.JPasswordField Password1Txt;
    private javax.swing.JLabel Password2;
    private javax.swing.JPasswordField Password2Txt;
    private javax.swing.JButton Register;
    private javax.swing.JLabel Uniqueusername;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    

}
