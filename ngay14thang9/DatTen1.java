package ngay14thang9;
import java.util.*;
public class DatTen1 {
        public static void generateCombinations(String[] names, int n, int k, int start, List<String> combination, List<List<String>> result) {
            if (combination.size() == k) {
                result.add(new ArrayList<>(combination));
                return;
            }
            for (int i = start; i < n; i++) {
                combination.add(names[i]);
                generateCombinations(names, n, k, i + 1, combination, result);
                combination.remove(combination.size() - 1); // Bỏ phần tử cuối để quay lui
            }
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int K = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống
            String[] names = sc.nextLine().split(" ");
            Arrays.sort(names);
            List<List<String>> result = new ArrayList<>();
            generateCombinations(names, N, K, 0, new ArrayList<>(), result);
            for (List<String> comb : result) {
                System.out.println(String.join(" ", comb));
            }
            sc.close();
        }
}
