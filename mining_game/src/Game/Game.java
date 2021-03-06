/*
 * By:     Matthew Fischer
 * Date:   
 */
package Game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author Matthew Fischer
 */
public class Game extends JFrame{
    
    // CONTAINER
    Container content = this.getContentPane();
    
    // PANEL
    JPanel p = new JPanel();
    
    // create Jlabel for game status
    JLabel status = new JLabel("Welcome to Mining", JLabel.CENTER);
    
    // BOARD ARRAY
    JButton[][] board = new JButton[20][20];
    
    // MAP ARRAY
    Mining m = new Mining();
    final int max = 50;
    // ROBOT
    //Robot r2 = new Robot();
    
    public Game(){
        this.createWindow();

        
        // ADD STATUS
        content.add(status,BorderLayout.NORTH);
        
        // STATUS 
        status.setOpaque(true);// make status visible
        status.setFont(new Font("Helvetica", Font.BOLD, 32));// set font
        status.setBackground(Color.BLUE);// set background color yellow
        
        // PANEL DETAILS
        p.setLayout(new GridLayout(20,20));// grid layout
        p.setBackground(Color.black);// set background color black
        
        // ADD PANEL
        content.add(p, BorderLayout.CENTER);
        
        // ADD JLABEL TO PANEL
        for(int row = 0; row < 20; row++){
            for(int col = 0; col < 20; col++){
                board[row][col] = new JButton();
                board[row][col].setOpaque(true);// set text visible

                if(m.map[row][col].getRock() == true){
                    board[row][col].setBackground(Color.black);//set background color
                }
                else if(m.food.getY() == row && m.food.getX() == col){
                    board[row][col].setBackground(Color.red);//set background color
                }else{
                    // FOOD
                    board[row][col].setBackground(Color.red);//set background color
                }
                // set label font
                board[row][col].setFont(new Font("Helvetica", Font.BOLD, 12));
                
                p.add(board[row][col]);
                
            }
        }
        requestFocusInWindow();
        pack();
    }
    
    public static void main(String[] args) {
        Game g = new Game();
        
        Robot r2 = new Robot();

    }
    
    // CREATE WINDOW JFRAME
    public void createWindow()
    {
        // create program window
        this.setVisible(true);// set window visible
        this.setPreferredSize(new Dimension(400,400));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set window will close on exiting button
        this.setTitle("Mining");// set window title
    }
    
    // FIND CLOSEST
    public void mine_closest(){
        
        //Cell close = m.closest_cell;
        
        // SET CLOSEST CELL
        m.setClosest_cell();
        
        // MINE CELL
        //m.map[close.x][close.y].setRock(false);
        m.closest_cell.setRock(false);
        
        // PAINT CELL
        board[m.closest_cell.getX()][m.closest_cell.getY()].setBackground(Color.red);
        
        
        
    }
    
    
}
