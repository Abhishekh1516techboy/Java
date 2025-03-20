import java.util.LinkedList;

public class Ac_27_LinkedList_DSA {
    Node head;
    private int size;

//    constructor Ac_27_LinkedList_DSA class...
    public Ac_27_LinkedList_DSA(){
        this.size = 0;
    }

//    Node class...
  public class Node{
        String data;
        Node next;

//      constructor Node class...
        public Node(String d){
            this.data = d;
            this.next = null;
            size++;
        }
    }

//    addFirst method...
    public void addFirst(String d){
        Node newNode = new Node(d);
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

//    addLast method...
public void addLast(String d){
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

    public static void main(String[] args) {
        Ac_27_LinkedList_DSA list = new Ac_27_LinkedList_DSA();

        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("List");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst(); // deleteFirst...
        list.printList();

        list.deleteLast(); // deleteLast...
        list.printList();

        System.out.println("Size of Node: " + list.getSize());// getSize of List...
        list.addFirst("this");
        list.printList();
        System.out.println("Size of Node: " + list.getSize());// getSize of List...

//        ---------------------------------------------------------------------
//                            Collection FrameWork
//        ---------------------------------------------------------------------
        System.out.println("----------Collection FrameWork---------");

        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("a");
        ll.addFirst("is");
        System.out.println(ll);

        ll.addFirst("This");
        System.out.println(ll);

        ll.addLast("list");
        System.out.println(ll);

        ll.add(3, "new");
        System.out.println(ll);

        ll.set(3, "Original");
        System.out.println(ll);

        ll.remove(3);
        System.out.println(ll);

        System.out.println("Size of Node: "+ ll.size());

        for (Object i: ll){
            System.out.print(i +" ");
        }

        System.out.println("\n"+ ll.getFirst());
        System.out.println("\n"+ ll.getLast());


    }
}
