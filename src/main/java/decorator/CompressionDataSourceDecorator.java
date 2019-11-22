package decorator;

public class CompressionDataSourceDecorator extends DataSourceDecorator {

    public CompressionDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public byte[] read() {
        System.out.println("Decomressing data...");
        return dataSource.read();
    }

    @Override
    public void write(byte[] data) {
        System.out.println("Compressing data...");
        dataSource.write(data);
    }
}
