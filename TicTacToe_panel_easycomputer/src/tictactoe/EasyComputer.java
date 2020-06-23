/*
 * By:     Matthew Fischer
 * Date:   
 */
package tictactoe;

import java.util.Random;

/**
 *
 * @author Matthew Fischer
 */
public class EasyComputer extends Computer{
    
    public EasyComputer() {
        this.level = "Easy";
    }

    @Override
    public int[] turn(char[][] game) {
        int[] t = new int[2];
        
        Random rnd = new Random();
        t[0] = rnd.nextInt(3);
        t[1] = rnd.nextInt(3);
        
        // PICK AVAILABLE MOVE
        while(game[t[0]][t[1]] != ' '){
            t[0] = rnd.nextInt(3);
            t[1] = rnd.nextInt(3);
        }
        return t;
    }
    
}
