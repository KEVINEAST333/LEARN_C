public class linchen2 {
    public int func1 (int[] list) {
        // write code here
        int ans = 0;
        int l = 0;
        int r = list.length -1;
        while(l < r) {
            ans= Math.max(ans,Math.min(list[l],list[r])*(r-1));
            if(list[l] > list[r]) {
                r--;
            }
            else {
                l++;
            }
        }
        return ans;
    }
}
