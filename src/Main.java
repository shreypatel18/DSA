


public class Main {
    public static void main(String[] args) {
       int [] x = {1,2,3,2,1,7};
       int [] x2 = {1,2,3,4,5};
       int [][] x3 = {{3,2,12}, {9,5,4}, {7,10,2}};
       int [][] x4 = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
       Assignment2.q4(x3);
       sumOfIdx.calcSum(x4, 1,1,2,2);
    Assignment1.findMaximum(x);
    Assignment1.findPeakElement(x);
    Rotation2D.Rotation(x3);
      Reversal.reverseArray(x2, 0, x2.length-1);
       MissingEle.checkMissing(x2);
       Palindrome.checkPalindrome(x, 0, x.length-1);
       checkDuplicate.check(x2);
        Assignment2.q1();
        Assignment2.q2(x3);
        Assignment2.q3(x3);
    }

}
class Palindrome{
    static void checkPalindrome(int[] m, int i, int x ){

        if(m[x]==m[i]){
            if(x==i){
                System.out.println(" a palindrome");
                return;
            }
            checkPalindrome(m, i+1, x-1);
        }else if(m[x]!=m[i]){
            if (x==i){
                System.out.println("not a palindrome");
            }
            System.out.println("not a palindrome");
        }
    }
}

class Reversal{
    static void reverseArray(int[] x, int first, int last){

        int temp = x[first];
        x[first] = x[last];
        x[last] = temp;
        if(first==last){
            for (int m: x) {
                System.out.println(" "+m+" ");
            }
        }else {
            reverseArray(x, first + 1, last - 1);
        }
    }
}
class MissingEle{
    int sum1;
    static void checkMissing(int[] arr){
        int sum1 = 0;

        int sum = ((arr.length+1)*(arr.length+2)/2);
        for (int m:
             arr) {
            sum1 = sum1+m;
        }
        int missingNo = sum-sum1;
        System.out.println(missingNo);
    }
}
class checkDuplicate{
    static void check(int [] arr){
        int[] map = new int[10];
        for (int j =0 ; j<map.length; j++) {
            map[j] = 0;
        }
        for(int i = 0; i<arr.length; i++){
            if(map[9-arr[i]]==0){
                map[9-arr[i]] = 1;
                if(i==arr.length-1){
                    System.out.println("no duplicates founded");
                }
            }else{
                System.out.println("duplicate founded"+" "+arr[i]);
                break;
            }
        }

    }
}
class Rotation2D{
    static void Rotation(int x[][]) {
        for(int i = 0 ; i<x.length; i++){
            for(int j = i; j<x[i].length; j++){

              int temp = x[i][j];
              x[i][j] = x[j][i];
              x[j][i] = temp;

            }
        }
       for (int i =0 ; i<x.length;i++){
          int left = 0;
          int right = x.length-1;
          while(left < right){
              x[i][left] = x[i][right];
              right--;
              left++;
          }
       }
       printArray(x);
    }
    static void printArray(int x[][]){
      for(int i=0; i<x.length; i++){
          for(int j =0; j<x[i].length; j++){
              System.out.print(" "+x[i][j]+" ");
          }
          System.out.println();
        }
    }
}

class sumOfIdx{    static  void calcSum(int x[][], int x1, int y1, int x2, int y2){
        int lenght = 0;
        int breadth= 0;
        if(x1<x2){
            lenght = (x2-x1) +1;
        } else if (x2<x1) {
            lenght = (x1 - x2) +1;
        }
        if(y1<y2){
            breadth = (y2-y1)+1;
        } else if(y2<y1){
            breadth = (y1-y2)+1;
        }
        int ans = lenght*breadth;
        System.out.println("ans is"+ ans);
    }

}