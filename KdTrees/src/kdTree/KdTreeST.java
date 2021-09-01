
package kdTree;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


public class KdTreeST <Value> {
	private int size;
	private Node root;
	
	// private helper class
	private class Node {
		private Point2D p; 
		private Value val; 
		private RectHV rect; 
		private Node leftBottom, rightTop; 
		
		public Node(Point2D p, Value val, RectHV rect) {
			this.p = p;
			this.val = val;
			this.rect = rect;
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
	
	
	public void put(Point2D p, Value val) {
		if (p == null || val == null) throw new NullPointerException("arguments can't be null");
		root = put(null, root, p, val, true);
	}
	
	
	private Node put(Node parent, Node node, Point2D p, Value val, boolean isVertical) {
		if (node == null) {
			size++;
			return new Node(p, val, createNewRect(parent, p, isVertical));
		}
		
		double compare = compareXOrY(node, p, isVertical);
		if 	    (compare < 0) node.leftBottom = put(node, node.leftBottom, p, val, !isVertical);
		else if (compare > 0) node.rightTop   = put(node, node.rightTop,   p, val, !isVertical);
		else if (node.p.equals(p)) node.val = val;
		else node.rightTop = put(node, node.rightTop, p, val, !isVertical);
		
		return node;
	}
	
	
	public Value get(Point2D p) {
		if (p == null) throw new NullPointerException("arguments can't be null");
		return get(root, p, true);
	}
	

	private Value get(Node node, Point2D p, boolean isVertical) {
		if (node == null) return null;
		
		double compare = compareXOrY(node, p, isVertical); 
		if (compare < 0) return get(node.leftBottom, p, !isVertical);
		else if (compare > 0) return get(node.rightTop, p, !isVertical);
		else if (node.p.equals(p)) return node.val;
		else return get(node.rightTop, p, !isVertical);
	}
	
	
	public boolean contains(Point2D p) {
		if (p == null) throw new NullPointerException("arguments can't be null");
		return get(p) != null;
	}
	
	
	public Iterable<Point2D> points() {
		Queue<Point2D> queueToReturn = new Queue<>();
		if (size == 0) return queueToReturn;
		Queue<Node> traversalQueue = new Queue<>();
		
		traversalQueue.enqueue(root);
		while (!traversalQueue.isEmpty()) {
			Node temp = traversalQueue.dequeue();
			queueToReturn.enqueue(temp.p);
			if (temp.leftBottom != null) traversalQueue.enqueue(temp.leftBottom);
			if (temp.rightTop != null) traversalQueue.enqueue(temp.rightTop);
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
		range(rect, pointsInsideRect, node.leftBottom);
		range(rect, pointsInsideRect, node.rightTop);
	}
	
	
	public Point2D nearest(Point2D p) {
		if (p == null) throw new NullPointerException("arguments can't be null");
		return nearest(p, root, root.p);
	}
	
	private Point2D nearest(Point2D p, Node node, Point2D winningPoint) {
		if (node == null) return winningPoint;
		if (node.rect.distanceSquaredTo(p) > winningPoint.distanceSquaredTo(p)) return winningPoint;
		if (p.distanceSquaredTo(node.p) < p.distanceSquaredTo(winningPoint)) winningPoint = node.p;
		
		if (node.leftBottom != null && node.leftBottom.rect.contains(p)) { 
			winningPoint = nearest(p, node.leftBottom, winningPoint);
			winningPoint = nearest(p, node.rightTop, winningPoint);
		} else {
			winningPoint = nearest(p, node.rightTop, winningPoint);
			winningPoint = nearest(p, node.leftBottom, winningPoint);
		}
		return winningPoint;
	}
	
	
	private double compareXOrY(Node node, Point2D p, boolean isVertical) {
		if (isVertical) return p.x() - node.p.x(); 
		else		    return p.y() - node.p.y();
	}
	
	
	private RectHV createNewRect(Node parent, Point2D p, boolean isVertical) {
		if (parent == null) return new RectHV(-Double.MAX_VALUE, -Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
		double compare = compareXOrY(parent, p, !isVertical);
		
		if (isVertical  && compare >= 0) return new RectHV(parent.rect.xmin(), parent.p.y(), parent.rect.xmax(), parent.rect.ymax());
		
		if (isVertical  && compare <  0) return new RectHV(parent.rect.xmin(), parent.rect.ymin(), parent.rect.xmax(), parent.p.y());
		
		if (!isVertical && compare >= 0) return new RectHV(parent.p.x(), parent.rect.ymin(), parent.rect.xmax(), parent.rect.ymax());
		
		if (!isVertical && compare <  0) return new RectHV(parent.rect.xmin(), parent.rect.ymin(), parent.p.x(), parent.rect.ymax());
		return null;
	}
	
	public static void main(String[] args) {
		String filename = "kdTree/input1M.txt";
        In in = new In(filename);
        KdTreeST<Integer> kdtree = new KdTreeST<>();
        for (int i = 0; !in.isEmpty(); i++) {
            double x = in.readDouble();
            double y = in.readDouble();
            Point2D p = new Point2D(x, y);
            kdtree.put(p, i);
        }
        StdOut.println("Starting...");
		long starttime = System.currentTimeMillis();
		int numberOfTimesToCalculate = 10000000;
		for (int i = 0; i < numberOfTimesToCalculate; i++) {
			kdtree.nearest(new Point2D(StdRandom.uniform(), StdRandom.uniform()));
		}
		long endtime = System.currentTimeMillis();
		double timeTakenInSeconds = (endtime-starttime)/1000.0;
		StdOut.println("Total time: " + timeTakenInSeconds);
		StdOut.println("Average per second: " + numberOfTimesToCalculate / timeTakenInSeconds);
	}
}