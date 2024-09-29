package ngay29thang9;
import java.util.*;
public class SapXepXauKiTu1 {
    public static Boolean sapXepXauKiTu1(String a) {
        Map<Character,Integer> n = new HashMap<Character,Integer>();
        int max=0;
        for(int i=0;i<a.length();i++)
        {
            int m=n.getOrDefault(a.charAt(i),0);
            n.put(a.charAt(i),m+1);
            max=Math.max(max, m+1);
        }
        if (max <= (a.length() + 1) / 2) {
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0)
        {
            String a=sc.nextLine();
            if(sapXepXauKiTu1(a))System.out.println(1);
            else System.out.println(-1);
        }
    }
}
