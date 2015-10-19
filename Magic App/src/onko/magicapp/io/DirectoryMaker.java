package onko.magicapp.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryMaker {

	/*
	 * Checks if the root directory with short edition name exists, if not ,
	 * creates it and populates it
	 */
	public boolean makeDirectories(String editionShort) {

		File rootEditionDirectory = new File(editionShort);
		if (!rootEditionDirectory.exists()) {
			rootEditionDirectory.mkdir();
		}

		List<File> directories = new ArrayList<File>();

		File commonsDirectory = new File(editionShort + "//Commons");
		directories.add(commonsDirectory);

		File uncommonsDirectory = new File(editionShort + "//Uncommons");
		directories.add(uncommonsDirectory);

		File raresDirectory = new File(editionShort + "//Rares");
		directories.add(raresDirectory);

		File mythicsDirectory = new File(editionShort + "//Mythics");
		directories.add(mythicsDirectory);

		File othersDirectory = new File(editionShort + "//Others");
		directories.add(othersDirectory);

		for (File f : directories) {

			if (!f.exists()) {
				f.mkdir();
			}
		}

		return true;
	}

	public boolean eraseDirectories(String editionShort) {

		List<File> directories = new ArrayList<File>();

		File commonsDirectory = new File(editionShort + "//Commons");
		directories.add(commonsDirectory);

		File uncommonsDirectory = new File(editionShort + "//Uncommons");
		directories.add(uncommonsDirectory);

		File raresDirectory = new File(editionShort + "//Rares");
		directories.add(raresDirectory);

		File mythicsDirectory = new File(editionShort + "//Mythics");
		directories.add(mythicsDirectory);

		File othersDirectory = new File(editionShort + "//Others");
		directories.add(othersDirectory);

		for (File f : directories) {

			if (f.exists()) {
				f.delete();
			}
		}

		File rootEditionDirectory = new File(editionShort);
		if (rootEditionDirectory.exists()) {
			return (rootEditionDirectory.delete());
		} else
			return false;
	}

}
