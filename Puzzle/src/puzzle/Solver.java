package puzzle;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Solver {
	private Stack<Board> solution;
	private int moves;

    public Solver(Board initial) {          // find a solution to the initial board (using the A* algorithm)
    	if (initial.isSolvable() == false) throw new IllegalArgumentException(" Puzzle not solvable");
    	
    	solution = new Stack<>();
		MinPQ<Move> q = new MinPQ<>();
		q.insert(new Move(initial, 0, null));
		
		while(true){
			Move move = q.delMin();
			
			//goal has been reached, populate fields of interest and return
			if(move.board.isGoal()){ 
				this.moves = move.moves;
				do{
					solution.push(move.board);
					move = move.parent;
				}
				while(move != null);
				//done solving
				return; 
			}
			for(Board next : move.board.neighbors()){
				
				//look back one move to prevent useless looping
				if(move.parent == null || !next.equals(move.parent.board)) 
					q.insert(new Move(next, move.moves+1, move));
			}
		}
    }
    
    private class Move implements Comparable<Move>{
		private Board board;
		private int moves;
		private Move parent;
		
		public Move(Board board, int moves, Move parent){
			this.board = board;
			this.moves = moves;
			this.parent = parent;
		}

		@Override
		public int compareTo(Move o) {
			int difference = this.board.manhattan() + this.moves - o.board.manhattan() - o.moves;
			
			//return normal difference of priority functions
			if (difference != 0) return difference; 
			
			//if priority is the same give preference to the one with more moves
			if (this.moves > o.moves) return -1; 
			return 1;
		}
	}
    
    public int moves() {                   					// min number of moves to solve initial board
    	return moves;
    }
    
    public Iterable<Board> solution() {     				// sequence of boards in a shortest solution
    	return solution;
    }
    
    public static void main(String[] args) { 				// solve a slider puzzle (given below) 
    	
    	
    	String[] inFiles = {"/puzzle/puzzle04.txt","/puzzle/puzzle3x3-unsolvable.txt"};
   	
    	for (int z = 0; z < inFiles.length; z++) {
    		// create initial board from file
    		StdOut.println("% more " + inFiles[z]);
    		In in = new In(inFiles[z]);
    		int N = in.readInt();
            int[][] blocks = new int[N][N];
            
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    blocks[i][j] = in.readInt();
            Board initial = new Board(blocks);
            StdOut.println(initial.toString());
            
            // check if puzzle is solvable; if so, solve it and output solution
            StdOut.println("% java Solver " + inFiles[z]);
            if (initial.isSolvable()) {
                Solver solver = new Solver(initial);
                StdOut.println("Minimum number of moves = " + solver.moves());
                for (Board board : solver.solution())
                    StdOut.println(board);
            }

            // if not, report unsolvable
            else {
                StdOut.println("Unsolvable puzzle");
            }
    	}
        
    }
}
