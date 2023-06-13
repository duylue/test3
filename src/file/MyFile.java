package file;

import model.Customer;

import java.io.*;
import java.util.ArrayList;

public class MyFile {


    public void wireCusToFile(ArrayList<Customer> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("cuslist.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            if (list != null && !list.isEmpty()) {
                objectOutputStream.writeObject(list);
            }

            objectOutputStream.close();

        } catch (Exception e) {

        }

    }

    public ArrayList<Customer> getCusFromFile() {
        try {
            FileInputStream inputStream = new FileInputStream("cuslist.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            ArrayList<Customer> list = (ArrayList<Customer>) objectInputStream.readObject();
            objectInputStream.close();
            return list;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
