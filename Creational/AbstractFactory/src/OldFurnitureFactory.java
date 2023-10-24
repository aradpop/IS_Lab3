public class OldFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new OldChair();
    }

    public Table createTable() {
        return new OldTable();
    }
}
