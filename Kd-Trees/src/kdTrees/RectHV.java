package kdTrees;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;

public class RectHV {

	private final double xmin, ymin, xmax, ymax;   // minimum x- and y-coordinates and maximum x- and y-coordinates
  
    // construct the rectangle [xmin, xmax] x [ymin, ymax] 
	public  RectHV(double xmin, double ymin, double xmax, double ymax) {
		if (xmax < xmin || ymax < ymin) {
            throw new IllegalArgumentException("Invalid rectangle");
        }
		this.xmin = xmin;
        this.ymin = ymin;
        this.xmax = xmax;
        this.ymax = ymax;
	}

	public  double xmin()  { 
		return xmin; 
}

	public  double ymin() {
		return ymin; 
	}

	public  double xmax()    {
		return xmax; 
	}

	public  double ymax() {
		return ymax;  
	}
	

    public double width()  { 
    	return xmax - xmin; 
    }
    
    public double height() { 
    	return ymax - ymin; 
    }

	
	
	// does this rectangle intersect that rectangle (at one or more points)? 
	public boolean intersects(RectHV that) {
		return this.xmax >= that.xmin && this.ymax >= that.ymin
	            && that.xmax >= this.xmin && that.ymax >= this.ymin;
	}
	
	// draw this axis-aligned rectangle
    public void draw() {
        StdDraw.line(xmin, ymin, xmax, ymin);
        StdDraw.line(xmax, ymin, xmax, ymax);
        StdDraw.line(xmax, ymax, xmin, ymax);
        StdDraw.line(xmin, ymax, xmin, ymin);
    }
    
	// square of Euclidean distance from point p to closest point in rectangle 
    public double distanceSquaredTo(Point2D p) {
        double dx = 0.0, dy = 0.0;
        if      (p.x() < xmin) dx = p.x() - xmin;
        else if (p.x() > xmax) dx = p.x() - xmax;
        if      (p.y() < ymin) dy = p.y() - ymin;
        else if (p.y() > ymax) dy = p.y() - ymax;
        return dx*dx + dy*dy;
    }
	
    public double distanceTo(Point2D p) {
        return Math.sqrt(this.distanceSquaredTo(p));
    }
    
    // does this rectangle contain the point p (either inside or on boundary)? 
 	public boolean contains(Point2D p)  {
 		return (p.x() >= xmin) && (p.x() <= xmax)
 	            && (p.y() >= ymin) && (p.y() <= ymax);
 	}

	// does this rectangle equal that object? 
	public boolean equals(Object y)   {
		if (y == this) return true;
        if (y == null) return false;
        if (y.getClass() != this.getClass()) return false;
        RectHV that = (RectHV) y;
        if (this.xmin != that.xmin) return false;
        if (this.ymin != that.ymin) return false;
        if (this.xmax != that.xmax) return false;
        if (this.ymax != that.ymax) return false;
        return true;
	}

	 // string representation 
	public  String toString() {
		return "[" + xmin + ", " + xmax + "] x [" + ymin + ", " + ymax + "]";
	}
}