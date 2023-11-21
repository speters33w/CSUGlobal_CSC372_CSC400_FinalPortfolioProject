package util.speters33w.sort;

/**
Sorts an array of comparable objects from smallest to largest using Selection Sort.
*/
public final class SelectionSort {

   @SuppressWarnings("unused")
   private SelectionSort() {}

   /**
    * Sorts the first n objects in an array into ascending order.
    *
    * @param array An array of Comparable objects.
    */
   public static <T extends Comparable<? super T>> void selectionSort(T[] array) {
      for (int i = 0; i < array.length - 1; i++) {
         int minPosition = i;

         for (int j = i + 1; j < array.length; j++) {
            if (array[minPosition].compareTo(array[j]) > 0) {
               minPosition = j;
            }
         }
         if (minPosition != i) {
            //swap the current item with the smallest remaining
            T temp = array[i];
            array[i] = array[minPosition];
            array[minPosition] = temp;
         }
      }
   } // selectionSort()
} // class util.speters33w.sort.SelectionSort