package Seminars.Seminar1;

public class Seminar20 {
    public static void main(String[] args) {
        System.out.println(getString(10, "a", "b"));

    }

    public static String getString(int n, String c1, String c2) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                str.append(c1);

            } else {
                str.append(c2);
            }

        }
        return str.toString();
    }
}

