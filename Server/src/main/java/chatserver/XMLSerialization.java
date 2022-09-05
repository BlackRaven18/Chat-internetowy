package chatserver;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.List;

public class XMLSerialization {

    public static <T> void serializeToXML(String filename, List<T> list) throws IOException {
        XMLEncoder encoder = new XMLEncoder(
                new BufferedOutputStream(
                        new FileOutputStream(filename)));
        encoder.writeObject(list);
        encoder.close();
    }

    public static <T> Object deserializeFromXML(String filename) throws IOException {
        XMLDecoder decoder = new XMLDecoder(
                new BufferedInputStream(
                        new FileInputStream(filename)));

        return decoder.readObject();
    }


}