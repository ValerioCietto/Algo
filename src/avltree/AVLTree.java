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
	/**
	 * controlla se l'albero è uno bilanciato
	 * @return true se l'albero è uno-bilanciato, false altrimenti
	 */
	public boolean is1Balanced() {
		int balance = getBalance(root);
		if(balance >= -1 && balance <= 1)return true;
		return false;
	}

	public void put(ObjectWithKey elem) {
		root = put(elem,root);
	}
	private Node put(ObjectWithKey element,Node node) {
		if(node==null){
			node = new Node(element);
			numElem++;
		}else if(element.key()<node.value.key()){
			//se la chiave è minore di quella del nodo attuale, 
			//bisogna posizionarsi sulla sinistra
			node.left=put(element,node.left);
			//richiama la procedura sul sisnistro, 
			//quando avrà terminato il controllo torna al padre
			if(getBalance(node) == 2){
				//caso di sbilanciamento sinistro(ruotaSS),
				//il controllo viene fatto dal padre sui figli
				if(element.key() > node.left.value.key())node.left= ruotaDD(node.left);//(caso SD1)se è maggiore la chiave da inserire rispetto al nodo,bisogna fare una rotazione destra
					node = ruotaSS(node);
					//(Caso SS1)altrimenti effettua una rotazione
					//sinistra
			}
		}else if(element.key() > node.value.key()) {
			node.right=put(element,node.right);
			if(getBalance(node) == - 2){
				if(element.key() < node.right.value.key()) node.right= ruotaSS(node.right);//in questo caso sarebbe ruotaDD
				 node = ruotaDD(node);//in questo caso sarebbe DS1
			}
		}else if(element.key()==node.value.key()){
			node = new Node(element);
		}
		upgradeHeight(node);
		return node;
	}
	/**
	 * 
	 * @param key
	 */
	public void remove(int key) {
		// TODO Auto-generated method stub
		
	}
	/**
     * Rotazione ss
     * @param d nodo da bilanciare
     * @return Nodo bilanciato
     */
	private Node ruotaSS(Node d){
		Node s ;
		s =d.left;
		d.left=s.right;
		s.right=d;
		upgradeHeight(d);
		upgradeHeight(s);
		return s;
	}

    /**
     * rotazione dd
     * @param s nodo da bilanciare
     * @return Nodo bilanciato
     */
	private Node ruotaDD(Node s){
		Node d;
		d=s.right;
		s.right=d.left;
		d.left=s;
		upgradeHeight(s);
		upgradeHeight(d);
		return d;
	}
	private Node ruotaSD(Node node){
		node.left = ruotaDD(node.left);
		return ruotaSS(node);
	}

	private Node DS(Node node){
		node.right = ruotaSS(node.right);
		return ruotaDD(node);
	}
	//------------------funzioni ausuliare----------------\\
	private int height(Node node){
		if(node==null) return -1;
		else return node.height;
	}
	/**
	 * 
	 * @param node nodo di cui bisogna aggiornare l'altezza
	 */
	private void upgradeHeight(Node node){
		//if(node!=null)
		node.height = max(height(node.left),height(node.right))+1;//ricalcola l'altezza del nodo radice(node)
	}
   private int getBalance(Node node){
       return height(node.left)-height(node.right);
   }
	 private static int max(int lhs, int rhs) {
		 return lhs > rhs ? lhs : rhs;
	 }
	private Node balance( Node node ){
		if( node == null )
			return node;

		if( getBalance(node) == 2 ){
			if( height( node.left.left ) <= height( node.left.right ) )node  = ruotaDD( node );
				node = ruotaSS(node);
		}
		else if( getBalance(node) == -2){
			if( height( node.right.right ) <= height( node.right.left ) )
				node = ruotaSS( node );
				node = ruotaDD( node );
		}
		node.height = Math.max( height( node.left ), height( node.right ) ) + 1;
		return node;
	}
	

}
