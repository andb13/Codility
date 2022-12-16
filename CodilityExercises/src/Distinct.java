import java.util.HashSet;

import java.util.*;

public class Distinct {
    
    public static int solution(int[] A){
        
        Set<Integer> distinctNumbers = new HashSet<>();

        for (int num : A) {
            distinctNumbers.add(num);
        }
        
        return distinctNumbers.size();
        
    }

}
