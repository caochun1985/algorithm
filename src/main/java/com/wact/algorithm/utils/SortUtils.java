package com.wact.algorithm.utils;

import edu.princeton.cs.algs4.StdOut;

public class SortUtils {

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    public static <T> boolean less(Comparable<T> v, T w) {
        return v.compareTo(w) < 0;
    }

    public static void show(Comparable[] a) {
        for (Comparable anA : a) StdOut.print(anA + " ");
        StdOut.println();
    }

}
