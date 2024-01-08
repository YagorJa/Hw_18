package Task2;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Methods {
    protected static void vvod(Map<Integer,String> map){
        System.out.print("Введите количество записей: ");
        Scanner sc = new Scanner(System.in);
        int numEntries = sc.nextInt();
        for (int i = 0; i <numEntries ; i++) {
        System.out.println("Введите айди");
        int id = sc.nextInt();
        sc.nextLine();
            System.out.print("Введите имя: ");
            String name = sc.nextLine();
         map.put(id,name);
        }
    }
    protected static void vyvod(Map<Integer,String> map){
        System.out.println("Содержиоме мэпа: ");
        for (Map.Entry<Integer,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    protected static List<String> mission (Map<Integer,String> map){
               List<Integer> range = Arrays.asList(1, 2, 5, 8, 9, 13);
        return map.entrySet()
               .stream()
               .filter(x -> range.contains(x.getKey()))
               .map(Map.Entry::getValue)
               .filter(name -> name.length()%2 ==1)
               .map(name -> new  StringBuilder(name).reverse().toString())
               .collect(Collectors.toList());

    }
}
//.map(Map.Entry::getValue): Это операция преобразования, которая применяется к каждому элементу
// потока после фильтрации. Map.Entry::getValue - это ссылка на метод, который возвращает значение
// каждого элемента Map. Таким образом, после применения этой операции, поток будет содержать
// только значения элементов Map, ключи которых прошли фильтр

//range.contains(x.getKey()) проверяет, содержится ли этот ключ в списке range.
// Если ключ содержится в списке, то элемент Map проходит фильтр