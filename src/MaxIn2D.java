public class MaxIn2D {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {3,4,6},
                {45,3,34}
        };
        System.out.println(max(array));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row< arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        } return max;
    }
}
