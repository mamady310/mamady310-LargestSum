
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        ArrayList<Integer> sortedNumbers = new ArrayList<>(nums);
      Collections.sort(sortedNumbers);
      int lastNum = sortedNumbers.size()-1;
      int secondLastNum = sortedNumbers.size() -2;
      int max = sortedNumbers.get(secondLastNum) + sortedNumbers.get(lastNum);
        return max;
    }
}