package ngay28thang9;

import java.util.*;

public class SapXepCongViec2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            Map<Integer,Integer> a= new HashMap<>();
            for(int i=0;i<n;i++)
            {
                sc.nextInt();
                int k=sc.nextInt();
                int l=sc.nextInt();
                int p=a.getOrDefault(k, 0);
                a.put(k,Math.max(l,p));
            }
            Long sum=0L;
            for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
               sum+=entry.getValue();
            }
            System.out.println(a.size()+" "+sum);
        }
    }
}

