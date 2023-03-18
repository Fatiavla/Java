package DZ.DZ1.DZ4;

import java.util.LinkedList;
import java.util.Random;

public class DZ01 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = generateList(10); // генерируем список из 10 элементов
        System.out.println("Original list: " + linkedList);
        LinkedList<Integer> reversedList = reverseList(linkedList); // переворачиваем список
        System.out.println("Reversed list: " + reversedList);
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i)); // добавляем элементы в обратном порядке
        }
        return reversedList;
    }

    public static LinkedList<Integer> generateList(int length) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(100)); // добавляем случайные числа в диапазоне от 0 до 99
        }
        return list;
    }
    
}
