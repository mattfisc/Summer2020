/*
 * By:     Matthew Fischer
 * Date:   
 */
package tictactoe;

import java.util.EventListener;

/**
 *
 * @author Matthew Fischer
 */
public interface DifficultyListener extends EventListener{
    public void difficultyEventOccurred(DifficultyEvent e);

}
