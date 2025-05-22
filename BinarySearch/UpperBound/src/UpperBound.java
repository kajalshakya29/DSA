public class UpperBound {
    public static void main(String[] args) {
        int[] arr={112, 223, 223, 435, 545, 656, 656};
        int n = arr.length;
        int target = 435;
        int up=n;
        int lo=0;
        int hi=n-1;

        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if (arr[mid]>target){
                up=Math.min(up,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(up);
    }
}