package DZ.DZ1.DZ4;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        boolean isDone = false;
        double firstNumber = 0.0;
        double secondNumber = 0.0;
        String operation = "";
        
        System.out.println("Добро пожаловать в калькулятор!");
        System.out.println("Введите первое число:");
        firstNumber = scanner.nextDouble();
        
        while (!isDone) {
           System.out.println("Выберите оператора (+, -, *, /) или 'q' что бы выйти или 'c' отменить последнюю операцию:");
           operation = scanner.next();
           
           switch (operation) {
              case "+":
                 System.out.println("Введите второе число:");
                 secondNumber = scanner.nextDouble();
                 result = firstNumber + secondNumber;
                 System.out.println("Ответ: " + result);
                 firstNumber = result;
                 break;
              case "-":
                 System.out.println("Введите второе число:");
                 secondNumber = scanner.nextDouble();
                 result = firstNumber - secondNumber;
                 System.out.println("Ответ: " + result);
                 firstNumber = result;
                 break;
              case "*":
                 System.out.println("Введите второе число:");
                 secondNumber = scanner.nextDouble();
                 result = firstNumber * secondNumber;
                 System.out.println("Ответ: " + result);
                 firstNumber = result;
                 break;
              case "/":
                 System.out.println("Введите второе число:");
                 secondNumber = scanner.nextDouble();
                 if (secondNumber == 0) {
                    System.out.println("Не могу поделить на ноль");
                    continue;
                 }
                 result = firstNumber / secondNumber;
                 System.out.println("Ответ: " + result);
                 firstNumber = result;
                 break;
              case "c":
                 System.out.println("Последняя операция отменена!");
                 break;
              case "q":
                 isDone = true;
                 break;
              default:
                 System.out.println("Неправильная операция!");
                 break;
           }
        }
        
        System.out.println("До свидания!");
        
        scanner.close();
     }
    }

