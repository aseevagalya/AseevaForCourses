package com.company.Task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] capacity = {3, 4, 5, 8, 9};
        int[] value = {1, 6, 4, 7, 6};

        int safe_capacity = 13;

        int maxValue = 0;
        long maxState = 0;

        long count = 2L << capacity.length; // возведение в степень

        for (long index = 0; index < count; index++) {
            int index_value = stateValue(index, value);
            int index_capacity = stateCapacity(index, capacity);
            if (index_capacity <= safe_capacity) {
                if (maxValue < index_value) {
                    maxValue = index_value;
                    maxState = index;
                }
            }
        }

        System.out.println("Оптимальное содержимое сейфа:");
        long poverOfTwo = 1;
        for (int i = 0; i < capacity.length; i++) {
            if ((poverOfTwo & maxState) > 0) {
                System.out.println("Предмет под номером "+(i + 1));
            }
            poverOfTwo <<= 1;
        }
    }

    private static int stateCapacity(long state, int[] capacity) {
        long poverOfTwo = 1;
        int index_capacity = 0;
        for (int i = 0; i < capacity.length; i++) {
            if ((poverOfTwo & state) != 0) {
                index_capacity += capacity[i];
            }
            poverOfTwo <<= 1;
        }
        return index_capacity;
    }

    private static int stateValue(long state, int[] value) {
        long poverOfTwo = 1;
        int index_value = 0;
        for (int i = 0; i < value.length; i++) {
            if ((poverOfTwo & state) != 0) {
                index_value += value[i];
            }
            poverOfTwo <<= 1;
        }
        return index_value;
    }
}


