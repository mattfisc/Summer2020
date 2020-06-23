/*
 * By:     Matthew Fischer
 * Date:   
 */
package tictactoe;

/**
 *
 * @author Matthew Fischer
 */
abstract class Computer {

    protected String level;

    public Computer(){
  
    }
    
    abstract public int[] turn(char[][] g);

    public String getLevel() {
        return level;
    }

    public void print(){
        System.out.println(level);
    }
}
