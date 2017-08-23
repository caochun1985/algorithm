package com.wact.algorithm.sort;

import com.wact.algorithm.utils.SortUtils;

public class Insertion implements Sorter {

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && SortUtils.less(a[j], a[j - 1]); j--) {
                SortUtils.exch(a, j, j - 1);
            }
        }
    }
}
