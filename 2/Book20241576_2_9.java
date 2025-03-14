import java.util.ArrayList;

class Book {
    String number;
    String name;
    double price;
    String status;

    public Book(String number, String name, double price, String status) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public void show() {
        System.out.println(number + ", " + name + ", " + price + ", " + status);
    }
}

class Books {
    static ArrayList<Book> bookList = new ArrayList<>();
}

class Admin {
    String number;
    String name;

    public Admin(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public void addNewBook(Book abook) {
        Books.bookList.add(abook);
    }

    public void lendBook(Reader aReader, Book aBook) {
        BorrowOrderItem theborrow = new BorrowOrderItem(aReader, aBook);
        BorrowOrder.borrowList.add(theborrow);
        aBook.status = "外借";
    }

    public void returnBook(Reader aReader, Book aBook) {
        for (int i = 0; i < BorrowOrder.borrowList.size(); i++) {
            if (BorrowOrder.borrowList.get(i).aReader == aReader && BorrowOrder.borrowList.get(i).aBook == aBook) {
                BorrowOrder.borrowList.remove(i);
                break;
            }
        }
        aBook.status = "在库";
    }
}

class Reader {
    String readerNum;
    String readerName;
    String college;

    public Reader(String readerNum, String readerName, String college) {
        this.readerNum = readerNum;
        this.readerName = readerName;
        this.college = college;
    }
}

class BorrowOrderItem {
    Reader aReader;
    Book aBook;

    public BorrowOrderItem(Reader aReader, Book aBook) {
        this.aReader = aReader;
        this.aBook = aBook;
    }

    public void show() {
        System.out.println(aReader.college + ", " + aReader.readerNum + ", " + aReader.readerName + ", " + aBook.name);
    }
}

class BorrowOrder {
    static ArrayList<BorrowOrderItem> borrowList = new ArrayList<>();
}

public class Book20241576_2_9 {
    public static void main(String[] args) {
        Book abook1 = new Book("BOOK001", "C语言程序设计", 35, "在库");
        Book abook2 = new Book("BOOK002", "JAVA语言程序设计", 25, "在库");

        Admin admin1 = new Admin("001", "周华");
        Reader reader1 = new Reader("STU001", "张兰", "软件工程");

        admin1.addNewBook(abook1);
        admin1.addNewBook(abook2);

        admin1.lendBook(reader1, abook1);
        admin1.lendBook(reader1, abook2);

        for (Book book : Books.bookList) {
            book.show();
        }

        for (BorrowOrderItem item : BorrowOrder.borrowList) {
            item.show();
        }

        admin1.returnBook(reader1, abook1);

        System.out.println("还书后：");
        for (Book book : Books.bookList) {
            book.show();
        }

        for (BorrowOrderItem item : BorrowOrder.borrowList) {
            item.show();
        }

        for (Book book : Books.bookList) {
            if (book.name.equals("C语言程序设计")) {
                book.show();
            }
        }
    }
}