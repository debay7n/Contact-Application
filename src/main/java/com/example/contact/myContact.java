package com.example.contact;
 import java.io.*;
 import java.util.HashMap;


public class myContact {
    HashMap<String, String> cntList;

    myContact() {
        this.cntList = new HashMap<>();
    }

    void addContact(String Name, String Number) {
        cntList.put(Name, Number);
    }

    HashMap<String, String> getCntList() {
        return cntList;
    }

    void serializeMap() {
        try {
            FileOutputStream os = new FileOutputStream("cntList");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject("wordlist");
            oos.close();
            os.close();

        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    void deserializeMap() {
        try {
            FileInputStream is = new FileInputStream("cntList");
            ObjectInputStream ois = new ObjectInputStream(is);
            cntList = (HashMap<String, String>) ois.readObject();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.out.println("CLASS NOT FOUND");
        }
    }
}

