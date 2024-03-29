/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.guessingamewgui;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author 10spe
 */
public class mainFrame extends javax.swing.JFrame {
    public int gamesWon=0; // Initialize counter of games won by player.
    public int gamesLost=0; // Initialize counter of games lost by player.
    private Random randomizer=new Random(); // Initialize random generator
    public int randomNum = randomizer.nextInt(99)+1; // Intiailize inital random number
    /**
     * Creates new form NewJFrame
     */
    public mainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        inputField = new javax.swing.JTextField();
        errorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("I'm thinking of a number between 1 and 100.");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Can you guess what that is?");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        inputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldActionPerformed(evt);
            }
        });

        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(errorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // Confirm that input field is not empty:
        if(!inputField.getText().isEmpty()&&!inputField.getText().isBlank()){
            // Confirm that value in input field is an integer value:
            try{
                // Retrieve value in textbox and save it as an integer:
                int intValue = Integer.parseInt(inputField.getText());
                // Confirm that integer value is greater than 0 and less than 100
                if(intValue > 0 && intValue < 101){
                    // Check if inputted value matches randomly generated number between 1 and 100:
                    if(intValue==randomNum){
                        // Increment counter of games won.
                        gamesWon++;
                        // Hide main play window:
                        setVisible(false);
                        // Create new frame for outputting victory messages:
                        JFrame winScreen = new JFrame();
                        // Define layout of new frame as null
                        winScreen.setLayout(null);
                        // Define size and location of new frame:
                        winScreen.setBounds(0,0,300,150);
                        // Create new label storing Victory message.
                        JLabel winMessage = new JLabel("You won!");
                        // Define size and location of label:
                        winMessage.setBounds(0,0,300,20);
                        // Set alignment of text within label to Center:
                        winMessage.setHorizontalAlignment(javax.swing.SwingUtilities.CENTER);
                        // Add new label to the frame:
                        winScreen.add(winMessage);
                        // Create new label to report win/loss record to the player:
                        JLabel recordReport = new JLabel("You have won "+gamesWon+" games, and lost "
                        + gamesLost + " games.");
                        // Define size and location of label:
                        recordReport.setBounds(0,0,300,50);
                        // Set alignment of text within label to Center:
                        recordReport.setHorizontalAlignment(javax.swing.SwingUtilities.CENTER);
                        // Add new label to the frame:
                        winScreen.add(recordReport);
                        // Create new label to query player if they want to play again:
                        JLabel restartQuery = new JLabel("Play again?");
                        // Set alignment of text within label to Center:
                        restartQuery.setHorizontalAlignment(javax.swing.SwingUtilities.CENTER);
                        // Define size and location of label:
                        restartQuery.setBounds(0,0,300,80);
                        // Add new label to the frame:
                        winScreen.add(restartQuery);
                        // Create button that will confirm if player wants to play again:
                        JButton restartButton=new JButton("Yes");
                        // Set size and location of restart button:
                        restartButton.setBounds(10,50,80,20);
                        // Create actionListener for restart button and add it to the button:
                        restartButton.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                //Generate a new random number between 1 and 100
                                randomNum=randomizer.nextInt(99)+1;
                                // Clear out any error messages from main window
                                errorMessage.setText("");
                                // Clear out old input from main window input box
                                inputField.setText("");
                                // Unhide main window
                                setVisible(true);
                                // Destroy results screen
                                setVisible(true);
                            }
                        });
                        // Add restart button to the results frame:
                        winScreen.add(restartButton);
                        // Create Button to end program if user no longer wants to play:
                        JButton exitButton=new JButton("No");
                        // Set size and location of exit button:
                        exitButton.setBounds(150,50,90,20);
                        // If exit button is pressed, end program:
                        exitButton.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                System.exit(0);
                            }
                        });
                        // Add exit button to the results frame:
                        winScreen.add(exitButton);
                        // Confirm visibility of results frame:
                        winScreen.setVisible(true);
                        // Make it so that results frame can not be resized:
                        winScreen.setResizable(false);
                        // Set it so that program closes if results screen is manually closed:
                        winScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }else{ // If inputted value doesn't match randomly generated value:
                        // Increment games lost counter.
                        gamesLost++;
                        // Hide main play window:
                        setVisible(false);
                        // Create new frame for outputting victory messages:
                        JFrame loseScreen = new JFrame();
                        // Define size and location of new frame:
                        loseScreen.setBounds(0,0,300,150);
                        // Define layout of new frame as null
                        loseScreen.setLayout(null);
                        // Create new frame for outputting loss mesage along with value of random number:
                        JLabel loseMessage = new JLabel("You Lost! I was thinking of the number "+randomNum+"!");
                        // Define size and location of new frame:
                        loseMessage.setBounds(0,0,300,20);
                        // Set alignment of text within label to Center:
                        loseMessage.setHorizontalAlignment(javax.swing.SwingUtilities.CENTER);
                        // Add new label to the frame:
                        loseScreen.add(loseMessage);
                        // Create new label to report win/loss record to the player:
                        JLabel recordReport = new JLabel("You have won "+gamesWon+" games, and lost "
                        + gamesLost + " games.");
                        // Define size and location of label:
                        recordReport.setBounds(0,0,300,60);
                        // Set alignment of text within label to Center:
                        recordReport.setHorizontalAlignment(javax.swing.SwingUtilities.CENTER);
                        // Add new label to the frame:
                        loseScreen.add(recordReport);
                        // Create new label to query player if they want to play again:
                        JLabel restartQuery = new JLabel("Play again?");
                        // Set alignment of text within label to Center:
                        restartQuery.setHorizontalAlignment(javax.swing.SwingUtilities.CENTER);
                        // Define size and location of label:
                        restartQuery.setBounds(0,0,300,80);
                        // Add new label to the frame:
                        loseScreen.add(restartQuery);
                        // Create button that will confirm if player wants to play again:
                        JButton restartButton=new JButton("Yes");
                        // Set size and location of restart button:
                        restartButton.setBounds(10,50,80,20);
                        // Create actionListener for restart button and add it to the button:
                        restartButton.addActionListener(new java.awt.event.ActionListener() {
                            // Define behavior for when button is pressed:
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                //Generate a new random number between 1 and 100
                                randomNum=randomizer.nextInt(99)+1;
                                // Clear out any error messages from main window
                                errorMessage.setText("");
                                // Clear out old input from main window input box
                                inputField.setText("");
                                // Unhide main window
                                setVisible(true);
                                // Destroy results screen
                                loseScreen.dispose();
                            }
                        });
                        // Add restart button to the results frame:
                        loseScreen.add(restartButton);
                        // Create button to exit program if user no longer wishes to play:
                        JButton exitButton=new JButton("No");
                        // Set size and location of exit button:
                        exitButton.setBounds(180,50,80,20);
                        //If exit button is pressed, end program:
                        exitButton.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                System.exit(0);
                            }
                        });
                        // Add exit button to the results frame:
                        loseScreen.add(exitButton);
                        // Confirm visibility of results frame:
                        loseScreen.setVisible(true);
                        // Make it so that results frame can not be resized:
                        loseScreen.setResizable(false);
                        // Set it so that program closes if results screen is manually closed:
                        loseScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                }else{
                    // Return error message to user if an integer value less than 1 or greater than
                    // 100 was inserted in textbox.
                    errorMessage.setText("Error. Please insert a number between 1 and 100.");
                }
            }catch(NumberFormatException e){
                // Return error message to user if a non-integer value was inserted in textbox.
                errorMessage.setText("Error. Insert integer value in textbox.");
            }
        }else{
            // Return error message to user if submit button was pressed while textbox was empty.
            errorMessage.setText("Error. Please insert value into textbox.");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void inputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFieldActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
