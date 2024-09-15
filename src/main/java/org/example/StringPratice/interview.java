package org.example.StringPratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class interview {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 2, 3, 6, 4,7};
        int max = 0;
        HashMap<Integer, int[]> hp = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {//7
            int Pday = prices[i];
            for (int j = i; j < prices.length; j++) {//7
                int Sday = prices[j];
                if ((Sday - Pday) > 0 && max < (Sday - Pday)) {
                    max = Sday - Pday;
                    hp.put(max, new int[]{prices[i], prices[j]});
                    al.add(max);
                }
            }
        }
        Collections.sort(al);
        System.out.println(Arrays.toString(hp.get(al.get(al.size() - 1))));
    }


}
