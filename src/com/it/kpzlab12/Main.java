package com.it.kpzlab12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Vector2f v1 = new Vector2f();
        Vector2f v2 = new Vector2f(10, 12);
        Vector2f v3 = new Vector2f(v2.normalize(), 10);
        Vector2f v4 = new Vector2f(10);

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);

        System.out.println("v1 cmp v2 = " + v1.compareTo(v2));
        System.out.println("v4 cmp v3 = " + v4.compareTo(v3));
        System.out.println("v2 hash = " + v2.hashCode());

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("v.bin"));
            oos.writeObject(v3);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
