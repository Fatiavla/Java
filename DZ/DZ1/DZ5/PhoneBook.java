package DZ.DZ1.DZ5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private static Map<String, Contact> phoneBook = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Выберите действие:\n1. Создать новый контакт\n2. Добавить номер телефона к существующему контакту\n3. Вывод всей телефонной книги\n4. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    createContact();
                    break;
                case 2:
                    addPhoneNumber();
                    break;
                case 3:
                    displayPhoneBook();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Неправильный выбор");
                    break;
            }
        }
    }

    private static void createContact() {
        System.out.println("Введите имя контакта:");
        String name = scanner.nextLine();
        System.out.println("Введите номер телефона:");
        String phoneNumber = scanner.nextLine();
        Contact contact = new Contact(name);
        contact.addPhoneNumber(getPhoneNumberType(), phoneNumber);
        phoneBook.put(name, contact);
    }

    private static void addPhoneNumber() {
        System.out.println("Введите имя контакта:");
        String name = scanner.nextLine();
        Contact contact = phoneBook.get(name);
        if (contact == null) {
            System.out.println("Контакт не найден");
            return;
        }
        System.out.println("Введите номер телефона:");
        String phoneNumber = scanner.nextLine();
        contact.addPhoneNumber(getPhoneNumberType(), phoneNumber);
    }

    private static void displayPhoneBook() {
        for (Map.Entry<String, Contact> entry : phoneBook.entrySet()) {
            Contact contact = entry.getValue();
            System.out.println(contact.getName() + ":");
            for (Map.Entry<String, String> phoneEntry : contact.getPhoneNumbers().entrySet()) {
                System.out.println("\t" + phoneEntry.getKey() + ": " + phoneEntry.getValue());
            }
        }
    }

    private static String getPhoneNumberType() {
        System.out.println("Введите тип номера телефона (например, \"домашний\", \"рабочий\", \"мобильный\"):");
        return scanner.nextLine();
    }
}

class Contact {

    private String name;
    private Map<String, String> phoneNumbers = new HashMap<>();

    public Contact(String name) {
        this.name = name;
    }

    public String addPhoneNumber(String type, String number) {
        return phoneNumbers.put(type, number);
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getPhoneNumbers() {
        return phoneNumbers;
    }
}
