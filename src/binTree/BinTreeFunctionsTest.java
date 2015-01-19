package binTree;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinTreeFunctionsTest {

	@Test
	public void testPreOrder() {
		BinTree t = new BinTree(0);
		t.left = new BinTree(1);
		t.right = new BinTree(2);
		assert(true);
	}

	@Test
	public void testInOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testPostOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindMin() {
		BinTree t = new BinTree(0);
		t.left = new BinTree(1);
		t.right = new BinTree(2);
		t.left.left = new BinTree(3);
		t.left.right = new BinTree(4);
		t.right.left = new BinTree(5);
		assert(BinTreeFunctions.findMin(t)==0);
	}

	@Test
	public void testFindMax() {
		BinTree t = new BinTree(0);
		t.left = new BinTree(1);
		t.right = new BinTree(2);
		t.left.left = new BinTree(3);
		t.left.right = new BinTree(4);
		t.right.left = new BinTree(5);
		assert(BinTreeFunctions.findMax(t)==5);
	}

	@Test
	public void testSwapChilds() {
		BinTree t = new BinTree(0);
		t.left = new BinTree(1);
		t.right = new BinTree(2);
		t.left.left = new BinTree(3);
		t.left.right = new BinTree(4);
		t.right.left = new BinTree(5);
		BinTreeFunctions.swapChilds(t);
		assert(t.left.right.dato == 5);

	}

	@Test
	public void testIncNodes() {
		BinTree t = new BinTree(0);
		t.left = new BinTree(1);
		t.right = new BinTree(2);
		t.left.left = new BinTree(3);
		t.left.right = new BinTree(4);
		t.right.left = new BinTree(5);
		BinTreeFunctions.incNodes(t, 3);
		assert(t.left.left.dato == 6);
	}

	@Test
	public void testAddRandomNode() {
		BinTree t = new BinTree(0);
		for(int i = 0; i< 99;i++){
			BinTreeFunctions.addRandomNode(t, i);
		}
		assert(BinTreeFunctions.numNodi(t, 100)==100);
	}
	
	@Test
	public void testNumNodi(){
		BinTree t = new BinTree(0);
		t.left = new BinTree(1);
		t.right = new BinTree(2);
		t.left.left = new BinTree(3);
		t.left.right = new BinTree(4);
		t.right.left = new BinTree(5);
		//t.right.right = new BinTree(6);
		int numNodi = BinTreeFunctions.numNodi(t, 2);
		assert(numNodi == 3);
	}

}
