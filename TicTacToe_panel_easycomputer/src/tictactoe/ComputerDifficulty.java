/*
 * By:     Matthew Fischer
 * Date:   
 */
package tictactoe;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Matthew Fischer
 */
public class ComputerDifficulty{
    private int id;
    private String level;
  
    
    public ComputerDifficulty(int id,String level){
        this.level = level;
        this.id = id;
        
    }
    public String toString(){
        return level;
    }

    public String getLevel() {
        return level;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}