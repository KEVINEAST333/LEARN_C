package written_examination;

public class juren {
    public static void main(String[] args) {

    }
    //插排
    public static void insertSort(int[] array) {
        for (int bound = 1;bound < array.length;bound++) {
            int cur = bound -1;
            int tmp = array[bound];
            for (;cur >= 0;cur --) {
                if(array[cur] > tmp) {
                    array[cur + 1] = array[cur];
                }else {
                    break;
                }
            }
            array[cur + 1] = tmp;
        }
    }
}
