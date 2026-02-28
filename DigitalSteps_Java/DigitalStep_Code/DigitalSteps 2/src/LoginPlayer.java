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
This frame is for players login, the code check if the entered username and pass are
in the database or not.
*/
public class LoginPlayer extends javax.swing.JFrame {


    DigitalStepsMain con;

    public LoginPlayer() {
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
        registerLabel = new javax.swing.JLabel();
        registerLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
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
        passwordField.setBounds(70, 323, 330, 30);

        loginbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginbtn.setContentAreaFilled(false);
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn);
        loginbtn.setBounds(150, 450, 150, 50);

        registerLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(0, 51, 153));
        registerLabel.setText("Create Account");
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
        registerLabel.setBounds(260, 520, 100, 20);

        registerLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        registerLabel1.setText("You Don't Have an Account?");
        getContentPane().add(registerLabel1);
        registerLabel1.setBounds(90, 520, 260, 20);

        backBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        backBtn.setContentAreaFilled(false);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(40, 530, 40, 40);

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

    private void registerLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLabelMouseEntered
       registerLabel.setForeground(new Color(236, 85, 59));
    }//GEN-LAST:event_registerLabelMouseEntered

    private void registerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLabelMouseClicked
        Signin frame = new Signin();
        frame.setVisible(true);
        close();
    }//GEN-LAST:event_registerLabelMouseClicked

    private void registerLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLabelMouseExited
        registerLabel.setForeground(new Color(33, 99, 155));
    }//GEN-LAST:event_registerLabelMouseExited

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        DoYouHaveAnAccount frame = new DoYouHaveAnAccount();
        frame.setVisible(true);
        close();
    }//GEN-LAST:event_backBtnMouseClicked

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
                new LoginPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel registerLabel1;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables

    private void userLogin(String username, String password) {
        Connection dbcon = DigitalStepsMain.connectDB();

        if (dbcon != null) {
            try {
                String sql = "Select * from player WHERE username = ? AND P_password = ?";
                PreparedStatement st = dbcon.prepareStatement(sql);

                st.setString(1, username);
                st.setString(2, password);

                ResultSet res = st.executeQuery();

                if (res.next()) { // account found

                    // get the account data to be stored in Player list, so we can access the data easily through the program
                    int player_id = res.getInt("Player_ID");
                    String fname = res.getString("Fname");
                    String lname = res.getString("Lname");
                    String email = res.getString("email");
                    String usern = res.getString("username");
                    String pass = res.getString("P_password");
                    String phone = res.getString("phonenumber");
                    String country = res.getString("country");
                    String level;
                    if (res.getString("Plyer_Level") == null) {
                        level = "-";
                        Player player = new Player(player_id, fname, lname, usern, email, pass, phone, country,level);
                        player.setLevel(level);
                        DigitalStepsMain.myPlayers.addFirst(player); // static list created in the main
                        BegginerHome frame = new BegginerHome();
                        frame.setVisible(true);
                        close();
                    } else if (res.getString("Plyer_Level").equals("Beginner")) {
                        level = res.getString("Plyer_Level");
                        Player player = new Player(player_id, fname, lname, usern, email, pass, phone, country,level);
                        player.setLevel(level);
                        DigitalStepsMain.myPlayers.addFirst(player); // static list created in the main
                        BegginerHome frame = new BegginerHome();
                        frame.setVisible(true);
                        close();
                    } else if (res.getString("Plyer_Level").equals("intermediate")) {
                        level = res.getString("Plyer_Level");
                        Player player = new Player(player_id, fname, lname, usern, email, pass, phone, country,level);
                        player.setLevel(level);
                        DigitalStepsMain.myPlayers.addFirst(player); // static list created in the main
                        InterHome frame = new InterHome();
                        frame.setVisible(true);
                        close();
                    } else {
                        level = res.getString("Plyer_Level");
                        Player player = new Player(player_id, fname, lname, usern, email, pass, phone, country,level);
                        player.setLevel(level);
                        DigitalStepsMain.myPlayers.addFirst(player); // static list created in the main
                        AdvHome frame = new AdvHome();
                        frame.setVisible(true);
                        close();
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "User not found.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Connection invalid");
        }

    }

}
