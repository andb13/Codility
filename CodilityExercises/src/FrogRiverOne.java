import java.util.Arrays;

public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        
        int[] fallenLeafs = new int[X];
        

        for(int i=0; i<X; i++){
            System.out.println();
            System.out.println("fallenLeafs[i]: "+fallenLeafs[i]);
            for(int j=0; j<A.length; j++){
                System.out.println("i = "+i+" ,j = "+j+" ,A["+j+"] = "+(i+1)+"? "+A[j]);
                if(A[j] == (i+1)){
                    fallenLeafs[i] = j;
                    break;
                }
                fallenLeafs[i] = -1;
            }
            System.out.println("fallenLeafs[i]: "+fallenLeafs[i]);
            if(fallenLeafs[i] == -1){
                return -1;
            }
        }

        if(fallenLeafs[X-1] == 0 && X != 1){
            return -1;
        }
        else{
            Arrays.sort(fallenLeafs);
            return fallenLeafs[X-1];
        }
    }
}