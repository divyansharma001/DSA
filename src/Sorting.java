import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 6, 2};
        int length = arr.length;
//        bubbleSort(arr, length);
        selectionSort(arr, length);
        System.out.println(Arrays.toString(arr));
    }
//    static void bubbleSort(int[] arr, int l){
//        boolean swapped;
//        for(int i=0;i<l;i++){
//            swapped=false;
//            for(int j=1;j<l-i;j++){
//                if(arr[j]<arr[j-1]){
//                    int temp = arr[j];
//                    arr[j]= arr[j-1];
//                    arr[j-1]=temp;
//                    swapped=true;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//        }
//
//    }
//}

//   static void bubbleSort(int[] arr, int n)
//    {
//        //code here
//        int r = n-1;
//        int c = 0;
//        recursiveBubbleSort(arr, r, c);
//    }

//    static void recursiveBubbleSort(int[] arr, int r, int c){
//        if(r==0){
//            return;
//        }
//        if(c<r){
//            if(arr[c]>arr[c+1]){
//                int temp = arr[c];
//                arr[c]=arr[c+1];
//                arr[c+1]=temp;
//            }
//            recursiveBubbleSort(arr, r, c+1);
//        }else{
//            recursiveBubbleSort(arr, r-1,0);
//        }
//    }

    static void selectionSort(int[] arr, int length){
        //find max element and replace with last element;
        for(int i=0;i<length;i++){
            int last = length - i - 1;
            int max =  findGreatest(arr, length);
            swap(arr, max , last);
        }
    }

    static int findGreatest(int[] arr, int length){
        int max = arr[0];
        for(int i=0;i<length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void swap(int[] arr, int max, int last){
        int temp = arr[last];
        arr[last]=max;
        max=temp;
    }



}