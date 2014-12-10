import static org.junit.Assert.*;

import org.junit.Test;


public class ProvaOperatoriInLineaTest {
	int testn = 100000000;
	@Test
	public void testProvaNonTernario() {
		for(int i = 0; i<testn;i++){
			ProvaOperatoriInLinea.provaNonTernario();
		}
		assert(true);
	}

	@Test
	public void testProvaTernario() {
		for(int i = 0; i<testn;i++){
			ProvaOperatoriInLinea.provaTernario();
		}
		assert(true);
	}

}
