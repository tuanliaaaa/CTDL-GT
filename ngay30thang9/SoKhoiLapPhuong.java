package ngay30thang9;


import java.util.Scanner;
import java.util.*;

public class SoKhoiLapPhuong {
    static boolean isCube(long n) {
        long cubeRoot = (long) Math.cbrt(n);
        return cubeRoot * cubeRoot * cubeRoot == n;
    }

    static void findLargestCube(String s, int index, String current, long[] maxCube) {
        if (index == s.length()) {
            if (!current.isEmpty()) {
                long num = Long.parseLong(current);
                if (isCube(num)) {
                    maxCube[0] = Math.max(maxCube[0], num);
                }
            }
            return;
        }

        findLargestCube(s, index + 1, current, maxCube);
        findLargestCube(s, index + 1, current + s.charAt(index), maxCube);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  
        while (T-- > 0) {
            String N = scanner.next();  
            long[] maxCube = {-1};  
            findLargestCube(N, 0, "", maxCube);  
            System.out.println(maxCube[0]);  
        }
        scanner.close();
    }
}
