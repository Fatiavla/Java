
package DZ.DZ1;
import java.util.Scanner;

public class DZ03 {
    public static void main(String[] args) {
    
        int num1;
        int num2;
        String operation;
    
        Scanner input = new Scanner(System.in);
    
        System.out.println("Введи певрое число");
        num1 = input.nextInt();
    
        System.out.println("Введи второе число");
        num2 = input.nextInt();
    
        Scanner op = new Scanner (System.in);
    
        System.out.println("Что будем делать, складывать(+), умножать(*), вычитать(-) или делить(/)?");
        operation = op.next();
    
        if (operation.equals("+"))
        {
            System.out.println("Ответ: "+(num1 + num2));
        }
        else if (operation.equals("-"))
        {
            System.out.println("Ответ:"+(num1 - num2));
        }       
        else if (operation.equals("*"))
        {
            System.out.println("Ответ: "+(num1 * num2));
        }   
        else if (operation.equals("/"))
        {
            System.out.println("Ответ: "+(num1 / num2));
        }
    }
}
