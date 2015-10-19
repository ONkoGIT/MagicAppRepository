package onko.magicapp.ui;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import onko.magicapp.CardDesigner;
import onko.magicapp.exceptions.PTIncorrectException;
import onko.magicapp.util.InputChecker;

public class CardDesignerPanel extends CardDesigner {

	private static final int COMPONENT_DISTANCE_1 = 50;
	private static final int COMPONENT_HEIGHT_1 = 50;

	private ArrayList<Component> swingComponents;
	private JTextField cardNameInputTf;
	private JTextField cardTextTf;
	private JTextField cardPowerTf;
	private JTextField cardToughnessTf;
	private JComboBox rarityCb;
	private JButton saveCardBtn;

	private String[] rarities = { "Common", "Uncommon", "Rare", "Mythic",
			"Other" };

	public CardDesignerPanel() {
		this.setLayout(null);

		swingComponents = new ArrayList<Component>();

		cardNameInputTf = new JTextField("Card name");
		cardNameInputTf.setBounds(COMPONENT_DISTANCE_1, COMPONENT_DISTANCE_1,
				300, COMPONENT_HEIGHT_1);
		swingComponents.add(cardNameInputTf);

		saveCardBtn = new JButton("Save card");
		saveCardBtn.setBounds(COMPONENT_DISTANCE_1, 700, 300,
				COMPONENT_HEIGHT_1);
		saveCardBtn.addActionListener(new ActionListener() {
			
			

			public void actionPerformed(ActionEvent e) {
				
				
				try {
				
					setCardName(cardNameInputTf.getText());
					setRarity(rarityCb.getSelectedItem().toString());
					setCardText(cardTextTf.getText());
					
					InputChecker.isInputCorrect(cardPowerTf.getText());
					setPower(Integer.parseInt(cardPowerTf.getText()));
					setToughness(Integer.parseInt(cardToughnessTf.getText()));
					saveCard();
					
				} catch (PTIncorrectException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(new JFrame(),"Power and toughness can be only numbers or *","Warning",
						    JOptionPane.WARNING_MESSAGE);
					
				}
			}

		});
		swingComponents.add(saveCardBtn);

		cardTextTf = new JTextField("Rules text");
		cardTextTf.setBounds(COMPONENT_DISTANCE_1,300, 500, 300);
		swingComponents.add(cardTextTf);
		
		cardPowerTf = new JTextField("Power");
		cardPowerTf.setBounds(420,600, 40, COMPONENT_HEIGHT_1);
		swingComponents.add(cardPowerTf);
		
		cardToughnessTf = new JTextField("Toughness");
		cardToughnessTf.setBounds(500,600, 40, COMPONENT_HEIGHT_1);
		swingComponents.add(cardToughnessTf);
		
		
		
		
		rarityCb = new JComboBox(rarities);
		rarityCb.setBounds(500, 200, 100, COMPONENT_HEIGHT_1);
		swingComponents.add(rarityCb);
		
		
		

		for (Component o : swingComponents) {
			Font font = new Font("TimesRoman", Font.PLAIN, 15);
			this.add(o);
			o.setFont(font);
			o.setVisible(true);
		}

		this.setVisible(true);

	}
}
