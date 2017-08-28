package com.wact.algorithm.sort;

import com.wact.algorithm.utils.SortUtils;

public class Merge implements Sorter {

    private Comparable[] aux;

    @SuppressWarnings("unchecked")
    private void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        System.arraycopy(a, lo, aux, lo, hi + 1 - lo);
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (SortUtils.less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }
}