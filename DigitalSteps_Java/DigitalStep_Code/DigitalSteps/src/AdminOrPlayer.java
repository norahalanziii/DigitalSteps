import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.event.*;

/**
 *
 * @author Huawei
 */

// Wajood
/*
This frame for determining the user role admin or player
*/
public class AdminOrPlayer extends javax.swing.JFrame {


    public AdminOrPlayer() {
        initComponents();
        PlayerButton.setBackground(new java.awt.Color(0,0,0,1));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlayerButton = new javax.swing.JButton();
        AdmButton1 = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome To Digital Steps");
        setMinimumSize(new java.awt.Dimension(800, 630));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        PlayerButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PlayerButton.setContentAreaFilled(false);
        PlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PlayerButton);
        PlayerButton.setBounds(430, 310, 310, 90);

        AdmButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AdmButton1.setContentAreaFilled(false);
        AdmButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdmButton1MouseClicked(evt);
            }
        });
        getContentPane().add(AdmButton1);
        AdmButton1.setBounds(90, 310, 310, 90);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin or player.png"))); // NOI18N
        getContentPane().add(BGLabel);
        BGLabel.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerButtonActionPerformed
        DoYouHaveAnAccount frame = new DoYouHaveAnAccount();
        frame.setVisible(true);
        close();
    }//GEN-LAST:event_PlayerButtonActionPerformed

    private void AdmButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdmButton1MouseClicked
        LoginAdmin frame = new LoginAdmin();
        frame.setVisible(true);
        close();
    }//GEN-LAST:event_AdmButton1MouseClicked

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
            java.util.logging.Logger.getLogger(AdminOrPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOrPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOrPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOrPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOrPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdmButton1;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton PlayerButton;
    // End of variables declaration//GEN-END:variables
}
