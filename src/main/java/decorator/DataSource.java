package decorator;

public interface DataSource {
    byte[] read();

    void write(byte[] data);
}
