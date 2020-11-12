package ru.geekbrains.Lesson;

import java.util.*;

public class PhoneBook extends HashMap {

    private HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<> ();
    }

    public void printPhoneBook() {
        for (HashMap.Entry<String,String> o : phoneBook.entrySet()) {
            System.out.println (o.getValue() + " " + o.getKey ());
        }
    }

    public void addPhones(String surname, String phone) {
        phoneBook.put (phone, surname);
    }

    public void getPhone(String surname) {
        for (Map.Entry<String,String> o : phoneBook.entrySet()) {
            if (surname.equals (o.getValue ())){
                System.out.println(o.getValue() + " " + o.getKey ());
            }
        }
    }
}
    // 1.
//for (Map.Entry<String, String> entry: hashmap.entrySet())
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//
//
// 2.
//for (String key: hashmap.keySet())
//            System.out.println(hashmap.get(key));
//
//
// 3.
//    Iterator<Map.Entry<String, String>> itr = hashmap.entrySet().iterator();
//while (itr.hasNext())
//        System.out.println(itr.next());

