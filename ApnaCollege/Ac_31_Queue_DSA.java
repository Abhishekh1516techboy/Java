import java.util.LinkedList;
import java.util.Queue;

public class Ac_31_Queue_DSA {

//    Queue class...
    public static class Queues{
        static int [] arr;
        int size;
        static int rear = -1;

//        constructor Queue class...
    public Queues(int n){
        arr = new int[n];
        this.size = n;
    }

    public  boolean isEmpty(){
        return rear == -1;
    }

    //  enqueue add..
    public void add(int d){
        if (rear == size -1){
            System.out.println("Full Queue...");
            return;
        }
        rear++;
        arr[rear] = d;
    }

//    dequeue remove...
    public  int remove(){
        if (isEmpty()){
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

//    peek...
    public int peek(){
        if (isEmpty()){
            System.out.println("Empty queue...");
            return -1;
        }
        return arr[0];
    }

}

    public static void main(String[] args) {
            Queues q = new Queues(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);

            while (!q.isEmpty()){
                System.out.print(q.peek());
                q.remove();
            }

//            ---------------------------------------------------------
//                               Collection Framework
//            ---------------------------------------------------------

            Queue<Integer> que = new LinkedList<>();
        System.out.println(que);

    }
}
