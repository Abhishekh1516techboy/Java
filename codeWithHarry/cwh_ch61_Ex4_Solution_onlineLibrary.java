// create Library class...
class Library {
   public String[] books;
   public int numOfBooks;

    // create constructor of Lirary class...
   public Library() {
        this.books = new String[100];
        this.numOfBooks = 0; 
    }

    // create methods...
    public void addBook(String book) {
        this.books[numOfBooks] = book;
        numOfBooks++;
        System.out.println(book + " has been added!");
    }

    public void showAvailableBooks() {
        int count = 1;
        System.out.println("==========================");
        System.out.println("Available Books are:-");
        System.out.println("==========================");
        for (String book : this.books) {
            if (book==null) {
                continue;
            }
            System.out.println(count++ +"."+ book);
        }
    }

    public void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i]==book) {
                System.out.println("---------------------------");
                System.out.println(book +" Book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println(book + " Book does not exists...");
    }

    public void returnBook(String book) {
        System.out.println("---------------------------");
        addBook(book);
    }

}

public class cwh_ch61_Ex4_Solution_onlineLibrary {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Java");
        centralLibrary.addBook("python");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("JavaScript");
        centralLibrary.showAvailableBooks(); 
        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks(); 
        centralLibrary.returnBook("computer");
        centralLibrary.showAvailableBooks(); 
    }
}