


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package welcomeframe;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JOptionPane;

/**
 *
 * @author THINKPAD
 */

class VideoPlayerExceptionn extends Exception {
    public VideoPlayerExceptionn(String message) {
        super(message);
    }
}
public class WelcomeToDigitalStepsFrame extends javax.swing.JFrame {
     private JFXPanel fxPanel;
    private MediaPlayer mediaPlayer;

 public WelcomeToDigitalStepsFrame() {
        initComponents2();
        try {
            initFX();
        } catch (VideoPlayerExceptionn e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
     private void initComponents2() {
        fxPanel = new JFXPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To digital Steps");

        getContentPane().setLayout(new BorderLayout()); 

        getContentPane().add(fxPanel, BorderLayout.CENTER); 
        setSize(800, 600); 
        setResizable(false); 

        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
    }

    private void initFX() throws VideoPlayerExceptionn {
        File file = new File("WelcomeNew.mp4");
        if (!file.exists()) {
            throw new VideoPlayerExceptionn("Video file not found!");
        }

        String mediaUrl = file.toURI().toString();
        Media media = new Media(mediaUrl);

        mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaPlayer.setOnReady(() -> {
            mediaPlayer.play();
            Dimension videoSize = new Dimension(800, 600); 
            fxPanel.setPreferredSize(videoSize);
            pack();
        });

        
        Scene scene = new Scene(new javafx.scene.layout.StackPane(mediaView));
        fxPanel.setScene(scene);

        mediaPlayer.setOnEndOfMedia(() -> {
            closeVideoPlayer();
            openNewFrame();
        });
    }

    private void closeVideoPlayer() {
        mediaPlayer.stop();
        setVisible(false); 
        dispose(); 
    }

    private void openNewFrame() {
        
         AfterWelcomeFrame obj = new AfterWelcomeFrame();
         obj.setVisible(true);

    }

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
            java.util.logging.Logger.getLogger(WelcomeToDigitalStepsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeToDigitalStepsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeToDigitalStepsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeToDigitalStepsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeToDigitalStepsFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

