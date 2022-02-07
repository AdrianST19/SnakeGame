/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snakegame;
import javax.swing.*;
/**
 *
 * @author Adrian Stefan
 */
public class GameFrame extends JFrame{

    public GameFrame(){

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // take our J frame and fit it around all of the component that we add
        this.setVisible(true);
        this.setLocationRelativeTo(null); // appear in the middle of the computer screen
    }
}
