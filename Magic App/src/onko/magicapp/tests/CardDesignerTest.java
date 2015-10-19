package onko.magicapp.tests;

import java.io.File;

import onko.magicapp.CardDesigner;

import org.junit.Before;
import org.junit.Test;

public class CardDesignerTest {
	
	File directory;
	
	@Before
	public void makeFoldersTest(){
		CardDesigner cd = new CardDesigner();
		cd.setEdition("RAV");
		
		
		
		directory = new File("Directory");
	}

	
	
	@Test
	public void testFolderCreation() {
		
		
		if(!directory.exists()){
			directory.mkdir();
		}
		
		assert(directory.exists());
		
	}


}
