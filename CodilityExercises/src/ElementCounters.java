public class ElementCounters {
    
    public static int[] solution(int N, int[] A) {
        
        int[] counters = new int[N];
        int maxCounter = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] <= N) {
                counters[A[i] - 1]++;
                maxCounter = counters[A[i]-1];
            }
            else{
                setCountersToMax(maxCounter, counters);
            }
        }

        return counters;

    }

    private static int[] setCountersToMax(int maxCounter, int[] counters){
        for(int i = 0; i<counters.length; i++ ){
            counters[i]=maxCounter;
        }
        return counters;
    }

}
