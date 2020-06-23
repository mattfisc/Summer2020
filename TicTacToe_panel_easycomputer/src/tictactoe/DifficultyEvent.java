/*
 * By:     Matthew Fischer
 * Date:   
 */
package tictactoe;

import java.util.EventObject;

/**
 *
 * @author Matthew Fischer
 */
public class DifficultyEvent extends EventObject{
    private String level;
    
    
    public DifficultyEvent(Object source,String dif){
        super(source);
        this.level = dif;
        
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    
    
}
