package onko.magicapp;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import onko.magicapp.ui.CardDesignerPanel;
import onko.magicapp.ui.EditionCardlistPanel;

public class MainFrame extends JFrame {
	
	private JPanel cardDesignerPanel ;

	/**
	 * 
	 */
	private static final long serialVersionUID = -6730225964767015203L;
	JPanel p;

	MainFrame() {
		this.setTitle("Magic toolkit");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(screenSize);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		
		cardDesignerPanel = new CardDesignerPanel();
		
		this.add(cardDesignerPanel);
		cardDesignerPanel.setVisible(true);
		this.setVisible(true);

		EditionCardlistPanel ecl = new EditionCardlistPanel();
		
		
//		p.setLayout(new BorderLayout());
//
//		CentralPanel centralPanel = new CentralPanel();
//
//		p.add(centralPanel, BorderLayout.CENTER);
//		centralPanel.setVisible(true);
//
//		WestPanel westPanel = new WestPanel();
//		p.add(westPanel, BorderLayout.WEST);
//		westPanel.setVisible(true);
//		
//		EastPanel eastPanel = new EastPanel();
//		p.add(eastPanel, BorderLayout.EAST);
//		eastPanel.setVisible(true);
//
//		this.add(p);
//		p.add(new UpperToolbar());
//		this.setVisible(true);
//	

	}

	public static void main(String[] args) {

		new MainFrame();
		CardDesigner cd = new CardDesigner();
		//cd.saveCard();
	

		
	
		
	}
}
