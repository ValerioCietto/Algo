import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RicercaBinariaTest {
	
	@Test
	public void testFind() {
		int[] a = {0,1,5};
		assert(RicercaBinaria.find(1, a)== 1);
	}

	@Test
	public void testIsPresent() {
		int[] a = {0,1,5};
		assert(RicercaBinaria.isPresent(1, a));
	}

	@Test
	public void testFindRecursivelyIntIntArray() {
		int[] a = {0,1,5};
		assert(RicercaBinaria.findRecursively(1, a)== 1);
	}
}
