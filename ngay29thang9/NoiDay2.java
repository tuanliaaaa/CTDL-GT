package ngay29thang9;
import java.util.*;
public class NoiDay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t= sc.nextInt();
        Long l= 1000000007L;
        while (t-->0)
        {
            int n=sc.nextInt();
            Long []a= new Long[n];
            for(int i=0;i<n;i++)a[i]=sc.nextLong();
            Arrays.sort(a);
            Long sum=0l;
             while (n > 1) {
                Arrays.sort(a, 0, n);
                
                Long first = a[0];
                Long second = a[1];
                
                Long newLength = first + second; 
                sum =sum%l+ newLength%l;        
                
                a[0] = newLength;
                for (int i = 1; i < n - 1; i++) {
                    a[i] = a[i + 1];
                }
                
                n--; 
            }
            
            System.out.println(sum%l);
        }
    }
}
