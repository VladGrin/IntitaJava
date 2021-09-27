package ua.bean;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class TestXML {
    public static void main(String[] args) {
//        Order order = new Order(1, 22.2f, "simple order");
//
//        try (FileOutputStream out = new FileOutputStream("order.xml");
//             BufferedOutputStream out1 = new BufferedOutputStream(out);
//             XMLEncoder xmlEncoder = new XMLEncoder(out1);) {
//
//            xmlEncoder.writeObject(order);
//            xmlEncoder.flush();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("order.xml")))){
            Order order = (Order) xmlDecoder.readObject();

            System.out.println(order);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
