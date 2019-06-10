package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Object> newList = new ArrayList<>(Arrays.asList(array1));
        List<Object> mergeList = new ArrayList<>(Arrays.asList(array2));
        newList.addAll(mergeList);
        Integer[] finalList = newList.toArray(new Integer[0]);
        return finalList;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Collections.rotate(Arrays.asList(array), 5-index);
        for (int i = 0; i<5; i++){
            System.out.println(array[i]);
        }


        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count1 = 0;
        int count2 = 0;
        for  (int i = 0;i < array1.length; i++)
            if (array1[i].equals(valueToEvaluate)){
                count1++;
            }

        for  (int i = 0;i < array2.length; i++)
            if (array2[i].equals(valueToEvaluate)){
                count2++;
            }

        return count1+count2;

    }

    public Integer mostCommon(Integer[] array) {
        Object max = new Object();
        for (int i = 0; i<array.length; i++){
            int currMax = 0;
            for (int j = 0; j<array.length; j++){
                int count = 0;
                if (array[i].equals(array[j])) {
                    count++;
                    if (count > currMax){
                        currMax = count;
                        max = array[i];
                    }
                }
            }
        }

        return (Integer)max;

    }
}
