package onko.magicapp.tests;

import onko.magicapp.io.DirectoryMaker;

import org.junit.Test;

public class DirectoryMakerTest {

	@Test
    public void testDirectoryMaking(){
		
		DirectoryMaker dm = new DirectoryMaker();
		
		assert(dm.makeDirectories("TEST"));
		
		assert(dm.eraseDirectories("TEST"));
		
		
		
	}

}
