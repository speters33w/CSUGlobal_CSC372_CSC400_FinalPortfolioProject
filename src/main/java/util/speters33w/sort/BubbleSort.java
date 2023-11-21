package util.speters33w.sort;

/**
 Sorts an array of comparable objects from smallest to largest using Bubble Sort.
 */
public final class BubbleSort {
    @SuppressWarnings("unused")
    private BubbleSort() {}

    /**
     * Sorts an array of comparable objects from smallest to largest using Bubble Sort.
     *
     * @param array the array to be sorted.
     */
    public static <T extends Comparable<? super T>> void bubbleSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
