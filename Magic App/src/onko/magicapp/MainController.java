package onko.magicapp;

import onko.magicapp.ui.CardDesignerPanel;

//singleton
public class MainController {

	private static MainController mainController = null;

	private MainController() {

	}

	public static MainController getInstance() {
		if (mainController==null) {
			mainController = new MainController();

		}

		return mainController;
	}

	private CardDesignerPanel cardDesignerPanel;

}
