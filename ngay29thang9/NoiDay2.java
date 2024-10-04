package ngay29thang9;
import java.math.BigInteger;
import java.util.*;
public class NoiDay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t= sc.nextInt();
        BigInteger l= BigInteger.valueOf(1000000007);
        while (t-->0)
        {
            int n=sc.nextInt();
            BigInteger []a= new BigInteger[n];
            for(int i=0;i<n;i++)a[i]=sc.nextBigInteger();
            Arrays.sort(a);
            BigInteger sum=BigInteger.ZERO; 
             while (n > 1) {
                Arrays.sort(a, 0, n);
                
                BigInteger first = a[0];
                BigInteger second = a[1];
                
                BigInteger newLength = first.add(second); 
                sum = ((sum.mod(l)).add(newLength.mod(l))).mod(l);        
                
                a[0] = newLength;
                for (int i = 1; i < n - 1; i++) {
                    a[i] = a[i + 1];
                }
                
                n--; 
            }
            
            System.out.println(sum);
        }
    }
}
