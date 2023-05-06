import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//Sorting Assignment
 class Sorting {
    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j + 1]) {
                  int temp = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j] = temp;

                }
            }
        }
        String m = Arrays.toString(arr);
        System.out.println(m);
    }

    static void insertionSort(int arr1[]){
        for(int i = 0; i<arr1.length; i++) {
            int j = i;
            while (j > 0 && arr1[j] > arr1[j - 1]) {
              int temp = arr1[j];
              arr1[j]= arr1[j-1];
              arr1[j-1] = temp;
              j--;
            }
        }
        String m = Arrays.toString(arr1);
        System.out.println(m);

        }


    static void selectionSort(int arr2[]){
        for(int i = 0; i<arr2.length; i++){
            int maxIdx = i;
            for(int j = i+1 ; j<arr2.length; j++){
                if(arr2[maxIdx]<arr2[j]){
                    maxIdx = j;
                }
            }
            if(maxIdx!=i){
               int temp = arr2[maxIdx];
               arr2[maxIdx] = arr2[i];
               arr2[i] = temp;
            }
        }
            String m = Arrays.toString(arr2);
        System.out.println(m);

    }

}

class BitManipulation  {
    // Linear time Complexity
    static void covertBinary(int no, ArrayList<Integer> m){
        if(no/2==1){
            m.add(no%2);
            m.add(1);
            printArr(m);
        }else {
            int bit = no % 2;
            m.add(bit);
            covertBinary(no/2, m);
        }
    }
    static void printArr(ArrayList x){
        Iterator x1 = x.iterator();
        int [] ans =new int[x.size()];
        int i = 0;
        while (x1.hasNext()){
            ans[i]= (int)x1.next();
            i++;
        }

        reverseArray(ans, 0, ans.length-1);
    }
    static void reverseArray(int [] arr, int first, int last){
        if(first>last){
            String m = Arrays.toString(arr);
            System.out.println(m);
            return;
        }else {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            reverseArray(arr, first+1, last-1);
        }
    }

    static void checkPowof2(int m, int ans, int remainder){
        if(remainder==0 && ans==1){
            System.out.println("it is a pow of two");
            return;
        } else if (remainder!=0 && ans ==1) {
            System.out.println("not a pow of two");
            return;
        }
        ans = m/2;
        remainder = m%2;
        checkPowof2(ans, ans, remainder);
    }
    static void checkOddorEven(int input){
        // all evens have their last bit 0 and all odds have their last bit 1
        if(input%2 == 0){
            System.out.println("even no");
        }
        if(input%2 == 1){
            System.out.println("odd no");
        }
    }
    static void findDuplicate(int[] arr){
        int low = 0;
        int high = arr.length;
        while(low<high){

        }
    }
}



