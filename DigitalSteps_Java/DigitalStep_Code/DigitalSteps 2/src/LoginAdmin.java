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
This JFrame is for admin login, this frame differs from the PlayerLogin frame is that
the admin cant create an account only login
*/

public class LoginAdmin extends javax.swing.JFrame {


    DigitalStepsMain con;

    public LoginAdmin() {
        initComponents();
        con = new DigitalStepsMain();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Error in Database connection", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        usernameTF.setBackground(new java.awt.Color(0, 0, 0, 1));
        passwordField.setBackground(new java.awt.Color(0, 0, 0, 1));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameTF = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login to your Account");
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        usernameTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(usernameTF);
        usernameTF.setBounds(70, 230, 330, 30);

        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(passwordField);
        passwordField.setBounds(70, 320, 330, 30);

        loginbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginbtn.setContentAreaFilled(false);
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn);
        loginbtn.setBounds(150, 450, 150, 50);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        getContentPane().add(BGLabel);
        BGLabel.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        String username = usernameTF.getText();
        String password = new String(passwordField.getPassword());
        
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter a username and Password.");
        } else {
            // start login
            userLogin(username, password);
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    public void close() {
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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables

    private void userLogin(String username, String password) {
        
        Connection dbcon = DigitalStepsMain.connectDB();
        
        if (dbcon != null) {
            try {
                String sql = "Select * from Administrative WHERE Username = ? AND A_password = ?";
                PreparedStatement st = (PreparedStatement) dbcon.prepareStatement(sql);
                
                st.setString(1, username);
                st.setString(2, password);
                
                ResultSet res = st.executeQuery(); 

                if (res.next()) { // account found

                    // get the account data to be stored in Admin list, so we can access the data easily through the program
                    long admin_id = res.getLong("Admin_ID");
                    String fname = res.getString("Fname");
                    String lname = res.getString("Lname");
                    String email = res.getString("Email");
                    String usern = res.getString("Username");
                    String pass = res.getString("A_password");
                    String phone = res.getString("phoneNumber");
                    String country = res.getString("Country");
                    String city = res.getString("City");
                    String zipcode = res.getString("Zipcode");
                    
                    Admin admin = new Admin(admin_id,fname,lname,usern,email,pass, phone,country,city,zipcode);
                    DigitalStepsMain.myAdmins.addFirst(admin); // static list created in the main
                    
                    // after login go to home admin
                    AdminHomeDashBoaedQuize frame = new AdminHomeDashBoaedQuize();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                    close();

                }else{
                    JOptionPane.showMessageDialog(this, "User not found.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            System.out.println("Connection invalid");
        }

    }

}
