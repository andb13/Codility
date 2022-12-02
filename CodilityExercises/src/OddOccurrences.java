import java.util.Arrays;

public class OddOccurrences {
    public static int solution(int[] A) {
        int length = A.length;
        boolean visited[] = new boolean[length];
        Arrays.fill(visited, false);
        int nonOccurNum = 0;
        for(int i=0; i<length; i++){
            if(visited[i]) 
                continue;
            
            int count = 1;
            for(int j = i+1; j<length;j++){
                if(A[i] == A[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count==1){
                nonOccurNum = A[i];
            }
        }
        return nonOccurNum;
    }
}
