import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Добавлено: " + item);
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Нужно добавить еще " +
                        (items.length - i) + " элемент(-а, -ов)");
            }
        }

        // int randomInt = 0;
        Random random = new Random();
        int randomInt = random.nextInt(items.length);


        return items[randomInt];
    }


}
