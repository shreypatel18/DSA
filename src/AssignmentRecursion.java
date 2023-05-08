import java.util.Map;

public class AssignmentRecursion {

    static int sumofDigits(int n, int sum){
        if(n%10==n){
            sum+=n;
            System.out.println(sum);
            return sum;
        }else{
            int x = n%10;
            sum+=x;
            n = (int) ((int) n*0.1);
            return  sumofDigits(n, sum);
        }
    }

    static int sumOfSeries(int n){
        int sum = 1;
        int pairs = 0;
        if(n%2==0){
             pairs = (n/2)-1;
             sum +=pairs;
             sum=sum-n;
        }else{
            pairs = n/2;
            sum += pairs;
        }
        return sum;
    }

    static void maxValueOfArray(int[] arr, int i, int largest){
        if(i>(arr.length-2)){
            System.out.println(largest);
            return;
        }
        if(largest<arr[i+1]){
            largest = arr[i+1];
        }
        maxValueOfArray(arr, i+1, largest);
    }



}
class ArmstrongDigit{
    int noOfDigits = 0;
    int i = 0;
     void checkArmStrong(int n){
        if(n%10==n){
            i++;
            this.noOfDigits = i;
            armStrongNo(n, 0, n);
        }else{
            n = (int) (n*0.1);
            i++;
           checkArmStrong(n);
        }
    }

     void armStrongNo(int n, int sum, int temp){

        if(temp%10==temp){
            int x = (int) Math.pow( temp,noOfDigits );
            sum+=x;
            if(sum==n){
                System.out.println("its an armstrong no");
            }else {
                System.out.println("not a armstrong no");
            }
            return;
        }else{
            int x = (int) Math.pow(temp%10,noOfDigits);
            sum=sum+x;
            temp = (int) (temp*0.1);
            armStrongNo(n, sum,  temp);
        }
    }
}
