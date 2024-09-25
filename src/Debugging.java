import java.util.ArrayList;
import java.util.List;

public class Debugging {

    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        ans = letterCombinations("23");
        System.out.println(ans);
    }



        public static List<String> letterCombinations(String digits) {

            return calculation(" ", digits);

        }

      static   List<String>  calculation(String p, String up){

            String[] notations = {"", "", "abc", "def", "ghi", "jkl", "mno",
                    "pqrs", "tuv", "wxyz"};

            if(up.isEmpty()){
                List<String> ans = new ArrayList<>();
                ans.add(p);
                return ans;
            }

            int digit = up.charAt(0)-'0';
            String value = notations[digit];

            List<String> ans = new ArrayList<>();

            for(int i=0;i<value.length();i++){
                char ch = value.charAt(i);
                ans.addAll(calculation(p+ch, up.substring(1)));
            }
            return ans;
        }
    }

