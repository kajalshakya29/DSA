
public class CountGreaterThanX {
    public static void main(String[] args) {
       int[] arr = {1,12,31,49,10,38};
       int x=31;
       int count = 0;
       for (int i =0; i<arr.length; i++){
           if (arr[i]>x){
               count++;
           }
       }
        System.out.println(count);
    }
}