public class Ac_28_Reverse_LinkedList  {
    Node head;
    private int size;

    //    constructor Ac_28_Reverse_LinkedList class...
    public Ac_28_Reverse_LinkedList(){
        this.size = 0;
    }

    //    Node class...
    public class Node{
        int data;
        Node next;

        //      constructor Node class...
        public Node(int d){
            this.data = d;
            this.next = null;
            size++;
        }
    }

    //    addFirst method...
    public void addFirst(int d){
        Node newNode = new Node(d);
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //    addLast method...
    public void addLast(int d){
        Node newNode = new Node(d);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // printList method...
    public void printList(){
        if (head == null){
            System.out.println("List is Empty...");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //    deleteFirst method...
    public void deleteFirst(){
        if (head == null){
            System.out.println("This list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //    deleteLast method...
    public void deleteLast(){
        if (head == null){
            System.out.println("This list is empty");
            return;
        }

        size--;
        if (head.next == null ){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //    getSize method...
    public int getSize(){
        return size;
    }

//    reverseIterate method...
    public void reverseIterate(){
        if (head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

//            Update...
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

//    reverseRecursive method...
    public Node reverseRecursive(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args) {
        Ac_28_Reverse_LinkedList list = new Ac_28_Reverse_LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();

        System.out.println(".........ReverseIteration........");
        list.reverseIterate();
        list.printList();

        System.out.println(".........ReverseRecursive........");
        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}

