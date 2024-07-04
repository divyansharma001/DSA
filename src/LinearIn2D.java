import java.util.Arrays;

public class LinearIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {6,7,8}
        };
        int target = 5;
      int[] ans = search(arr,target);
      System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] array, int target){
     for(int row=0;row< array.length;row++){
         for(int column=0; column<array[row].length;column++){
             if(array[row][column]==target){
                 return new int[]{row, column};
             }
         }
     } return new int[]{-1,-1};
    }
}
