package timecomplexity;

/**
 * Created by muthu on 19/09/2017.
 X = 10
 Y = 85
 D = 30
 */
public class FrogJumpSolutions {

    public static void main(String args[]){
        System.out.println(new FrogJumpSolutions().solution(10, 85, 30));
    }

    public int solution(int X, int Y, int D){
        int value=X+D;
        int count=1;
        while(value<Y){
            value = value+D;
            count++;
        }
        return count;
    }
}
