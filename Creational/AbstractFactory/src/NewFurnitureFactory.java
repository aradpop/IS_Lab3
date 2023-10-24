public class NewFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new NewChair();
    }

    public Table createTable() {
        return new NewTable();
    }
}
