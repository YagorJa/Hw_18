package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(4);
        integers.add(8);
        integers.add(5);
        integers.add(1);
        integers.add(2);
        integers.add(41);
        integers.add(3);
        integers.add(8);
        integers.add(9);
        integers.add(11);
        integers.add(20);

        int c =
        integers.stream().
                distinct().
                filter(x -> x%2 == 0).
               collect(Collectors.summingInt(Integer::intValue));
        System.out.println(c);
    }
}