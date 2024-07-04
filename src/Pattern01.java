public class Pattern01 {
    public static void main(String[] args) {
    rat(4);
    }

    static void rat(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
