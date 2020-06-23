/*
 * By:     Matthew Fischer
 * Date:   
 */
package tictactoe;

/**
 *
 * @author Matthew Fischer
 */
public class HardComputer extends Computer{
    private int[][] preferredMoves = {
         {1, 1}, {0, 0}, {0, 2}, {2, 0}, {2, 2},
         {0, 1}, {1, 0}, {1, 2}, {2, 1}};
    
    public HardComputer() {
        this.level = "Hard";
    }

    @Override
    public int[] turn(char[][] g) {
        int[] turn = new int[2];
        
        // Check winning move
        
        // Check block
        
        
        // Check prefferred move
        
        
        // Check win

        
        
        
//        // column 1 = s | column 2 = s | column 3 = t
//        for(int f = 0; f < g.length; f++){
//            for(int s = 0; s < g.length; s++){
//                for(int t = 0; t < g.length; t++){
//                    if(g[f][s] ==  g[s][f] && f != s){
//                        
//                    }
//                }
//            }
//        }
         
            
            
            
        return turn;

    }
    
}
