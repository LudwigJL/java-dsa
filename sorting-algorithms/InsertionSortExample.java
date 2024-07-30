public class InsertionSortExample {
    public static void main(String[] args) {
        
        int array[] = {4, 7, 8, 4, 2, 1, 2, 3, 0, 7};

        insertionSort(array);

        for(int i: array){
            System.out.print(i);
        }
    }

    public static void insertionSort(int array[] ){

        /** Time Complexity: O(N^2)
            Usecase: Insertion sort is only efficient on nearly sorted data.
            When a list is sorted or almost sorted, an insertion sort's time comp is O(n)!

        **/

        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;

        }
    }
}
