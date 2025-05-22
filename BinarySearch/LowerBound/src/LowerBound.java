//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LowerBound {
    public static void main(String[] args) {
        int[] arr={112, 223, 223, 435, 545, 656, 656};
        int n = arr.length;
        int target = 435;
        int lb=n;
        int lo=0;
        int hi=n-1;
        //int mid=lo+(hi-lo)/2;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if (arr[mid]>=target){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(lb);
    }
}