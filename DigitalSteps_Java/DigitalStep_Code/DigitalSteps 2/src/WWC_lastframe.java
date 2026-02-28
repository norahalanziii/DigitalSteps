
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class WWC_lastframe extends javax.swing.JFrame {

   private DefaultTableModel tableModel;
    private JTable table;

    public WWC_lastframe() {
        initComponents();
        setLocationRelativeTo(null);
        //System.out.println(javaapplication56.getPointsCounterScore());
        setSize(600,630);
        setResizable(false);
        
 // Set the background image&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
       ImageIcon backgroundImage = new ImageIcon("backgraound_wwc.jpg");
       JLabel backgroundLabel = new JLabel(backgroundImage);
        setContentPane(backgroundLabel);
        getContentPane().setLayout(null);
       

        // Create the label
        JLabel label = new JLabel("Congratulations! You finished the game!");
        label.setFont(new Font("Crayon", Font.PLAIN, 24));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        label.setBounds(0, 100, getWidth(), 40);

        // Create the name label
        JLabel nameLabel = new JLabel(WWC_frame.nickname );
        nameLabel.setFont(new Font("Crayon", Font.PLAIN, 24));
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nameLabel.setVerticalAlignment(SwingConstants.CENTER);
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(0, 150, getWidth(), 30);
        
        String score = String.valueOf(javaapplication56.getPointsCounterScore());
        JLabel ScoreLabel = new JLabel(score );
        ScoreLabel.setFont(new Font("Crayon", Font.PLAIN, 24));
        ScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ScoreLabel.setVerticalAlignment(SwingConstants.CENTER);
        ScoreLabel.setForeground(Color.WHITE);
        ScoreLabel.setBounds(0, 200, getWidth(), 30);
        ;


String[] columnNames = {"Nickname", "Score"};
        Object data [][]= {
                {"roro", 10},
                {"meme", 11},
                {"ww", 8},
                {"lele", 9},
                {"rose", 2}
        };
        Object[][] truncatedData = new Object[10][columnNames.length];
        System.arraycopy(data, 0, truncatedData, 0, Math.min(data.length, 10));
        tableModel = new DefaultTableModel(data, columnNames);
updateTableData(WWC_frame.nickname,javaapplication56.getPointsCounterScore());

        // Create the table with the table model...
        table = new JTable(tableModel);
        table.setEnabled(false);
        table.setBackground(new Color(216, 191, 216));
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(200, 250, 400, 200);
        
        // Add the scrollPane to the frame...
        add(scrollPane);
 // Create the buttons
 
        JButton playAgainButton = new JButton("Play Again");
        JButton goBackButton = new JButton("Go to Digital Steps");
        JButton exitButton = new JButton("Exit");

        // Create the panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(200, 160, 220));
        buttonPanel.setBounds(0, getHeight() - 80, getWidth(), 60);
        buttonPanel.add(playAgainButton);
        buttonPanel.add(goBackButton);
        buttonPanel.add(exitButton);

        // Add components to the frame
        add(label);
        add(nameLabel);
        add(ScoreLabel);
        add(scrollPane);
        add(buttonPanel);
        // Action listener for the play again button
        playAgainButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                javaapplication56.setPointsCounterScore(0);
                // Create a new frame for displaying the play again content
                JFrame playAgainFrame = new JFrame("Play Again");
                playAgainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                playAgainFrame.setSize(400, 300);
                playAgainFrame.setLayout(new FlowLayout());
dispose();
        WWW_Q1 addQuizeFrame = new WWW_Q1();
addQuizeFrame.setLocationRelativeTo(null);
    addQuizeFrame.setVisible(true);
                
            }
        });

        // Action listener for the go back button
        goBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //add ds
            }
        });

        // Action listener for the exit button
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);

       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(805, 360));
        setMinimumSize(new java.awt.Dimension(805, 360));
        getContentPane().setLayout(new java.awt.FlowLayout());

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private void updateTableData(String playerName, int newScore) {
    
 // Update the table data
    boolean updated = false;
    for (int row = 0; row < tableModel.getRowCount(); row++) {
        if (tableModel.getValueAt(row, 0).equals(playerName)) {
            int currentScore = (int) tableModel.getValueAt(row, 1);
            if (newScore > currentScore) {
                tableModel.setValueAt(newScore, row, 1);
                updated = true;
            }
            break;
        }
    }

    // Rearrange the table rows based on the score
    if (updated) {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tableModel);
        sorter.setComparator(1, Comparator.reverseOrder()); // Sort by score in descending order
        table.setRowSorter(sorter);
    }

    // Check if the table is full and limit it to a maximum of 10 rows
    if (tableModel.getRowCount() > 10) {
        tableModel.setRowCount(10);
    }

    // Notify the table about the data change
    tableModel.fireTableDataChanged();
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
            java.util.logging.Logger.getLogger(WWC_lastframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WWC_lastframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WWC_lastframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WWC_lastframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WWC_lastframe().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
