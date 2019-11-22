package abstractfactory;

public class ClassicFurnitureFabric implements FurnitureFabric {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
