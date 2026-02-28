
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.image.ImageProducer;
import javax.swing.JButton;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class QuizChoiceWindow extends javax.swing.JFrame {
 private JButton displayAllQuizzesButton;
    private JButton displayByNameButton;
    private JButton displayByIdButton;
    private JTable table;
    private JTextArea inputTextArea;
    private JLabel backgroundLabel;
    
    public QuizChoiceWindow() {
        initComponentss();
       
        setSize(400, 400);
     setResizable(false);

        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Adminquizsystemfrasme adminQuizSystemFrame = new Adminquizsystemfrasme();
                adminQuizSystemFrame.setLocationRelativeTo(null);
                adminQuizSystemFrame.setVisible(true);
            }
        });
    }
  
private void initComponentss() {
        
  

        // Create the background label with the image
        backgroundLabel = new JLabel();
        backgroundLabel.setIcon(new ImageIcon("background.png"));
        backgroundLabel.setBounds(0, 0, 600, 500);
        

        // Create the display all quizzes button
        displayAllQuizzesButton = new JButton("Display All Quizzes");
        displayAllQuizzesButton.setFont(new Font("Arial", Font.BOLD, 16));
        displayAllQuizzesButton.setBounds(50, 20, 300, 40);
        displayAllQuizzesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Create a new frame for displaying all quizzes
                    JFrame quizzesFrame = new JFrame("All Quizzes");
                    quizzesFrame.setSize(400, 300);
                    quizzesFrame.setLocationRelativeTo(null);

                    // Create a table model with column names
                    String[] columnNames = {"Quiz ID", "Quiz Name", "Description", "Level"};
                    DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

                    // Fetch quiz data from the database
                    Connection connection = DigitalStepsMain.connectDB();
                    Statement statement = connection.createStatement();
                    String query = "SELECT Quiz_ID, Quiz_Name, DescriptionQ, quizLevel FROM Quiz";
                    ResultSet resultSet = statement.executeQuery(query);

                    // Populate the table model with the retrieved data
                    while (resultSet.next()) {
                        int quizId = resultSet.getInt("Quiz_ID");
                        String quizName = resultSet.getString("Quiz_Name");
                        String description = resultSet.getString("DescriptionQ");
                        String level = resultSet.getString("quizLevel");
                        Object[] rowData = {quizId, quizName, description, level};
                        tableModel.addRow(rowData);
                    }

                    // Create the table
                    JTable table = new JTable(tableModel);
                    JScrollPane scrollPane = new JScrollPane(table);
                    quizzesFrame.add(scrollPane);

                    quizzesFrame.setVisible(true);

                    // Close the database connection and release resources
                    resultSet.close();
                    statement.close();
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Create the display by ID button
        displayByIdButton = new JButton("Display by ID");
        displayByIdButton.setFont(new Font("Arial", Font.BOLD, 16));
        displayByIdButton.setBounds(50, 80, 300, 40);
        displayByIdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              try {
            // Prompt the user to enter the quiz ID
            String input = JOptionPane.showInputDialog(QuizChoiceWindow.this, "Enter Quiz ID:");
            if (input != null && !input.isEmpty()) {
                // Parse the input as an integer
                int quizId = Integer.parseInt(input);

                // Create a new frame for displaying quizzes by ID
                JFrame quizzesFrame = new JFrame("Quizzes by ID");
                quizzesFrame.setSize(400, 300);
                quizzesFrame.setLocationRelativeTo(null);

                // Create a table model with column names
                String[] columnNames = {"Quiz ID", "Quiz Name", "Description", "Level"};
                DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

                // Fetch quiz data from the database by ID
                Connection connection = DigitalStepsMain.connectDB();
                String query = "SELECT Quiz_ID, Quiz_Name, DescriptionQ, quizLevel FROM Quiz WHERE Quiz_ID = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, quizId);
                ResultSet resultSet = statement.executeQuery();

                // Populate the table model with the retrieved data
                while (resultSet.next()) {
                    int fetchedQuizId = resultSet.getInt("Quiz_ID");
                    String quizName = resultSet.getString("Quiz_Name");
                    String description = resultSet.getString("DescriptionQ");
                    String level = resultSet.getString("quizLevel");
                    Object[] rowData = {fetchedQuizId, quizName, description, level};
                    tableModel.addRow(rowData);
                }

                // Create the table
                JTable table = new JTable(tableModel);
                JScrollPane scrollPane = new JScrollPane(table);
                quizzesFrame.add(scrollPane);

                quizzesFrame.setVisible(true);

                // Close the database connection and release resources
                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(QuizChoiceWindow.this, "Invalid Quiz ID. Please enter a valid integer ID.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
});

        // Create the display by name button
        displayByNameButton = new JButton("Display by Name");
        displayByNameButton.setFont(new Font("Arial", Font.BOLD, 16));
        displayByNameButton.setBounds(50, 140, 300, 40);
        displayByNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 try {
            // Prompt the user to enter the quiz name
            String input = JOptionPane.showInputDialog(QuizChoiceWindow.this, "Enter Quiz Name:");
            if (input != null && !input.isEmpty()) {
                // Create a new frame for displaying quizzes by name
                JFrame quizzesFrame = new JFrame("Quizzes by Name");
                quizzesFrame.setSize(400, 300);
                quizzesFrame.setLocationRelativeTo(null);

                // Create a table model with column names
                String[] columnNames = {"Quiz ID", "Quiz Name", "Description", "Level"};
                DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

                // Fetch quiz data from the database by name
                Connection connection = DigitalStepsMain.connectDB();
                String query = "SELECT Quiz_ID, Quiz_Name, DescriptionQ, quizLevel FROM Quiz WHERE Quiz_Name = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, input);
                ResultSet resultSet = statement.executeQuery();

                // Populate the table model with the retrieved data
                while (resultSet.next()) {
                    int quizId = resultSet.getInt("Quiz_ID");
                    String quizName = resultSet.getString("Quiz_Name");
                    String description = resultSet.getString("DescriptionQ");
                    String level = resultSet.getString("quizLevel");
                    Object[] rowData = {quizId, quizName, description, level};
                    tableModel.addRow(rowData);
                }

                // Create the table
                JTable table = new JTable(tableModel);
                JScrollPane scrollPane = new JScrollPane(table);
                quizzesFrame.add(scrollPane);

                quizzesFrame.setVisible(true);

                // Close the database connection and release resources
                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
});

        // Add components to the frame
        add(displayAllQuizzesButton);
        add(displayByIdButton);
        add(displayByNameButton);
       
        getContentPane().add(backgroundLabel);
        setLayout(null);
    
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
        setTitle("QuizChoiceWindow");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private String getQuizDataByName(String quizName) {
   
String data = null;
    
        if (quizName.equalsIgnoreCase(quizName)) {
            // Create a 2D array with a single row containing the quiz data
             data = quizName;
            }
           
        
    

     return data;
}
   private boolean checkQuizExistsByName(String quizName) {
        // Check if the quiz exists in your data source
        // Add your logic here
        return true; // Replace with your implementation
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
            java.util.logging.Logger.getLogger(QuizChoiceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizChoiceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizChoiceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizChoiceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     

SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                QuizChoiceWindow quizChoiceWindow = new QuizChoiceWindow();
                
                quizChoiceWindow.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
