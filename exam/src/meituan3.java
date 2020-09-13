import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//类的比较
/*public interface Comparable<T>{
    public int compareTo(T o);
}
此方法返回一个int类型的数据：
        1：表示大于；
        -1：表示小于；
        0：表示等于*/
public class meituan3 {
    static class Com implements Comparable<Com>{
        int a;
        int b ;
        int i;
        public Com(int a, int b, int i){
            this.a = a;
            this.b = b;
            this.i = i;
        }

        @Override
        public String toString() {
            return "Com{" +
                    "a=" + a +
                    ", b=" + b +
                    ", i=" + i +
                    '}';
        }
        @Override
        public int compareTo(Com o) {
            if(this.b > o.b) {
                return -1;
            } else if(this.b < o.b) {
                return  1;
            } else {
                if(this.a > o.a) {
                    return -1;
                } else if(this.a < o.a) {
                    return  1;
                } else {
                    return 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*    ArrayList<ArrayList<Integer>> arrrays = new ArrayList<>();
        String str = "";
        int n = scanner.nextInt();
        for(int i = 0;i < n;i++) {
            ArrayList<Integer> array = new ArrayList<>();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            array.add(b);
            array.add(i);
            arrrays.add(array);
        }
        //Collections.sort(arrrays.get(0));
        for(int i = 0;i < n;i++) {
            str += i + " ";
        }
        System.out.println(str);*/
        Com com1 = new Com(1,2,1);
        Com com2 = new Com(1,3,2);
        Com com3 = new Com(5,2,3);
        ArrayList<Com> arrayList = new ArrayList<>();
        arrayList.add(com1);
        arrayList.add(com2);
        arrayList.add(com3);
        Collections.sort(arrayList);
        System.out.println(arrayList.toString());
    }
}
