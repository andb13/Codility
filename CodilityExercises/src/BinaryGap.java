import java.util.*;

public class BinaryGap {
    public static int solution(int num){
        String binaryNum = Integer.toBinaryString(num);
        int maxCont = 0;
        List<Integer> counters = new ArrayList<>();
        for(int i = 0; i < binaryNum.length(); i++){
            char current = binaryNum.charAt(i);
            if (current == '0') {
                maxCont++;
            }
            else {
                counters.add(maxCont);
                maxCont = 0;
            }
        }
        return Collections.max(counters);
    }
}
