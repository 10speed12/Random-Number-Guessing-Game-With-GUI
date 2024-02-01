/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessingamewgui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author 10spe
 */
public class GuessinGameWGUI {
    public int gamesWon=0;
    public int gamesLost=0;
    public static void main(String[] args) {
        JFrame mainF = new mainFrame();
        mainF.setVisible(true);
        mainF.setResizable(false);
        mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
