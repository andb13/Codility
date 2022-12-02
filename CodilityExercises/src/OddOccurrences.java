import java.util.Arrays;

public class OddOccurrences {
    public static int solution(int[] A) {
        int length = A.length;
        int nonOccurNum = 0;
        for(int i=0; i<length; i++){   
            int count = 0;        
            for(int j=0; j<length;j++){
                if(A[i]==A[j]){
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
