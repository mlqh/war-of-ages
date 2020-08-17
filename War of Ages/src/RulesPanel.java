/**
 * RulesPanel.java
 * Panel for rules screens
 * Matthew Hao
 * Jan 20, 2020
 */

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RulesPanel extends JPanel implements GameConstants {
    
    private JLabel firstLabel, secondLabel;
    private JButton nextButton, OKButton;
    private ImageIcon firstBackground, secondBackground;
    
    public RulesPanel() {
        setLayout(null);
        firstBackground = new ImageIcon(BACKGROUND_PATH + "RulesFirst.jpg");
        this.firstLabel = new JLabel(firstBackground);
        
        this.nextButton = new JButton("Next");
        nextButton.setActionCommand("next");
        nextButton.addActionListener(new ButtonListener(this));
        
        add(nextButton);
        add(firstLabel);
        firstLabel.setBounds(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
        nextButton.setBounds(505, 555, 180, 55);
    }
    
    // second page of rules
    public void nextSlide() {
        this.remove(firstLabel);
        this.remove(nextButton);
        
        secondBackground = new ImageIcon(BACKGROUND_PATH + "RulesSecond.jpg");
        secondLabel = new JLabel(secondBackground);
        
        OKButton = new JButton("OK");
        OKButton.setActionCommand("OK - rules");
        OKButton.addActionListener(new ButtonListener(this));
        
        this.add(OKButton);
        this.add(secondLabel);
        OKButton.setBounds(505, 555, 180, 55);
        secondLabel.setBounds(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
    }
    
    public void reset() {
        this.remove(secondLabel);
        this.remove(OKButton);
        
        this.add(nextButton);
        this.add(firstLabel);
        firstLabel.setBounds(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
        nextButton.setBounds(505, 555, 180, 55);
    }
}
