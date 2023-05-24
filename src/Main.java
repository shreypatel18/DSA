import java.util.ArrayList;
import java.util.Arrays;

public class Main {

     public static int findOddOccuring(int[] arr)
    {
        int xor = 0;
        for (int i: arr) {
            xor = xor ^ i;
        }
        return xor;
    }
    public static void main(String[] args) {

//    LinkedListAssignment x = new LinkedListAssignment();
//    x.InsertionAtEnd(1);
//    x.InsertionAtEnd(1);
//    x.InsertionAtBegin(2);
//    x.InsertionAtBegin(2);

//     Quetions x1 = new Quetions(x);
//     x1.delDuplicates();
//     x1.display();
//        LinkedListAssignment a = new LinkedListAssignment();
//        LinkedListAssignment b = new LinkedListAssignment();
//        a.InsertionAtEnd(5);
//        a.InsertionAtEnd(6);
//        a.InsertionAtEnd(3);
//        b.InsertionAtEnd(8);
//        b.InsertionAtEnd(4);
//        b.InsertionAtEnd(2);
//        Quetions x1 = new Quetions(a);
//        x1.sumList(a, b);

        LinkedListAssignment m = new LinkedListAssignment();
        m.InsertionAtBegin(4);
        m.InsertionAtBegin(2);
        m.InsertionAtBegin(2);
        m.InsertionAtBegin(4);
        Quetions g = new Quetions(m);
        g.checkPalindrome(m);



//         int e =findOddOccuring(new int[]{7,7,1,1,1,2,2,4,4,5,5,5,5});
//        System.out.println(e);
////        System.out.println(5346%10);
//       int [] x = {3,4,2,1,5};
//       int [] x2 = {1,1,1,2,2,1};
//       int [][] x3 = {{3,2,12}, {9,5,4}, {7,10,2}};
//
//       int [][] x4 = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}};

//       int j = 0^6;
//        System.out.println(j);
//       BitManipulation.checkOddorEven(5);
//       BitManipulation.covertBinary(123, new ArrayList());
//        BitManipulation.checkPowof2(32, 0, 0);
//       Sorting.selectionSort(x);

      // Sorting.bubbleSort(x);
       // Sorting.insertionSort(x);
//
// Sorting.selectionSort(x);
//       Sorting.insertionSort(x);
//       BinarySearch.square(26);
//    Boolean m = BinarySearch.checkPerfectSquare(9);
//        System.out.println(m);
//       int result = BinarySearch.lowBound(x2, 0, x2.length, 2);
//        System.out.println(result)BinarySearch.square(12);
//       BinarySearch.lowBound(x2, 0, x2.length-1, 3, -1);
//       BinarySearch.binarySearch(x2, 0, x2.length-1, 3);
//       Assignment2.q4(x3);
//       sumOfIdx.calcSum(x4, 1,1,2,2);
//    Assignment1.findMaximum(x);
//    Assignment1.findPeakElement(x);
//    Rotation2D.Rotation(x3);
//      Reversal.reverseArray(x2, 0, x2.length-1);
//       MissingEle.checkMissing(x2);
//       Palindrome.checkPalindrome(x, 0, x.length-1);
//       checkDuplicate.check(x2);
//        Assignment2.q1();
//        Assignment2.q2(x3);
//        Assignment2.q3(x3);
    }

}
