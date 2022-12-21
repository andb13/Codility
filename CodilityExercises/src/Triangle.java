public class Triangle {
    
    public static int solution(int[] A){

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                for(int k=0; k<A.length; k++){
                    if(i != j && j != k && i != k){
                        if(
                            A[i] + A[j] > A[k] && 
                            A[j] + A[k] > A[i] && 
                            A[k] + A[i] > A[j]
                        ){
                            return 1;
                        }
                    }
                }
            }
        }

        return 0;
    }

}
