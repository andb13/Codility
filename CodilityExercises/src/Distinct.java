import java.util.HashSet;

import java.util.*;

public class Distinct {
    
    public static int solution(int[] A){
        
        Set<Integer> distinctNumbers = new HashSet<>();
        int distinctValues = 0;

        for (int num : A) {
            distinctNumbers.add(num);
        }

        for (int num : distinctNumbers) {
            distinctValues++;
        }
        
        return distinctValues;
    }

}
