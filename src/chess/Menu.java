package chess;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import chess.panels.GamePanelAI;
import chess.panels.GamePanelNormal;

public class Menu extends JFrame {

	JPanel menuPanel ;
	JButton pair;
	JButton alone;
	JLabel name;
	public Menu() {
		super("Ajedrez");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font f =new Font(Font.SANS_SERIF, Font.ROMAN_BASELINE, 18);
		menuPanel = new JPanel();
		menuPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.weightx = 1;
        c.weighty = .25;
        c.insets = new Insets(15, 40, 15, 40);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
		this.add(menuPanel);
		
		name = new JLabel("Choose Mode:");
		pair = new JButton("Pair");
		alone = new JButton("Alone");
		
		name.setFont(f);
		pair.setFont(f);
		alone.setFont(f);
		
		menuPanel.setBackground(Color.decode("#efdee7"));
		pair.setBackground(Color.decode("#cfffe5"));
		pair.setOpaque(true);
		alone.setBackground(Color.decode("#cfffe5"));
		alone.setOpaque(true);
		
		pair.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        new GameFrame(new GamePanelNormal());
		        setVisible(false);
		        dispose();
		    }
	  });
			
		alone.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        new GameFrame(new GamePanelAI());
		        setVisible(false);
		        dispose();
		    }
	  });
		
		menuPanel.add(name ,c);
		menuPanel.add(pair ,c);
		menuPanel.add(alone, c);
		
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);


	}
}
