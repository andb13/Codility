import java.util.*;

public class Task1 {
    public static int solution(int num){
        System.out.println(num);
        String binaryNum = Integer.toBinaryString(num);
        System.out.println(binaryNum);
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
