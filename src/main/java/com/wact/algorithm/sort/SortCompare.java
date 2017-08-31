package com.wact.algorithm.sort;

import com.wact.algorithm.utils.SortUtils;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {

    private static <T extends Comparable<T>> double time(String alg, T[] a) {
        Stopwatch timer = new Stopwatch();
        Sorter sorter = create(alg);
        if (sorter != null) {
            sorter.sort(a);
            StdOut.println(SortUtils.isSorted(a));
            //SortUtils.show(a);
        }
        return timer.elapsedTime();
    }

    private static double timeRandomInput(String alg, int n) {
        double total = 0.0;
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++)
            a[i] = StdRandom.uniform(100);
        total += time(alg, a);
        return total;
    }

    private static Sorter create(String alg) {
        switch (alg) {
            case "selection":
                return new Selection();
            case "insertion":
                return new Insertion();
            case "shell":
                return new Shell();
            case "merge":
                return new Merge();
            case "quick":
                return new Quick();
            case "quick3way":
                return new Quick3way();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        int n = 1000000;
        String alg = "quick3way";
        double time = timeRandomInput(alg, n);
        StdOut.printf("Alg: %s, Time: %f", alg, time);
    }

}
