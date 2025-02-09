import Inventor.Book;
import Inventor.Depo;
import Inventor.Phone;

public class Main {
    public static void main(String[] args) {
        Depo<Book> bookObject = new Depo<>();
        bookObject.addItem(new Book("1984", "corc Oruel", "f"));

        Depo<Phone> phoneObject = new Depo<>();
        phoneObject.addItem(new Phone("Samsung", "12", 64));
        bookObject.showItem();

    }
}