package avltree;

public class AVLTree implements Dictionary{

	public Node root;
	private int numElem;
	/**
	 * Trova il nodo con tale chiave
	 * in maniera ricorsiva
	 * @param key chiave da trovare
	 * @return il valore della chiave se esiste, null se non presente
	 */
	public ObjectWithKey get(int key) {
		
		return get(key,root);
	}
	/**
	 * Trova il nodo con tale chiave
	 * @param key chiave da trovare
	 * @param node radice del sottoalbero
	 * @return il valore della chiave se esiste, null se non presente
	 */
	private ObjectWithKey get(int key, Node node){
		if(node ==null){ 
			return null;
		}	
		if(key<node.value.key()){
			return get(key,node.left);
		}	
		else if(key>node.value.key()){
			return get(key,node.right);
		}
		else return node.value;
	}

	/**
	 * Controlla se l'albero è vuoto
	 * @return true se vuoto, false altrimenti
	 */
	public boolean isEmpty() {
		return root==null? true : false;
	}
	
	public AVLTree (){
		
	}

	public void printInOrder() {
		// TODO Auto-generated method stub
		
	}

	public boolean is1Balanced() {
		// TODO Auto-generated method stub
		return false;
	}

	public void put(Elem elem) {
		// TODO Auto-generated method stub
		
	}

	public void remove(int key) {
		// TODO Auto-generated method stub
		
	}

}
