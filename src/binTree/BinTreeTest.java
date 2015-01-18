package binTree;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinTreeTest {

	@Test
	public void testGetLeft() {
		BinTree t = new BinTree(1);
		t.left = new BinTree(2);
		assert(t.getLeft().dato==2);
	}

	@Test
	public void testGetRight() {
		BinTree t = new BinTree(1);
		t.right = new BinTree(2);
		assert(t.getRight().dato==2);
	}

	@Test
	public void testGetData() {
		BinTree t = new BinTree(1);
		assert(t.dato==1);
	}

	@Test
	public void testIsLeaf() {
		BinTree t = new BinTree(1);
		assert(t.isLeaf());
	}

	@Test
	public void testSumNodes() {
		BinTree t = new BinTree(1);
		t.left = new BinTree(2);
		t.right = new BinTree(3);
		t.left.left = new BinTree(6);
		assert(t.sumNodes(t)==12);
	}

}
