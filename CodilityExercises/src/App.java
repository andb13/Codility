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
        /*int[] A = {3, 8, 9, 7, 6};
        ArrayRotation.solution(A, 3);
        //Print numbers
        int length = A.length;
        for(int j=0; j<length; j++){
            System.out.println(A[j]);
        }*/
            //Non Occur Number
        /*int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(OddOccurrences.solution(A));*/
            //Frog jumps
        /*int x = 10;
        int y = 85;
        int d = 30;
        System.out.println(FrogJump.solution(x,y,d));*/
            //MaxCounters
        int[] A = {3,4,4,6,1,4,4};
        int[] solucion = ElementCounters.solution(5,A);
        for (int i : solucion) {
            System.out.println(i);
        }
    }
}
