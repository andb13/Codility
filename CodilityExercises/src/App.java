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
            //PermMissingElem
        /*int[] A = {2,3,1,5};
        System.out.println(MissingElement.solution(A));*/
            //TapeEquilibrium
        /*int[] A = {3,1,2,4,3};
        System.out.println(TapeEquilibrium.solution(A));*/
            //FrogRiverOne
        /*int[] A = {1,3,1,4,2,3,5,4};
        int[] A = {1,2,3,5,3,1};
        System.out.println(FrogRiverOne.solution(5, A));*/
            //PermCheck
        /*int[] A = {4,1,3};
        System.out.println(PermutationCheck.solution(A));*/
            //MaxCounters
        /*int[] A = {1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,3,4};
        int[] solucion = ElementCounters.solution(2,A);
        System.out.println("Solucion:");
        for (int i : solucion) {
            System.out.println(i);
        }*/
            //MissingInteger
        /*int[] A = {1,2,3};
        int[] A = {1,3,6,4,1,2};
        System.out.println(MissingInteger.solution(A));*/
            //PassingCars
        /*int[] A = {0,1,0,1,1};
        System.out.println(PassingCars.solution(A));*/
            //CountDiv
        //System.out.println(CountDiv.solution(0, 0, 11));
            //GenomicRangeQuery
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        int[] solucion = GenomicRangeQuery.solution("CAGCCTA", P, Q);
        for (int i : solucion) {
            System.out.println(i);
        }
    }
}
