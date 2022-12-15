public class GenomicRangeQuery {
    
    public static int[] solution(String S, int[] P, int[] Q){
        
        int[] queries = new int[P.length];
        
        for(int i=0; i<P.length; i++){
            for(int j=P[i]; j<=Q[i]; j++){
                int impactFactor = calculateImpactFactor(S.charAt(j));
                if(impactFactor<queries[i] || queries[i] == 0){
                    queries[i] = impactFactor;
                }
            }
        }

        return queries;
    }

    private static int calculateImpactFactor(char nucleotide){
        switch (nucleotide) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
                return 4;
        }
        return 0;
    }

}
