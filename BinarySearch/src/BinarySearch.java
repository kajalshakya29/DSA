public class BinarySearch {
    public static void main(String[] args) {
       int[] arr={112, 223, 334, 435, 545, 656, 767};
       int n =arr.length;
       int target =334;
       int lo=0;
       int hi=n-1;
       boolean flag=false;
       while(lo<=hi){
           int mid= (lo+hi)/2;
           if (arr[mid]==target){
               flag=true;
               break;
           }
           else if (arr[mid]>target) hi=mid-1;
           else if (arr[mid]<target) lo=mid+1;

       }
       if (flag==true) System.out.println("target present");
       else System.out.println("target not found");

    }
}