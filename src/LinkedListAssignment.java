import java.security.Key;

public class LinkedListAssignment {
    Node Head;
    class Node{
        Node next;
        int Data;
        Node(int D){
            Data = D;
        }
    }
    void InsertionAtEnd(int data){

        if(Head==null){
            Head = new Node(data);
        }else{
            Node x = new Node(data);
            x.next = null;
            Node temp = Head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = x;
            return;
        }
    }
    void InsertionAtBegin(int data){
        Node x = new Node(data);
        x.next = Head;
        Head = x;
    }
    void  InsertionAtAny(int data, int position) {
        Node temp = Head;
        int track = 0;
        Node x = new Node(data);
        while (track <= position-1) {
            if(track==position){
                break;
            }
            temp = temp.next;
            track++;
        }
        Node y = temp.next;
        temp.next = x;
        x.next = y;
    }

    void display(){
        Node temp = Head;
        while(temp!=null){
            System.out.print(" "+temp.Data+" ");
            temp = temp.next;
        }
    }
}

 class Quetions extends LinkedListAssignment{
    LinkedListAssignment x1;
    Quetions(LinkedListAssignment x){
        x1 = x;
    }

    void findKey(int key){
        Node temp =x1.Head;
        while(temp.next!=null){
            if(temp.Data== key){
                System.out.println("founded key");
                return;
            }
            temp = temp.next;
            if(temp.Data== key){
                System.out.println("founded key");
                return;
            }
        }
        System.out.println("key not founded");
    }

    void delDuplicates(){
        Node temp1 =x1.Head;

while(temp1.next!=null){
    Node temp2 = temp1.next;
    if(temp2==null){
        if(temp2.Data == temp1.Data){
            temp1.next = null;
        }else{
            break;
        }
    }
    while (temp2.next!=null){
        if(temp1.Data == temp2.Data){
            temp1.next = temp2.next;
        }
        temp2 = temp2.next;
    }
    temp1 = temp1.next;
}
    }

  void sumList(LinkedListAssignment A, LinkedListAssignment B){

        LinkedListAssignment sumList = new LinkedListAssignment();
        int count1 = countDigits(A);
        int count2 = countDigits(B);
        int sum1  = getSum(A, count1);
        int sum2  = getSum(B, count2);
        int finalSum = sum1+sum2;
        int temp = 1;
        while(finalSum!=0){
          int x = (int) (finalSum%Math.pow(10, 1));
          finalSum= (int) (finalSum/Math.pow(10, 1));
          sumList.InsertionAtBegin(x);
          temp++;
        }
          sumList.display();
  }
  int countDigits(LinkedListAssignment x){
        int count = 0;
        Node temp = x.Head;
        while(temp.next!= null){
            count++;
            temp = temp.next;
        }
        return count++;
  }
  int getSum(LinkedListAssignment x, int count){
        int sum = 0;
        Node temp = x.Head;
        while(temp.next!=null){

            sum+= Math.pow(10, count)*temp.Data;

            count--;
            temp = temp.next;
            if(temp.next== null){
                sum+=temp.Data;
            }
        }
        return sum;

  }

  void checkPalindrome(LinkedListAssignment m){
   LinkedListAssignment x = reverseLinkedList(m);
   LinkedListAssignment y = m;
   Node a = x.Head, b= y.Head;
   while(a.next!=null ){
       if(a.Data!=b.Data){
           System.out.println("not a palindrome");
           return;
       }
       a= a.next;
       b= b.next;
       if(a.next==null){
           if(a.Data!=b.Data){
               System.out.println("not a palindrome");
               return;
           }
       }
   }
      System.out.println("a palindrome");
  }
  LinkedListAssignment reverseLinkedList(LinkedListAssignment m){
        Node x1 = m.Head;
        Node x2 = m.Head;

        while(x1.next != null && x1.next.next!=null){
            x1 = x1.next.next;
            x2 = x2.next;
        }

        LinkedListAssignment half = new LinkedListAssignment();

        Node temp = x2.next;
        while(temp.next!=null){

           half.InsertionAtBegin(temp.Data);
           temp= temp.next;
           if(temp.next==null){
               half.InsertionAtBegin(temp.Data);
           }
        }

      return half;
  }

 }

