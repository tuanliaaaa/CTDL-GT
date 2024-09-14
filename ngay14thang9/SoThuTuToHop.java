package ngay14thang9;
import java.util.Scanner;

public class SoThuTuToHop {

    public static int combination(int n, int k) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;
        k = Math.min(k, n - k); // Tính C(n, k) = C(n, n-k) để tối ưu
        int res = 1;
        for (int i = 0; i < k; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    // Hàm tính số thứ tự của tổ hợp
    public static int combinationRank(int[] comb, int n, int k) {
        int rank = 0;

        for (int i = 0; i < k; i++) {
            int ci = comb[i];
            if (ci > 1) {
                rank += combination(ci - 1, k - i); // Tính các tổ hợp nhỏ hơn
            }
        }
        
        return rank;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] comb = new int[k];
        for (int i = 0; i < k; i++) {
            comb[i] = sc.nextInt();
        }

        int rank = combinationRank(comb, n, k);
        System.out.println( rank);

        sc.close();
    }
}
