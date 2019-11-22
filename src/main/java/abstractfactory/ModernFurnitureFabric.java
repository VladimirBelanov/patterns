package abstractfactory;

public class ModernFurnitureFabric implements FurnitureFabric {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
