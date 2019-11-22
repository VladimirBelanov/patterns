package decorator;

public class App {
    public static void main(String[] args) {
        DataSource dataSource =
                new CompressionDataSourceDecorator(
                        new EncryptionDataSourceDecorator(
                                new FileDataSource()
                        )
                );

        dataSource.write(new byte[]{});
        dataSource.read();

    }
}
