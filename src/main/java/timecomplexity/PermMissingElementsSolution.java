package timecomplexity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by muthu on 19/09/2017.
 */
public class PermMissingElementsSolution {
    public static void main(String args[]){
        System.out.println(new PermMissingElementsSolution().solution(new int[]{2,3,1,5}));
    }

    public int solution(int[] A){
        int[] arr = IntStream.of(A).sorted().toArray();
        int missingValue=-1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]-arr[i-1]==2){
                missingValue = arr[i-1]+1;
            }
        }
        return missingValue;
    }
}
