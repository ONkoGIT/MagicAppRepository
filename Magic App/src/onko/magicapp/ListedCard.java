package onko.magicapp;

import javax.swing.JButton;

public class ListedCard extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1738051894837620806L;
	private String cardName;

	public ListedCard(String cardName) {
		this.cardName = cardName;
		
		this.setSize(250, 50);
		this.setText(this.cardName);
		this.setVisible(true);
		
	}

}
