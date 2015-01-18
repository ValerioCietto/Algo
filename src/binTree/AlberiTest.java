package binTree;

public class AlberiTest {

	public static void main(String[] args) {
		System.out.println("test binTree");
		BinTree t = new BinTree(0);
		for(int i = 0; i< 10;i++){
			BinTreeFunctions.addRandomNode(t, i);
		}
		BinTreeFunctions.inOrder(t);

	}

}
