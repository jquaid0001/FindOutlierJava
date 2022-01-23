package com.company;

import java.util.HashMap;

public class FindOutlier{

    static int find(int[] integers){

        if (integers == null || integers.length < 3)
            return 0;                               //0 = false

        else {
            int evenCount = 0, oddCount = 0;
            HashMap<String, Integer> hashMap = new HashMap<String, Integer>(2, 5.0F);
            for (int intToMap : integers) {
                if (intToMap % 2 == 0) {
                    hashMap.put("even", intToMap);
                    ++evenCount;
                    if (evenCount > 1 && oddCount == 1)
                        break;
                }
                else {
                    hashMap.put("odd", intToMap);
                    ++oddCount;
                    if (oddCount > 1 && evenCount == 1)
                        break;
                }
            }

            if (evenCount > 1)
                return hashMap.get("odd");
            else
                return hashMap.get("even");
        }
    }
}