import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько элементов в коробке?");
        int size = scanner.nextInt();

        new MagicBox(size);



    }
}
