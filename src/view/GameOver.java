package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.controller;

public class GameOver implements ActionListener  {
	
	JPanel panel;
	
	public GameOver(String s){
		Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
		panel = new JPanel();
		panel.setBounds(5*screenSize.width/24,5*screenSize.height/18,25*screenSize.width/46,25*screenSize.height/54);
		//panel.setLayout(null);
		
		JLabel background = new JLabel();
		background.setIcon(controller.getScaledImage(new ImageIcon("Images/message.jpg"), panel.getWidth(), panel.getHeight()));
		
		JTextArea bla = new JTextArea();
		bla.setOpaque(false);
		bla.setText("Well Played,\nThe Winner is " + s);
		bla.setFont(new Font("Arial Black", Font.PLAIN, screenSize.width/35));
		bla.setBounds(panel.getWidth()/10, panel.getHeight()/4, panel.getWidth(), 3*screenSize.height/16);
		bla.setEditable(false);
		
		JButton ok = new JButton("OK");
		ok.setBounds(37*screenSize.width/192, 35*screenSize.height/108, 5*screenSize.width/48, 5*screenSize.height/108);
		ok.setIcon(controller.getScaledImage(new ImageIcon("Images/Button original.png"), ok.getWidth(), ok.getHeight()));
		ok.setFont(new Font("Arial Black", Font.BOLD, screenSize.width/64));
		ok.setHorizontalTextPosition(JButton.CENTER);
		ok.addActionListener(this);
		background.setLayout(null);
		background.add(bla);
		background.add(ok);
		panel.add(background);
	//	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	//	JButton b = (JButton)e.getSource();
			//this.setVisible(false);
			System.exit(0);
			
		
	}

	public JPanel getPanel() {
		return panel;
	}
	
	public static void main(String[]args){
		new GameOver("Lmao");
	}
	
	

}
