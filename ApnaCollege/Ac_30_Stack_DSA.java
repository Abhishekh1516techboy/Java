public class Ac_30_Stack_DSA {

    public  static class Node{
        int data;
        Node next;

//        constructor Node class...
        public Node(int d){
            this.data = d;
            next = null;
        }
    }

//    Static class...
    public static class Stack{
        public static Node head;

        public boolean isEmpty(){
            return head == null;
        }

//        push...
        public void push(int d){
            Node newnode = new Node(d);
            if (isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

//        pop...
        public int pop(){
            if (isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

//        peek...
        public int peek(){
            if (isEmpty()){
                return - 1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

         while (!stk.isEmpty()){
             System.out.print(stk.peek());
             stk.pop();
         }
    }
}
