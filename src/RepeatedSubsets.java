//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class RepeatedSubsets {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 2};
//        List<List<Integer>> ans = repeatedSubsets(arr);
//        for (List<Integer> list : ans) {
//            System.out.println(list);
//        }
//    }
//
//    static List<List<Integer>> repeatedSubsets(int[] arr) {
//        Arrays.sort(arr); // Sort the array to handle duplicates
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>()); // Add an empty subset initially
//        int start, end = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            start = 0;
//
//            // If current element is the same as the previous one, adjust `start` to avoid duplicates
//            if (i > 0 && arr[i] == arr[i - 1]) {
//                start = end + 1;
//            }
//
//            end = outer.size() - 1;
//            int n = outer.size();
//
//            for (int j = start; j < n; j++) {
//                List<Integer> internal = new ArrayList<>(outer.get(j));
//                internal.add(arr[i]);
//                List<List<Integer>> ans = new ArrayList<>();
//                for(int m=0;m<internal.size();m++){
//
//                    for(int n=0;n<internal.size();n++){
//
//                        ans.add(arr[m]+arr[j]);
//                    }
//
//                }
//                outer.add(ans);
//            }
//        }
//
//        return outer;
//    }
//}
