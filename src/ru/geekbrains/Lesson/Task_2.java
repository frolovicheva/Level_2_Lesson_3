package ru.geekbrains.Lesson;

import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
       PhoneBook myBook = new PhoneBook ();
       myBook.addPhones ("Иванов", "+71231111111");
       myBook.addPhones ("Петров","+71232222222");
       myBook.addPhones ("Сидоров", "+71233333333");
       myBook.addPhones ("Иванов","+71234444444");
       myBook.addPhones ("Петров","+71235555555");


       myBook.printPhoneBook ();

       System.out.println ();
       myBook.getPhone ("Петров");

       System.out.println ();
       myBook.getPhone ("Сидоров");
    }
}
