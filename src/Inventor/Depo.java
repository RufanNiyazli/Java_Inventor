package Inventor;

import java.util.ArrayList;
import java.util.List;

public class Depo<T> {
    List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void showItem() {
        for (T item : items) {
            System.out.println(item);
        }
    }

}
