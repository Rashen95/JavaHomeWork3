//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;

public class Tak02 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            myList.add((int) (Math.random() * 51));
        }
        for (int i = 0; i < myList.toArray().length; i++) {
            System.out.printf("%s   ", myList.toArray()[i]);
        }
        System.out.println();
        System.out.println("Удаляю все четные числа");
        System.out.println("Вот ваш список без четных чисел");
        ArrayList<Integer> myResultList = new ArrayList<>();
        for (int i = 0; i < myList.toArray().length; i++) {
            if ((int) myList.toArray()[i] % 2 != 0) {
                myResultList.add((int) myList.toArray()[i]);
            }
        }
        for (int i = 0; i < myResultList.toArray().length; i++) {
            System.out.printf("%s   ", myResultList.toArray()[i]);
        }
    }
}