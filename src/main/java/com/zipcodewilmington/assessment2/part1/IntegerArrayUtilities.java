package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return (array.length % 2 == 0);
    }

    public Integer[] range(int start, int stop) {
        if (stop >= start) {
            Integer[] integers = new Integer[stop - start + 1];
            for (int i = 0; i < integers.length; i++) {
                integers[i] = start + i;
            }
            return integers;
        }
        else {
            return null;
        }
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0] * array[1];
    }
}
