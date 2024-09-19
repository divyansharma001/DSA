import java.util.ArrayList;
import java.util.List;

public class RecursiveToIteration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    // This function returns all subsets of the given array `arr`
    static List<List<Integer>> subset(int[] arr) {
        // `outer` is used to store all the subsets (initially contains just the empty subset)
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // Adding the empty subset

        // Loop over each element in the input array
        for (int num : arr) {
            int n = outer.size(); // Store the current number of subsets in `outer`

            // Iterate through all the existing subsets
            for (int i = 0; i < n; i++) {
                // `outer.get(i)` fetches the i-th subset from `outer`
                // Make a copy of the i-th subset so that we don't modify the original
                List<Integer> internal = new ArrayList<>(outer.get(i));

                // Add the current element `num` to the copied subset
                internal.add(num);

                // Add this new subset (with `num` included) back to `outer`
                outer.add(internal);
            }
        }
        return outer; // Return the list of all subsets
    }
}

/*
Explanation of `outer.get(i)` in the code:
-------------------------------------------
1. `outer.get(i)` is used to access the i-th subset that is already present in the `outer` list.
2. We create a copy of this subset using `new ArrayList<>(outer.get(i))` to avoid modifying the original subset.
3. After copying, we add the current number (`num`) to this copy to form a new subset.
4. This new subset is then added to `outer`, expanding the list of subsets.

By doing this for every element in the array, we build up all possible subsets (including empty and full subsets).
*/
