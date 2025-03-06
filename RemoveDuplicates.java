import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};
        int[] result = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
