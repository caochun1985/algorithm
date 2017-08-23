package com.wact.algorithm.sort;

public interface Sorter {

    <T extends Comparable<T>> void sort(T[] a);

}
