import java.util.*;

public class MaxProductOfThree {
    
    public static int solution(int[] A){

        int position = 0;
        HashMap<Integer, Integer> tripletProduct = new HashMap<>();
        
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                for(int k=0; k<A.length; k++){
                    if(i != j && j != k && i != k){
                        tripletProduct.put(position, A[i]*A[j]*A[k]);
                        position++;
                    }
                }
            }
        }

        int maxProduct = tripletProduct.get(0);

        for(int i=1; i<position; i++){
            if(tripletProduct.get(i) > maxProduct){
                maxProduct = tripletProduct.get(i);
            }
        }

        return maxProduct;
    }

}
