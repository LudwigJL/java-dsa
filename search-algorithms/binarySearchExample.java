import java.util.ArrayList;
import java.util.Arrays;

public class binarySearchExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 12, 13, 14, 15, 18, 19));
        int target = 14;

        System.out.println(binarySearch(numbers, target));
        

    }

    public static int binarySearch(ArrayList<Integer> list, int target){

        // Time Complexity: Logarithmic Time O(log n)
        // Use case: Works well on sorted data. 
         
        int start = 0;
        int end = list.size() - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = list.get(mid);

            if(midValue == target){
                return mid;
            }
            else if(midValue < target){
                start = mid + 1;
            }
            else if(midValue > target){
                end = mid - 1;
            }
        }

        return -1; //target not found
    }

}
