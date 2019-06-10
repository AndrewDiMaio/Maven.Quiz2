package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return (array.length %2 == 0);
    }

    public Integer[] range(int start, int stop) {
        /*int num = stop-start;
        List newList = new ArrayList();
        int j = 0;
        for (int i = start; i<stop; i++){
            newList.set(j, i);
            j++;
        }
        return (Integer[]) newList.toArray();*/
        List<Object> newList = new ArrayList<>();
        int j = 0;
        for (int i = start; i<stop+1; i++) {
            newList.add(i);
            j++;
        }
        Integer[] finalList = newList.toArray(new Integer[0]);
        return finalList;
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
