import java.util.Arrays;

public class TapeEquilibrium {
    
    public static int solution(int[] A){
        int[] differences = new int[A.length];

        for(int i=0;i<A.length;i++){
            differences[i] = calculateDifference(i+1, A);
        }

        Arrays.sort(differences);

        return differences[0];
    }

    private static int calculateDifference(int P, int[] A){
        int sumFirstPart = 0;
        int sumSecondPart = 0;

        for(int i=0;i<A.length;i++){
            if(i<P){
                sumFirstPart += A[i];
            }
            else{
                sumSecondPart += A[i];
            }
        }

        if(sumFirstPart > sumSecondPart){
            return sumFirstPart - sumSecondPart;
        }

        return sumSecondPart - sumFirstPart;
    }

}
