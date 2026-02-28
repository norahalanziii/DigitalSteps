import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.swing.*;
import java.io.File;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


       
public class WWC_frame extends javax.swing.JFrame {


    
    public int pointsCounter1 = 0;
    private String videoFilePath = "WWC_home.mp4";

     WWC_frame() {
        
        initComponents();
       
        setSize(805, 630);

        setResizable(false);
        playVideo(videoFilePath);

        start_.setOpaque(false);
        start_.setContentAreaFilled(false);
        start_.setBorderPainted(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        start_.setSize(screenSize);
//        start_.setOpaque(false);
//       // start_.setContentAreaFilled(false);
//        start_.setBorderPainted(false);
        
        
//        start_.setOpaque(false);
//start_.setContentAreaFilled(false);
//start_.setBorderPainted(false);
////Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//start_.setSize(screenSize);

          }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("World wide competition ");

        start_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_ActionPerformed(evt);
            }
        });
        getContentPane().add(start_, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(625, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public static String   nickname;
    private void start_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_ActionPerformed
     dispose();
     nickname = JOptionPane.showInputDialog(null, "Enter your nickname:");
    
    
    ImageIcon avatar1 = new ImageIcon("avatar1.png");
    ImageIcon avatar2 = new ImageIcon("avatar2.png");
    ImageIcon avatar3 = new ImageIcon("avatar3.png");

    JRadioButton avatarButton1 = new JRadioButton();
    avatarButton1.setIcon(avatar1);
    JRadioButton avatarButton2 = new JRadioButton();
    avatarButton2.setIcon(avatar2);
    JRadioButton avatarButton3 = new JRadioButton();
    avatarButton3.setIcon(avatar3);

    ButtonGroup avatarGroup = new ButtonGroup();
    avatarGroup.add(avatarButton1);
    avatarGroup.add(avatarButton2);
    avatarGroup.add(avatarButton3);

    JPanel avatarPanel = new JPanel();
    avatarPanel.setLayout(new GridLayout(1, 3));
    avatarPanel.add(avatarButton1);
    avatarPanel.add(avatarButton2);
    avatarPanel.add(avatarButton3);

    int result = JOptionPane.showConfirmDialog(null, avatarPanel, "Select Avatar", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (result != JOptionPane.OK_OPTION) {
        return; 
    }

    // Step 3: Determine which avatar was selected
    ImageIcon selectedAvatar = null;
    if (avatarButton1.isSelected()) {
        selectedAvatar = avatar1;
    } else if (avatarButton2.isSelected()) {
        selectedAvatar = avatar2;
    } else if (avatarButton3.isSelected()) {
        selectedAvatar = avatar3;
    }

    Font labelFont = new Font("Arial", Font.BOLD, 16);
    JLabel nicknameLabel = new JLabel("Nickname: " + nickname );
    nicknameLabel.setFont(labelFont);
  


JLabel avatarTextLabel = new JLabel("Avatar:");

// Set the font for the text
avatarTextLabel.setFont(labelFont);

// Create the JLabel for the avatar picture
JLabel avatarImageLabel = new JLabel();
avatarImageLabel.setIcon(selectedAvatar);
    
    JLabel descriptionLabel = new JLabel("This is a game and there is no going back."+" \n Have fun!");
    descriptionLabel.setFont(labelFont);
    
JPanel finalPanel = new JPanel();
finalPanel.setLayout(new BoxLayout(finalPanel, BoxLayout.Y_AXIS));
finalPanel.add(nicknameLabel);
finalPanel.add(avatarTextLabel);
//finalPanel.add(avatarLabel);
finalPanel.add(avatarImageLabel);
finalPanel.add(descriptionLabel);

JPanel buttonPanel = new JPanel(new FlowLayout());

// Create the buttons
JButton letsGoButton = new JButton("Let's Go");
JButton runawayButton = new JButton("Runaway");

// Add the buttons to the buttonPanel
buttonPanel.add(letsGoButton);
buttonPanel.add(runawayButton);




    letsGoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            

        Window window = SwingUtilities.getWindowAncestor(finalPanel);
        if (window != null) {
            window.dispose();
        }

        // Remove the panel from its parent container
        Container parent = finalPanel.getParent();
        if (parent instanceof JFrame) {
            JFrame frame = (JFrame) parent;
            frame.remove(finalPanel);
            frame.revalidate(); // Refresh the frame
            frame.repaint();    // Repaint the frame
        }

        // Open the WWW_Q1 frame
        WWW_Q1 addQuizeFrame = new WWW_Q1();
        addQuizeFrame.setLocationRelativeTo(null);
        addQuizeFrame.setVisible(true);
        
       
        }
    });

    runawayButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0); // Close the program
        }
    });


finalPanel.add(buttonPanel);
    JOptionPane.showMessageDialog(null, finalPanel, "User Information", JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_start_ActionPerformed

    
    public void playVideo(String filePath) {
JFXPanel fxPanel = new JFXPanel();
    getContentPane().add(fxPanel, BorderLayout.CENTER);

    Platform.runLater(() -> {
        Media media = new Media(new File(filePath).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        StackPane root = new StackPane();
        root.getChildren().add(mediaView);
        Scene scene = new Scene(root, 800, 600);
        fxPanel.setScene(scene);

        mediaPlayer.play();
    });
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
            java.util.logging.Logger.getLogger(WWC_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WWC_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WWC_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WWC_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WWC_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            WWC_frame frame = new WWC_frame();
            frame.setLocationRelativeTo(null); // Center the frame on the screen
            frame.setVisible(true);
       });


    }
    
private ImageIcon selectedAvatar; // Declare a member variable to store the selected avatar
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton start_;
    // End of variables declaration//GEN-END:variables
}



