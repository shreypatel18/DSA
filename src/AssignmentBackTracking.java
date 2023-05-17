import java.util.ArrayList;
import java.util.Arrays;

public class AssignmentBackTracking {
    static void subSets(int[] arr, int[] sol, int idx, ArrayList sols) {
        if(idx>=arr.length){
            System.out.println(Arrays.toString(sol));
            int sum = 0;
            for(int x : sol){
                sum+=x;
            }
            sols.add(sum);
            return;
        }
        int temp = sol[idx];
        sol[idx]=arr[idx];
        subSets(arr, sol, idx+1, sols);
        sol[idx]= temp;
        subSets(arr, sol, idx+1, sols);
    }

    static void printPermutations(int[] input, int stri, int endi){
        if(stri==endi){
            System.out.println(Arrays.toString(input));
            return;
        }
        for(int i = stri; i<endi; i++) {
            int temp = input[stri];
            input[stri] = input[i ];
            input[i] = temp;
            printPermutations(input, stri+1, endi);
            int temp1 = input[stri];
            input[stri] = input[i];
            input[i] = temp1;

        }
    }
}
