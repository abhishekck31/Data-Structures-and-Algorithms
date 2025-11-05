import java.util.ArrayList; // dynamic array implementation
import java.util.Arrays;    // utility for sorting
import java.util.List;      // List interface

public class CombinationSum {
    // stores all valid combinations found
    private final List<List<Integer>> result = new ArrayList<List<Integer>>();

    // public API: given candidate numbers and a target, return all unique combinations
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); // sort to enable pruning (early stop) and avoid duplicates ordering
        backtrack(candidates, target, 0, new ArrayList<Integer>()); // start recursion from index 0
        return result; // return all collected combinations
    }

    // recursive helper:
    // candidates - sorted array of numbers we can use
    // remain     - remaining sum we need to reach
    // start      - current index in candidates to consider (prevents using smaller indices and duplicates)
    // comb       - current partial combination being built
    private void backtrack(int[] candidates, int remain, int start, List<Integer> comb) {
        if (remain == 0) {
            // base case: exact sum achieved, add a copy of current combination to result
            result.add(new ArrayList<Integer>(comb));
            return; // backtrack
        }
        // iterate candidates from 'start' to end
        for (int i = start; i < candidates.length; i++) {
            int val = candidates[i]; // current candidate value
            if (val > remain) break; // pruning: since array is sorted, no further candidates will fit
            comb.add(val); // choose the current value
            // recurse with decreased remaining target; pass i (not i+1) to allow reuse of same element
            backtrack(candidates, remain - val, i, comb);
            // un-choose: remove last element to try next candidate
            comb.remove(comb.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7}; // example candidate set
        int target = 7;                 // example target sum
        // compute combinations and print them
        List<List<Integer>> solutions = new CombinationSum().combinationSum(candidates, target);
        System.out.println(solutions); // expected output: [[2, 2, 3], [7]]
    }
}
