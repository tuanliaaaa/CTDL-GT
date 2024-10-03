package ngay30thang9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SapDatXauKiTu2 {
    public static Boolean sapXepXauKiTu2(String a,int o) {
        Map<Character,Integer> n = new HashMap<Character,Integer>();
        int max=0;
        for(int i=0;i<a.length();i++)
        {
            int m=n.getOrDefault(a.charAt(i),0);
            n.put(a.charAt(i),m+1);
            max=Math.max(max, m+1);
        }
        if (max <= (a.length() + 1) / o) {
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            sc.nextLine();
            String a=sc.nextLine();
            if(sapXepXauKiTu2(a,n))System.out.println(1);
            else System.out.println(-1);
        }
    }
}
