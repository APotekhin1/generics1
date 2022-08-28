public class Main {
    public static void main(String[] args) {
        System.out.println("Коробка со строками: ");
        MagicBox<String> magicBox = new MagicBox<>(3);
        magicBox.add("Super");
        magicBox.add("Veter");
        magicBox.add("Poker");
        String pick = magicBox.pick();
        System.out.println("Случайный элемент: " + pick);

        System.out.println("Коробка с цифрами: ");
        MagicBox<Integer> magicBox1 = new MagicBox<>(5);
        magicBox1.add(2);
        magicBox1.add(-6);
        magicBox1.add(1);
        Integer pick1 = magicBox1.pick();
        System.out.println("Случайный элемент: " + pick1);


    }
}
