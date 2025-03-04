package com.fundamentals;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Flips {
    public static void main(String[] args) {
        int T = 18;
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for(int t = 0 ; t < T; t++){
            if(StdRandom.bernoulli(0.5)){
                heads.increment();
            }
            else {
                tails.increment();
            }
        }
        StdOut.println(heads);
        StdOut.println(tails);
        int d = heads.tally() - tails.tally();
        System.out.println("delta: " + Math.abs(d));
    }
}
