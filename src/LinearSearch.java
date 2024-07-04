public class LinearSearch {
    public static void main(String[] args) {
    int[] array = {1,4,3,5,6,8};
    int target = 6;
    int ans = linearSearch(array, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
     if(arr.length==0){
         return -1;
     }
     for(int index=0;index< arr.length; index++){
         int element = arr[index];
         if(element==target){
             return index;
         }
     }
     return -1;
    }
}
