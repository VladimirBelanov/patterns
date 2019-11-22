package decorator;

public class FileDataSource implements DataSource {
    @Override
    public byte[] read() {
        System.out.println("Reading from file...");
        return new byte[0];
    }

    @Override
    public void write(byte[] data) {
        System.out.println("Writing to file...");
    }
}
