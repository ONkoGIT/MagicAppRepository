package onko.magicapp.ui;

import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JFrame;
import javax.swing.JPanel;

import onko.magicapp.ListedCard;
import onko.magicapp.io.CardIO;

public class EditionCardlistPanel extends JPanel {

	private String editionName;
	private CardIO cardIO = new CardIO();
	private File editionDirectory;
	private File[] commonsInEdition;
	private ArrayList<Component> swingComponents;
	private Set<ListedCard> listedCards;

	public EditionCardlistPanel() {
		this.editionName = "NEU";
		this.listedCards = new TreeSet<ListedCard>();
		this.editionDirectory = new File(this.editionName + "\\Commons");

		this.setLayout(null);

		loadCards();
		swingComponents = new ArrayList<Component>();

		for (int i = 0; i < commonsInEdition.length; i++) {
			String cardName = commonsInEdition[i].getName();
			cardName = cardName.substring(0, cardName.length()-4);
			ListedCard lc = new ListedCard(cardName);
			lc.setBounds(0, i*50, 250, 50);
			swingComponents.add(lc);
			System.out.println("Loaded button" + commonsInEdition[i].getName());
		}

		this.setSize(500, 500);
		this.setVisible(true);

		for (int i = 0; i < swingComponents.size(); i++) {
			this.add(swingComponents.get(i));
		}

		JFrame f = new JFrame("Edition cardlist");
		f.setSize(500, 500);
		f.add(this);
		f.setVisible(true);

	}

	public void loadCards() {
		commonsInEdition = editionDirectory.listFiles();
	}

}
