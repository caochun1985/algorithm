package com.wact.algorithm.sort;

import com.wact.algorithm.utils.SortUtils;

public class Selection implements Sorter {

    public static void main(String[] args) {
        Selection selection = new Selection();
        Character[] a = new Character[]{'e', 'x', 'a', 'm', 'p', 'l', 'e'};
        selection.sort(a);
        assert SortUtils.isSorted(a);
        SortUtils.show(a);
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (SortUtils.less(a[j], a[min]))
                    min = j;
            }
            SortUtils.exch(a, i, min);
        }
    }

}
