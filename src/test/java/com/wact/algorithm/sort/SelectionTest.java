package com.wact.algorithm.sort;

import com.wact.algorithm.utils.SortUtils;
import edu.princeton.cs.algs4.StdIn;
import org.junit.Test;

public class SelectionTest {

    @Test
    public void sort() {
        Sorter selection = new Selection();
        String[] a = StdIn.readAllStrings();
        selection.sort(a);
        assert SortUtils.isSorted(a);
        SortUtils.show(a);
    }

}
