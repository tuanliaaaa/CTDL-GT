package ngay28thang9;
import java.util.*;
public class SapXepCongViec1 {
   
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Activity[] c= new Activity[n];
            for(int i=0;i<n;i++){
                c[i]=new Activity(sc.nextInt());
            }
            for(int i=0;i<n;i++)c[i].setFinish(sc.nextInt());
            Arrays.sort(c);
            int dem=0;
            int check=-1;
            for(int i=0;i<n;i++){
                if(c[i].getStart()>=check)
                {
                    dem++;
                    check=c[i].getFinish();
                }
            }
            System.out.println(dem);
        }
    }
}
class Activity implements Comparable<Activity> {
    int start, finish;

    public Activity(int start) {
        this.start=start;
    }
    public int getFinish() {
        return finish;
    }
    public void setFinish(int finish) {
        this.finish = finish;
    }
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    @Override
    public int compareTo(Activity other) {
        return this.finish - other.finish; 
    }
}