package ngay30thang9;


import java.util.Scanner;
import java.util.*;

public class SoKhoiLapPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        
        while (T-- > 0) {
            String N = sc.next(); 
            long maxCube = -1;    

            int len = N.length();
            for (int i = 1; i < (1 << len); i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < len; j++) {
                    if ((i & (1 << j)) != 0) {
                        sb.append(N.charAt(j));
                    }
                }
                
                if (sb.length() > 0) {
                    long num = Long.parseLong(sb.toString());
                    long cubeRoot = Math.round(Math.cbrt(num));
                    if (cubeRoot * cubeRoot * cubeRoot == num) {
                        maxCube = Math.max(maxCube, num);
                    }
                }
            }
            
            // In ra kết quả
            System.out.println(maxCube);
        }
        sc.close();
    }
}
