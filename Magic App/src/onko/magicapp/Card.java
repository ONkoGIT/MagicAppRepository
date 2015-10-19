package onko.magicapp;

import java.io.Serializable;


public class Card implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1484815L;

	private int number;

	private String name;

	private String[] cost = {"0"};

	private String[] colors;

	private String types;

	private String subtypes;

	private char rarity;

	private int power;

	private int toughness;

	private String[] text;

	private String[] flavorText;
	
	Card(){
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getCost() {
		return cost;
	}

	public void setCost(String[] cost) {
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

	public char getRarity() {
		return rarity;
	}

	public void setRarity(char rarity) {
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

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}

	public String[] getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(String[] flavorText) {
		this.flavorText = flavorText;
	}

	/*  
	 * 
	 * 
	 */
	public int getConvertedManacost() {
		int convertedManacost = 0;

		if (Integer.parseInt(cost[0]) != 0) {

			convertedManacost = cost.length;

		}
		return convertedManacost;
	}
	
	

}
