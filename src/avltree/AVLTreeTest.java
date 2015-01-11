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
		AVLTree tree = new AVLTree();
		Elem a = new Elem("a", 5);
		Elem b = new Elem("b", 12);
		Elem c = new Elem("c", 6);
		Elem d = new Elem("d", 1);
		Elem e = new Elem("e", 4);
		Elem f = new Elem("f", 15);
		Elem g = new Elem("g", 8);
		Elem h = new Elem("h", 9);
		tree.put(a);
		tree.put(b);
		tree.put(c);
		tree.put(d);
		tree.put(e);
		tree.put(f);
		tree.put(g);
		tree.put(h);
		assert(tree.get(6).key()==6);
	}

	/**
	 * Test method for {@link avltree.AVLTree#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		AVLTree tree = new AVLTree();
		assert(tree.isEmpty());
	}

	/**
	 * Test method for {@link avltree.AVLTree#AVLTree()}.
	 */
	@Test
	public void testAVLTree() {
		AVLTree tree = new AVLTree();
		assert(tree!=null);
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
		AVLTree avl = new AVLTree();
		avl.put(new Elem("1", 0));
		assert(avl.root.height==0);
	}

	/**
	 * Test method for {@link avltree.AVLTree#remove(int)}.
	 */
	@Test
	public void testRemove() {
		AVLTree avl = new AVLTree();
		avl.put(new Elem("1", 0));
		avl.remove(0);
		assert(avl.isEmpty());
	}

}
