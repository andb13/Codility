import java.util.*;

public class MissingInteger {
    
    public static int solution(int[] A){
        Set<Integer> numSet = new HashSet<>();

        for (int num : A) {
            numSet.add(num);
        }

        System.out.println(numSet.toString());

        for(int i=1; i<=A.length; i++){    
            if(!numSet.contains(i)){
                return i;
            }
            if(i == A.length){
                return i+1;
            }
        }

        return 1;
    }

}
