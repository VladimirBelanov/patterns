package decorator;

public class EncryptionDataSourceDecorator extends DataSourceDecorator {
    public EncryptionDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public byte[] read() {
        System.out.println("Decrypting data...");
        return dataSource.read();
    }

    @Override
    public void write(byte[] data) {
        System.out.println("Crytping data");
        dataSource.write(data);
    }
}
