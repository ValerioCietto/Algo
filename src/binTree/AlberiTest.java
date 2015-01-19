package binTree;

public class AlberiTest {

	public static void main(String[] args) {
		System.out.println("test binTree");
		BinTree t = new BinTree(0);
		for(int i = 1; i< 10;i++){
			BinTreeFunctions.addRandomNode(t, i);
		}
		
		t.preorder(t);
		System.out.println();
		t.postorder(t);
		System.out.println();
		t.inorder(t);
		System.out.println();
		System.out.println(BinTreeFunctions.numLevels(t));
		System.out.println(BinTreeFunctions.findMax(t));
		System.out.println(BinTreeFunctions.findMin(t));

	}

}
