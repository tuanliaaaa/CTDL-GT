package ngay13thang10;
import java.util.*;;
public class XauConChungDaiNhat {
    public static int xauConChungDaiNhat(String a, String b) {
        int [][]c = new int[a.length()+1][b.length()+1];
        for(int i=0;i<=a.length();i++)
        {
            for(int j=0;j<=b.length();j++)
            {
                c[i][j]=0;
            }
        }
        int max=0;
        for(int i=1;i<=a.length();i++)
        {
            for(int j=1;j<=b.length();j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))c[i][j]=c[i-1][j-1]+1;
                else c[i][j]=Math.max(Math.max(c[i-1][j], c[i][j-1]),c[i-1][j-1]);
                max=Math.max(max, c[i][j]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while (t-->0)
        {
            String a=sc.nextLine();
            String b=sc.nextLine();
            System.out.println(xauConChungDaiNhat(a,b));
            
        }
    }
}
