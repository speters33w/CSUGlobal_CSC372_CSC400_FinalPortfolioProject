package util.speters33w.sort;

/**
 * Sorts an array into ascending order using Insertion Sort.
 */
public class InsertionSort {


    private InsertionSort() {}
    /**
     * Sorts an array into ascending order using Insertion Sort.
     *
     * @param array An array of Comparable objects.
     */
    public static <T extends Comparable<? super T>> void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T insertVal = array[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal.compareTo(array[insertIndex]) < 0) {
                array[insertIndex + 1] = array[insertIndex];
                insertIndex--;
            }
            array[insertIndex + 1] = insertVal;
        }
    }
}
