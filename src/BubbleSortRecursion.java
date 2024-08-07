import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] array = {4, 3, 5, 3, 1, 2};
        bubbleSort(array, array.length - 1, 0);
        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] array, int lastUnsortedIndex, int currentIndex) {
        // Base case: If only one element is left, the array is sorted.
        if (lastUnsortedIndex == 0) {
            return;
        }

        // If we haven't reached the end of the array during this pass
        if (currentIndex < lastUnsortedIndex) {
            // Swap if the current element is greater than the next
            if (array[currentIndex] > array[currentIndex + 1]) {
                int temp = array[currentIndex];
                array[currentIndex] = array[currentIndex + 1];
                array[currentIndex + 1] = temp;
            }
            // Recurse with the next pair of elements
            bubbleSort(array, lastUnsortedIndex, currentIndex + 1);
        } else {
            // Recurse for the next pass with the next unsorted portion of the array
            bubbleSort(array, lastUnsortedIndex - 1, 0);
        }
    }
}
