package Strategy;


public class Sorter<T> {

    public void sort(T[] array, ComparatorImp<T> comparatorImp) {
        for (int i = 0; i < array.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                minPos = comparatorImp.compare(array[j], array[minPos]) == -1 ? j : minPos;
            }
            swap(array, i, minPos);
        }
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
