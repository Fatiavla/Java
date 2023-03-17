package DZ.DZ1.DZ3;

import java.util.ArrayList;
import java.util.Scanner;

public class Dz002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        // заполнение списка
        System.out.print("Введите количество элементов в списке: ");
        int n = scanner.nextInt();
        System.out.println("Введите элементы списка:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            list.add(number);
        }

        // поиск минимального элемента
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Минимальное значение в списке: " + min);

        // поиск максимального элемента
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Максимальное значение в списке: " + max);

        // среднее арифметическое
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double average = (double) sum / list.size();
        System.out.println("Среднее арифметическое значение в списке: " + average);
    }
    
}
