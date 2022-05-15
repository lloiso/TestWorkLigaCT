import java.util.*;

public class Main {
    private static Object Integer;

    public static void main(String[] args) {
        Integer[] fd = {1, 1, 2, 2, 4, 1, 2};

        System.out.println(Arrays.toString(getUnique(fd)));

    }

    public static Integer[] getUnique(Integer[] numbers) {

        Set<Integer> targetSet = new HashSet<Integer>(Arrays.asList(numbers));
        Integer[] returnArray = targetSet.toArray(new Integer[0]);

        return returnArray;
    }
}