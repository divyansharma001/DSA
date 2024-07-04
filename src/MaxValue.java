public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,5,6,9,4,2};
        System.out.println(max(arr));
    }
    static int max(int[] array){
       int maxValue = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>maxValue){
                maxValue=array[i];
            }
        }
        return maxValue;
    }
}
