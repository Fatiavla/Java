package DZ.DZ1.DZ06;
import java.util.ArrayList;
import java.util.Scanner;
public class NotebookShop {
    private ArrayList<Notebook> Notebooks;

    public NotebookShop() {
        Notebooks = new ArrayList<>();
        Notebook Notebook1 = new Notebook("Macbook Pro", 16, 512, "macOS", "silver");
        Notebook Notebook2 = new Notebook("Lenovo ThinkPad X1 Carbon", 8, 256, "Windows 10", "black");
        Notebook Notebook3 = new Notebook("Asus ROG Zephyrus G14", 16, 1_000, "Windows 10", "gray");
        Notebook Notebook4 = new Notebook("Dell XPS 13", 16, 512, "Windows 10", "white");
        Notebook Notebook5 = new Notebook("HP Envy x360", 16, 512, "Windows 10", "blue");
        Notebooks.add(Notebook1);
        Notebooks.add(Notebook2);
        Notebooks.add(Notebook3);
        Notebooks.add(Notebook4);
        Notebooks.add(Notebook5);
    }

    public void filterNotebooks() {
        Scanner scanner = new Scanner(System.in);
        int filterCriteria = 0;
        ArrayList<Notebook> filteredNotebooks = new ArrayList<>();

        while (filterCriteria < 1 || filterCriteria > 4) {
            System.out.println("Выберите критерий фильтрации:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            filterCriteria = scanner.nextInt();
        }

        switch (filterCriteria) {
            case 1:
                filteredNotebooks = filterByRam();
                break;
            case 2:
                filteredNotebooks = filterByStorageSize();
                break;
            case 3:
                filteredNotebooks = filterByOS();
                break;
            case 4:
                filteredNotebooks = filterByColor();
                break;
        }

        boolean addFilterCriteria = false;
        while (!addFilterCriteria) {
            System.out.println("Хотите добавить еще критерии фильтрации?");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            int addCriteria = scanner.nextInt();
            if (addCriteria == 1) {
                filteredNotebooks = addFilterCriteria(filteredNotebooks);
            } else {
                addFilterCriteria = true;
            }
        }

        if (filteredNotebooks.size() > 0) {
            for (Notebook Notebook : filteredNotebooks) {
                System.out.println(Notebook.getModelName());
            }
        } else {
            System.out.println("Ноутбуки, соответствующие заданным критериям, не найдены.");
        }
    }

    private ArrayList<Notebook> filterByRam() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальный объем ОЗУ:");
        int minRam = scanner.nextInt();
        ArrayList<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook Notebook : Notebooks) {
            if (Notebook.getRam() >= minRam) {
                filteredNotebooks.add(Notebook);
            }
        }
        return filteredNotebooks;
    }

    private ArrayList<Notebook> filterByStorageSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальный объем жесткого диска в гигабайтах:");
        int minStorageSize = scanner.nextInt();
        ArrayList<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook Notebook : Notebooks) {
            if (Notebook.getStorageSize() >= minStorageSize) {
                filteredNotebooks.add(Notebook);
            }
        }
        return filteredNotebooks;
    }

    private ArrayList<Notebook> filterByOS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операционную систему:");
        String os = scanner.nextLine();
        ArrayList<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook Notebook : Notebooks) {
            if (Notebook.getOS().equalsIgnoreCase(os)) {
                filteredNotebooks.add(Notebook);
            }
        }
        return filteredNotebooks;
    }

    private ArrayList<Notebook> filterByColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цвет:");
        String color = scanner.nextLine();
        ArrayList<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook Notebook : Notebooks) {
            if (Notebook.getColor().equalsIgnoreCase(color)) {
                filteredNotebooks.add(Notebook);
            }
        }
        return filteredNotebooks;
    }

    private ArrayList<Notebook> addFilterCriteria(ArrayList<Notebook> currentFilters) {
        Scanner scanner = new Scanner(System.in);
        int filterCriteria = 0;
        ArrayList<Notebook> filteredNotebooks = new ArrayList<>();
        filteredNotebooks.addAll(currentFilters);

        while (filterCriteria < 1 || filterCriteria > 4) {
            System.out.println("Выберите критерий фильтрации:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            filterCriteria = scanner.nextInt();
        }

        switch (filterCriteria) {
            case 1:
                filteredNotebooks = filterByRam(filteredNotebooks);
                break;
            case 2:
                filteredNotebooks = filterByStorageSize(filteredNotebooks);
                break;
            case 3:
                filteredNotebooks = filterByOS(filteredNotebooks);
                break;
            case 4:
                filteredNotebooks = filterByColor(filteredNotebooks);
                break;
        }

        return filteredNotebooks;
    }

    private ArrayList<Notebook> filterByRam(ArrayList<Notebook> currentFilters) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальный объем ОЗУ:");
        int minRam = scanner.nextInt();
        ArrayList<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook Notebook : currentFilters) {
            if (Notebook.getRam() >= minRam) {
                filteredNotebooks.add(Notebook);
            }
        }
        return filteredNotebooks;
    }

    private ArrayList<Notebook> filterByStorageSize(ArrayList<Notebook> currentFilters) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальный объем жесткого диска в гигабайтах:");
        int minStorageSize = scanner.nextInt();
        ArrayList<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook Notebook : currentFilters) {
            if (Notebook.getStorageSize() >= minStorageSize) {
                filteredNotebooks.add(Notebook);
            }
        }
        return filteredNotebooks;
    }

    private ArrayList<Notebook> filterByOS(ArrayList<Notebook> currentFilters) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операционную систему:");
        String os = scanner.nextLine();
        ArrayList<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook Notebook : currentFilters) {
            if (Notebook.getOS().equalsIgnoreCase(os)) {
                filteredNotebooks.add(Notebook);
            }
        }
        return filteredNotebooks;
    }

    private ArrayList<Notebook> filterByColor(ArrayList<Notebook> currentFilters) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цвет:");
        String color = scanner.nextLine();
        ArrayList<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook Notebook : currentFilters) {
            if (Notebook.getColor().equalsIgnoreCase(color)) {
                filteredNotebooks.add(Notebook);
            }
        }
        return filteredNotebooks;
    }

    public static void main(String[] args) {
        NotebookShop NotebookShop = new NotebookShop();
        NotebookShop.filterNotebooks();
    }
}
