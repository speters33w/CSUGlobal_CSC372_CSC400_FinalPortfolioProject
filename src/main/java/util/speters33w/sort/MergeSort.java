package util.speters33w.sort;

/**
 Sorts an array of comparable objects from smallest to largest using Merge Sort.
 */
public class MergeSort {

    @SuppressWarnings("unused")
    private MergeSort() {}

    /**
     * Main entry for the sort algorithm, takes in one array of Comparables as an argument.
     * @param array The array to be sorted.
     * @param <T> a Comparable type.
     */
    public static <T extends Comparable<? super T>> void mergeSort(T[] array){
        int end = array.length - 1;
        mergeSort(array, 0, end);
    }

    /**
     *
     * @param array the array being sorted.
     * @param start the starting index of the array being sorted.
     * @param end the ending index of the array being sorted.
     * @param <T> a Comparable type.
     */
    private static <T extends Comparable<? super T>> void mergeSort(T[] array, int start, int end)
    {
        // base case
        if (start < end)
        {
            int middle = (start + end) / 2;

            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    /**
     * Merges the sub-arrays after sorting.
     * @param array the array being sorted.
     * @param start the starting index of the array being sorted.
     * @param middle the middle index of the array being sorted.
     * @param end the ending index of the array being sorted.
     */
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<? super T>> void merge(T[] array, int start, int middle, int end) {
        // Instantiate two generic comparable arrays to hold the sorted sub-arrays
        T[] leftArray  = (T[]) new Comparable[middle - start + 1];
        T[] rightArray = (T[]) new Comparable[end - middle];
        // Initialize indexes.
        int leftIndex = 0, rightIndex = 0;
        int currentIndex = start;

        // fill in left and right arrays
        System.arraycopy(array, start, leftArray, 0, leftArray.length);
        for (int i = 0; i < rightArray.length; ++i) {
            rightArray[i] = array[middle + 1 + i];
        }

        // merge the two sub-arrays
        while (leftIndex < leftArray.length && rightIndex < rightArray.length)
        {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0)
            {
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            else
            {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        while (leftIndex < leftArray.length) array[currentIndex++] = leftArray[leftIndex++];
        while (rightIndex < rightArray.length) array[currentIndex++] = rightArray[rightIndex++];
    }
}