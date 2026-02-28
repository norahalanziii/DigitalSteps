
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Huawei
 */

// Wajood

/*
This JFrame is for displaying the Admin profile, the data are taken from Database also there's a butn for delete account
*/
public class AdminProfile extends javax.swing.JFrame {


    public AdminProfile() {
        initComponents();
        deleteAccBtn.setBackground(new java.awt.Color(0, 0, 0, 1));
        setAdminData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        fnameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        lnameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        zipcodeLabel = new javax.swing.JLabel();
        deleteAccBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        showPassBtn = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(DigitalStepsMain.myAdmins.firstAdmin().getFname() + " Profile");
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(33, 99, 155));
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(51, 180, 190, 20);

        fnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fnameLabel.setForeground(new java.awt.Color(33, 99, 155));
        getContentPane().add(fnameLabel);
        fnameLabel.setBounds(51, 257, 190, 20);

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(33, 99, 155));
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(273, 180, 190, 20);

        lnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lnameLabel.setForeground(new java.awt.Color(33, 99, 155));
        getContentPane().add(lnameLabel);
        lnameLabel.setBounds(273, 257, 190, 20);

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idLabel.setForeground(new java.awt.Color(33, 99, 155));
        getContentPane().add(idLabel);
        idLabel.setBounds(50, 330, 90, 30);

        phoneLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(33, 99, 155));
        getContentPane().add(phoneLabel);
        phoneLabel.setBounds(160, 330, 110, 30);

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(33, 99, 155));
        getContentPane().add(emailLabel);
        emailLabel.setBounds(287, 330, 173, 30);

        countryLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        countryLabel.setForeground(new java.awt.Color(33, 99, 155));
        getContentPane().add(countryLabel);
        countryLabel.setBounds(50, 410, 140, 40);

        cityLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(33, 99, 155));
        getContentPane().add(cityLabel);
        cityLabel.setBounds(210, 410, 130, 40);

        zipcodeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        zipcodeLabel.setForeground(new java.awt.Color(33, 99, 155));
        getContentPane().add(zipcodeLabel);
        zipcodeLabel.setBounds(370, 410, 100, 40);

        deleteAccBtn.setToolTipText("This Button Will Delete Your Account Permanently");
        deleteAccBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteAccBtn.setContentAreaFilled(false);
        deleteAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteAccBtn);
        deleteAccBtn.setBounds(130, 500, 260, 40);

        homeBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        homeBtn.setContentAreaFilled(false);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn);
        homeBtn.setBounds(460, 10, 60, 70);

        showPassBtn.setBackground(new java.awt.Color(246, 246, 246));
        showPassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showPassBtn.png"))); // NOI18N
        showPassBtn.setToolTipText("Show Password");
        showPassBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        showPassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showPassBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showPassBtnMouseExited(evt);
            }
        });
        getContentPane().add(showPassBtn);
        showPassBtn.setBounds(470, 170, 50, 40);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin Profile.png"))); // NOI18N
        getContentPane().add(BGLabel);
        BGLabel.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete your account?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            deleteAccountFromDatabase();
        }
    }//GEN-LAST:event_deleteAccBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        AdminHomeDashBoaedQuize frame = new AdminHomeDashBoaedQuize();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        close();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void showPassBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassBtnMouseEntered
       showPassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showPassBtnHover.png"))); // NOI18N
    }//GEN-LAST:event_showPassBtnMouseEntered

    private void showPassBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassBtnMouseExited
       showPassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showPassBtn.png"))); // NOI18N
    }//GEN-LAST:event_showPassBtnMouseExited

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
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new AdminProfile().setVisible(true);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "No account is Provided, Sign-up or Sign-in First.","Not Authorized",JOptionPane.ERROR_MESSAGE);
                    LoginAdmin frame = new LoginAdmin();
                    frame.setVisible(true);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JButton deleteAccBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel fnameLabel;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton showPassBtn;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel zipcodeLabel;
    // End of variables declaration//GEN-END:variables

    public void setAdminData() { // this method is to display data in admin profile
        // username is taken from Admin login frame
        
        Connection dbcon = DigitalStepsMain.connectDB();
        String username = DigitalStepsMain.myAdmins.firstAdmin().getUsername();
        
        if (dbcon != null) {
            try {
                String sql = "SELECT * FROM Administrative WHERE Username = ?";
                PreparedStatement st = dbcon.prepareStatement(sql);
                st.setString(1, username);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {

                    usernameLabel.setText(rs.getString("Username"));
                    fnameLabel.setText(rs.getString("Fname"));
                    lnameLabel.setText(rs.getString("Lname"));
                    cityLabel.setText(rs.getNString("City"));
                    countryLabel.setText(rs.getNString("Country"));
                    zipcodeLabel.setText(rs.getNString("ZipCode"));
                    phoneLabel.setText(rs.getNString("PhoneNumber"));
                    emailLabel.setText(rs.getNString("Email"));
                    BigDecimal adminID = rs.getBigDecimal("admin_ID"); // because the coulmn type in DB is decimal
                    idLabel.setText(adminID.toString());

                    // hide or show password
                    String password = rs.getString("A_password");
                    String maskedPass = hidePass(password);
                    passwordLabel.setText(maskedPass);

                    // Add a click event listener to the show password button
                    showPassBtn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Toggle password visibility
                            passwordLabel.setText(showPass ? maskedPass : password);
                            // Update the showPassword flag
                            showPass = !showPass;
                        }
                    });

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    dbcon.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }

    private boolean showPass = false;

    private String hidePass(String password) {

        if (showPass) {
            return password;
        } else {
            // hide password
            StringBuilder hiddenPass = new StringBuilder();
            for (int i = 0; i < password.length(); i++) {
                hiddenPass.append("*");
            }

            return hiddenPass.toString();
        }
    }

    private void deleteAccountFromDatabase() { // this method is to delete the account

        Connection dbcon = DigitalStepsMain.connectDB();

        try {

            String sql = "DELETE FROM Administrative WHERE Username = ?";
            PreparedStatement st = dbcon.prepareStatement(sql);

            // Set the parameter for the username to be deleted
            st.setString(1, usernameLabel.getText()); // Assuming usernameLabel displays the username

            // Execute the delete statement
            int rowsAffected = st.executeUpdate();

            // Check if account was deleted successfully
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Account deleted successfully.");
//                AfterWelcome frame = AfterWelcome();
//                frame.setVisible(true);
                close();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete account.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        }
    }
}
