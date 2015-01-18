package binTree;

import java.util.Random;

public class BinTreeFunctions {
	/*(t.isLeaf()?"":",")
	*operatore ternario
	*"" se foglia
	*"," altrimenti
	*/
	public static String preOrder(BinTree t){
		if(t!=null){
			String out = ""+t.dato+(t.isLeaf()?"":",");
			preOrder(t.left);
			preOrder(t.right);
		}
		return "";
	}
	public static String inOrder(BinTree t){
		if(t!=null){
			inOrder(t.left);
			String out = ""+t.dato+(t.isLeaf()?"":",");
			inOrder(t.right);
		}
		return "";
	}
	public static String postOrder(BinTree t){
		if(t!=null){
			postOrder(t.left);
			postOrder(t.right);
			String out = ""+t.dato+(t.isLeaf()?"":",");
		}
		return "";
	}
	public static int findMin(BinTree t){
		if(t!=null){
			int leftMin = findMin(t.left);
			int rightMin = findMin(t.right);
			return (leftMin>rightMin)?rightMin:leftMin;
		}
		return Integer.MAX_VALUE;
	}
	public static int findMax(BinTree t){
		if(t!=null){
			int leftMax = findMin(t.left);
			int rightMax = findMin(t.right);
			return (leftMax<rightMax)?rightMax:leftMax;
		}
		return Integer.MIN_VALUE;
	}
	public static void swapChilds(BinTree t){
		if(t!= null){
			BinTree tmp = t.right;
			t.right = t.left;
			t.left = tmp;
			swapChilds(t.left);
			swapChilds(t.right);
		}
	}
	public static void incNodes(BinTree t, int n){
		if(t!= null){
			t.dato += n;
			incNodes(t.left, n);
			incNodes(t.right, n);
		}
	}
	public static boolean addRandomNode(BinTree t, int n){
		if(t!=null){
			Random r = new Random(4);
			int decision = r.nextInt();
			switch (decision){
			    case 0:
			    	return addRandomNode(t.left, n);
			    	
			    case 1:
			    	return addRandomNode(t.right, n);
			    	
			    case 2:
			    	t.left = new BinTree(n);
			    	return true;
			    	
			    case 3:
			    	t.right = new BinTree(n);
			    	return true;
			    	
			}
				
		}
		return false;
	}
}
