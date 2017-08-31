package com.wact.algorithm.sort;

import com.wact.algorithm.utils.SortUtils;

public class Quick implements Sorter {

    private <T extends Comparable<T>> int partition(T[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        T v = a[lo];
        while (true) {
            while (SortUtils.less(a[++i], v)) if (i >= hi) break;
            while (SortUtils.less(v, a[--j])) if (j <= lo) break;
            if (i >= j) break;
            SortUtils.exch(a, i, j);
        }
        SortUtils.exch(a, lo, j);
        return j;
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        sort(a, 0, a.length - 1);
    }

    private <T extends Comparable<T>> void sort(T[] a, int lo, int hi) {
        if (lo >= hi) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }
}
