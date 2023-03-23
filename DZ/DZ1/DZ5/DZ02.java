package DZ.DZ1.DZ5;
import java.util.*;
public class DZ02 {
    public static void main(String[] args) {
       
        List<String> employees = Arrays.asList(
             "Иван Иванов",
             "Светлана Петрова",
             "Кристина Белова",
             "Анна Мусина",
             "Анна Крутова",
             "Иван Юрин",
             "Петр Лыков",
             "Павел Чернов",
             "Петр Чернышов",
             "Мария Федорова",
             "Марина Светлова",
             "Мария Савина",
             "Мария Рыкова",
             "Марина Лугова",
             "Анна Владимирова",
             "Иван Мечников",
             "Петр Петин",
             "Иван Ежов"
        );
 
        Map<String, Integer> occurrences = new HashMap<>();
        
        for (String employee : employees) {
            String firstName = employee.split(" ")[0];
            occurrences.put(firstName, occurrences.getOrDefault(firstName, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> sortedOccurrences = new ArrayList<>(occurrences.entrySet());
        
        sortedOccurrences.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        
        for (Map.Entry<String, Integer> entry : sortedOccurrences) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " повторений");
            }
        }
    }
}
