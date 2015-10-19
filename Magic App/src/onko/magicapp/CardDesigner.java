package onko.magicapp;

import javax.swing.JPanel;

import onko.magicapp.io.CardIO;
import onko.magicapp.io.DirectoryMaker;

public class CardDesigner extends JPanel {
	
	private CardIO cardIO;
	private DirectoryMaker directoryMaker;
	
	public CardDesigner(){
		this.editionFull = "New edition";
		this.editionShort = "NEW";
		this.cardName = "test";
				
		cardIO = new CardIO();
		directoryMaker = new DirectoryMaker();
		
	}
	
	private String editionFull;
	private String editionShort;
	
	private int number;

	private String cardName;

	// W U R B G C(olorless) + other special cost symbols reserved
	
	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	private int[] cost = new int[25];

	private String[] colors;

	private String types;

	private String subtypes;

	private String rarity;

	private int power;

	private int toughness;

	private String cardText;

	private String[] flavorText;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return cardName;
	}

	public void setName(String name) {
		this.cardName = name;
	}

	public int[] getCost() {
		return cost;
	}

	public void setCost(int[] cost) {
		this.cost = cost;
	}

	public String[] getColors() {
		return colors;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getSubtypes() {
		return subtypes;
	}

	public void setSubtypes(String subtypes) {
		this.subtypes = subtypes;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getToughness() {
		return toughness;
	}

	public void setToughness(int toughness) {
		this.toughness = toughness;
	}

	public String getCardText() {
		return cardText;
	}

	public void setCardText(String text) {
		this.cardText = text;
	}

	public String[] getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(String[] flavorText) {
		this.flavorText = flavorText;
	}
	
	public String getEdition() {
		return editionFull;
	}

	public void setEdition(String edition) {
		this.editionFull = edition;
	}
	
	public void saveCard(){
				
		directoryMaker.makeDirectories(editionShort);
						
		Card card = new Card();
		card.setName(this.getCardName());
		
		String filePath = editionShort + "\\" + this.getRarity() + "s" + "\\" + card.getName() + ".ser";
		cardIO.saveCard(filePath, card);
			
	}
	


}
