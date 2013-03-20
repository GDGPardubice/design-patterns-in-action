package storage;

import java.io.*;

/**
 * @author Jirka Pénzeš Date: 4.5.12 23:55
 * @author Jan Voracek Date: 15.5.12 07:21
 */
public class Serializer<T> {

    private String fileName;

    public Serializer(String fileName) {
        this.fileName = fileName;
    }

    public boolean save(Object data) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
            output.writeObject(data);
            closeStream(output);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public T load() {
        T data = null;
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream(fileName));
            data = (T) input.readObject();
        } catch (Exception ex) {
        } finally {
            closeStream(input);
        }
        return data;
    }

    private void closeStream(Closeable stream) {
        try {
            if (stream != null) {
                stream.close();
            }
        } catch (IOException ex) {
        }
    }
}