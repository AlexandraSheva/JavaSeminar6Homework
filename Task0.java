import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Task0. 1)Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
 * Реализовать в java.
2)Создать множество ноутбуков.
3)Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:

1 - ОЗУ

2 - Объем ЖД

3 - Операционная система

4 - Цвет …

1)Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
2)Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Task0 {

  public static void main(String[] args) {

    Laptops lap1 = new Laptops("Acer", 8, 3000, "Wind 11");
    Laptops lap2 = new Laptops("Apple", 24, 512, "macOS Monterey");
    Laptops lap3 = new Laptops("HP", 16, 1000, "Wind 7");
    Laptops lap4 = new Laptops("Lenovo", 12, 2000, "Wind-2000");

    Set <Laptops> lapSet = new HashSet <> (); 
    lapSet.add (lap1);
    lapSet.add (lap2);
    lapSet.add (lap3);
    lapSet.add (lap4);

    getFeatures(lapSet);
  }

  public static void getFeatures(Set<Laptops> set) {

    Map<String, String> features = new HashMap<>();
    features.put("1", "Марка ноутбука");
    features.put("2", "ОЗУ");
    features.put("3", "Объем жесткого диска");
    features.put("4", "Операционная система");

    System.out.println("Введите число, соответствующее критерию: ");
    System.out.println("1 - Марка ноутбука");
    System.out.println("2 - ОЗУ");
    System.out.println("3 - Объем жесткого диска");
    System.out.println("4 - Операционная система");

    Scanner scanner = new Scanner(System.in);
    String userVar = scanner.nextLine();

    if (features.containsKey(userVar)) {
      String selectedFeature = features.get(userVar);
      //String value = scanner.nextLine();

      switch (selectedFeature) {
        case "Марка ноутбука":
          System.out.println("Введите название ноутбука: ");
          String selectedLap = scanner.nextLine();
          for (Laptops lap : set) {
              if (lap.getFirm().equalsIgnoreCase(selectedLap)) {
                lap.showAll();
              } /*else {
              System.out.println("Ноутбук такой фирмы не найден. ");
            }*/
          }
          break;
        case "ОЗУ":
          System.out.println("Введите минимальное значение для ОЗУ: ");
          String minOzu = scanner.nextLine();
          int minValue = Integer.parseInt(minOzu);
          for (Laptops lap : set) {
            if (lap.getOzu() >= minValue) {
              lap.showAll();
            }
            
          } 
          break; 
        case "Объем жесткого диска":
          System.out.println("Введите минимальное значение для ОЖД: ");
          String minObZhD = scanner.nextLine();
          int minVal = Integer.parseInt(minObZhD);
          for (Laptops lap : set) {
            if (lap.getObZhD() >= minVal) {
              lap.showAll();
            }
            
          } 
          break;  
        case "Операционная система":
          System.out.println("Введите название операционной системы: ");
          String selectedOS = scanner.nextLine();
          for (Laptops lap : set) {
              if (lap.getOs().equalsIgnoreCase(selectedOS)) {
                lap.showAll();
              } 
          }
          break;

      }


    } else {
      System.out.println("Задан неверный номер критерия!");
    }
  }
}
