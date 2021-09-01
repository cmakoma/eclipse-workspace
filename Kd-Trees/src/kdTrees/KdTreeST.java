package kdTrees;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class KdTreeST<Value> {
	
	private Node root;
	private int size;

	private class Node {
		   private Point2D p;      	// the point
		   private Value val;    	// the symbol table maps the point to this value
		   private RectHV rect;    // the axis-aligned rectangle corresponding to this node
		   private Node lb;        // the left/bottom subtree
		   private Node rt;        // the right/top subtree
		   
		   public Node(Point2D p, Value val, RectHV rect) {
				this.p = p;
				this.val = val;
				this.rect =  rect;
			}
		}
	
	public KdTreeST() {
		size = 0;
		root = null;
	}
		
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return size;
	}
	
	///*****PUT***********
		public void put(Point2D p, Value val) {
			if (p == null || val == null) throw new NullPointerException("arguments can't be null");
			root = put(null, root, p, val, true);
		}
		// helper
		private Node put(Node parent, Node node, Point2D p, Value val, boolean isVertical) {
			if (node == null) {
				size++;
				return new Node(p, val, createNewRect(parent, p, isVertical));
			}
			
			double compare = compareXOrY(node, p, isVertical);
			if 	    (compare < 0) node.lb = put(node, node.lb, p, val, !isVertical);
			else if (compare > 0) node.rt   = put(node, node.rt,   p, val, !isVertical);
			else if (node.p.equals(p)) node.val = val;
			else node.rt = put(node, node.rt, p, val, !isVertical);
			
			return node;
		}
	
	/////////******GET*****
	public Value get(Point2D p) {
		if (p == null) throw new NullPointerException("arguments can't be null");
		return get(root, p, true);
	}
	//  helper
	private Value get(Node node, Point2D p, boolean isVertical) {
		if (node == null) return null;
		
		double compare = compareXOrY(node, p, isVertical); 
		if (compare < 0) return get(node.lb, p, !isVertical);
		else if (compare > 0) return get(node.rt, p, !isVertical);
		else if (node.p.equals(p)) return node.val;
		else return get(node.rt, p, !isVertical);
	}
	
	
	
	////////******CONTAINS*********
	public boolean contains(Point2D p) {
		if (p == null) throw new NullPointerException("arguments can't be null");
		return get(p) != null;
	}
	
	
	
	//return all point in level order
	public Iterable<Point2D> levelOrder() {
		Queue<Point2D> queueToReturn = new Queue<>();
		if (size == 0) return queueToReturn;
		Queue<Node> traversalQueue = new Queue<>();
		
		traversalQueue.enqueue(root);
		while (!traversalQueue.isEmpty()) {
			Node temp = traversalQueue.dequeue();
			queueToReturn.enqueue(temp.p);
			if (temp.lb != null) traversalQueue.enqueue(temp.lb);
			if (temp.rt != null) traversalQueue.enqueue(temp.rt);
		}
		return queueToReturn;
	}
	
	public Iterable<Point2D> range(RectHV rect) {
		if (rect == null) throw new NullPointerException("arguments can't be null");
		Queue<Point2D> pointsInsideRect = new Queue<>();
		range(rect, pointsInsideRect, root);
		return pointsInsideRect;
	}
	
	private void range(RectHV rect, Queue<Point2D> pointsInsideRect, Node node) {
		if (node == null) return;
		if (!rect.intersects(node.rect)) return;
		if (rect.contains(node.p)) pointsInsideRect.enqueue(node.p);
		range(rect, pointsInsideRect, node.lb);
		range(rect, pointsInsideRect, node.rt);
	}
	
	////Nearest point to point p
	public Point2D nearest(Point2D p) {
		if (p == null) throw new NullPointerException("arguments can't be null");
		return nearest(p, root, root.p);
	}
	
	private Point2D nearest(Point2D p, Node node, Point2D winningPoint) {
		if (node == null) return winningPoint;
		if (node.rect.distanceSquaredTo(p) > winningPoint.distanceSquaredTo(p)) return winningPoint;//distanceSquaredTo() is faster and doesn't use Math.sqrt()
		if (p.distanceSquaredTo(node.p) < p.distanceSquaredTo(winningPoint)) winningPoint = node.p;
		
		if (node.lb != null && node.lb.rect.contains(p)) { // We always want to be moving toward the point
			winningPoint = nearest(p, node.lb, winningPoint);
			winningPoint = nearest(p, node.rt, winningPoint);
		} else {
			winningPoint = nearest(p, node.rt, winningPoint);
			winningPoint = nearest(p, node.lb, winningPoint);
		}
		return winningPoint;
	}
	
	
	// Compare either x or y depending on if it's vertical or horizontal
		private double compareXOrY(Node node, Point2D p, boolean isVertical) {
			if (isVertical) return p.x() - node.p.x(); 
			else		    return p.y() - node.p.y();
		}
		
		// private helper method to calculate the rectangle for put
		private RectHV createNewRect(Node parent, Point2D p, boolean isVertical) {
			if (parent == null) return new RectHV(-Double.MAX_VALUE, -Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
			double compare = compareXOrY(parent, p, !isVertical);
			// use parent's ymin and then copy the rest of the rect
			if (isVertical  && compare >= 0) return new RectHV(parent.rect.xmin(), parent.p.y(), parent.rect.xmax(), parent.rect.ymax());
			// use parent's ymax and then copy the rest of the rect
			if (isVertical  && compare <  0) return new RectHV(parent.rect.xmin(), parent.rect.ymin(), parent.rect.xmax(), parent.p.y());
			// use parent's xmin and then copy the rest of the rect
			if (!isVertical && compare >= 0) return new RectHV(parent.p.x(), parent.rect.ymin(), parent.rect.xmax(), parent.rect.ymax());
			// use parent's xmax and then copy the rest of the rect
			if (!isVertical && compare <  0) return new RectHV(parent.rect.xmin(), parent.rect.ymin(), parent.p.x(), parent.rect.ymax());
			return null;
		}
	
	//********TEST**************
	public static void main(String[] args) {
		String filename = "input100K.txt";
//		String filename = "input1M.txt";
        In in = new In(filename);
     // initialize the two data structures with point from standard input
        KdTreeST<Integer> kdtree = new KdTreeST<>();
        for (int i = 0; !in.isEmpty(); i++) {
            double x = in.readDouble();
            double y = in.readDouble();
            Point2D p = new Point2D(x, y);
            kdtree.put(p, i);
        }
        
        
        StdOut.println("Starting...");
		long starttime = System.currentTimeMillis();
		int numberOfTimesToCalculate = 100000;
		for (int i = 0; i < numberOfTimesToCalculate; i++) {
			kdtree.nearest(new Point2D(StdRandom.uniform(), StdRandom.uniform()));
		}
		long endtime = System.currentTimeMillis();
		double timeTakenInSeconds = (endtime-starttime)/1000.0;
		StdOut.println("Total time: " + timeTakenInSeconds);
		StdOut.println("Average per second: " + numberOfTimesToCalculate / timeTakenInSeconds);
	}
}
