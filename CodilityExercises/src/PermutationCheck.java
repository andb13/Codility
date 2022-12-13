import java.util.*;

public class PermutationCheck{
    
    public static int solution(int[] A){

        Set<Integer> set = new HashSet<>();

        for (int num : A) {
            set.add(num);
        }

        for(int i=1; i<A.length+1; i++){    
            if(!set.contains(i)){
                return 0;
            }
        }

        return 1;
    }

}