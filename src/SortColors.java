    import java.util.Arrays;

    public class SortColors {

        public static void main(String[] args) {
            int[] nums = {2,0,2,1,1,0};
            sortColors(nums);
            System.out.println(Arrays.toString(nums));
        }


            static void sortColors(int[] nums) {
                int length = nums.length-1;
                helper(nums,length,0,0);
            }

           static void helper(int[] nums, int r, int c, int m){
                if(r==0){
                    return;
                }
                if(c<r){
                    if(nums[c]>nums[m]){
                        helper(nums, r, c+1, c);
                    }else{
                        helper(nums, r, c+1, m);
                    }
                }else{
                    //swap
                    int temp = nums[m];
                    nums[m] = nums[r-1];
                    nums[r-1]= temp;
                    helper(nums, r-1, 0, 0);
                }
            }

    }
