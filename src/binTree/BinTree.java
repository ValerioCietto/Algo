package binTree;

public class BinTree {
	int dato;
	BinTree left, right;
	BinTree root;
	
	public BinTree(int dato, BinTree left, BinTree right){
		this.dato = dato;
		this.left = left;
		this.right = right;
	}
	public BinTree(int dato){
		this.dato = dato;
	}
	
	public BinTree getLeft(){
		return this.left;
	}
	
	public BinTree getRight(){
		return this.right;
	}
	
	public int getData(){
		return dato;
	}
	public boolean isLeaf(){
		return left == null && right == null;
	}
	public int sumNodes(BinTree t){
		if(t!=null){
			return this.dato+sumNodes(left)+sumNodes(right);
		}
		return 0;
	}
	
	public void inorder(BinTree t) {
		if (t != null) {
			inorder(t.getLeft());
			System.out.print(t.getData() + " ");
			inorder(t.getRight());
		}
	}

	public void preorder(BinTree t) {
		if (t != null) {
			System.out.print(t.getData() + " ");
			preorder(t.getLeft());
			preorder(t.getRight());
		}
	}

	public void postorder(BinTree t) {
		if (t != null) {
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() + " ");
		}
	}

	public void showInorder() {
		System.out.print("Inorder: ");
		inorder(root);
		System.out.println();
	}

	public void showPreorder() {
		System.out.print("Preorder: ");
		preorder(root);
		System.out.println();
	}

	public void showPostorder() {
		System.out.print("Postorder: ");
		postorder(root);
		System.out.println();
	}
}
