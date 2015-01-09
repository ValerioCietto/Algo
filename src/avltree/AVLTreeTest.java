/**
 * 
 */
package avltree;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author valerio
 *
 */
public class AVLTreeTest {

	/**
	 * Test method for {@link avltree.AVLTree#get(int)}.
	 */
	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link avltree.AVLTree#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link avltree.AVLTree#AVLTree()}.
	 */
	@Test
	public void testAVLTree() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link avltree.AVLTree#printInOrder()}.
	 */
	@Test
	public void testPrintInOrder() {
		assert(true);
	}

	/**
	 * Test method for {@link avltree.AVLTree#is1Balanced()}.
	 */
	@Test
	public void testIs1Balanced() {
		AVLTree avl = new AVLTree();
		avl.put(new Elem("1", 0));
		avl.put(new Elem("2", 1));
		avl.put(new Elem("1", 0));
		avl.put(new Elem("2", 1));
		avl.put(new Elem("1", 0));
		avl.put(new Elem("2", 1));
		avl.put(new Elem("1", 0));
		avl.put(new Elem("2", 1));
		assert(avl.is1Balanced());
	}

	/**
	 * Test method for {@link avltree.AVLTree#put(avltree.Elem)}.
	 */
	@Test
	public void testPut() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link avltree.AVLTree#remove(int)}.
	 */
	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

}
