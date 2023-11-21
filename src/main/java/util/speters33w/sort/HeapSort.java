package util.speters33w.sort;

public class HeapSort {

    public static <T extends Comparable<? super T>> void heapSort(T[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }
        for (int j = array.length - 1; j > 0; j--) {
            T temp = array[0];
            array[0] = array[j];
            array[j] = temp;
            adjustHeap(array, 0, j);
        }
    }

    private static <T extends Comparable<? super T>> void adjustHeap(T[] array, int i, int length) {
        T tmp = array[i];
        for (int j = i * 2 + 1; j < length; j = j * 2 + 1) {
            if (j + 1 < length && array[j].compareTo(array[j + 1]) < 0) {
                j++;
            }
            if (array[j].compareTo(tmp) > 0) {
                array[i] = array[j];
                i = j;
            } else {
                break;
            }
        }
        array[i] = tmp;
    }
}
