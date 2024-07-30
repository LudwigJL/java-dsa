import java.util.ArrayList;
import java.util.List;

public class linearSearchExample {
    public static void main(String[] args) {
        List<Integer> numbers = generateNumbers(1, 100);
        int target = 100;
        int index = linearSearch(numbers, target);
 
        if (index != -1) {
            System.out.println("Found target: " + target + " at index: " + index);
        } 
        else {
            System.out.println("Not found in the list.");
        }
    }

    public static int linearSearch(List<Integer> list, int target){

        //Time Complexity: Linear Time O(n)
        //Use case: Consider using linear search when data is not sorted. If data is sorted binary search is the better option. 
        

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == target){
                return i;
            }
        }
        return -1;
    }

    public static List<Integer> generateNumbers(int start, int end){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            numbers.add(i);
        }
        return numbers;
    }

}
