package abstractfactory;

public class App {

    public static void main(String[] args) {
        FurnitureFabric fabric;
        if ("CLASSIC".equals(args[0].toUpperCase())) {
            fabric = new ClassicFurnitureFabric();
        } else {
            fabric = new ModernFurnitureFabric();
        }

        while (true) {
            fabric.createChair();
            fabric.createTable();
        }
    }
}
