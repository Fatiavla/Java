package DZ.DZ1.DZ2;
import java.util.Scanner;
public class DZ03 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String str) {
        // удаление пробелов и приведение всех символов к нижнему регистру
        str = str.toLowerCase().replaceAll("\\s+", "");

        // проверка на палиндром
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
