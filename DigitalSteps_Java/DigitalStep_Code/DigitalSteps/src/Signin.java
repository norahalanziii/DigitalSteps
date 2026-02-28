import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Huawei
 */

// Wajood

/*
This JFrame is for registring a new user, after the validation of the user
input data, the data is stored in the database were the id generated auto for each player
*/

public class Signin extends javax.swing.JFrame {
    
    public static String fname;
    public static String lname;
    public static String age;
    public static String country;
    public String username;
    public String email;
    public String password;
    public String phone;
    public static Player player;

    public Signin() {
        initComponents();
        
        // make the JTextField Transprenet 
        fnameTF.setBackground(new java.awt.Color(0,0,0,1));
        lnameTF.setBackground(new java.awt.Color(0,0,0,1));
        emailTF.setBackground(new java.awt.Color(0,0,0,1));
        passwordField.setBackground(new java.awt.Color(0,0,0,1));
        phoneTF.setBackground(new java.awt.Color(0,0,0,1));
        usernameTF.setBackground(new java.awt.Color(0,0,0,1));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signBtn = new javax.swing.JButton();
        lnameTF = new javax.swing.JTextField();
        fnameTF = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        phoneTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        countryCB = new javax.swing.JComboBox<>();
        registerLabel = new javax.swing.JLabel();
        registerLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create an Account");
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        signBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        signBtn.setContentAreaFilled(false);
        signBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signBtnMouseClicked(evt);
            }
        });
        signBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signBtnActionPerformed(evt);
            }
        });
        getContentPane().add(signBtn);
        signBtn.setBounds(170, 520, 110, 40);

        lnameTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(lnameTF);
        lnameTF.setBounds(240, 130, 140, 30);

        fnameTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(fnameTF);
        fnameTF.setBounds(80, 130, 130, 30);

        passwordField.setToolTipText("Your Password must: \n1- Be between 8 and 15 characters.\n2- Include at least one letter. \n3- Include at least one number. \n4- Include at least one symbol (@,#,%,$,&) ");
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(passwordField);
        passwordField.setBounds(80, 480, 290, 20);

        phoneTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(phoneTF);
        phoneTF.setBounds(80, 410, 300, 20);

        usernameTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(usernameTF);
        usernameTF.setBounds(80, 340, 300, 20);

        emailTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(emailTF);
        emailTF.setBounds(80, 270, 300, 20);

        countryCB.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        countryCB.setForeground(new java.awt.Color(255, 102, 0));
        countryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saudi Arabia", "Bahrain", "Kuwait", "Oman", "Qatar", "United Arab Emirates (UAE)" }));
        countryCB.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        countryCB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(countryCB);
        countryCB.setBounds(80, 192, 290, 28);

        registerLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(0, 51, 153));
        registerLabel.setText("Log - in");
        registerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerLabelMouseExited(evt);
            }
        });
        getContentPane().add(registerLabel);
        registerLabel.setBounds(270, 570, 100, 20);

        registerLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        registerLabel1.setText("Do You Have an Account?");
        getContentPane().add(registerLabel1);
        registerLabel1.setBounds(110, 570, 160, 20);

        backBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        backBtn.setContentAreaFilled(false);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(40, 530, 40, 40);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signin.png"))); // NOI18N
        getContentPane().add(BGLabel);
        BGLabel.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signBtnMouseClicked
        ExperienceQuestion frame = new ExperienceQuestion();
        frame.setVisible(true);
        close();
    }//GEN-LAST:event_signBtnMouseClicked

    private void registerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLabelMouseClicked
        LoginPlayer frame = new LoginPlayer();
        frame.setVisible(true);
        close();
    }//GEN-LAST:event_registerLabelMouseClicked

    private void registerLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLabelMouseEntered
        registerLabel.setForeground(new Color(236, 85, 59));
    }//GEN-LAST:event_registerLabelMouseEntered

    private void registerLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLabelMouseExited
        registerLabel.setForeground(new Color(33, 99, 155));
    }//GEN-LAST:event_registerLabelMouseExited

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        DoYouHaveAnAccount frame = new DoYouHaveAnAccount();
        frame.setVisible(true);
        close();
    }//GEN-LAST:event_backBtnMouseClicked

    private void signBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signBtnActionPerformed
        // Retrieve user input
        fname = fnameTF.getText();
        lname = lnameTF.getText();
        country = (String) countryCB.getSelectedItem();
        email = emailTF.getText();
        phone = phoneTF.getText();
        username = usernameTF.getText();
        password = new String(passwordField.getPassword());

        // Validate input
        String validationMessage = validateInput();
        if (!validationMessage.isEmpty()) {
            JOptionPane.showMessageDialog(this, validationMessage);
        } else {
            // All input is valid, proceed with registration
            int result = register(fname, lname, email, username, password, phone, country);
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Account Has Been Created, " + fname + " Welcome!", "Welcome", JOptionPane.PLAIN_MESSAGE);
                ExperienceQuestion frame = new ExperienceQuestion();
                frame.setVisible(true);
                close();
            } else {
                JOptionPane.showMessageDialog(null, "Account Creation FAILD, ", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_signBtnActionPerformed

    
    private String validateInput() {
        
        // this method to reduse the number of message dialog to print all the messages in one dialog
        
        StringBuilder errorMessage = new StringBuilder();
        if (fname.isEmpty() || lname.isEmpty() || country.isEmpty() || email.isEmpty() || phone.isEmpty() || username.isEmpty() || password.isEmpty()) {
            errorMessage.append("Please fill all the fields to continue creating an account\n");
        }
        if (!checkEmail(email)) {
            errorMessage.append("Invalid email format\n");
        }
        if (!checkPassword(password)) {
            errorMessage.append("Invalid password format\n");
        }
        if (!isUsernameUnique(username)) {
            errorMessage.append("Username already exists. Please choose a different one.\n");
        }
        if (!isEmailUnique(email)) {
            errorMessage.append("Email already exists. Please use a different one.\n");
        }
        if (!isPhoneNumberUnique(phone)) {
            errorMessage.append("Phone Number already exists. Please use a different one.\n");
        }
        if (!isPhoneNumberValid(phone)) {
            errorMessage.append("Phone number must be a 10-digit number.\n");
        }
        return errorMessage.toString();
    }
    public void close() { // to close the current frame if we open a new one
        WindowEvent winEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winEvent);
    }

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
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> countryCB;
    private javax.swing.JTextField emailTF;
    private javax.swing.JTextField fnameTF;
    private javax.swing.JTextField lnameTF;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel registerLabel1;
    private javax.swing.JButton signBtn;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables

    private int register(String fname, String lname, String email, String username, String password, String phone, String country) {

        // in this method the input is expected to be valid to be stored in the database
        int result = 0;
        Connection dbcon = DigitalStepsMain.connectDB();
        int player_id = 0;
        
        try {
            // this sql statment stores the input data into the player taple
            String sql = "INSERT INTO player (Fname,Lname,email,username,P_password,phonenumber,country) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement st = (PreparedStatement) dbcon.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, fname);
            st.setString(2, lname);
            st.setString(3, email);
            st.setString(4, username);
            st.setString(5, password);
            st.setString(6, phone);
            st.setString(7, country);

            result = st.executeUpdate();
            ResultSet resultset = st.getGeneratedKeys();
            
            if (resultset.next()){
                player_id = resultset.getInt(1);
            }

            if (result == 1){
                player = new Player(player_id, fname, lname, username, email, password, phone,country,"");
                DigitalStepsMain.myPlayers.addFirst(player);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    private boolean checkPassword(String password) { // method that return true only if the password is valid to
        /*   the conditions
         pass should be > 8 charecter
         at least 1 letter
         at least 1 number
         at least one spical char (@ , & , %, $, #)*/

        boolean hasLetter = false;
        boolean hasNumber = false;
        boolean hasChar = false;

        if (password.length() >= 8 && password.length() <= 15) {

            for (int i = 0; i < password.length(); i++) {

                char ch = password.charAt(i); // to make strings to char

                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    hasLetter = true;
                } else if (ch >= '0' && ch <= '9') {
                    hasNumber = true;
                } else if (ch == '@' || ch == '#' || ch == '%' || ch == '$' || ch == '&') {
                    hasChar = true;
                }
            }
        }
        return hasLetter && hasNumber && hasChar;
    }

    public static boolean checkEmail(String email) {
        String emailRegex = "^[\\w.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
        return email.matches(emailRegex);
    }

    private boolean isPhoneNumberValid(String phone) {
        return phone.length() == 10 && phone.matches("\\d+");
    }


    private boolean isUsernameUnique(String username) {

        // this method check if the username is unique by checking both tables : player and administrative
        Connection dbcon = DigitalStepsMain.connectDB();
        if (dbcon != null) {
            try {
                // Check if the username exists in the player table
                String checkPlayerUsernameQuery = "SELECT * FROM player WHERE username=?";
                PreparedStatement checkPlayerUsernameStatement = dbcon.prepareStatement(checkPlayerUsernameQuery);
                checkPlayerUsernameStatement.setString(1, username);
                ResultSet playerResultSet = checkPlayerUsernameStatement.executeQuery();
                if (playerResultSet.next()) {
                    return false; // Username exists in player table
                }

                // Check if the username exists in the administrative table
                String checkAdminUsernameQuery = "SELECT * FROM administrative WHERE username=?";
                PreparedStatement checkAdminUsernameStatement = dbcon.prepareStatement(checkAdminUsernameQuery);
                checkAdminUsernameStatement.setString(1, username);
                ResultSet adminResultSet = checkAdminUsernameStatement.executeQuery();
                return !adminResultSet.next(); // If returns false it mean username is unique in administrative table

            } catch (SQLException ex) {
                Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Connection invalid");
        }
        return false; //false if any error occurs
    }

    private boolean isEmailUnique(String email) {
        Connection dbcon = DigitalStepsMain.connectDB();
        if (dbcon != null) {
            try {
                // Check if the email exists in the player table
                String checkPlayerEmailQuery = "SELECT * FROM player WHERE email=?";
                PreparedStatement checkPlayerEmailStatement = dbcon.prepareStatement(checkPlayerEmailQuery);
                checkPlayerEmailStatement.setString(1, email);
                ResultSet playerResultSet = checkPlayerEmailStatement.executeQuery();
                if (playerResultSet.next()) {
                    return false; // Email exists in player table
                }

                // Check if the email exists in the administrative table
                String checkAdminEmailQuery = "SELECT * FROM administrative WHERE email=?";
                PreparedStatement checkAdminEmailStatement = dbcon.prepareStatement(checkAdminEmailQuery);
                checkAdminEmailStatement.setString(1, email);
                ResultSet adminResultSet = checkAdminEmailStatement.executeQuery();
                return !adminResultSet.next(); // If returns false it mean email unique in administrative table
            } catch (SQLException ex) {
                Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Connection invalid");
        }
        return false; // false if any error occurs
    }

    private boolean isPhoneNumberUnique(String phoneNumber) {
        Connection dbcon = DigitalStepsMain.connectDB();
        if (dbcon != null) {
            try {
                // Check if the phone number exists in the player table
                String checkPlayerPhoneQuery = "SELECT * FROM player WHERE phonenumber=?";
                PreparedStatement checkPlayerPhoneStatement = dbcon.prepareStatement(checkPlayerPhoneQuery);
                checkPlayerPhoneStatement.setString(1, phoneNumber);
                ResultSet playerResultSet = checkPlayerPhoneStatement.executeQuery();
                if (playerResultSet.next()) {
                    return false; // Phone number exists in player table
                }

                // Check if the phone number exists in the administrative table
                String checkAdminPhoneQuery = "SELECT * FROM administrative WHERE phonenumber=?";
                PreparedStatement checkAdminPhoneStatement = dbcon.prepareStatement(checkAdminPhoneQuery);
                checkAdminPhoneStatement.setString(1, phoneNumber);
                ResultSet adminResultSet = checkAdminPhoneStatement.executeQuery();
                return !adminResultSet.next(); // If returns false it means phone is unique in administrative table
            } catch (SQLException ex) {
                Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Connection invalid");
        }
        return false; //false if any error occurs
    }



        
        

}
