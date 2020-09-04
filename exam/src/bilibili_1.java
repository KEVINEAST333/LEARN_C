public class bilibili_1 {
    public static void main(String[] args) {

        }
    public int cal_max_common_factor (int[] L) {
        int j = 0;
        // write code here
        for(int i = 0;i < L.length ;i++) {
            if(L[i] == 1) {
                return 1;
            }

            }
        for(int i = 0;i < L.length -1;i++) {
            if (L[i] % L[i + 1] == 0) {
                j++;
            }
            if(j == L.length -1) {
                return L[0];
            }

        }


        }
    }
}
