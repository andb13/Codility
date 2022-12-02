public class FrogJump {
    public static int solution(int X, int Y, int D) {
        int jumps = 0;
        for(;X<Y; X+=D){
            jumps++;
        }
        return jumps;
    }
}
