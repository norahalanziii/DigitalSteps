/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalstepsguifinal;

/**
 *
 * @author THINKPAD
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author THINKPAD
 */
//import javafx.embed.swing.JFXPanel;
//import javafx.scene.Scene;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaView;
//import javafx.util.Duration;
//import javax.swing.*;
//import java.awt.*;
//import java.io.File;
//
//
//class VideoPlayerException extends Exception {
//    public VideoPlayerException(String message) {
//        super(message);
//    }
//}
//
//public class WelcomeFrame extends javax.swing.JFrame {
//    private JFXPanel fxPanel;
//    private MediaPlayer mediaPlayer;
//
//    public WelcomeFrame() {
//        initComponents();
//        try {
//            initFX();
//        } catch (VideoPlayerException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//
//    private void initComponents() {
//        fxPanel = new JFXPanel();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        setTitle("Welcome To digital Steps");
//
//        getContentPane().setLayout(new BorderLayout()); // Use BorderLayout
//
//        getContentPane().add(fxPanel, BorderLayout.CENTER); // Set video panel in the center
//        setSize(800, 600); // Set initial frame size to 800x600 pixels
//        setResizable(false); // Set frame not resizable
//
//        // Center the frame on the screen
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        int x = (screenSize.width - getWidth()) / 2;
//        int y = (screenSize.height - getHeight()) / 2;
//        setLocation(x, y);
//    }
//
//    private void initFX() throws VideoPlayerException {
//        File file = new File("WelcomeNew.mp4");
//        if (!file.exists()) {
//            throw new VideoPlayerException("Video file not found!");
//        }
//
//        String mediaUrl = file.toURI().toString();
//        Media media = new Media(mediaUrl);
//
//        mediaPlayer = new MediaPlayer(media);
//        MediaView mediaView = new MediaView(mediaPlayer);
//        mediaPlayer.setOnReady(() -> {
//            mediaPlayer.play();
//            Dimension videoSize = new Dimension(800, 600); 
//            fxPanel.setPreferredSize(videoSize);
//            pack();
//        });
//
//        
//        Scene scene = new Scene(new javafx.scene.layout.StackPane(mediaView));
//        fxPanel.setScene(scene);
//
//        mediaPlayer.setOnEndOfMedia(() -> {
//            closeVideoPlayer();
//            openNewFrame();
//        });
//    }
//
//    private void closeVideoPlayer() {
//        mediaPlayer.stop();
//        setVisible(false); 
//        dispose(); 
//    }
//
//    private void openNewFrame() {
//        
//         AfterWelcome obj = new AfterWelcome();
//         obj.setVisible(true);
//
////        JFrame newFrame = new JFrame("New Frame");
////        JLabel label = new JLabel("Video ended!");
////        newFrame.getContentPane().add(label);
////        newFrame.setSize(200, 100);
////        newFrame.setResizable(false);
////
////        // Center the frame on the screen
////        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
////        int x = (screenSize.width - newFrame.getWidth()) / 2;
////        int y = (screenSize.height - newFrame.getHeight()) / 2;
////        newFrame.setLocation(x, y);
////
////        newFrame.setVisible(true);
//    }
//
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new WelcomeFrame().setVisible(true);
//            }
//        });
//    }
//}