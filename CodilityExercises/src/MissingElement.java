import java.util.*;

public class MissingElement {
    public static int solution(int[] A) {
        Arrays.sort(A);
        for(int i=1; i<A.length+2;i++){
            if(!contains(i, A)){
                return i;
            }
        }
        return 0;
    }

    private static boolean contains(int comparedNumber, int[] orderedNumbers) {
        boolean result = false;
        for (int i : orderedNumbers) {
            if(i == comparedNumber){
                result = true;
            }
        }
        return result;
    }
}
