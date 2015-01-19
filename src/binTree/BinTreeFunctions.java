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
			return ((leftMin>rightMin)?rightMin:leftMin);
		}
		return Integer.MAX_VALUE;
	}
	public static int findMax(BinTree t){
		if(t!=null){
			int leftMax = findMin(t.left);
			int rightMax = findMin(t.right);
			return ((leftMax<rightMax)?rightMax:leftMax);
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
	public static int numLevels(BinTree t){
		if(t!=null){
			return Math.max(numLevels(t.left), numLevels(t.right))+1;
		}
		return 0;
	}
	public static boolean addRandomNode(BinTree t, int n){
		
		if(t!=null){
			
			Random r = new Random();
			int decision = r.nextInt(2);
			
			switch (decision){
			    case 0:
			    	if(t.left!=null){
			    		return addRandomNode(t.left, n);
			    	}
			    	else{
			    		t.left = new BinTree(n);
			    		System.out.println("node added left");
				    	return true;
			    	}
			    case 1:
			    	if(t.right!=null){
			    		return addRandomNode(t.right, n);
			    	}
			    	else{
			    		t.right = new BinTree(n);
			    		System.out.println("node added right");
				    	return true;
			    	}
			    	
			    
			    	
			}
				
		}
		return false;
	}
}
