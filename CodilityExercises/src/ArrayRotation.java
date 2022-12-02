public class ArrayRotation {
    public static int[] solution(int[] A, int K){
        for(int i = 0; i < K; i++){
           rotateArrayByOne(A);
        }
        return A;
    }

    public static void rotateArrayByOne(int array[]){
        int length = array.length;
        int tmp = array[length-1];
        for(int i = length-1; i > 0; i--){
            array[i] = array [i-1];
        }
        array[0] = tmp;
    }
}
