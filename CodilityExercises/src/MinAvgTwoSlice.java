import java.util.HashMap;

public class MinAvgTwoSlice {
    
    public static int solution(int[] A){

        double minAverage = 0;
        int initialPosition = 0;
        double average = 0;
        HashMap<Integer, Double> sliceStartingPosition = new HashMap<Integer, Double>();

        for(int i=0; i<A.length-2; i++){
            average = A[i]+A[i+1];
            average = average/2;
            sliceStartingPosition.put(i, average);
        }

        average = (A[A.length-2]+A[A.length-1])/2;

        sliceStartingPosition.put(A.length-2, average);

        System.out.println(sliceStartingPosition.toString());

        for(int i=0; i<A.length-2; i++){
            if(sliceStartingPosition.get(i) < minAverage || minAverage == 0){
                minAverage = sliceStartingPosition.get(i);
                initialPosition = i;
            }
        }

        return  initialPosition;

    }

}
