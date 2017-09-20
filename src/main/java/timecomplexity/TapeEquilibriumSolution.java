package timecomplexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

//Solution by MS
class TapeEquilibriumSolution {

    public static void main(String args[]){
        System.out.println(new TapeEquilibriumSolution().solution(new int[]{3,1,2,4,3}));
    }

    public int solution(int[] A){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(A!=null && A.length>1){
            for(int i=1; i<A.length; i++){
                int firstSum = IntStream.of(Arrays.copyOfRange(A, 0, i)).sum();
                int secondSum = IntStream.of(Arrays.copyOfRange(A, i, A.length)).sum();
                arr.add(Math.abs(firstSum-secondSum));
            }
        }
        return Collections.min(arr);
    };

}