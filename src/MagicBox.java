import java.util.Random;
import java.util.Scanner;

public class MagicBox<T> {
    protected T[] items;
    Scanner scanner = new Scanner(System.in);

    public MagicBox(int size) {
        items = (T[]) new Object[size];
        for (int i=0; i < size; i++) {
            System.out.println("Введите " + (i + 1) + " элемент");
            T input = (T) scanner.next();
            items[i] = input;
        }
        pick();

    }

    //public boolean add(T item) {

    //}

    public T pick() {

        int randomInt = 0;
        Random random = new Random();
        randomInt = random.nextInt(items.length);
        System.out.println("Случайный элемент из коробки: "
                        + items[randomInt]);

        return null;
    }


}
