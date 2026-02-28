
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author Huawei
 */

// Wajood
/*
This frame is for the asking the players wether they have an account -> login
dont have an ccount -> crate account
*/
public class DoYouHaveAnAccount extends javax.swing.JFrame {

    /**
     * Creates new form DoYouHaveAnAccount
     */
    public DoYouHaveAnAccount() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Do You Have an Account?");
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        signBtn.setToolTipText("Create an Account");
        signBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        signBtn.setContentAreaFilled(false);
        signBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signBtnMouseClicked(evt);
            }
        });
        getContentPane().add(signBtn);
        signBtn.setBounds(320, 370, 160, 70);

        loginBtn.setToolTipText("Login to my Account");
        loginBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginBtn.setContentAreaFilled(false);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        getContentPane().add(loginBtn);
        loginBtn.setBounds(320, 280, 160, 70);

        backBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        backBtn.setContentAreaFilled(false);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(40, 510, 70, 60);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do u have an account.png"))); // NOI18N
        BGLabel.setMinimumSize(new java.awt.Dimension(800, 630));
        getContentPane().add(BGLabel);
        BGLabel.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        LoginPlayer frame = new LoginPlayer();
        frame.setVisible(true);
        close();
    }//GEN-LAST:event_loginBtnMouseClicked

    private void signBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signBtnMouseClicked
        Signin frame = new Signin();
        frame.setVisible(true);
        close();
    }//GEN-LAST:event_signBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        AdminOrPlayer frame = new AdminOrPlayer();
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
            java.util.logging.Logger.getLogger(DoYouHaveAnAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoYouHaveAnAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoYouHaveAnAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoYouHaveAnAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoYouHaveAnAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton signBtn;
    // End of variables declaration//GEN-END:variables
}
