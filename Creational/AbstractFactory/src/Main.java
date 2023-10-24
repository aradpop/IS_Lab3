public class Main {
    public static void testFurniture(FurnitureFactory factory) {
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        chair.sitOn();
        System.out.println("Chair has " + (chair.hasLegs() ? " legs.":" no legs."));

        table.sitAt();
        System.out.println("Table is " + (table.isSquare() ? " square.":" not square."));
    }

    public static void main(String[] args) {
        testFurniture(new OldFurnitureFactory());

        testFurniture(new NewFurnitureFactory());
    }
}