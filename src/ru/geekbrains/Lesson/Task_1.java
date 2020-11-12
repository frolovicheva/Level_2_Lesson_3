package ru.geekbrains.Lesson;

import java.util.*;

public class Task_1 {
    /*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать сколько раз встречается каждое слово.

    Варианты выполнения данного задания через HashMap мы разбирали на уроке,
    поэтому попробовала написать метод актуальный для ArrayList.
    */

    public static void main(String[] args) {
        String[] someArray = {"F","A","B","C","D","A","B","C","A","B","A"}; /* Создаем массив слов. */
        List<String> list1 = Arrays.asList (someArray); /* Создаем Коллекцию (List) из массива.*/
        List<String> list2 = new ArrayList<>();/*Вторую Коллекцию создаем "классическим" способом.*/
        list2.add ("мама");
        list2.add ("папа");
        list2.add ("брат");
        list2.add ("сестра");
        list2.add ("брат");
        list2.add ("бабушка");
        list2.add ("бабушка");

        checkList(list1);
        System.out.println ();

        checkList (list2);
    }

    private static void checkList(List<String> list) {
        System.out.println (list);/*Для наглядности печатаем содержимое Коллекции */
        Set<String> set = new HashSet<>();/*Используем в дальнейшем для вывода уникальных элементов*/
        int i = -1;
        do {
            Iterator<String> iter = list.iterator ();
            int counter = 0;
            String str = list.get ((list.size () + i) - (list.size () - 1));/*Вытаскиваем значение по индексу от 0 до конца Коллекции*/
            while (iter.hasNext ()){
                String str2 = iter.next ();
                if(str2.equals(str)) {/*Находим одинаковые элементы*/
                    counter++;/*Считаем их количество*/
                }
            }
            if (set.add(str)) {/*Отсекаем повторяющиеся элементы, т.к. метод Set.add - boolean*/
                System.out.println(str + "-" + counter);
            }
            i++;
        } while (i < list.size () - 1);

//        Можно отдельно вывести уникальные элементы (без количества):
//        System.out.println (set);
    }

}
