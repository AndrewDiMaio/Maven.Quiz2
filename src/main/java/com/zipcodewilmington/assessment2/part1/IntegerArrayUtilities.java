package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return (array.length %2 == 0);
    }

    public Integer[] range(int start, int stop) {
        int num = stop-start;
        Integer[] arr = null;
        int j = 0;
        for (int i = start; i<stop; i++){
            arr[j] += i;
            j++;
        }
        return arr;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum = array[0]+array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer prod = array[array.length-1]*array[array.length-2];
        return prod;
    }
}
