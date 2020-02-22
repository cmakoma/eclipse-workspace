// Assignement Percolation
// Program PercolationStats
// Author Christian Makoma
// Created Feb 12, 2020


package percolation;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private int T;
    private double[] percenatge;

    public PercolationStats(int N, int T) {
        // perform T independent experiments on an N-by-N grid
        if (N <= 0 || T <= 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.T = T;
        this.percenatge = new double[T];
        for (int i = 0; i < T; i++) {
            int count = 0;
            Percolation percolation = new Percolation(N);
            while (!percolation.percolates()) {
                int x, y;
                do {
                    x = StdRandom.uniform(N) + 1;
                    y = StdRandom.uniform(N) + 1;
                } while (percolation.isOpen(x, y));
                percolation.open(x, y);
                count++;
            }
            percenatge[i] = (double) count / N / N;
        }
    }

    public double mean() {
        
        return StdStats.mean(percenatge);
    }

    public double stddev() {
      
        return StdStats.stddev(percenatge);
    }

    public double confidenceLo() {

        return StdStats.mean(percenatge) - 1.96 * StdStats.stddev(percenatge) / Math.sqrt(T);
    }

    public double confidenceHi() {
       
        return StdStats.mean(percenatge) + 1.96 * StdStats.stddev(percenatge) / Math.sqrt(T);
    }

    public static void main(String[] args) {
       
        int n = 2;
        int t = 10000;
        PercolationStats stats = new PercolationStats(n, t);
        System.out.println(stats.mean() + "");
        System.out.println(stats.stddev() + "");
        System.out.println(stats.confidenceLo() + " " + stats.confidenceHi());
    }
}

