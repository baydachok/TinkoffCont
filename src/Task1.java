import java.util.Scanner;
import java.util.Vector;

public class Task1 {



    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Vector<Integer> examMarks = new Vector<>(n);
        for (int i = 0; i < n; ++i) {
            examMarks.add(scanner.nextInt());
        }
        int maxConsecutiveFives = -1;
        for (int i = 6; i < n; ++i) {
            boolean hasLowMarks = false;
            int countFives = 0;
            for (int j = 0; j < 7; ++j) {
                if (examMarks.get(i - j) <= 3) {
                    hasLowMarks = true;
                    break;
                }
                if (examMarks.get(i - j) == 5) {
                    countFives++;
                }
            }
            if (!hasLowMarks) {
                maxConsecutiveFives = Math.max(maxConsecutiveFives, countFives);
            }
        }
        System.out.println(maxConsecutiveFives);
    }

    public static void main(String[] args) {
        solve();
    }
}