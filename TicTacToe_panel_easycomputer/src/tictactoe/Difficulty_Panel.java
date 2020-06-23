/*
 * By:     Matthew Fischer
 * Date:   
 */
package tictactoe;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Matthew Fischer
 */
public class Difficulty_Panel extends JPanel{
    

    private JButton okBtn;
    private JList difList;
    private JLabel label;
    private int wins = 0;
    private int loses = 0;
    private int ties = 0;
    private Computer computer;
    private DifficultyListener difficultyListener;
    
    public Difficulty_Panel(){
        label = new JLabel( "Medium Computer");
        // Panel size
        Dimension dim = getPreferredSize();
        dim.width = 200;
        setPreferredSize(dim);
        
        difList = new JList();
        difList.setPreferredSize(new Dimension(100,60));
        difList.setBorder(BorderFactory.createEtchedBorder());
        
        // Set up list box
        DefaultListModel difficultySetting = new DefaultListModel();
        difficultySetting.addElement("Easy");
        difficultySetting.addElement("Medium");
        difficultySetting.addElement("Hard");
        difList.setModel(difficultySetting);
        difList.setSelectedIndex(1);
        
        okBtn = new JButton("OK");
        okBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {    
                String str = (String)difList.getSelectedValue();

                DifficultyEvent ev = new DifficultyEvent(this,str);
                if( difficultyListener != null){
                    difficultyListener.difficultyEventOccurred(ev);
                }
                
                label.setText( str + " Computer");
            }
            
        });


        Border innerBorder = BorderFactory.createTitledBorder("Computer\nDifficulty");
        Border outterBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outterBorder,innerBorder)); 
        
        // Layout of Grid
        layoutComponents();
    }

    public void setDifficultyEventListener(DifficultyListener listener){
        this.difficultyListener = listener;
    }
    
    private void layoutComponents() {
// GridLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        
        
        
        
        /////////// FIRST ROW ////////////
        gc.weightx = 1;
        gc.weighty = .1;
        
        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(difList,gc);
        
        
        /////////// SECOND ROW //////////
        
        gc.weightx = 1;
        gc.weighty = 2.0;
        
        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(okBtn,gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(label,gc);
    }
}



