public class PassingCars {
    
    public static int solution(int[] A){

        int crossedCars = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] == 0){
                for(int j=0; j<A.length; j++){
                    if(A[j] == 1 && j>i){
                        crossedCars++;
                    }
                    if(crossedCars > 1000000000) {
                        return -1;
                    }
                }
            }
        }
        
        return crossedCars;
    }

}
