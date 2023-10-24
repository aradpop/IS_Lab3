public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);

        for (int i = 0; i < 100; i++) {
            Box tmp = new Box(i);

            for (int j = 0; j < 10; j++)
                tmp.addItem(new Product(j));

            box.addItem(tmp);
        }

        System.out.println("Total box price = " + box.getPrice());
    }
}