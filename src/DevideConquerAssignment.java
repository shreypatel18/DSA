import java.util.ArrayList;

class obj{
    int value;
    int next;
    obj(int m, int n){
        this.value = m;
        this. next = n;
    }
}
public class DevideConquerAssignment{
    public  static void main(String args[]){
            q1linearSwap(new int[]{3, 8, 6, 7, 5, 9, 10});
            q2SepPosNeg(new int[] {19,-20,7,-4,-13,11,-5,3});
            int[] k = {19,-20,7,-4,-13,11,-5,3};
            q3SepPosNegmaintainOrder(k, 0, k.length -1);
            display(k);
            Q4(new int[]{1,1,2,2}, new int[]{3,3,3,4}, 5);
            DevideConquerAssignment x = new DevideConquerAssignment();
            x.q5(new int[][]{{1, 3}, {2, 9}, {4, 6}, {10, 13}});


    }
    //helping fuctions

    static void display(int[] arr){
        for(int m : arr){
            System.out.print(" "+m+" ");
        }
    }

    static void inverse(int []arr){
        int low = 0;
        int high = arr.length-1;
        for(int i = 0; i< (arr.length/2); i++){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }
    }
    static void q1linearSwap(int[] arr){
        int x = -1;
        int y = -1;
        for(int i = 0; i<arr.length-1; i++){
            if(x!=-1 && arr[i]>arr[i+1]){
                y = i+1;
            }
            if(arr[i]>arr[i+1] && x==-1){
                x = i;
            }

        }
      if(x!=-1 && y!= -1){

        int temp = arr[x];
        arr[x]   = arr[y];
        arr[y]   = temp;
        display(arr);
        }
    }
// Questions

    static void q2SepPosNeg(int[] arr){
        int i=0;
        for(int j = 0; j<arr.length; j++){
            if(arr[j]<0){

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }

        display(arr);
    }

    static void q3SepPosNegmaintainOrder(int[] arr, int low, int high){
        if(low<high) {
            int mid = low + (high - low) / 2;
            q3SepPosNegmaintainOrder(arr, low, mid);
            q3SepPosNegmaintainOrder(arr, mid + 1, high);
            merging(arr, low, high, mid);
        }
    }
    static void merging(int[] arr, int low, int high, int mid){
        int size1 = mid-low+1;
        int size2 = high-mid;
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        int low1 = low;
        for(int i = 0; i<size1; i++){
            arr1[i] = arr[low1];
            low1++;
        }
        int low2 = mid+1;
        for(int i = 0; i<size2; i++){
            arr2[i] = arr[low2];
            low2++;
        }
        int h = 0;
        int h1 = 0;
        int k1 = 0;
        int k = 0;
        int ma = low;
        while (h1<size1 && k1<size2){
            if(arr1[h]<0){
                arr[ma] = arr1[h];
                h++;
                ma++;
                h1++;
            }else {
                h1++;
                if(arr2[k]<0){
                    arr[ma] = arr2[k];
                    k++;
                    ma++;
                    k1++;
                }else {
                    k1++;
                }
            }

        }
        while (h<size1){
            arr[ma] = arr1[h];
            ma++;
            h++;
        }
        while (k<size2){
            arr[ma] = arr2[k];
            ma++;
            k++;
        }
    }

    static void Q4(int arr1[], int arr2[], int k){
        Boolean ans = true;
        int size = arr1.length;
        for(int i = 0; i<arr1.length; i++ ){
            if(arr1[i]+arr2[size-1]<k){
                ans = false;
            }
            size--;
        }
        if(ans){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }


     void q5(int[][] arr1){

       Boolean ans = true;
        obj x[] = new obj[arr1.length];
        for(int i = 0; i<arr1.length; i++){
           obj x1 = new obj(arr1[i][0], arr1[i][1]);
           x[i] = x1;
        }

        devide(x, 0, arr1.length-1);

        int idx = 0;
        while(idx<arr1.length-1){
            if(x[idx].next>x[idx+1].next){
                ans = false;
                System.out.println("yes multiple range");
                return;
            }
            idx++;
         }
        if(ans){
            System.out.println("no multiple ranges");
        }
    }

    static void mergeSort(obj arr1[]){

        devide(arr1, 0, arr1.length-1);
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
    static void devide(obj []arr1, int low, int high){
        if(low<high ) {
            int mid = low + (high - low) / 2;
            devide(arr1, low, mid);
            devide(arr1, mid + 1, high);
            merge(low, high, mid, arr1);
        }
    }
    static void merge(int low, int high, int mid, obj []arr){
        int lw = low;
        int x = mid+1; // for copying
        int low1 = low;
        int high1 = high;
        int size1 = mid-low1+1;
        int size2 = high1 - mid;
        obj arr1[] = new obj[size1];
        obj arr2[] = new obj[size2];
        for(int i = 0 ; i< size1; i++){
            arr1[i] = arr[low];
            low++;
        }
        for(int i = 0 ; i< size2; i++){
            arr2[i] = arr[x];
            x++;
        }
        int p=0;
        int q=0;
        while(p<size1 && q<size2){
            if(arr1[p].value <arr2[q].value){
                arr[lw] = arr1[p];
                p++;
            }else {
                arr[lw] = arr2[q];
                q++;
            }
            lw++;
        }
        while (p<size1){
            arr[lw] = arr1[p];
            p++;
            lw++;
        }
        while (q<size2){
            arr[lw] = arr2[q];
            q++;
            lw++;
        }
    }

}