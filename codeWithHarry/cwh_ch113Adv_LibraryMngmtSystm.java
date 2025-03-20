/*
 * Create Library Management System which is capable of issuing books to the students.
 * Book should have info Like:-
 * 1.Book Name
 * 2.Book Author
 * 3.Issued To
 * 4.Issued On
 * 5.Issued Date
 * User should be able to add books, and return issued books, issue books
 * Assume that all the users are registered with their names in the control Database.
 */

import java.util.ArrayList;

//create Book class...
class Book{
    public String name, author;

    //    create constructor...
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "\nBook: "+"\""+name+"\""+ " | "+"Author: "+"\""+author+"\"";
    }
}

//create MyLibrary class...
class MyLibrary{
//    create ArrayList...
    public ArrayList<Book> books;

    //    create constructor of MyLibrary...
    public MyLibrary(ArrayList<Book> books) {
       this.books = books;
    }

//    create  addBook method...
    public void addBook(Book book ){
        System.out.println("This book has been Added to the Library.");
        this.books.add(book);
    }

//    create  issueBook method...
    public void issueBook(Book book, String issued_to ){
        System.out.println(book+" has been Issued from the Library to "+"\""+issued_to+"\".");
        this.books.remove(book);
    }

//    create  returnBook method...
    public void returnBook(Book rb){
        System.out.println(rb+" book has been Returned by User.");
        this.books.add(rb);
    }

}

public class cwh_ch113Adv_LibraryMngmtSystm {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 =new Book("Algorithms", "Steffen");
        bk.add(b1);
        Book b2 =new Book("Java", "James Gosling");
        bk.add(b2);
        Book b3 =new Book("Python", "Devs");
        bk.add(b3);
        Book b4=new Book("JavaScript", "Tom Alen");
        bk.add(b4);
        Book b5=new Book("Data Science", "Dani riche");
        bk.add(b5);
        MyLibrary myl = new MyLibrary(bk);
        myl.addBook(new Book("C++", "Danee recher"));
        System.out.println(myl.books);
        myl.issueBook(b3,"Abhishekh");
        System.out.println(myl.books);
        myl.returnBook(b3);
        System.out.println(myl.books);
    }
}
