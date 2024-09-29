package ngay28thang9;
import java.util.*;
import java.util.Collections;
public class GiaTriNhoNhatCuaBieuThuc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) 
        {
            int n=sc.nextInt();
            Integer []a= new Integer[n];
            Integer []b= new Integer[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            for(int i=0;i<n;i++)b[i]=sc.nextInt();    
            Arrays.sort(b, Collections.reverseOrder());
            long sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=a[i]*b[i];
            }
            System.out.println(sum);
        }
    }
}
