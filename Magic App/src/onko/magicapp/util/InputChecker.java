package onko.magicapp.util;

import onko.magicapp.exceptions.PTIncorrectException;

public class InputChecker {

	public static boolean isFieldEmpty(String s) {
		if (s.isEmpty()) {
			return true;
		}

		else
			return false;

	}

	public static boolean isInputCorrect(String powerOrToughness)
			throws PTIncorrectException {

		if (isFieldEmpty(powerOrToughness)) {
			
			throw new PTIncorrectException();

		} 
		return false;

	}

}
