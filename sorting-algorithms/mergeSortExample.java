import java.util.Random;

public class mergeSortExample {
    public static void mergeSortExample(String[] args) {

       Random rand = new Random();
       int[] numbers = new int[100000];

       for (int i = 0; i < numbers.length; i++){
        numbers[i] = rand.nextInt(10000);
       }
       mergeSort(numbers);

       printArray(numbers);

    }

    private static void mergeSort(int[] inputArray){

        /** Time Complexity: Log linear O(n log n)
            Usecase: One of the more widely used and effecient sorting algorithms. Ex Python use mergeSort in its 
            buidlt- in sorting functions. The mergeSort algoritm can also be used to solve other problems with the divide-and-conquer approach. 

        **/

        int inputLength = inputArray.length;

        if (inputLength < 2){
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
        
        for(int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }

        for(int i = midIndex; i < inputLength; i++){
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
        // i = iterator for left half, j = iterator for right half & k = merged array
        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize){
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            }
            else{
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }

    private static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
    }

}
