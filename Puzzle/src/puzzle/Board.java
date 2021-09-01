package puzzle;

import java.util.Arrays;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Board {
	private final int N;
	private final int[] tiles;
	private int zeroLocation;
	private int hamming = -1;
	private int manhattan = -1;
	
    public Board(int[][] blocks)  {							// construct a board from an N-by-N array of blocks
    														// (where blocks[i][j] = block in row i, column j)													
    	if (blocks == null) throw new NullPointerException();
    	N = blocks.length;
    	
    	// Initialize tiles
    	tiles = new int[N*N];
    	int tileInit = 0;
    	
    	for (int i = 0; i < N; i++) {
    		for (int j = 0; j < N; j++) {
    			if (blocks [i][j] == 0) zeroLocation = tileInit;
    			tiles[tileInit++] = blocks[i][j];
    		}
    	}
    	
    }         
                                           
    public int size()  {									// board size N
    	return N;
    }  
    
    public int hamming() { 				 	                // number of blocks out of place
    	// avoiding hamming recalculation once when we have it
    	if (hamming != -1) return hamming;
    	
    	hamming = 0;
    	for (int i = 0; i < tiles.length; i++) {
			if (tiles[i] != (i + 1) && tiles[i] != 0) hamming++;
		}
    	
    	return hamming;
    }
    
    public int manhattan()   {              				// sum of Manhattan distances between blocks and goal
    	
    	// avoiding hamming recalculation once when we have it
    	if (manhattan != -1) return manhattan;
    	
    	manhattan = 0;
    	for (int i = 0; i < tiles.length; i++) {
    		if (tiles[i] == (i+1) || i == zeroLocation) continue;
    		
    		// count rows displacement;
    		manhattan += Math.abs((i / N) - ((tiles[i] - 1) / N));
    		
    		// count columns displacement;
			manhattan += Math.abs((i % N) - ((tiles[i] - 1) % N));
    	}
    	
    	return manhattan;
    }
    
    public boolean isGoal()   {             // is this board the goal board?
    	
    	// if the blank tile isn't in place we know it's not goal(Best case)
    	if (tiles[tiles.length - 1] != 0) return false; 
    	
    	//everything Else
    	for (int i = 0; i < tiles.length - 1; i++) {
    		if(tiles[i] != (i + 1))  return false;
    	}
    	return true;
    	
    }
    
    public boolean isSolvable() {           // is this board solvable?
    	int inversions = 0;
    	
    	for (int i = 0; i < tiles.length; i++) {
    		
    		//don't count blank in the inversions
    		if (tiles[i] == 0) continue;
    		
    		// count inversions
    		for (int j = i; j < tiles.length; j++) {
    			if (tiles[j] < tiles[i] && tiles[j] != 0 )  inversions++;
    		}
    	}
    	
    	// true if even
    	boolean isEvenBoard = (N % 2) == 0;
    	
    	//sum inversions
    	if (isEvenBoard) inversions += zeroLocation / N; 
    	
    	//is sum inversions true
    	boolean isEvenInversions = (inversions % 2) == 0;
    	
    	//odd board is solvable with even inversions. 
    	//an even board is solvable with odd inversions. 
    	return isEvenBoard != isEvenInversions;
    	
    }
    
    @Override
	public boolean equals(Object y){							// does this board equal y?
		if (y == this) return true;
		if (y == null) return false;
		if (this.getClass() != y.getClass()) return false;
		Board other = (Board) y;
		for (int i = 0; i < tiles.length; i++)
			if (this.tiles[i] != other.tiles[i]) return false;
		return true;
	}
	
	@Override
	public int hashCode() {										// hashCode from equals
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(tiles);
		return result;
	}
    
    
    public Iterable<Board> neighbors() {						// all neighboring boards
    	Stack<Board> neighbors = new Stack<>();
    	
    	// has up neighbor?
    	if (zeroLocation / N != 0) pushNeighborToStack(neighbors, -N);
    	
    	// has down neighor?
		if (zeroLocation / N != N - 1) pushNeighborToStack(neighbors, N);
		
		// has left neighbor?
		if (zeroLocation % N != 0) pushNeighborToStack(neighbors, -1);
		
		// has right neighbor?
		if (zeroLocation % N != N - 1) pushNeighborToStack(neighbors, 1);
		
		return neighbors;
	} 
    
    // pushes neighboring boards to the neighbors stack for the neighbors() method
 	private void pushNeighborToStack(Stack<Board> neighbors, int displace) {
 		
 		// Swap neighbor tile and blank tile
 		swap(tiles, zeroLocation, zeroLocation + displace); 
 		
 		// Push neighbor board to stack
 		neighbors.push(new Board(tiles, N, zeroLocation + displace)); 
 		
 		// Switch tiles back to its original state
 		swap(tiles, zeroLocation, zeroLocation + displace); 
 	}
 	
 	// swaps two tiles. 
 	private void swap(int[] swapBoard, int pos1, int pos2) {
 		int swap = swapBoard[pos1];
 		swapBoard[pos1] = swapBoard[pos2];
 		swapBoard[pos2] = swap;
 	}
 	
 	// constructor for the new neighbors.
 	private Board(int[] blocks, int N, int zeroLocation) {
 		this.N = N;
 		this.zeroLocation = zeroLocation;
 		tiles = new int[N*N];
 		System.arraycopy(blocks, 0, tiles, 0, tiles.length); // faster than a for loop
 	}
 	
 	
	public String toString() {              					// string representation of this board (in the output format specified below)
    	StringBuilder s = new StringBuilder();
	    s.append(N + "\n");
	    for (int i = 0; i < tiles.length; i++) {
            s.append(String.format("%2d ", tiles[i]));
            if ((i + 1) % N == 0)
            	s.append("\n");
	    }
	    return s.toString();
    }

    public static void main(String[] args){ 					// unit tests (not graded)
    	Board testBoard = new Board(new int[][]{
			{6, 2, 8},
			{4, 1, 0},
			{3, 7, 5}});
	StdOut.println(testBoard.toString());
    }
}