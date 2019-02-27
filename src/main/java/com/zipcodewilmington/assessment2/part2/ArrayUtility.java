package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Set;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] newArray = new Integer[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int i = array1.length; i < array1.length + array2.length; i++) {
            newArray[i] = array2[i-array1.length];
        }
        return newArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotateToBack = new Integer[index];
        Integer[] rotateToFront = new Integer[array.length - index];
        int i = 0;
        while (i < array.length){
            if (i < index) {
                rotateToBack[i] = array[i];
            }
            else {
                rotateToFront[(i - index)] = array[i];
            }
            i++;
        }
        Integer[] retArray = merge(rotateToFront, rotateToBack);
        return retArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        Integer[] array = merge(array1, array2);
        for (Integer integer : array){
            if (integer.equals(valueToEvaluate)){count++;}
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (Integer integer: array) {
            if(countMap.containsKey(integer)) {
                Integer value = countMap.get(integer);
                countMap.put(integer, ++value);
            }
            else{
                countMap.put(integer, 1);
            }
        }

        Integer highestValue = array[0];
        Integer highestCount = 0;
        Set<Integer> keys = countMap.keySet();
        for (Integer key : keys){
            if(countMap.get(key) > highestCount){
                highestCount = countMap.get(key);
                highestValue = key;
            }
        }
        return highestValue;
    }
}
