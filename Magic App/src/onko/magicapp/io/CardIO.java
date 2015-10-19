package onko.magicapp.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import onko.magicapp.Card;

public class CardIO {

	public void saveCard(String filePath, Card card) {
		
		File file = new File(filePath);

		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("File " + file.getName()
						+ " was created.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(card);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}

	public Card readCard(File filePath) {

		Card card = null;

		try {
			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);

			card = (Card) ois.readObject();

			System.out
					.println("Card " + card.getName() + " converted mana cost "
							+ card.getConvertedManacost());
			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return card;

	}

}
