public class bubbleSortExample {
    public static void main(String[] args) {
        int array[] = {9, 2, 4, 6, 3, 2, 1};

        bubbleSort(array);

        for(int i : array){
            System.out.print(i);
        }

    }

    // Time Complexity: Quadratic time O(n^2)
    // Use case: never
    public static void bubbleSort( int array[]){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){

                // > is ascending: < is descending
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }

    }
}
