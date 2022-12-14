import java.util.*;

public class CountDiv {
    
    public static int solution(int A, int B, int K){
        int divisors = 0;

        Set<Integer> numsWithinRange = new HashSet<>();

        for(;A<=B;A++){
            numsWithinRange.add(A);
        }

        System.out.println(numsWithinRange.toString());

        for (Integer num : numsWithinRange) {
            if(num%K == 0){
                divisors++;
                System.out.println(num);
            }
        }

        return divisors;
    }

}
