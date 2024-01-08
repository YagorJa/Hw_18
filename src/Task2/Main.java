package Task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Methods.vvod(map);
       List<String> result = Methods.mission(map);
        System.out.println("ФиналОчка" + result);
        Methods.vyvod(map);
    }

}
