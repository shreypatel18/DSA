import java.util.Scanner;

class Assignment1{
    static void sumOfEvenIdx(int[] arr){
        int sum = 0;
     for(int i =0; i<arr.length; i+=2){
       sum+=arr[i];
     }
        System.out.println("sum");
    }

    static void printEvenElements(int []arr){
        for(int m: arr){
            if(m%2==0){
                System.out.print(" "+m+" ");
            }
        }
    }
  static  void findMaximum(int []arr){
        int temp = 0;
        for(int i=0; i<arr.length-1; i++){
          if(arr[i]>arr[i+1]){
              temp = arr[i];
              arr[i] = arr[i+1];
              arr[i+1] =temp;
          }
        }
      System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);
    }

  static void findPeakElement(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                System.out.println(arr[i]);
            }
        }
  }
}

class Assignment2{
    static void q1(){
        int m,n, noOfpositive=0, noOfNegative=0, noOfZero = 0, noOfEven=0, noOfOdd = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter m");
        m = s.nextInt();
        s.reset();
        System.out.println("enter n");
        n = s.nextInt();
        s.reset();
        int inputArr[][] = new int[m][n];
        for(int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                inputArr[i][j] = s.nextInt();
                s.reset();
            }
        }
        for(int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                int m1 = inputArr[i][j];
                if(m1==0){noOfZero++;}
                if(m1%2==0){noOfEven++;}
                if(m1%2 != 0){noOfOdd++;}
                if(m1<0){noOfNegative++;}
                if(m1>0){noOfpositive++;}
            }
        }
        System.out.println("no of positives "+noOfpositive);
        System.out.println("no of odds "+noOfOdd);
        System.out.println("no of evens "+noOfZero);
        System.out.println("no of even "+noOfEven);
        System.out.println("no of negatives "+noOfNegative);
    }

    static void q2(int arr[][]){
        System.out.println("secondary diagonal");
        for(int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr.length; j++){
               if(i+j==arr.length-1){
                   System.out.println(" "+ arr[i][j]+ " ");
               }
            }
        }
    }
    static void q3(int arr[][]){
        System.out.println("primary diagonal");
        for(int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr.length; j++){
                if(i==j){
                    System.out.println(" "+ arr[i][j]+ " ");
                }
            }
        }
    }
    static void q4(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length-1; j++){
                if(arr[i][j]>arr[i][j+1]){
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j+1];
                    arr[i][j+1] = temp;
                }
            }

            for(int m =0; m< arr.length-1; m++){
                if(arr[m][arr[m].length-1]>arr[m+1][arr[m].length-1]){
                    int temp = arr[m][arr[m].length-1];
                    arr[m][arr[m].length-1] = arr[m+1][arr[m].length-1] ;
                    arr[m+1][arr[m].length-1]  = temp;
                }
            }

        }
        System.out.println(arr[arr.length-1][arr[arr.length-1].length-1]);
    }


}


