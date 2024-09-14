package ngay14thang9;
import java.util.Scanner;
public class SoThuTuHoanVi {
        public static int factorial(int n) {
            if (n == 0 || n == 1) return 1;
            return n * factorial(n - 1);
        }
        public static int permutationRank(int[] perm, int n) {
            int rank = 0;
            boolean[] used = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 1; j < perm[i]; j++) {
                    if (!used[j]) count++; 
                }
                rank += count * factorial(n - i - 1);
                used[perm[i]] = true; 
            }
            return rank + 1; 
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0)
            {
                int n = sc.nextInt();
                int[] perm = new int[n];
                for (int i = 0; i < n; i++) {
                    perm[i] = sc.nextInt();
                }
                
                int rank = permutationRank(perm, n);
                System.out.println(rank);
                
            }
            sc.close();
        }
}