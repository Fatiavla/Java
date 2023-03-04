
// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

import java.util.Scanner;

public class Main { 

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print('Imya');
        String input_name = input.nextLine();
        System.out.printf("Hello, %s! \n", input_name);
        input.close();
    }
}