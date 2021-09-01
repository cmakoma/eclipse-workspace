package kdTree;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;

public class RectHV {
	
	   private final double xmin, ymin;   // minimum x- and y-coordinates
	   private final double xmax, ymax;   // maximum x- and y-coordinates
		
	   public RectHV(double xmin, double ymin, double xmax, double ymax) {		// construct the rectangle [xmin, xmax]
	    																		//  x [ymin, ymax]
	    	if (xmax < xmin || ymax < ymin) {
	            throw new IllegalArgumentException("Invalid rectangle");
	        }
			
			this.xmin = xmin;
			this.ymin = ymin;
			this.xmax = xmax;
			this.ymax = ymax;
	   }

    
	     
	   public  double xmin()  { return xmin; }                         // minimum x-coordinate of rectangle 
	   public  double ymin()  { return ymin; }                         // minimum y-coordinate of rectangle 
	   public  double xmax()  { return xmax; }                         // maximum x-coordinate of rectangle 
	   public  double ymax()  { return ymax; }                         // maximum y-coordinate of rectangle 
	   
	
	   public double width()  { return xmax - xmin; }					// width of rectangle
	   public double height() { return ymax - ymin; }					// height of rectangle
	   
	   
	   public boolean intersects(RectHV that) {							// does this axis-aligned rectangle intersect that one?
	        return this.xmax >= that.xmin && this.ymax >= that.ymin
	            && that.xmax >= this.xmin && that.ymax >= this.ymin;
	    }
	   
	   
	   public void draw() {												// draw this axis-aligned rectangle
	        StdDraw.line(xmin, ymin, xmax, ymin);
	        StdDraw.line(xmax, ymin, xmax, ymax);
	        StdDraw.line(xmax, ymax, xmin, ymax);
	        StdDraw.line(xmin, ymax, xmin, ymin);
	    }
	   
	
	    public double distanceTo(Point2D p) {							// distance from p to closest point on 
	    																// this axis-aligned rectangle
	        return Math.sqrt(this.distanceSquaredTo(p));
	    }

	    
	    public double distanceSquaredTo(Point2D p) {					// square of Euclidean distance from point p 
	    																// to closest point in rectangle 
	        double dx = 0.0, dy = 0.0;
	        if      (p.x() < xmin) dx = p.x() - xmin;
	        else if (p.x() > xmax) dx = p.x() - xmax;
	        if      (p.y() < ymin) dy = p.y() - ymin;
	        else if (p.y() > ymax) dy = p.y() - ymax;
	        return dx*dx + dy*dy;
	    }

	    
	    public boolean contains(Point2D p) {							// does this rectangle contain the point p (
	    																// either inside or on boundary)?
	        return (p.x() >= xmin) && (p.x() <= xmax)
	            && (p.y() >= ymin) && (p.y() <= ymax);
	    }

	    
	    public boolean equals(Object y) {								// does this rectangle equal that object?		
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

	    
	    public String toString() {											// string representation
	        return "[" + xmin + ", " + xmax + "] x [" + ymin + ", " + ymax + "]";
	    }
	}