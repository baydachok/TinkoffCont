import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountDir = Integer.parseInt(scan.nextLine());

        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < amountDir; i++) {
            array.add(scan.nextLine());
        }

        array.sort(String::compareTo);

        StringBuilder sb = new StringBuilder();
        for (String path : array) {
            int indexSlash = 0;
            for (int i = path.length() - 1; i >= 0; i--) {
                if (path.charAt(i) == '/') {
                    indexSlash = i+1;
                    break;
                }
            }
            String dir = path.substring(indexSlash, path.length());
            String tab = "  ".repeat((int) path.chars().filter(c -> c == '/').count());

            sb.append(tab).append(dir).append("\n");
        }

        System.out.print(sb);
    }
}