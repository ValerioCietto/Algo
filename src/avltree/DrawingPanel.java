package avltree;

import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;



public class DrawingPanel extends JPanel {
  private static final long serialVersionUID = 1L;
  AVLTree tree;  
  private int fromLeftMargin = 2;// visitedNodeNumber = 1;
  private Graphics graphics;
  private int hScale = 40;
  private int vScale = 20;
  
  DrawingPanel(AVLTree t) {
    tree = t;
  }

  Node build(Node t, int level) {
    if(t == null) return null;
    else {
      Node left = build(t.left, level + 1);
      String str = t.value.toString();
      Rectangle2D rect = graphics.getFontMetrics().getStringBounds(str, graphics);
      int width = (int)Math.round(rect.getWidth())+2;
      int height = (int)Math.round(rect.getHeight());
      int dx = (int)Math.round(rect.getCenterX());
      int dy = (int)Math.round(rect.getCenterY());
      int x = fromLeftMargin + dx + 2;//hScale*visitedNodeNumber - dx;
      int y = vScale*level + dy;
      fromLeftMargin += width; //visitedNodeNumber++;
      Node right = build(t.right, level + 1);
      return new Node(t.value, x, y, width, height, left, right);
    }
  }

  void draw(Node dt) {
    if(dt != null) {
      String str = dt.value.toString();
      graphics.drawRect(dt.x-2, dt.y-13, dt.width+2, dt.height+12);
      graphics.drawString(str, dt.x+1, dt.y + dt.height - 2);
      if(dt.left != null) {
        int x1 = dt.x + dt.width/4;
        int y1 = dt.y + dt.height;
        int x2 = dt.left.x + dt.left.width/4;
        int y2 = dt.left.y;
        graphics.drawLine(x1, y1, x2, y2-12);
      }
      draw(dt.left);
      if(dt.right != null) {
        int x1 = dt.x + dt.width/4;
        int y1 = dt.y + dt.height;
        int x2 = dt.right.x + dt.right.width/4;
        int y2 = dt.right.y;
        graphics.drawLine(x1, y1, x2, y2-12);
      }
      draw(dt.right);
    }
  }

  @Override
public void paintComponent(Graphics g) {
    super.paintComponent(g);
    graphics = g;
    Node dt = build(tree.root,1);
    draw(dt);
    fromLeftMargin = 2;
  }
}
