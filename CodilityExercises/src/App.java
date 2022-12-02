public class App {
    public static void main(String[] args) throws Exception {
            //Binary Gap runs
        /*System.out.println(BinaryGap.solution(1041)+"\n");
        System.out.println(BinaryGap.solution(15)+"\n");
        System.out.println(BinaryGap.solution(32)+"\n");
        System.out.println(BinaryGap.solution(9)+"\n");
        System.out.println(BinaryGap.solution(529)+"\n");
        System.out.println(BinaryGap.solution(10003)+"\n");
        System.out.println(BinaryGap.solution(102)+"\n");
        System.out.println(BinaryGap.solution(13)+"\n");*/
            //Array Rotation run
        int[] A = {3, 8, 9, 7, 6};
        ArrayRotation.solution(A, 3);
        //Print numbers
        int length = A.length;
        for(int j=0; j<length; j++){
            System.out.println(A[j]);
        }
    }
}
