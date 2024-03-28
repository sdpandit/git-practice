import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>();
        for (int i=0; i<15; i++) {
            System.out.println(i + "  " + i*i + "  " + i*i*i);
            nums.add(i);
            nums.add(i*i);
            nums.add(i*i*i);
        }

        System.out.println(nums.size());
    }
}
