package avltree;

public class Node {
	ObjectWithKey value;	
	Node left;
	Node right;
	int height;
	int x, y, width,heightDraw;
	 
	public Node(ObjectWithKey value){
		this.value=value;
		left=right=null;
		height=0;
	}
	Node(ObjectWithKey element, int x, int y, int width, int heightDraw, Node left, Node right) {
    value = element;
    this.x = x;
    this.y = y;
    this.width = width;
    this.heightDraw = heightDraw;
    this.left = left;
    this.right = right;
  }
}
