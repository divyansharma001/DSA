public class SearchInString {
    public static void main(String[] args) {
        String string = "Divyansh";
        System.out.println(linearSearch(string, 'w'));
    }
    static boolean linearSearch(String str, char target ){
        if(str.isEmpty()){
            return false;
        }

        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
