package ngay18thang9;
import java.util.Scanner;
import java.util.*;;
public class SoNguyenTo {
    private static Boolean [] sangNguyenTo;
    private static List<List<Integer>> l;
    private static int n,p;
    public static void soNguyenTo(int sum,List<Integer> c,int hang) 
    {
        if(c.size()==n&&sum==0){
            l.add(c);
        }else if(c.size()<n){
            for(int i=hang+1;i<=200;i++)
            {
                if(sangNguyenTo[i]&&i>p){
                    int x=sum-i;
                    if(x>=0){
                        List<Integer> m = new ArrayList();
                        m.addAll(c);
                        m.add(i);
                        soNguyenTo( x, m, i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        sangNguyenTo = new Boolean[201];
        for(int i=0;i<=200;i++)sangNguyenTo[i]=true;
        sangNguyenTo[0]=false;
        sangNguyenTo[1]=false;

        for(int i=2;i<=200;i++){
            if(sangNguyenTo[i]){
                for(int j=i*2;j<=200;j+=i)
                {
                    sangNguyenTo[j]=false;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            l=new ArrayList();
            n=sc.nextInt();
             p=sc.nextInt();
            int s=sc.nextInt();
           
            soNguyenTo(s,new ArrayList(),0);
            for(int i=0;i<l.size();i++){
                for(int j=0;j<n;j++)System.out.print(l.get(i).get(j)+" ");
                System.out.println();
            }
        }
    }
}
