package ngay28thang9;
import java.math.BigInteger;
import java.util.*;
public class GiaTriNhoNhatCuaBieuThuc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) 
        {
            int n=sc.nextInt();
            Long []a= new Long[n];
            Long []b= new Long[n];
            for(int i=0;i<n;i++)a[i]=sc.nextLong();
            Arrays.sort(a);
            for(int i=0;i<n;i++)b[i]=sc.nextLong();    
            Arrays.sort(b, Collections.reverseOrder());
            BigInteger sum=new BigInteger("0");
            for(int i=0;i<n;i++)
            {
                BigInteger ai = BigInteger.valueOf(a[i]);
                BigInteger bi = BigInteger.valueOf(b[i]);
                sum = sum.add(ai.multiply(bi)); 
            }
            System.out.println(sum);
        }
    }
}
